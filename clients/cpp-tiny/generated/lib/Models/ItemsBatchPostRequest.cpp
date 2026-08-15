

#include "Items_batch_post_request.h"

using namespace Tiny;

Items_batch_post_request::Items_batch_post_request()
{
	catalog_id = std::string();
	catalog_type = std::string();
	country = Country();
	items = std::list<ItemDeleteBatchRecord>();
	language = std::string();
	operation = BatchOperation();
}

Items_batch_post_request::Items_batch_post_request(std::string jsonString)
{
	this->fromJson(jsonString);
}

Items_batch_post_request::~Items_batch_post_request()
{

}

void
Items_batch_post_request::fromJson(std::string jsonObj)
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




        BatchOperation* obj = &operation;
		obj->fromJson(value.dump());

    }


}

bourne::json
Items_batch_post_request::toJson()
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







	object["operation"] = getOperation().toJson();


    return object;

}

std::string
Items_batch_post_request::getCatalogId()
{
	return catalog_id;
}

void
Items_batch_post_request::setCatalogId(std::string  catalog_id)
{
	this->catalog_id = catalog_id;
}

std::string
Items_batch_post_request::getCatalogType()
{
	return catalog_type;
}

void
Items_batch_post_request::setCatalogType(std::string  catalog_type)
{
	this->catalog_type = catalog_type;
}

Country
Items_batch_post_request::getCountry()
{
	return country;
}

void
Items_batch_post_request::setCountry(Country  country)
{
	this->country = country;
}

std::list<ItemDeleteBatchRecord>
Items_batch_post_request::getItems()
{
	return items;
}

void
Items_batch_post_request::setItems(std::list <ItemDeleteBatchRecord> items)
{
	this->items = items;
}

std::string
Items_batch_post_request::getLanguage()
{
	return language;
}

void
Items_batch_post_request::setLanguage(std::string  language)
{
	this->language = language;
}

BatchOperation
Items_batch_post_request::getOperation()
{
	return operation;
}

void
Items_batch_post_request::setOperation(BatchOperation  operation)
{
	this->operation = operation;
}



