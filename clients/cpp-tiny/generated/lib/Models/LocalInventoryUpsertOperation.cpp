

#include "LocalInventoryUpsertOperation.h"

using namespace Tiny;

LocalInventoryUpsertOperation::LocalInventoryUpsertOperation()
{
	attributes = RetailLocalInventoryItemAttributes();
	item_id = std::string();
	operation = std::string();
	store_code = std::string();
}

LocalInventoryUpsertOperation::LocalInventoryUpsertOperation(std::string jsonString)
{
	this->fromJson(jsonString);
}

LocalInventoryUpsertOperation::~LocalInventoryUpsertOperation()
{

}

void
LocalInventoryUpsertOperation::fromJson(std::string jsonObj)
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
LocalInventoryUpsertOperation::toJson()
{
    bourne::json object = bourne::json::object();






	object["attributes"] = getAttributes().toJson();





    object["item_id"] = getItemId();






    object["operation"] = getOperation();






    object["store_code"] = getStoreCode();



    return object;

}

RetailLocalInventoryItemAttributes
LocalInventoryUpsertOperation::getAttributes()
{
	return attributes;
}

void
LocalInventoryUpsertOperation::setAttributes(RetailLocalInventoryItemAttributes attributes)
{
	this->attributes = attributes;
}

std::string
LocalInventoryUpsertOperation::getItemId()
{
	return item_id;
}

void
LocalInventoryUpsertOperation::setItemId(std::string item_id)
{
	this->item_id = item_id;
}

std::string
LocalInventoryUpsertOperation::getOperation()
{
	return operation;
}

void
LocalInventoryUpsertOperation::setOperation(std::string operation)
{
	this->operation = operation;
}

std::string
LocalInventoryUpsertOperation::getStoreCode()
{
	return store_code;
}

void
LocalInventoryUpsertOperation::setStoreCode(std::string store_code)
{
	this->store_code = store_code;
}



