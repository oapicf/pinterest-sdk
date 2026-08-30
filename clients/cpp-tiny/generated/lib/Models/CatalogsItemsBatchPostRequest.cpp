

#include "CatalogsItemsBatchPostRequest.h"

using namespace Tiny;

CatalogsItemsBatchPostRequest::CatalogsItemsBatchPostRequest()
{
	catalog_id = null;
	catalog_type = std::string();
	country = Country();
	items = std::list<ItemDeleteBatchRecord>();
	language = std::string();
	operation = std::string();
}

CatalogsItemsBatchPostRequest::CatalogsItemsBatchPostRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsItemsBatchPostRequest::~CatalogsItemsBatchPostRequest()
{

}

void
CatalogsItemsBatchPostRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *catalog_idKey = "catalog_id";

    if(object.has_key(catalog_idKey))
    {
        bourne::json value = object[catalog_idKey];



        jsonToValue(&catalog_id, value, "std::string");


    }

    const char *catalog_typeKey = "catalog_type";

    if(object.has_key(catalog_typeKey))
    {
        bourne::json value = object[catalog_typeKey];



        jsonToValue(&catalog_type, value, "std::string");


    }

    const char *countryKey = "country";

    if(object.has_key(countryKey))
    {
        bourne::json value = object[countryKey];




        Country* obj = &country;
		obj->fromJson(value.dump());

    }

    const char *itemsKey = "items";

    if(object.has_key(itemsKey))
    {
        bourne::json value = object[itemsKey];


        std::list<ItemDeleteBatchRecord> items_list;
        ItemDeleteBatchRecord element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            items_list.push_back(element);
        }
        items = items_list;


    }

    const char *languageKey = "language";

    if(object.has_key(languageKey))
    {
        bourne::json value = object[languageKey];



        jsonToValue(&language, value, "std::string");


    }

    const char *operationKey = "operation";

    if(object.has_key(operationKey))
    {
        bourne::json value = object[operationKey];



        jsonToValue(&operation, value, "std::string");


    }


}

bourne::json
CatalogsItemsBatchPostRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["catalog_id"] = getCatalogId();






    object["catalog_type"] = getCatalogType();







	object["country"] = getCountry().toJson();




    std::list<ItemDeleteBatchRecord> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        ItemDeleteBatchRecord obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;







    object["language"] = getLanguage();






    object["operation"] = getOperation();



    return object;

}

std::string
CatalogsItemsBatchPostRequest::getCatalogId()
{
	return catalog_id;
}

void
CatalogsItemsBatchPostRequest::setCatalogId(std::string catalog_id)
{
	this->catalog_id = catalog_id;
}

std::string
CatalogsItemsBatchPostRequest::getCatalogType()
{
	return catalog_type;
}

void
CatalogsItemsBatchPostRequest::setCatalogType(std::string catalog_type)
{
	this->catalog_type = catalog_type;
}

Country
CatalogsItemsBatchPostRequest::getCountry()
{
	return country;
}

void
CatalogsItemsBatchPostRequest::setCountry(Country country)
{
	this->country = country;
}

std::list<ItemDeleteBatchRecord>
CatalogsItemsBatchPostRequest::getItems()
{
	return items;
}

void
CatalogsItemsBatchPostRequest::setItems(std::list<ItemDeleteBatchRecord> items)
{
	this->items = items;
}

std::string
CatalogsItemsBatchPostRequest::getLanguage()
{
	return language;
}

void
CatalogsItemsBatchPostRequest::setLanguage(std::string language)
{
	this->language = language;
}

std::string
CatalogsItemsBatchPostRequest::getOperation()
{
	return operation;
}

void
CatalogsItemsBatchPostRequest::setOperation(std::string operation)
{
	this->operation = operation;
}



