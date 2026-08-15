

#include "AdsAnalyticsFilterColumn.h"

using namespace Tiny;

AdsAnalyticsFilterColumn::AdsAnalyticsFilterColumn()
{
}

AdsAnalyticsFilterColumn::AdsAnalyticsFilterColumn(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdsAnalyticsFilterColumn::~AdsAnalyticsFilterColumn()
{

}

void
AdsAnalyticsFilterColumn::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
AdsAnalyticsFilterColumn::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



