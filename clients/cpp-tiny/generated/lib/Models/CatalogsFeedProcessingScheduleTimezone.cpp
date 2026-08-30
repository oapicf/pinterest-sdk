

#include "CatalogsFeedProcessingScheduleTimezone.h"

using namespace Tiny;

CatalogsFeedProcessingScheduleTimezone::CatalogsFeedProcessingScheduleTimezone()
{
}

CatalogsFeedProcessingScheduleTimezone::CatalogsFeedProcessingScheduleTimezone(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsFeedProcessingScheduleTimezone::~CatalogsFeedProcessingScheduleTimezone()
{

}

void
CatalogsFeedProcessingScheduleTimezone::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
CatalogsFeedProcessingScheduleTimezone::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



