

#include "LocalInventoryCreateOperation.h"

using namespace Tiny;

LocalInventoryCreateOperation::LocalInventoryCreateOperation()
{
	attributes = RetailLocalInventoryItemAttributes();
	item_id = std::string();
	operation = std::string();
	store_code = std::string();
}

LocalInventoryCreateOperation::LocalInventoryCreateOperation(std::string jsonString)
{
	this->fromJson(jsonString);
}

LocalInventoryCreateOperation::~LocalInventoryCreateOperation()
{

}

void
LocalInventoryCreateOperation::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *attributesKey = "attributes";

    if(object.has_key(attributesKey))
    {
        bourne::json value = object[attributesKey];




        RetailLocalInventoryItemAttributes* obj = &attributes;
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

    const char *store_codeKey = "store_code";

    if(object.has_key(store_codeKey))
    {
        bourne::json value = object[store_codeKey];



        jsonToValue(&store_code, value, "std::string");


    }


}

bourne::json
LocalInventoryCreateOperation::toJson()
{
    bourne::json object = bourne::json::object();






	object["attributes"] = getAttributes().toJson();





    object["item_id"] = getItemId();






    object["operation"] = getOperation();






    object["store_code"] = getStoreCode();



    return object;

}

RetailLocalInventoryItemAttributes
LocalInventoryCreateOperation::getAttributes()
{
	return attributes;
}

void
LocalInventoryCreateOperation::setAttributes(RetailLocalInventoryItemAttributes attributes)
{
	this->attributes = attributes;
}

std::string
LocalInventoryCreateOperation::getItemId()
{
	return item_id;
}

void
LocalInventoryCreateOperation::setItemId(std::string item_id)
{
	this->item_id = item_id;
}

std::string
LocalInventoryCreateOperation::getOperation()
{
	return operation;
}

void
LocalInventoryCreateOperation::setOperation(std::string operation)
{
	this->operation = operation;
}

std::string
LocalInventoryCreateOperation::getStoreCode()
{
	return store_code;
}

void
LocalInventoryCreateOperation::setStoreCode(std::string store_code)
{
	this->store_code = store_code;
}



