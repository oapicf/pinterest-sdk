

#include "ItemProcessingStatus.h"

using namespace Tiny;

ItemProcessingStatus::ItemProcessingStatus()
{
}

ItemProcessingStatus::ItemProcessingStatus(std::string jsonString)
{
	this->fromJson(jsonString);
}

ItemProcessingStatus::~ItemProcessingStatus()
{

}

void
ItemProcessingStatus::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
ItemProcessingStatus::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



