from turtle import home
from django.shortcuts import render
from .models import catalog as catalog_model

# Create your views here.

def get_home(request):
    catalog_list = catalog_model.objects.filter().order_by('catalog_id')
    return render(request, 'home.html', {'catalog_list' : catalog_list})