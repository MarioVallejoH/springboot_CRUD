# springboot_CRUD

CRUD App using Spring Boot without DB. Data is saved on a list of ```Topics```, wich are a class with the following structure:

```
{
    "id":"id_string",
    "name":"name_string",
    "description":"description_string"
}
```
To get all data saved in ```List<Topics>``` send a GET petition to ```/topics``` in ur localhost addr ( url could take this form ```localhost:8080/topics```).

To get specific data saved in ```List<Topics>``` send a GET petition to ```/topics/{id}``` with the desired id.

To add data to ```List<Topics>``` send a POST petition to ```/topics``` with the ```Topic``` structure in body using JSON format.

To delete data from ```List<Topics>``` send a DELETE petition to ```/topics/delete/{id}``` with the desired ```Topic``` id to be deleted.

To update data from ```List<Topics>``` send a PUT petition to ```/topics/update``` with the ```Topic``` structure in body using JSON format. It will replace the element with the same ID.

To update data fields from ```List<Topics>``` send a PATCH petition to ```/topics/update``` with the ```Topic``` structure in body using JSON format. It will replace the element field values if values in PATCH petition are different of `""`.



