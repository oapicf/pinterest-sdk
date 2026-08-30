

#include "BulkRequestStatus.h"

using namespace Tiny;

BulkRequestStatus::BulkRequestStatus()
{
}

BulkRequestStatus::BulkRequestStatus(std::string jsonString)
{
	this->fromJson(jsonString);
}

BulkRequestStatus::~BulkRequestStatus()
{

}

void
BulkRequestStatus::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
BulkRequestStatus::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



