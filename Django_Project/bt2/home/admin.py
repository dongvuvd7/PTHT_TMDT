from django.contrib import admin
from .models import catalog

# Register your models here.
class CatalogAdmin(admin.ModelAdmin):
    list_display = ('catalog_id', 'name')
    search_fields = ['name']
    list_filter = ('catalog_id', 'name')
admin.site.register(catalog, CatalogAdmin)