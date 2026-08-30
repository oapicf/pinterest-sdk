

#include "CatalogsCreateRetailItem.h"

using namespace Tiny;

CatalogsCreateRetailItem::CatalogsCreateRetailItem()
{
	attributes = ItemAttributesRequest();
	item_id = std::string();
	operation = std::string();
}

CatalogsCreateRetailItem::CatalogsCreateRetailItem(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsCreateRetailItem::~CatalogsCreateRetailItem()
{

}

void
CatalogsCreateRetailItem::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *attributesKey = "attributes";

    if(object.has_key(attributesKey))
    {
        bourne::json value = object[attributesKey];




        ItemAttributesRequest* obj = &attributes;
		obj->fromJson(value.dump());

    }

    const char *item_idKey = "item_id";

    if(object.has_key(item_idKey))
    {
        bourne::json value = object[item_idKey];



        jsonToValue(&item_id, value, "std::string");


    }

    const char *operationKey = "operation";

    if(object.has_key(operationKey))
    {
        bourne::json value = object[operationKey];



        jsonToValue(&operation, value, "std::string");


    }


}

bourne::json
CatalogsCreateRetailItem::toJson()
{
    bourne::json object = bourne::json::object();






	object["attributes"] = getAttributes().toJson();





    object["item_id"] = getItemId();






    object["operation"] = getOperation();



    return object;

}

ItemAttributesRequest
CatalogsCreateRetailItem::getAttributes()
{
	return attributes;
}

void
CatalogsCreateRetailItem::setAttributes(ItemAttributesRequest attributes)
{
	this->attributes = attributes;
}

std::string
CatalogsCreateRetailItem::getItemId()
{
	return item_id;
}

void
CatalogsCreateRetailItem::setItemId(std::string item_id)
{
	this->item_id = item_id;
}

std::string
CatalogsCreateRetailItem::getOperation()
{
	return operation;
}

void
CatalogsCreateRetailItem::setOperation(std::string operation)
{
	this->operation = operation;
}



