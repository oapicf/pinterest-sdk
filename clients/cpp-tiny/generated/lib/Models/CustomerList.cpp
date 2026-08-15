

#include "CustomerList.h"

using namespace Tiny;

CustomerList::CustomerList()
{
	ad_account_id = std::string();
	created_time = float(0);
	exceptions = null;
	id = std::string();
	name = std::string();
	num_batches = float(0);
	num_removed_user_records = float(0);
	num_uploaded_user_records = float(0);
	status = std::string();
	type = std::string();
	updated_time = float(0);
}

CustomerList::CustomerList(std::string jsonString)
{
	this->fromJson(jsonString);
}

CustomerList::~CustomerList()
{

}

void
CustomerList::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *ad_account_idKey = "ad_account_id";

    if(object.has_key(ad_account_idKey))
    {
        bourne::json value = object[ad_account_idKey];



        jsonToValue(&ad_account_id, value, "std::string");


    }

    const char *created_timeKey = "created_time";

    if(object.has_key(created_timeKey))
    {
        bourne::json value = object[created_timeKey];



        jsonToValue(&created_time, value, "long");


    }

    const char *exceptionsKey = "exceptions";

    if(object.has_key(exceptionsKey))
    {
        bourne::json value = object[exceptionsKey];




        Object* obj = &exceptions;
		obj->fromJson(value.dump());

    }

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *num_batchesKey = "num_batches";

    if(object.has_key(num_batchesKey))
    {
        bourne::json value = object[num_batchesKey];



        jsonToValue(&num_batches, value, "long");


    }

    const char *num_removed_user_recordsKey = "num_removed_user_records";

    if(object.has_key(num_removed_user_recordsKey))
    {
        bourne::json value = object[num_removed_user_recordsKey];



        jsonToValue(&num_removed_user_records, value, "long");


    }

    const char *num_uploaded_user_recordsKey = "num_uploaded_user_records";

    if(object.has_key(num_uploaded_user_recordsKey))
    {
        bourne::json value = object[num_uploaded_user_recordsKey];



        jsonToValue(&num_uploaded_user_records, value, "long");


    }

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];



        jsonToValue(&status, value, "std::string");


    }

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];



        jsonToValue(&type, value, "std::string");


    }

    const char *updated_timeKey = "updated_time";

    if(object.has_key(updated_timeKey))
    {
        bourne::json value = object[updated_timeKey];



        jsonToValue(&updated_time, value, "long");


    }


}

bourne::json
CustomerList::toJson()
{
    bourne::json object = bourne::json::object();





    object["ad_account_id"] = getAdAccountId();






    object["created_time"] = getCreatedTime();







	object["exceptions"] = getExceptions().toJson();





    object["id"] = getId();






    object["name"] = getName();






    object["num_batches"] = getNumBatches();






    object["num_removed_user_records"] = getNumRemovedUserRecords();






    object["num_uploaded_user_records"] = getNumUploadedUserRecords();






    object["status"] = getStatus();






    object["type"] = getType();






    object["updated_time"] = getUpdatedTime();



    return object;

}

std::string
CustomerList::getAdAccountId()
{
	return ad_account_id;
}

void
CustomerList::setAdAccountId(std::string  ad_account_id)
{
	this->ad_account_id = ad_account_id;
}

long
CustomerList::getCreatedTime()
{
	return created_time;
}

void
CustomerList::setCreatedTime(long  created_time)
{
	this->created_time = created_time;
}

Object
CustomerList::getExceptions()
{
	return exceptions;
}

void
CustomerList::setExceptions(Object  exceptions)
{
	this->exceptions = exceptions;
}

std::string
CustomerList::getId()
{
	return id;
}

void
CustomerList::setId(std::string  id)
{
	this->id = id;
}

std::string
CustomerList::getName()
{
	return name;
}

void
CustomerList::setName(std::string  name)
{
	this->name = name;
}

long
CustomerList::getNumBatches()
{
	return num_batches;
}

void
CustomerList::setNumBatches(long  num_batches)
{
	this->num_batches = num_batches;
}

long
CustomerList::getNumRemovedUserRecords()
{
	return num_removed_user_records;
}

void
CustomerList::setNumRemovedUserRecords(long  num_removed_user_records)
{
	this->num_removed_user_records = num_removed_user_records;
}

long
CustomerList::getNumUploadedUserRecords()
{
	return num_uploaded_user_records;
}

void
CustomerList::setNumUploadedUserRecords(long  num_uploaded_user_records)
{
	this->num_uploaded_user_records = num_uploaded_user_records;
}

std::string
CustomerList::getStatus()
{
	return status;
}

void
CustomerList::setStatus(std::string  status)
{
	this->status = status;
}

std::string
CustomerList::getType()
{
	return type;
}

void
CustomerList::setType(std::string  type)
{
	this->type = type;
}

long
CustomerList::getUpdatedTime()
{
	return updated_time;
}

void
CustomerList::setUpdatedTime(long  updated_time)
{
	this->updated_time = updated_time;
}



