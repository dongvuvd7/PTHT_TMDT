from django.shortcuts import render, redirect

# from demo.home.models import department

# from demo.home.models import department
from .models import employees as employee_model
from home.models import department as department_model

# Create your views here.
#Hien thi danh sach nhan vien ra table nhan vien
def get_employees(request, id):
    employee_list = employee_model.objects.filter(department_id = id) #lay nhan vien theo dieu kien la department_id phai = id (select * from ... where ...)
    department = department_model.objects.get(department_id = id) #ham get tra ve 1 doi tuong, ham filter tra ve danh sach cac doi tuong
    return render(request, 'employees.html', {'employee_list' : employee_list, 'department' : department})

#Hien thi Form them moi nhan vien
def get_employee_form(request):
    department_list = department_model.objects.filter() #Lay danh sach cac phong ban de build ra select option
    return render(request, 'employeeForm.html', {'department_list' : department_list})

#Them moi nhan vien vào database
def add_employee(request):
    if request.method == 'POST':
        #Lay cac du lieu
        department_id = request.POST['department']
        name = request.POST['fullName']
        age = request.POST['age']
        avatar = request.FILES['avatar']
        cv = request.FILES['cv']
        
        #Do department_id cua bang employee lien ket vs bang department nen can phai truyen ca 1 doi tuong department
        department = department_model.objects.get(department_id = department_id) #select * from department where department_id = department_id

        #Tien hanh luu vao database
        employee = employee_model.objects.create(
            #employee_id tu dong tang
            department_id = department,
            name = name,
            age = age,
            avatar = avatar,
            cv = cv,
        )
        employee.save()
        #Dieu huong lai trang xem ds nhan vien
        return redirect('/department/' + str(department_id)) #Do department_id la int nen de noi chuoi thi can chuyen ve str
    else:
        return render(request, 'error.html')
