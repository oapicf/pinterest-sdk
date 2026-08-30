

#include "InviteAssetsSummary.h"

using namespace Tiny;

InviteAssetsSummary::InviteAssetsSummary()
{
	ad_accounts = std::list<InviteAssetsSummaryItem>();
	profiles = std::list<InviteAssetsSummaryItem>();
}

InviteAssetsSummary::InviteAssetsSummary(std::string jsonString)
{
	this->fromJson(jsonString);
}

InviteAssetsSummary::~InviteAssetsSummary()
{

}

void
InviteAssetsSummary::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *ad_accountsKey = "ad_accounts";

    if(object.has_key(ad_accountsKey))
    {
        bourne::json value = object[ad_accountsKey];


        std::list<InviteAssetsSummaryItem> ad_accounts_list;
        InviteAssetsSummaryItem element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            ad_accounts_list.push_back(element);
        }
        ad_accounts = ad_accounts_list;


    }

    const char *profilesKey = "profiles";

    if(object.has_key(profilesKey))
    {
        bourne::json value = object[profilesKey];


        std::list<InviteAssetsSummaryItem> profiles_list;
        InviteAssetsSummaryItem element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            profiles_list.push_back(element);
        }
        profiles = profiles_list;


    }


}

bourne::json
InviteAssetsSummary::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<InviteAssetsSummaryItem> ad_accounts_list = getAdAccounts();
    bourne::json ad_accounts_arr = bourne::json::array();

    for(auto& var : ad_accounts_list)
    {
        InviteAssetsSummaryItem obj = var;
        ad_accounts_arr.append(obj.toJson());
    }
    object["ad_accounts"] = ad_accounts_arr;






    std::list<InviteAssetsSummaryItem> profiles_list = getProfiles();
    bourne::json profiles_arr = bourne::json::array();

    for(auto& var : profiles_list)
    {
        InviteAssetsSummaryItem obj = var;
        profiles_arr.append(obj.toJson());
    }
    object["profiles"] = profiles_arr;




    return object;

}

std::list<InviteAssetsSummaryItem>
InviteAssetsSummary::getAdAccounts()
{
	return ad_accounts;
}

void
InviteAssetsSummary::setAdAccounts(std::list<InviteAssetsSummaryItem> ad_accounts)
{
	this->ad_accounts = ad_accounts;
}

std::list<InviteAssetsSummaryItem>
InviteAssetsSummary::getProfiles()
{
	return profiles;
}

void
InviteAssetsSummary::setProfiles(std::list<InviteAssetsSummaryItem> profiles)
{
	this->profiles = profiles;
}



