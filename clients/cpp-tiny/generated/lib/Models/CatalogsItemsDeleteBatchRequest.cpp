

#include "CatalogsItemsDeleteBatchRequest.h"

using namespace Tiny;

CatalogsItemsDeleteBatchRequest::CatalogsItemsDeleteBatchRequest()
{
	country = Country();
	items = std::list<ItemDeleteBatchRecord>();
	language = std::string();
	operation = BatchOperation();
}

CatalogsItemsDeleteBatchRequest::CatalogsItemsDeleteBatchRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsItemsDeleteBatchRequest::~CatalogsItemsDeleteBatchRequest()
{

}

void
CatalogsItemsDeleteBatchRequest::fromJson(std::string jsonObj)
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




        BatchOperation* obj = &operation;
		obj->fromJson(value.dump());

    }


}

bourne::json
CatalogsItemsDeleteBatchRequest::toJson()
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







	object["operation"] = getOperation().toJson();


    return object;

}

Country
CatalogsItemsDeleteBatchRequest::getCountry()
{
	return country;
}

void
CatalogsItemsDeleteBatchRequest::setCountry(Country  country)
{
	this->country = country;
}

std::list<ItemDeleteBatchRecord>
CatalogsItemsDeleteBatchRequest::getItems()
{
	return items;
}

void
CatalogsItemsDeleteBatchRequest::setItems(std::list <ItemDeleteBatchRecord> items)
{
	this->items = items;
}

std::string
CatalogsItemsDeleteBatchRequest::getLanguage()
{
	return language;
}

void
CatalogsItemsDeleteBatchRequest::setLanguage(std::string  language)
{
	this->language = language;
}

BatchOperation
CatalogsItemsDeleteBatchRequest::getOperation()
{
	return operation;
}

void
CatalogsItemsDeleteBatchRequest::setOperation(BatchOperation  operation)
{
	this->operation = operation;
}



