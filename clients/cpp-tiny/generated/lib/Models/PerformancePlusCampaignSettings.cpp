

#include "PerformancePlusCampaignSettings.h"

using namespace Tiny;

PerformancePlusCampaignSettings::PerformancePlusCampaignSettings()
{
	boost_prospecting_ad_group_bid = bool(false);
	pinner_list_exclusions = std::list<std::string>();
}

PerformancePlusCampaignSettings::PerformancePlusCampaignSettings(std::string jsonString)
{
	this->fromJson(jsonString);
}

PerformancePlusCampaignSettings::~PerformancePlusCampaignSettings()
{

}

void
PerformancePlusCampaignSettings::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *boost_prospecting_ad_group_bidKey = "boost_prospecting_ad_group_bid";

    if(object.has_key(boost_prospecting_ad_group_bidKey))
    {
        bourne::json value = object[boost_prospecting_ad_group_bidKey];



        jsonToValue(&boost_prospecting_ad_group_bid, value, "bool");


    }

    const char *pinner_list_exclusionsKey = "pinner_list_exclusions";

    if(object.has_key(pinner_list_exclusionsKey))
    {
        bourne::json value = object[pinner_list_exclusionsKey];


        std::list<std::string> pinner_list_exclusions_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            pinner_list_exclusions_list.push_back(element);
        }
        pinner_list_exclusions = pinner_list_exclusions_list;


    }


}

bourne::json
PerformancePlusCampaignSettings::toJson()
{
    bourne::json object = bourne::json::object();





    object["boost_prospecting_ad_group_bid"] = isBoostProspectingAdGroupBid();





    std::list<std::string> pinner_list_exclusions_list = getPinnerListExclusions();
    bourne::json pinner_list_exclusions_arr = bourne::json::array();

    for(auto& var : pinner_list_exclusions_list)
    {
        pinner_list_exclusions_arr.append(var);
    }
    object["pinner_list_exclusions"] = pinner_list_exclusions_arr;






    return object;

}

bool
PerformancePlusCampaignSettings::isBoostProspectingAdGroupBid()
{
	return boost_prospecting_ad_group_bid;
}

void
PerformancePlusCampaignSettings::setBoostProspectingAdGroupBid(bool boost_prospecting_ad_group_bid)
{
	this->boost_prospecting_ad_group_bid = boost_prospecting_ad_group_bid;
}

std::list<std::string>
PerformancePlusCampaignSettings::getPinnerListExclusions()
{
	return pinner_list_exclusions;
}

void
PerformancePlusCampaignSettings::setPinnerListExclusions(std::list<std::string> pinner_list_exclusions)
{
	this->pinner_list_exclusions = pinner_list_exclusions;
}



