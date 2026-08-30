

#include "DeletePartnerAssetAccessItem.h"

using namespace Tiny;

DeletePartnerAssetAccessItem::DeletePartnerAssetAccessItem()
{
	asset_id = std::string();
	partner_id = std::string();
	partner_type = std::string();
}

DeletePartnerAssetAccessItem::DeletePartnerAssetAccessItem(std::string jsonString)
{
	this->fromJson(jsonString);
}

DeletePartnerAssetAccessItem::~DeletePartnerAssetAccessItem()
{

}

void
DeletePartnerAssetAccessItem::fromJson(std::string jsonObj)
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
DeletePartnerAssetAccessItem::toJson()
{
    bourne::json object = bourne::json::object();





    object["asset_id"] = getAssetId();






    object["partner_id"] = getPartnerId();






    object["partner_type"] = getPartnerType();



    return object;

}

std::string
DeletePartnerAssetAccessItem::getAssetId()
{
	return asset_id;
}

void
DeletePartnerAssetAccessItem::setAssetId(std::string asset_id)
{
	this->asset_id = asset_id;
}

std::string
DeletePartnerAssetAccessItem::getPartnerId()
{
	return partner_id;
}

void
DeletePartnerAssetAccessItem::setPartnerId(std::string partner_id)
{
	this->partner_id = partner_id;
}

std::string
DeletePartnerAssetAccessItem::getPartnerType()
{
	return partner_type;
}

void
DeletePartnerAssetAccessItem::setPartnerType(std::string partner_type)
{
	this->partner_type = partner_type;
}



