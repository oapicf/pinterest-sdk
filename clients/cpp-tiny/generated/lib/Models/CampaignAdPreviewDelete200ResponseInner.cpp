

#include "Campaign_ad_preview_delete_200_response_inner.h"

using namespace Tiny;

Campaign_ad_preview_delete_200_response_inner::Campaign_ad_preview_delete_200_response_inner()
{
	status = Campaign_ad_preview_delete_200_response_inner_status();
}

Campaign_ad_preview_delete_200_response_inner::Campaign_ad_preview_delete_200_response_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

Campaign_ad_preview_delete_200_response_inner::~Campaign_ad_preview_delete_200_response_inner()
{

}

void
Campaign_ad_preview_delete_200_response_inner::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];




        Campaign_ad_preview_delete_200_response_inner_status* obj = &status;
		obj->fromJson(value.dump());

    }


}

bourne::json
Campaign_ad_preview_delete_200_response_inner::toJson()
{
    bourne::json object = bourne::json::object();






	object["status"] = getStatus().toJson();


    return object;

}

Campaign_ad_preview_delete_200_response_inner_status
Campaign_ad_preview_delete_200_response_inner::getStatus()
{
	return status;
}

void
Campaign_ad_preview_delete_200_response_inner::setStatus(Campaign_ad_preview_delete_200_response_inner_status status)
{
	this->status = status;
}



