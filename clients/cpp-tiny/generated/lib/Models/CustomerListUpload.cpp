

#include "CustomerListUpload.h"

using namespace Tiny;

CustomerListUpload::CustomerListUpload()
{
	ad_account_id = null;
	creation_time = int(0);
	customer_list_id = null;
	error_counts = std::list<ErrorDetail>();
	id = null;
	operation = UserListOperationType();
	record_counts = null;
	state = null;
	updated_time = int(0);
}

CustomerListUpload::CustomerListUpload(std::string jsonString)
{
	this->fromJson(jsonString);
}

CustomerListUpload::~CustomerListUpload()
{

}

void
CustomerListUpload::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *ad_account_idKey = "ad_account_id";

    if(object.has_key(ad_account_idKey))
    {
        bourne::json value = object[ad_account_idKey];



        jsonToValue(&ad_account_id, value, "std::string");


    }

    const char *creation_timeKey = "creation_time";

    if(object.has_key(creation_timeKey))
    {
        bourne::json value = object[creation_timeKey];



        jsonToValue(&creation_time, value, "int");


    }

    const char *customer_list_idKey = "customer_list_id";

    if(object.has_key(customer_list_idKey))
    {
        bourne::json value = object[customer_list_idKey];



        jsonToValue(&customer_list_id, value, "std::string");


    }

    const char *error_countsKey = "error_counts";

    if(object.has_key(error_countsKey))
    {
        bourne::json value = object[error_countsKey];


        std::list<ErrorDetail> error_counts_list;
        ErrorDetail element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            error_counts_list.push_back(element);
        }
        error_counts = error_counts_list;


    }

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *operationKey = "operation";

    if(object.has_key(operationKey))
    {
        bourne::json value = object[operationKey];




        UserListOperationType* obj = &operation;
		obj->fromJson(value.dump());

    }

    const char *record_countsKey = "record_counts";

    if(object.has_key(record_countsKey))
    {
        bourne::json value = object[record_countsKey];




        RecordCounts* obj = &record_counts;
		obj->fromJson(value.dump());

    }

    const char *stateKey = "state";

    if(object.has_key(stateKey))
    {
        bourne::json value = object[stateKey];




        WorkloadState* obj = &state;
		obj->fromJson(value.dump());

    }

    const char *updated_timeKey = "updated_time";

    if(object.has_key(updated_timeKey))
    {
        bourne::json value = object[updated_timeKey];



        jsonToValue(&updated_time, value, "int");


    }


}

bourne::json
CustomerListUpload::toJson()
{
    bourne::json object = bourne::json::object();





    object["ad_account_id"] = getAdAccountId();






    object["creation_time"] = getCreationTime();






    object["customer_list_id"] = getCustomerListId();





    std::list<ErrorDetail> error_counts_list = getErrorCounts();
    bourne::json error_counts_arr = bourne::json::array();

    for(auto& var : error_counts_list)
    {
        ErrorDetail obj = var;
        error_counts_arr.append(obj.toJson());
    }
    object["error_counts"] = error_counts_arr;







    object["id"] = getId();







	object["operation"] = getOperation().toJson();






	object["record_counts"] = getRecordCounts().toJson();






	object["state"] = getState().toJson();





    object["updated_time"] = getUpdatedTime();



    return object;

}

std::string
CustomerListUpload::getAdAccountId()
{
	return ad_account_id;
}

void
CustomerListUpload::setAdAccountId(std::string ad_account_id)
{
	this->ad_account_id = ad_account_id;
}

int
CustomerListUpload::getCreationTime()
{
	return creation_time;
}

void
CustomerListUpload::setCreationTime(int creation_time)
{
	this->creation_time = creation_time;
}

std::string
CustomerListUpload::getCustomerListId()
{
	return customer_list_id;
}

void
CustomerListUpload::setCustomerListId(std::string customer_list_id)
{
	this->customer_list_id = customer_list_id;
}

std::list<ErrorDetail>
CustomerListUpload::getErrorCounts()
{
	return error_counts;
}

void
CustomerListUpload::setErrorCounts(std::list<ErrorDetail> error_counts)
{
	this->error_counts = error_counts;
}

std::string
CustomerListUpload::getId()
{
	return id;
}

void
CustomerListUpload::setId(std::string id)
{
	this->id = id;
}

UserListOperationType
CustomerListUpload::getOperation()
{
	return operation;
}

void
CustomerListUpload::setOperation(UserListOperationType operation)
{
	this->operation = operation;
}

RecordCounts
CustomerListUpload::getRecordCounts()
{
	return record_counts;
}

void
CustomerListUpload::setRecordCounts(RecordCounts record_counts)
{
	this->record_counts = record_counts;
}

WorkloadState
CustomerListUpload::getState()
{
	return state;
}

void
CustomerListUpload::setState(WorkloadState state)
{
	this->state = state;
}

int
CustomerListUpload::getUpdatedTime()
{
	return updated_time;
}

void
CustomerListUpload::setUpdatedTime(int updated_time)
{
	this->updated_time = updated_time;
}



