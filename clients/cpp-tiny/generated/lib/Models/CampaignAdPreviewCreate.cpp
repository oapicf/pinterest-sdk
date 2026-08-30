

#include "CampaignAdPreviewCreate.h"

using namespace Tiny;

CampaignAdPreviewCreate::CampaignAdPreviewCreate()
{
	ad_group_id = std::string();
}

CampaignAdPreviewCreate::CampaignAdPreviewCreate(std::string jsonString)
{
	this->fromJson(jsonString);
}

CampaignAdPreviewCreate::~CampaignAdPreviewCreate()
{

}

void
CampaignAdPreviewCreate::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *ad_group_idKey = "ad_group_id";

    if(object.has_key(ad_group_idKey))
    {
        bourne::json value = object[ad_group_idKey];



        jsonToValue(&ad_group_id, value, "std::string");


    }


}

bourne::json
CampaignAdPreviewCreate::toJson()
{
    bourne::json object = bourne::json::object();





    object["ad_group_id"] = getAdGroupId();



    return object;

}

std::string
CampaignAdPreviewCreate::getAdGroupId()
{
	return ad_group_id;
}

void
CampaignAdPreviewCreate::setAdGroupId(std::string ad_group_id)
{
	this->ad_group_id = ad_group_id;
}



