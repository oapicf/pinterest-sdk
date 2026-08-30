

#include "AdgroupTrackingFeatureType.h"

using namespace Tiny;

AdgroupTrackingFeatureType::AdgroupTrackingFeatureType()
{
}

AdgroupTrackingFeatureType::AdgroupTrackingFeatureType(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdgroupTrackingFeatureType::~AdgroupTrackingFeatureType()
{

}

void
AdgroupTrackingFeatureType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
AdgroupTrackingFeatureType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



