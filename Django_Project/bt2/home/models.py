from django.db import models

# Create your models here.

#Tao bang list cac danh muc item
class catalog(models.Model):
    catalog_id = models.AutoField(primary_key=True)
    name = models.CharField(max_length=50, null=False)

    def __str__(self):
        return f"{self.catalog_id},{self.name}"