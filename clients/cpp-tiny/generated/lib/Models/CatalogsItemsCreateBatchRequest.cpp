

#include "CatalogsItemsCreateBatchRequest.h"

using namespace Tiny;

CatalogsItemsCreateBatchRequest::CatalogsItemsCreateBatchRequest()
{
	country = Country();
	items = std::list<ItemCreateBatchRecord>();
	language = std::string();
	operation = BatchOperation();
}

CatalogsItemsCreateBatchRequest::CatalogsItemsCreateBatchRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsItemsCreateBatchRequest::~CatalogsItemsCreateBatchRequest()
{

}

void
CatalogsItemsCreateBatchRequest::fromJson(std::string jsonObj)
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


        std::list<ItemCreateBatchRecord> items_list;
        ItemCreateBatchRecord element;
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
CatalogsItemsCreateBatchRequest::toJson()
{
    bourne::json object = bourne::json::object();






	object["country"] = getCountry().toJson();




    std::list<ItemCreateBatchRecord> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        ItemCreateBatchRecord obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;







    object["language"] = getLanguage();







	object["operation"] = getOperation().toJson();


    return object;

}

Country
CatalogsItemsCreateBatchRequest::getCountry()
{
	return country;
}

void
CatalogsItemsCreateBatchRequest::setCountry(Country  country)
{
	this->country = country;
}

std::list<ItemCreateBatchRecord>
CatalogsItemsCreateBatchRequest::getItems()
{
	return items;
}

void
CatalogsItemsCreateBatchRequest::setItems(std::list <ItemCreateBatchRecord> items)
{
	this->items = items;
}

std::string
CatalogsItemsCreateBatchRequest::getLanguage()
{
	return language;
}

void
CatalogsItemsCreateBatchRequest::setLanguage(std::string  language)
{
	this->language = language;
}

BatchOperation
CatalogsItemsCreateBatchRequest::getOperation()
{
	return operation;
}

void
CatalogsItemsCreateBatchRequest::setOperation(BatchOperation  operation)
{
	this->operation = operation;
}



