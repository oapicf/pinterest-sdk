

#include "CampaignIdFilter.h"

using namespace Tiny;

CampaignIdFilter::CampaignIdFilter()
{
	campaign_ids = std::list<std::string>();
}

CampaignIdFilter::CampaignIdFilter(std::string jsonString)
{
	this->fromJson(jsonString);
}

CampaignIdFilter::~CampaignIdFilter()
{

}

void
CampaignIdFilter::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *campaign_idsKey = "campaign_ids";

    if(object.has_key(campaign_idsKey))
    {
        bourne::json value = object[campaign_idsKey];


        std::list<std::string> campaign_ids_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            campaign_ids_list.push_back(element);
        }
        campaign_ids = campaign_ids_list;


    }


}

bourne::json
CampaignIdFilter::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<std::string> campaign_ids_list = getCampaignIds();
    bourne::json campaign_ids_arr = bourne::json::array();

    for(auto& var : campaign_ids_list)
    {
        campaign_ids_arr.append(var);
    }
    object["campaign_ids"] = campaign_ids_arr;






    return object;

}

std::list<std::string>
CampaignIdFilter::getCampaignIds()
{
	return campaign_ids;
}

void
CampaignIdFilter::setCampaignIds(std::list <std::string> campaign_ids)
{
	this->campaign_ids = campaign_ids;
}



