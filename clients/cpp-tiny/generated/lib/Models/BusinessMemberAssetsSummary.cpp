

#include "BusinessMemberAssetsSummary.h"

using namespace Tiny;

BusinessMemberAssetsSummary::BusinessMemberAssetsSummary()
{
	ad_accounts = std::list<AssetIdWithPermissions>();
	profiles = std::list<AssetIdWithPermissions>();
}

BusinessMemberAssetsSummary::BusinessMemberAssetsSummary(std::string jsonString)
{
	this->fromJson(jsonString);
}

BusinessMemberAssetsSummary::~BusinessMemberAssetsSummary()
{

}

void
BusinessMemberAssetsSummary::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *ad_accountsKey = "ad_accounts";

    if(object.has_key(ad_accountsKey))
    {
        bourne::json value = object[ad_accountsKey];


        std::list<AssetIdWithPermissions> ad_accounts_list;
        AssetIdWithPermissions element;
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


        std::list<AssetIdWithPermissions> profiles_list;
        AssetIdWithPermissions element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            profiles_list.push_back(element);
        }
        profiles = profiles_list;


    }


}

bourne::json
BusinessMemberAssetsSummary::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<AssetIdWithPermissions> ad_accounts_list = getAdAccounts();
    bourne::json ad_accounts_arr = bourne::json::array();

    for(auto& var : ad_accounts_list)
    {
        AssetIdWithPermissions obj = var;
        ad_accounts_arr.append(obj.toJson());
    }
    object["ad_accounts"] = ad_accounts_arr;






    std::list<AssetIdWithPermissions> profiles_list = getProfiles();
    bourne::json profiles_arr = bourne::json::array();

    for(auto& var : profiles_list)
    {
        AssetIdWithPermissions obj = var;
        profiles_arr.append(obj.toJson());
    }
    object["profiles"] = profiles_arr;




    return object;

}

std::list<AssetIdWithPermissions>
BusinessMemberAssetsSummary::getAdAccounts()
{
	return ad_accounts;
}

void
BusinessMemberAssetsSummary::setAdAccounts(std::list<AssetIdWithPermissions> ad_accounts)
{
	this->ad_accounts = ad_accounts;
}

std::list<AssetIdWithPermissions>
BusinessMemberAssetsSummary::getProfiles()
{
	return profiles;
}

void
BusinessMemberAssetsSummary::setProfiles(std::list<AssetIdWithPermissions> profiles)
{
	this->profiles = profiles;
}



