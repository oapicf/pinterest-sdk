

#include "CatalogsItemsDeleteDiscontinuedBatchRequest.h"

using namespace Tiny;

CatalogsItemsDeleteDiscontinuedBatchRequest::CatalogsItemsDeleteDiscontinuedBatchRequest()
{
	country = Country();
	items = std::list<ItemDeleteDiscontinuedBatchRecord>();
	language = std::string();
	operation = std::string();
}

CatalogsItemsDeleteDiscontinuedBatchRequest::CatalogsItemsDeleteDiscontinuedBatchRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsItemsDeleteDiscontinuedBatchRequest::~CatalogsItemsDeleteDiscontinuedBatchRequest()
{

}

void
CatalogsItemsDeleteDiscontinuedBatchRequest::fromJson(std::string jsonObj)
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


        std::list<ItemDeleteDiscontinuedBatchRecord> items_list;
        ItemDeleteDiscontinuedBatchRecord element;
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
CatalogsItemsDeleteDiscontinuedBatchRequest::toJson()
{
    bourne::json object = bourne::json::object();






	object["country"] = getCountry().toJson();




    std::list<ItemDeleteDiscontinuedBatchRecord> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        ItemDeleteDiscontinuedBatchRecord obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;







    object["language"] = getLanguage();






    object["operation"] = getOperation();



    return object;

}

Country
CatalogsItemsDeleteDiscontinuedBatchRequest::getCountry()
{
	return country;
}

void
CatalogsItemsDeleteDiscontinuedBatchRequest::setCountry(Country country)
{
	this->country = country;
}

std::list<ItemDeleteDiscontinuedBatchRecord>
CatalogsItemsDeleteDiscontinuedBatchRequest::getItems()
{
	return items;
}

void
CatalogsItemsDeleteDiscontinuedBatchRequest::setItems(std::list<ItemDeleteDiscontinuedBatchRecord> items)
{
	this->items = items;
}

std::string
CatalogsItemsDeleteDiscontinuedBatchRequest::getLanguage()
{
	return language;
}

void
CatalogsItemsDeleteDiscontinuedBatchRequest::setLanguage(std::string language)
{
	this->language = language;
}

std::string
CatalogsItemsDeleteDiscontinuedBatchRequest::getOperation()
{
	return operation;
}

void
CatalogsItemsDeleteDiscontinuedBatchRequest::setOperation(std::string operation)
{
	this->operation = operation;
}



