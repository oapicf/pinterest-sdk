

#include "CatalogsItemsUpsertBatchRequest.h"

using namespace Tiny;

CatalogsItemsUpsertBatchRequest::CatalogsItemsUpsertBatchRequest()
{
	country = Country();
	items = std::list<ItemUpsertBatchRecord>();
	language = std::string();
	operation = std::string();
}

CatalogsItemsUpsertBatchRequest::CatalogsItemsUpsertBatchRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsItemsUpsertBatchRequest::~CatalogsItemsUpsertBatchRequest()
{

}

void
CatalogsItemsUpsertBatchRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

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


        std::list<ItemUpsertBatchRecord> items_list;
        ItemUpsertBatchRecord element;
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
CatalogsItemsUpsertBatchRequest::toJson()
{
    bourne::json object = bourne::json::object();






	object["country"] = getCountry().toJson();




    std::list<ItemUpsertBatchRecord> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        ItemUpsertBatchRecord obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;







    object["language"] = getLanguage();






    object["operation"] = getOperation();



    return object;

}

Country
CatalogsItemsUpsertBatchRequest::getCountry()
{
	return country;
}

void
CatalogsItemsUpsertBatchRequest::setCountry(Country country)
{
	this->country = country;
}

std::list<ItemUpsertBatchRecord>
CatalogsItemsUpsertBatchRequest::getItems()
{
	return items;
}

void
CatalogsItemsUpsertBatchRequest::setItems(std::list<ItemUpsertBatchRecord> items)
{
	this->items = items;
}

std::string
CatalogsItemsUpsertBatchRequest::getLanguage()
{
	return language;
}

void
CatalogsItemsUpsertBatchRequest::setLanguage(std::string language)
{
	this->language = language;
}

std::string
CatalogsItemsUpsertBatchRequest::getOperation()
{
	return operation;
}

void
CatalogsItemsUpsertBatchRequest::setOperation(std::string operation)
{
	this->operation = operation;
}



