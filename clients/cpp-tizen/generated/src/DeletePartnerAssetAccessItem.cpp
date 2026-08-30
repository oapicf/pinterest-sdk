#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "DeletePartnerAssetAccessItem.h"

using namespace std;
using namespace Tizen::ArtikCloud;

DeletePartnerAssetAccessItem::DeletePartnerAssetAccessItem()
{
	//__init();
}

DeletePartnerAssetAccessItem::~DeletePartnerAssetAccessItem()
{
	//__cleanup();
}

void
DeletePartnerAssetAccessItem::__init()
{
	//asset_id = std::string();
	//partner_id = std::string();
	//partner_type = std::string();
}

void
DeletePartnerAssetAccessItem::__cleanup()
{
	//if(asset_id != NULL) {
	//
	//delete asset_id;
	//asset_id = NULL;
	//}
	//if(partner_id != NULL) {
	//
	//delete partner_id;
	//partner_id = NULL;
	//}
	//if(partner_type != NULL) {
	//
	//delete partner_type;
	//partner_type = NULL;
	//}
	//
}

void
DeletePartnerAssetAccessItem::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *asset_idKey = "asset_id";
	node = json_object_get_member(pJsonObject, asset_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&asset_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *partner_idKey = "partner_id";
	node = json_object_get_member(pJsonObject, partner_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&partner_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *partner_typeKey = "partner_type";
	node = json_object_get_member(pJsonObject, partner_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&partner_type, node, "std::string", "");
		} else {
			
		}
	}
}

DeletePartnerAssetAccessItem::DeletePartnerAssetAccessItem(char* json)
{
	this->fromJson(json);
}

char*
DeletePartnerAssetAccessItem::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getAssetId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *asset_idKey = "asset_id";
	json_object_set_member(pJsonObject, asset_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPartnerId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *partner_idKey = "partner_id";
	json_object_set_member(pJsonObject, partner_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPartnerType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *partner_typeKey = "partner_type";
	json_object_set_member(pJsonObject, partner_typeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
DeletePartnerAssetAccessItem::getAssetId()
{
	return asset_id;
}

void
DeletePartnerAssetAccessItem::setAssetId(std::string  asset_id)
{
	this->asset_id = asset_id;
}

std::string
DeletePartnerAssetAccessItem::getPartnerId()
{
	return partner_id;
}

void
DeletePartnerAssetAccessItem::setPartnerId(std::string  partner_id)
{
	this->partner_id = partner_id;
}

std::string
DeletePartnerAssetAccessItem::getPartnerType()
{
	return partner_type;
}

void
DeletePartnerAssetAccessItem::setPartnerType(std::string  partner_type)
{
	this->partner_type = partner_type;
}


