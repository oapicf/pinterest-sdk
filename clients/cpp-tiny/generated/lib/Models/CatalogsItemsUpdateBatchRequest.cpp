

#include "CatalogsItemsUpdateBatchRequest.h"

using namespace Tiny;

CatalogsItemsUpdateBatchRequest::CatalogsItemsUpdateBatchRequest()
{
	country = Country();
	items = std::list<ItemUpdateBatchRecord>();
	language = std::string();
	operation = std::string();
}

CatalogsItemsUpdateBatchRequest::CatalogsItemsUpdateBatchRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsItemsUpdateBatchRequest::~CatalogsItemsUpdateBatchRequest()
{

}

void
CatalogsItemsUpdateBatchRequest::fromJson(std::string jsonObj)
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


        std::list<ItemUpdateBatchRecord> items_list;
        ItemUpdateBatchRecord element;
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
CatalogsItemsUpdateBatchRequest::toJson()
{
    bourne::json object = bourne::json::object();






	object["country"] = getCountry().toJson();




    std::list<ItemUpdateBatchRecord> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        ItemUpdateBatchRecord obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;







    object["language"] = getLanguage();






    object["operation"] = getOperation();



    return object;

}

Country
CatalogsItemsUpdateBatchRequest::getCountry()
{
	return country;
}

void
CatalogsItemsUpdateBatchRequest::setCountry(Country country)
{
	this->country = country;
}

std::list<ItemUpdateBatchRecord>
CatalogsItemsUpdateBatchRequest::getItems()
{
	return items;
}

void
CatalogsItemsUpdateBatchRequest::setItems(std::list<ItemUpdateBatchRecord> items)
{
	this->items = items;
}

std::string
CatalogsItemsUpdateBatchRequest::getLanguage()
{
	return language;
}

void
CatalogsItemsUpdateBatchRequest::setLanguage(std::string language)
{
	this->language = language;
}

std::string
CatalogsItemsUpdateBatchRequest::getOperation()
{
	return operation;
}

void
CatalogsItemsUpdateBatchRequest::setOperation(std::string operation)
{
	this->operation = operation;
}



