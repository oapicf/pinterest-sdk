

#include "CatalogsDeleteRetailItem.h"

using namespace Tiny;

CatalogsDeleteRetailItem::CatalogsDeleteRetailItem()
{
	item_id = std::string();
	last_updated_time = long(0);
	operation = std::string();
}

CatalogsDeleteRetailItem::CatalogsDeleteRetailItem(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsDeleteRetailItem::~CatalogsDeleteRetailItem()
{

}

void
CatalogsDeleteRetailItem::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *item_idKey = "item_id";

    if(object.has_key(item_idKey))
    {
        bourne::json value = object[item_idKey];



        jsonToValue(&item_id, value, "std::string");


    }

    const char *last_updated_timeKey = "last_updated_time";

    if(object.has_key(last_updated_timeKey))
    {
        bourne::json value = object[last_updated_timeKey];



        jsonToValue(&last_updated_time, value, "long");


    }

    const char *operationKey = "operation";

    if(object.has_key(operationKey))
    {
        bourne::json value = object[operationKey];



        jsonToValue(&operation, value, "std::string");


    }


}

bourne::json
CatalogsDeleteRetailItem::toJson()
{
    bourne::json object = bourne::json::object();





    object["item_id"] = getItemId();






    object["last_updated_time"] = getLastUpdatedTime();






    object["operation"] = getOperation();



    return object;

}

std::string
CatalogsDeleteRetailItem::getItemId()
{
	return item_id;
}

void
CatalogsDeleteRetailItem::setItemId(std::string  item_id)
{
	this->item_id = item_id;
}

long
CatalogsDeleteRetailItem::getLastUpdatedTime()
{
	return last_updated_time;
}

void
CatalogsDeleteRetailItem::setLastUpdatedTime(long  last_updated_time)
{
	this->last_updated_time = last_updated_time;
}

std::string
CatalogsDeleteRetailItem::getOperation()
{
	return operation;
}

void
CatalogsDeleteRetailItem::setOperation(std::string  operation)
{
	this->operation = operation;
}



