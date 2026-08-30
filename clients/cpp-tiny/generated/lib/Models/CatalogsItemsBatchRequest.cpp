

#include "CatalogsItemsBatchRequest.h"

using namespace Tiny;

CatalogsItemsBatchRequest::CatalogsItemsBatchRequest()
{
	country = Country();
	items = std::list<ItemDeleteBatchRecord>();
	language = std::string();
	operation = std::string();
}

CatalogsItemsBatchRequest::CatalogsItemsBatchRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsItemsBatchRequest::~CatalogsItemsBatchRequest()
{

}

void
CatalogsItemsBatchRequest::fromJson(std::string jsonObj)
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
CatalogsItemsBatchRequest::toJson()
{
    bourne::json object = bourne::json::object();






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

Country
CatalogsItemsBatchRequest::getCountry()
{
	return country;
}

void
CatalogsItemsBatchRequest::setCountry(Country country)
{
	this->country = country;
}

std::list<ItemDeleteBatchRecord>
CatalogsItemsBatchRequest::getItems()
{
	return items;
}

void
CatalogsItemsBatchRequest::setItems(std::list<ItemDeleteBatchRecord> items)
{
	this->items = items;
}

std::string
CatalogsItemsBatchRequest::getLanguage()
{
	return language;
}

void
CatalogsItemsBatchRequest::setLanguage(std::string language)
{
	this->language = language;
}

std::string
CatalogsItemsBatchRequest::getOperation()
{
	return operation;
}

void
CatalogsItemsBatchRequest::setOperation(std::string operation)
{
	this->operation = operation;
}



