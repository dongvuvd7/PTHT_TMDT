from django.shortcuts import render, redirect
from .models import items as item_model
from home.models import catalog as catalog_model

# Create your views here.
#Hien thi danh muc
def get_items(request, id):
    item_list = item_model.objects.filter(catalog_id = id)
    #Lay danh muc theo ma danh muc
    catalog = catalog_model.objects.get(catalog_id = id);
    return render(request, 'items.html', {
        'item_list' : item_list,
        'catalog' : catalog,
    })

#Hien thi Form them moi san pham
def get_item_form(request):
    catalog_list = catalog_model.objects.filter() #Lay danh sach cac danh muc de build ra select option
    return render(request, 'itemForm.html', {'catalog_list' : catalog_list})

#Them moi san pham vào database
def add_item(request):
    if request.method == 'POST':
        #Lay cac du lieu
        catalog_id = request.POST['catalog']
        name = request.POST['fullName']
        company = request.POST['company']
        avatar = request.FILES['avatar']
        price = request.POST['price']
        
        #Do catalog_id cua bang item lien ket vs bang catalog nen can phai truyen ca 1 doi tuong catalog
        catalog = catalog_model.objects.get(catalog_id = catalog_id) #select * from catalog where catalog_id = catalog_id

        #Tien hanh luu vao database
        item = item_model.objects.create(
            #item_id tu dong tang
            catalog_id = catalog,
            name = name,
            company = company,
            avatar = avatar,
            price = price,
        )
        item.save()
        #Dieu huong lai trang xem ds nhan vien
        return redirect('/catalog/' + str(catalog_id)) #Do catalog_id la int nen de noi chuoi thi can chuyen ve str
    else:
        return render(request, 'error.html')