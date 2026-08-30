

#include "SupplementalItemBatchOperationStatus.h"

using namespace Tiny;

SupplementalItemBatchOperationStatus::SupplementalItemBatchOperationStatus()
{
}

SupplementalItemBatchOperationStatus::SupplementalItemBatchOperationStatus(std::string jsonString)
{
	this->fromJson(jsonString);
}

SupplementalItemBatchOperationStatus::~SupplementalItemBatchOperationStatus()
{

}

void
SupplementalItemBatchOperationStatus::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
SupplementalItemBatchOperationStatus::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



