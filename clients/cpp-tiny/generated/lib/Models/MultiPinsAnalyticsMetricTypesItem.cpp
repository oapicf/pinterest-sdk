

#include "MultiPinsAnalyticsMetricTypesItem.h"

using namespace Tiny;

MultiPinsAnalyticsMetricTypesItem::MultiPinsAnalyticsMetricTypesItem()
{
}

MultiPinsAnalyticsMetricTypesItem::MultiPinsAnalyticsMetricTypesItem(std::string jsonString)
{
	this->fromJson(jsonString);
}

MultiPinsAnalyticsMetricTypesItem::~MultiPinsAnalyticsMetricTypesItem()
{

}

void
MultiPinsAnalyticsMetricTypesItem::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
MultiPinsAnalyticsMetricTypesItem::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



