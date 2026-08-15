

#include "CatalogsFeedProcessingStatus.h"

using namespace Tiny;

CatalogsFeedProcessingStatus::CatalogsFeedProcessingStatus()
{
}

CatalogsFeedProcessingStatus::CatalogsFeedProcessingStatus(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsFeedProcessingStatus::~CatalogsFeedProcessingStatus()
{

}

void
CatalogsFeedProcessingStatus::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
CatalogsFeedProcessingStatus::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



