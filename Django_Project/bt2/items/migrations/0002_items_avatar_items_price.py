# Generated by Django 4.0.2 on 2022-03-01 12:57

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('items', '0001_initial'),
    ]

    operations = [
        migrations.AddField(
            model_name='items',
            name='avatar',
            field=models.ImageField(default=None, upload_to='images'),
        ),
        migrations.AddField(
            model_name='items',
            name='price',
            field=models.CharField(default=None, max_length=100),
        ),
    ]
