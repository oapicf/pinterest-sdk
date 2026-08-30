

#include "ConversionDeletionRequestStatus.h"

using namespace Tiny;

ConversionDeletionRequestStatus::ConversionDeletionRequestStatus()
{
}

ConversionDeletionRequestStatus::ConversionDeletionRequestStatus(std::string jsonString)
{
	this->fromJson(jsonString);
}

ConversionDeletionRequestStatus::~ConversionDeletionRequestStatus()
{

}

void
ConversionDeletionRequestStatus::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
ConversionDeletionRequestStatus::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



