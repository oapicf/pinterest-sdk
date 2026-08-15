

#include "BulkReportingJobStatus.h"

using namespace Tiny;

BulkReportingJobStatus::BulkReportingJobStatus()
{
}

BulkReportingJobStatus::BulkReportingJobStatus(std::string jsonString)
{
	this->fromJson(jsonString);
}

BulkReportingJobStatus::~BulkReportingJobStatus()
{

}

void
BulkReportingJobStatus::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
BulkReportingJobStatus::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



