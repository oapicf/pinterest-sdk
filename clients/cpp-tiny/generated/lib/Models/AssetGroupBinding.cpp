

#include "AssetGroupBinding.h"

using namespace Tiny;

AssetGroupBinding::AssetGroupBinding()
{
	ad_accounts_ids = std::list<std::string>();
	asset_group_description = std::string();
	asset_group_name = std::string();
	asset_group_types = std::list<std::string>();
	catalogs_ids = std::list<std::string>();
	created_by = null;
	created_time = int(0);
	id = std::string();
	owner = null;
	profiles_ids = std::list<std::string>();
	updated_time = int(0);
}

AssetGroupBinding::AssetGroupBinding(std::string jsonString)
{
	this->fromJson(jsonString);
}

AssetGroupBinding::~AssetGroupBinding()
{

}

void
AssetGroupBinding::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *ad_accounts_idsKey = "ad_accounts_ids";

    if(object.has_key(ad_accounts_idsKey))
    {
        bourne::json value = object[ad_accounts_idsKey];


        std::list<std::string> ad_accounts_ids_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            ad_accounts_ids_list.push_back(element);
        }
        ad_accounts_ids = ad_accounts_ids_list;


    }

    const char *asset_group_descriptionKey = "asset_group_description";

    if(object.has_key(asset_group_descriptionKey))
    {
        bourne::json value = object[asset_group_descriptionKey];



        jsonToValue(&asset_group_description, value, "std::string");


    }

    const char *asset_group_nameKey = "asset_group_name";

    if(object.has_key(asset_group_nameKey))
    {
        bourne::json value = object[asset_group_nameKey];



        jsonToValue(&asset_group_name, value, "std::string");


    }

    const char *asset_group_typesKey = "asset_group_types";

    if(object.has_key(asset_group_typesKey))
    {
        bourne::json value = object[asset_group_typesKey];


        std::list<std::string> asset_group_types_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            asset_group_types_list.push_back(element);
        }
        asset_group_types = asset_group_types_list;


    }

    const char *catalogs_idsKey = "catalogs_ids";

    if(object.has_key(catalogs_idsKey))
    {
        bourne::json value = object[catalogs_idsKey];


        std::list<std::string> catalogs_ids_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            catalogs_ids_list.push_back(element);
        }
        catalogs_ids = catalogs_ids_list;


    }

    const char *created_byKey = "created_by";

    if(object.has_key(created_byKey))
    {
        bourne::json value = object[created_byKey];




        BusinessAccessUserSummary* obj = &created_by;
		obj->fromJson(value.dump());

    }

    const char *created_timeKey = "created_time";

    if(object.has_key(created_timeKey))
    {
        bourne::json value = object[created_timeKey];



        jsonToValue(&created_time, value, "int");


    }

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *ownerKey = "owner";

    if(object.has_key(ownerKey))
    {
        bourne::json value = object[ownerKey];




        BusinessAccessUserSummary* obj = &owner;
		obj->fromJson(value.dump());

    }

    const char *profiles_idsKey = "profiles_ids";

    if(object.has_key(profiles_idsKey))
    {
        bourne::json value = object[profiles_idsKey];


        std::list<std::string> profiles_ids_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            profiles_ids_list.push_back(element);
        }
        profiles_ids = profiles_ids_list;


    }

    const char *updated_timeKey = "updated_time";

    if(object.has_key(updated_timeKey))
    {
        bourne::json value = object[updated_timeKey];



        jsonToValue(&updated_time, value, "int");


    }


}

bourne::json
AssetGroupBinding::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<std::string> ad_accounts_ids_list = getAdAccountsIds();
    bourne::json ad_accounts_ids_arr = bourne::json::array();

    for(auto& var : ad_accounts_ids_list)
    {
        ad_accounts_ids_arr.append(var);
    }
    object["ad_accounts_ids"] = ad_accounts_ids_arr;









    object["asset_group_description"] = getAssetGroupDescription();






    object["asset_group_name"] = getAssetGroupName();





    std::list<std::string> asset_group_types_list = getAssetGroupTypes();
    bourne::json asset_group_types_arr = bourne::json::array();

    for(auto& var : asset_group_types_list)
    {
        asset_group_types_arr.append(var);
    }
    object["asset_group_types"] = asset_group_types_arr;








    std::list<std::string> catalogs_ids_list = getCatalogsIds();
    bourne::json catalogs_ids_arr = bourne::json::array();

    for(auto& var : catalogs_ids_list)
    {
        catalogs_ids_arr.append(var);
    }
    object["catalogs_ids"] = catalogs_ids_arr;










	object["created_by"] = getCreatedBy().toJson();





    object["created_time"] = getCreatedTime();






    object["id"] = getId();







	object["owner"] = getOwner().toJson();




    std::list<std::string> profiles_ids_list = getProfilesIds();
    bourne::json profiles_ids_arr = bourne::json::array();

    for(auto& var : profiles_ids_list)
    {
        profiles_ids_arr.append(var);
    }
    object["profiles_ids"] = profiles_ids_arr;









    object["updated_time"] = getUpdatedTime();



    return object;

}

std::list<std::string>
AssetGroupBinding::getAdAccountsIds()
{
	return ad_accounts_ids;
}

void
AssetGroupBinding::setAdAccountsIds(std::list<std::string> ad_accounts_ids)
{
	this->ad_accounts_ids = ad_accounts_ids;
}

std::string
AssetGroupBinding::getAssetGroupDescription()
{
	return asset_group_description;
}

void
AssetGroupBinding::setAssetGroupDescription(std::string asset_group_description)
{
	this->asset_group_description = asset_group_description;
}

std::string
AssetGroupBinding::getAssetGroupName()
{
	return asset_group_name;
}

void
AssetGroupBinding::setAssetGroupName(std::string asset_group_name)
{
	this->asset_group_name = asset_group_name;
}

std::list<std::string>
AssetGroupBinding::getAssetGroupTypes()
{
	return asset_group_types;
}

void
AssetGroupBinding::setAssetGroupTypes(std::list<std::string> asset_group_types)
{
	this->asset_group_types = asset_group_types;
}

std::list<std::string>
AssetGroupBinding::getCatalogsIds()
{
	return catalogs_ids;
}

void
AssetGroupBinding::setCatalogsIds(std::list<std::string> catalogs_ids)
{
	this->catalogs_ids = catalogs_ids;
}

BusinessAccessUserSummary
AssetGroupBinding::getCreatedBy()
{
	return created_by;
}

void
AssetGroupBinding::setCreatedBy(BusinessAccessUserSummary created_by)
{
	this->created_by = created_by;
}

int
AssetGroupBinding::getCreatedTime()
{
	return created_time;
}

void
AssetGroupBinding::setCreatedTime(int created_time)
{
	this->created_time = created_time;
}

std::string
AssetGroupBinding::getId()
{
	return id;
}

void
AssetGroupBinding::setId(std::string id)
{
	this->id = id;
}

BusinessAccessUserSummary
AssetGroupBinding::getOwner()
{
	return owner;
}

void
AssetGroupBinding::setOwner(BusinessAccessUserSummary owner)
{
	this->owner = owner;
}

std::list<std::string>
AssetGroupBinding::getProfilesIds()
{
	return profiles_ids;
}

void
AssetGroupBinding::setProfilesIds(std::list<std::string> profiles_ids)
{
	this->profiles_ids = profiles_ids;
}

int
AssetGroupBinding::getUpdatedTime()
{
	return updated_time;
}

void
AssetGroupBinding::setUpdatedTime(int updated_time)
{
	this->updated_time = updated_time;
}



