

#include "AdGroupAudienceSizingResponse.h"

using namespace Tiny;

AdGroupAudienceSizingResponse::AdGroupAudienceSizingResponse()
{
	audience_size_lower_bound = float(0);
	audience_size_upper_bound = float(0);
}

AdGroupAudienceSizingResponse::AdGroupAudienceSizingResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdGroupAudienceSizingResponse::~AdGroupAudienceSizingResponse()
{

}

void
AdGroupAudienceSizingResponse::fromJson(std::string jsonObj)
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
AdGroupAudienceSizingResponse::toJson()
{
    bourne::json object = bourne::json::object();





    object["audience_size_lower_bound"] = getAudienceSizeLowerBound();






    object["audience_size_upper_bound"] = getAudienceSizeUpperBound();



    return object;

}

long
AdGroupAudienceSizingResponse::getAudienceSizeLowerBound()
{
	return audience_size_lower_bound;
}

void
AdGroupAudienceSizingResponse::setAudienceSizeLowerBound(long  audience_size_lower_bound)
{
	this->audience_size_lower_bound = audience_size_lower_bound;
}

long
AdGroupAudienceSizingResponse::getAudienceSizeUpperBound()
{
	return audience_size_upper_bound;
}

void
AdGroupAudienceSizingResponse::setAudienceSizeUpperBound(long  audience_size_upper_bound)
{
	this->audience_size_upper_bound = audience_size_upper_bound;
}



