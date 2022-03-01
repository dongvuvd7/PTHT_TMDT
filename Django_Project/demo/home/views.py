from urllib import request
from django.shortcuts import render
from .models import department as department_model

# Create your tests here.
def get_home(request):
    department_list = department_model.objects.filter().order_by('department_id') # .objects.filter() = select * from
    return render(request, 'home.html', {'department_list' : department_list})