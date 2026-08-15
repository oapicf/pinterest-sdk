

#include "CustomerListUploadCreateRequest.h"

using namespace Tiny;

CustomerListUploadCreateRequest::CustomerListUploadCreateRequest()
{
	operation = std::string();
	total_parts = int(0);
}

CustomerListUploadCreateRequest::CustomerListUploadCreateRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

CustomerListUploadCreateRequest::~CustomerListUploadCreateRequest()
{

}

void
CustomerListUploadCreateRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *operationKey = "operation";

    if(object.has_key(operationKey))
    {
        bourne::json value = object[operationKey];




        UserListOperationType* obj = &operation;
		obj->fromJson(value.dump());

    }

    const char *total_partsKey = "total_parts";

    if(object.has_key(total_partsKey))
    {
        bourne::json value = object[total_partsKey];



        jsonToValue(&total_parts, value, "int");


    }


}

bourne::json
CustomerListUploadCreateRequest::toJson()
{
    bourne::json object = bourne::json::object();






	object["operation"] = getOperation().toJson();





    object["total_parts"] = getTotalParts();



    return object;

}

UserListOperationType
CustomerListUploadCreateRequest::getOperation()
{
	return operation;
}

void
CustomerListUploadCreateRequest::setOperation(UserListOperationType  operation)
{
	this->operation = operation;
}

int
CustomerListUploadCreateRequest::getTotalParts()
{
	return total_parts;
}

void
CustomerListUploadCreateRequest::setTotalParts(int  total_parts)
{
	this->total_parts = total_parts;
}



