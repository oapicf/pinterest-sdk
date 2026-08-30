

#include "SupplementalItemsBatchResponse.h"

using namespace Tiny;

SupplementalItemsBatchResponse::SupplementalItemsBatchResponse()
{
	batch_id = std::string();
	completed_time = std::string();
	created_time = std::string();
	operation_results = std::list<SupplementalOperationResult>();
	status = null;
}

SupplementalItemsBatchResponse::SupplementalItemsBatchResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

SupplementalItemsBatchResponse::~SupplementalItemsBatchResponse()
{

}

void
SupplementalItemsBatchResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *batch_idKey = "batch_id";

    if(object.has_key(batch_idKey))
    {
        bourne::json value = object[batch_idKey];



        jsonToValue(&batch_id, value, "std::string");


    }

    const char *completed_timeKey = "completed_time";

    if(object.has_key(completed_timeKey))
    {
        bourne::json value = object[completed_timeKey];



        jsonToValue(&completed_time, value, "std::string");


    }

    const char *created_timeKey = "created_time";

    if(object.has_key(created_timeKey))
    {
        bourne::json value = object[created_timeKey];



        jsonToValue(&created_time, value, "std::string");


    }

    const char *operation_resultsKey = "operation_results";

    if(object.has_key(operation_resultsKey))
    {
        bourne::json value = object[operation_resultsKey];


        std::list<SupplementalOperationResult> operation_results_list;
        SupplementalOperationResult element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            operation_results_list.push_back(element);
        }
        operation_results = operation_results_list;


    }

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];




        SupplementalItemBatchOperationStatus* obj = &status;
		obj->fromJson(value.dump());

    }


}

bourne::json
SupplementalItemsBatchResponse::toJson()
{
    bourne::json object = bourne::json::object();





    object["batch_id"] = getBatchId();






    object["completed_time"] = getCompletedTime();






    object["created_time"] = getCreatedTime();





    std::list<SupplementalOperationResult> operation_results_list = getOperationResults();
    bourne::json operation_results_arr = bourne::json::array();

    for(auto& var : operation_results_list)
    {
        SupplementalOperationResult obj = var;
        operation_results_arr.append(obj.toJson());
    }
    object["operation_results"] = operation_results_arr;








	object["status"] = getStatus().toJson();


    return object;

}

std::string
SupplementalItemsBatchResponse::getBatchId()
{
	return batch_id;
}

void
SupplementalItemsBatchResponse::setBatchId(std::string batch_id)
{
	this->batch_id = batch_id;
}

std::string
SupplementalItemsBatchResponse::getCompletedTime()
{
	return completed_time;
}

void
SupplementalItemsBatchResponse::setCompletedTime(std::string completed_time)
{
	this->completed_time = completed_time;
}

std::string
SupplementalItemsBatchResponse::getCreatedTime()
{
	return created_time;
}

void
SupplementalItemsBatchResponse::setCreatedTime(std::string created_time)
{
	this->created_time = created_time;
}

std::list<SupplementalOperationResult>
SupplementalItemsBatchResponse::getOperationResults()
{
	return operation_results;
}

void
SupplementalItemsBatchResponse::setOperationResults(std::list<SupplementalOperationResult> operation_results)
{
	this->operation_results = operation_results;
}

SupplementalItemBatchOperationStatus
SupplementalItemsBatchResponse::getStatus()
{
	return status;
}

void
SupplementalItemsBatchResponse::setStatus(SupplementalItemBatchOperationStatus status)
{
	this->status = status;
}



