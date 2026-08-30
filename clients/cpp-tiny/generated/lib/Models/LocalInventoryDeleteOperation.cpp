

#include "LocalInventoryDeleteOperation.h"

using namespace Tiny;

LocalInventoryDeleteOperation::LocalInventoryDeleteOperation()
{
	item_id = std::string();
	operation = std::string();
	store_code = std::string();
}

LocalInventoryDeleteOperation::LocalInventoryDeleteOperation(std::string jsonString)
{
	this->fromJson(jsonString);
}

LocalInventoryDeleteOperation::~LocalInventoryDeleteOperation()
{

}

void
LocalInventoryDeleteOperation::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

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
LocalInventoryDeleteOperation::toJson()
{
    bourne::json object = bourne::json::object();





    object["item_id"] = getItemId();






    object["operation"] = getOperation();






    object["store_code"] = getStoreCode();



    return object;

}

std::string
LocalInventoryDeleteOperation::getItemId()
{
	return item_id;
}

void
LocalInventoryDeleteOperation::setItemId(std::string item_id)
{
	this->item_id = item_id;
}

std::string
LocalInventoryDeleteOperation::getOperation()
{
	return operation;
}

void
LocalInventoryDeleteOperation::setOperation(std::string operation)
{
	this->operation = operation;
}

std::string
LocalInventoryDeleteOperation::getStoreCode()
{
	return store_code;
}

void
LocalInventoryDeleteOperation::setStoreCode(std::string store_code)
{
	this->store_code = store_code;
}



