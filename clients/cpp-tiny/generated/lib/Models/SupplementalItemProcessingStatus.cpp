

#include "SupplementalItemProcessingStatus.h"

using namespace Tiny;

SupplementalItemProcessingStatus::SupplementalItemProcessingStatus()
{
}

SupplementalItemProcessingStatus::SupplementalItemProcessingStatus(std::string jsonString)
{
	this->fromJson(jsonString);
}

SupplementalItemProcessingStatus::~SupplementalItemProcessingStatus()
{

}

void
SupplementalItemProcessingStatus::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
SupplementalItemProcessingStatus::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



