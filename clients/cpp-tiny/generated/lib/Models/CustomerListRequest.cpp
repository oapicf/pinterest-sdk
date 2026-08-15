

#include "CustomerListRequest.h"

using namespace Tiny;

CustomerListRequest::CustomerListRequest()
{
	list_type = std::string();
	name = std::string();
	records = std::string();
}

CustomerListRequest::CustomerListRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

CustomerListRequest::~CustomerListRequest()
{

}

void
CustomerListRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *list_typeKey = "list_type";

    if(object.has_key(list_typeKey))
    {
        bourne::json value = object[list_typeKey];




        UserListType* obj = &list_type;
		obj->fromJson(value.dump());

    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *recordsKey = "records";

    if(object.has_key(recordsKey))
    {
        bourne::json value = object[recordsKey];



        jsonToValue(&records, value, "std::string");


    }


}

bourne::json
CustomerListRequest::toJson()
{
    bourne::json object = bourne::json::object();






	object["list_type"] = getListType().toJson();





    object["name"] = getName();






    object["records"] = getRecords();



    return object;

}

UserListType
CustomerListRequest::getListType()
{
	return list_type;
}

void
CustomerListRequest::setListType(UserListType  list_type)
{
	this->list_type = list_type;
}

std::string
CustomerListRequest::getName()
{
	return name;
}

void
CustomerListRequest::setName(std::string  name)
{
	this->name = name;
}

std::string
CustomerListRequest::getRecords()
{
	return records;
}

void
CustomerListRequest::setRecords(std::string  records)
{
	this->records = records;
}



