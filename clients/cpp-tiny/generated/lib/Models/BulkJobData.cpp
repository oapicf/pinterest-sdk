

#include "BulkJobData.h"

using namespace Tiny;

BulkJobData::BulkJobData()
{
	result_url = std::string();
	status = BulkRequestStatus();
	workload_id = int(0);
}

BulkJobData::BulkJobData(std::string jsonString)
{
	this->fromJson(jsonString);
}

BulkJobData::~BulkJobData()
{

}

void
BulkJobData::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *result_urlKey = "result_url";

    if(object.has_key(result_urlKey))
    {
        bourne::json value = object[result_urlKey];



        jsonToValue(&result_url, value, "std::string");


    }

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];




        BulkRequestStatus* obj = &status;
		obj->fromJson(value.dump());

    }

    const char *workload_idKey = "workload_id";

    if(object.has_key(workload_idKey))
    {
        bourne::json value = object[workload_idKey];



        jsonToValue(&workload_id, value, "int");


    }


}

bourne::json
BulkJobData::toJson()
{
    bourne::json object = bourne::json::object();





    object["result_url"] = getResultUrl();







	object["status"] = getStatus().toJson();





    object["workload_id"] = getWorkloadId();



    return object;

}

std::string
BulkJobData::getResultUrl()
{
	return result_url;
}

void
BulkJobData::setResultUrl(std::string result_url)
{
	this->result_url = result_url;
}

BulkRequestStatus
BulkJobData::getStatus()
{
	return status;
}

void
BulkJobData::setStatus(BulkRequestStatus status)
{
	this->status = status;
}

int
BulkJobData::getWorkloadId()
{
	return workload_id;
}

void
BulkJobData::setWorkloadId(int workload_id)
{
	this->workload_id = workload_id;
}



