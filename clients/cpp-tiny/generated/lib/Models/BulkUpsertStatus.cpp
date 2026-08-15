

#include "BulkUpsertStatus.h"

using namespace Tiny;

BulkUpsertStatus::BulkUpsertStatus()
{
}

BulkUpsertStatus::BulkUpsertStatus(std::string jsonString)
{
	this->fromJson(jsonString);
}

BulkUpsertStatus::~BulkUpsertStatus()
{

}

void
BulkUpsertStatus::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
BulkUpsertStatus::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



