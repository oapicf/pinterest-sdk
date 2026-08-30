

#include "AdgroupTrackingFeatures.h"

using namespace Tiny;

AdgroupTrackingFeatures::AdgroupTrackingFeatures()
{
	enabled = std::list<AdgroupTrackingFeatureType>();
}

AdgroupTrackingFeatures::AdgroupTrackingFeatures(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdgroupTrackingFeatures::~AdgroupTrackingFeatures()
{

}

void
AdgroupTrackingFeatures::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *enabledKey = "enabled";

    if(object.has_key(enabledKey))
    {
        bourne::json value = object[enabledKey];


        std::list<AdgroupTrackingFeatureType> enabled_list;
        AdgroupTrackingFeatureType element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            enabled_list.push_back(element);
        }
        enabled = enabled_list;


    }


}

bourne::json
AdgroupTrackingFeatures::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<AdgroupTrackingFeatureType> enabled_list = getEnabled();
    bourne::json enabled_arr = bourne::json::array();

    for(auto& var : enabled_list)
    {
        AdgroupTrackingFeatureType obj = var;
        enabled_arr.append(obj.toJson());
    }
    object["enabled"] = enabled_arr;




    return object;

}

std::list<AdgroupTrackingFeatureType>
AdgroupTrackingFeatures::getEnabled()
{
	return enabled;
}

void
AdgroupTrackingFeatures::setEnabled(std::list<AdgroupTrackingFeatureType> enabled)
{
	this->enabled = enabled;
}



