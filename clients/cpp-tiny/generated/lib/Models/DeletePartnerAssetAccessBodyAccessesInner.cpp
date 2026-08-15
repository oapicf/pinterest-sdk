

#include "DeletePartnerAssetAccessBody_accesses_inner.h"

using namespace Tiny;

DeletePartnerAssetAccessBody_accesses_inner::DeletePartnerAssetAccessBody_accesses_inner()
{
	asset_id = std::string();
	partner_id = std::string();
	partner_type = std::string();
}

DeletePartnerAssetAccessBody_accesses_inner::DeletePartnerAssetAccessBody_accesses_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

DeletePartnerAssetAccessBody_accesses_inner::~DeletePartnerAssetAccessBody_accesses_inner()
{

}

void
DeletePartnerAssetAccessBody_accesses_inner::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *asset_idKey = "asset_id";

    if(object.has_key(asset_idKey))
    {
        bourne::json value = object[asset_idKey];



        jsonToValue(&asset_id, value, "std::string");


    }

    const char *partner_idKey = "partner_id";

    if(object.has_key(partner_idKey))
    {
        bourne::json value = object[partner_idKey];



        jsonToValue(&partner_id, value, "std::string");


    }

    const char *partner_typeKey = "partner_type";

    if(object.has_key(partner_typeKey))
    {
        bourne::json value = object[partner_typeKey];



        jsonToValue(&partner_type, value, "std::string");


    }


}

bourne::json
DeletePartnerAssetAccessBody_accesses_inner::toJson()
{
    bourne::json object = bourne::json::object();





    object["asset_id"] = getAssetId();






    object["partner_id"] = getPartnerId();






    object["partner_type"] = getPartnerType();



    return object;

}

std::string
DeletePartnerAssetAccessBody_accesses_inner::getAssetId()
{
	return asset_id;
}

void
DeletePartnerAssetAccessBody_accesses_inner::setAssetId(std::string  asset_id)
{
	this->asset_id = asset_id;
}

std::string
DeletePartnerAssetAccessBody_accesses_inner::getPartnerId()
{
	return partner_id;
}

void
DeletePartnerAssetAccessBody_accesses_inner::setPartnerId(std::string  partner_id)
{
	this->partner_id = partner_id;
}

std::string
DeletePartnerAssetAccessBody_accesses_inner::getPartnerType()
{
	return partner_type;
}

void
DeletePartnerAssetAccessBody_accesses_inner::setPartnerType(std::string  partner_type)
{
	this->partner_type = partner_type;
}



