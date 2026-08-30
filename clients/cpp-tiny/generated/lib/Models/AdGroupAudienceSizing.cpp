

#include "AdGroupAudienceSizing.h"

using namespace Tiny;

AdGroupAudienceSizing::AdGroupAudienceSizing()
{
	audience_size_lower_bound = float(0);
	audience_size_upper_bound = float(0);
}

AdGroupAudienceSizing::AdGroupAudienceSizing(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdGroupAudienceSizing::~AdGroupAudienceSizing()
{

}

void
AdGroupAudienceSizing::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *audience_size_lower_boundKey = "audience_size_lower_bound";

    if(object.has_key(audience_size_lower_boundKey))
    {
        bourne::json value = object[audience_size_lower_boundKey];



        jsonToValue(&audience_size_lower_bound, value, "long");


    }

    const char *audience_size_upper_boundKey = "audience_size_upper_bound";

    if(object.has_key(audience_size_upper_boundKey))
    {
        bourne::json value = object[audience_size_upper_boundKey];



        jsonToValue(&audience_size_upper_bound, value, "long");


    }


}

bourne::json
AdGroupAudienceSizing::toJson()
{
    bourne::json object = bourne::json::object();





    object["audience_size_lower_bound"] = getAudienceSizeLowerBound();






    object["audience_size_upper_bound"] = getAudienceSizeUpperBound();



    return object;

}

long
AdGroupAudienceSizing::getAudienceSizeLowerBound()
{
	return audience_size_lower_bound;
}

void
AdGroupAudienceSizing::setAudienceSizeLowerBound(long audience_size_lower_bound)
{
	this->audience_size_lower_bound = audience_size_lower_bound;
}

long
AdGroupAudienceSizing::getAudienceSizeUpperBound()
{
	return audience_size_upper_bound;
}

void
AdGroupAudienceSizing::setAudienceSizeUpperBound(long audience_size_upper_bound)
{
	this->audience_size_upper_bound = audience_size_upper_bound;
}



