

#include "Campaign_ad_preview_create_200_response_inner.h"

using namespace Tiny;

Campaign_ad_preview_create_200_response_inner::Campaign_ad_preview_create_200_response_inner()
{
	data = Campaign_ad_preview_create_200_response_inner_data();
}

Campaign_ad_preview_create_200_response_inner::Campaign_ad_preview_create_200_response_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

Campaign_ad_preview_create_200_response_inner::~Campaign_ad_preview_create_200_response_inner()
{

}

void
Campaign_ad_preview_create_200_response_inner::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *dataKey = "data";

    if(object.has_key(dataKey))
    {
        bourne::json value = object[dataKey];




        Campaign_ad_preview_create_200_response_inner_data* obj = &data;
		obj->fromJson(value.dump());

    }


}

bourne::json
Campaign_ad_preview_create_200_response_inner::toJson()
{
    bourne::json object = bourne::json::object();






	object["data"] = getData().toJson();


    return object;

}

Campaign_ad_preview_create_200_response_inner_data
Campaign_ad_preview_create_200_response_inner::getData()
{
	return data;
}

void
Campaign_ad_preview_create_200_response_inner::setData(Campaign_ad_preview_create_200_response_inner_data data)
{
	this->data = data;
}



