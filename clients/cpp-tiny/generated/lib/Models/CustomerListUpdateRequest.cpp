

#include "CustomerListUpdateRequest.h"

using namespace Tiny;

CustomerListUpdateRequest::CustomerListUpdateRequest()
{
	operation_type = std::string();
	records = std::string();
}

CustomerListUpdateRequest::CustomerListUpdateRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

CustomerListUpdateRequest::~CustomerListUpdateRequest()
{

}

void
CustomerListUpdateRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *operation_typeKey = "operation_type";

    if(object.has_key(operation_typeKey))
    {
        bourne::json value = object[operation_typeKey];




        UserListOperationType* obj = &operation_type;
		obj->fromJson(value.dump());

    }

    const char *recordsKey = "records";

    if(object.has_key(recordsKey))
    {
        bourne::json value = object[recordsKey];



        jsonToValue(&records, value, "std::string");


    }


}

bourne::json
CustomerListUpdateRequest::toJson()
{
    bourne::json object = bourne::json::object();






	object["operation_type"] = getOperationType().toJson();





    object["records"] = getRecords();



    return object;

}

UserListOperationType
CustomerListUpdateRequest::getOperationType()
{
	return operation_type;
}

void
CustomerListUpdateRequest::setOperationType(UserListOperationType  operation_type)
{
	this->operation_type = operation_type;
}

std::string
CustomerListUpdateRequest::getRecords()
{
	return records;
}

void
CustomerListUpdateRequest::setRecords(std::string  records)
{
	this->records = records;
}



