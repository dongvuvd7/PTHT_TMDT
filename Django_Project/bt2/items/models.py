from email.policy import default
from pickle import NONE
from django.db import models
from home.models import catalog

# Create your models here.
class items(models.Model):
    item_id = models.AutoField(primary_key=True)
    catalog_id = models.ForeignKey(catalog, default=None, on_delete=models.CASCADE)
    name = models.CharField(max_length=250, null = False)
    company = models.CharField(max_length=250, null=False)
    avatar = models.ImageField(upload_to = 'images', null = False, default = None)
    price = models.CharField(max_length=100, null = False, default = None)

    def __str__(self):
        return f"{self.item_id}, {self.catalog_id}, {self.name}, {self.company}, {self.avatar}, {self.price}"
