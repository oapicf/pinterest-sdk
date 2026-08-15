

#include "CatalogsUpsertRetailItem.h"

using namespace Tiny;

CatalogsUpsertRetailItem::CatalogsUpsertRetailItem()
{
	attributes = ItemAttributesRequest();
	item_id = std::string();
	operation = std::string();
}

CatalogsUpsertRetailItem::CatalogsUpsertRetailItem(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsUpsertRetailItem::~CatalogsUpsertRetailItem()
{

}

void
CatalogsUpsertRetailItem::fromJson(std::string jsonObj)
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
CatalogsUpsertRetailItem::toJson()
{
    bourne::json object = bourne::json::object();






	object["attributes"] = getAttributes().toJson();





    object["item_id"] = getItemId();






    object["operation"] = getOperation();



    return object;

}

ItemAttributesRequest
CatalogsUpsertRetailItem::getAttributes()
{
	return attributes;
}

void
CatalogsUpsertRetailItem::setAttributes(ItemAttributesRequest  attributes)
{
	this->attributes = attributes;
}

std::string
CatalogsUpsertRetailItem::getItemId()
{
	return item_id;
}

void
CatalogsUpsertRetailItem::setItemId(std::string  item_id)
{
	this->item_id = item_id;
}

std::string
CatalogsUpsertRetailItem::getOperation()
{
	return operation;
}

void
CatalogsUpsertRetailItem::setOperation(std::string  operation)
{
	this->operation = operation;
}



