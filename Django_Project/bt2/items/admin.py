from django.contrib import admin
from .models import items

# Register your models here.
class ItemAdmin(admin.ModelAdmin):
    list_display = ('item_id', 'catalog_id', 'name', 'company', 'avatar', 'price')
    search_fields = ['name']
    list_filter = ('item_id', 'catalog_id', 'name', 'company')
admin.site.register(items, ItemAdmin)