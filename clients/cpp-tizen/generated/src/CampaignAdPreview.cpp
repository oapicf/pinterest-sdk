#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CampaignAdPreview.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CampaignAdPreview::CampaignAdPreview()
{
	//__init();
}

CampaignAdPreview::~CampaignAdPreview()
{
	//__cleanup();
}

void
CampaignAdPreview::__init()
{
	//ad_account_id = std::string();
	//ad_group_id = std::string();
	//client_id = int(0);
	//expires_at = int(0);
	//is_active = bool(false);
	//pin_id = int(0);
	//pin_promotion_id = int(0);
	//promoted_product_group_id = int(0);
	//url = std::string();
	//user_id = int(0);
	//uuid = std::string();
}

void
CampaignAdPreview::__cleanup()
{
	//if(ad_account_id != NULL) {
	//
	//delete ad_account_id;
	//ad_account_id = NULL;
	//}
	//if(ad_group_id != NULL) {
	//
	//delete ad_group_id;
	//ad_group_id = NULL;
	//}
	//if(client_id != NULL) {
	//
	//delete client_id;
	//client_id = NULL;
	//}
	//if(expires_at != NULL) {
	//
	//delete expires_at;
	//expires_at = NULL;
	//}
	//if(is_active != NULL) {
	//
	//delete is_active;
	//is_active = NULL;
	//}
	//if(pin_id != NULL) {
	//
	//delete pin_id;
	//pin_id = NULL;
	//}
	//if(pin_promotion_id != NULL) {
	//
	//delete pin_promotion_id;
	//pin_promotion_id = NULL;
	//}
	//if(promoted_product_group_id != NULL) {
	//
	//delete promoted_product_group_id;
	//promoted_product_group_id = NULL;
	//}
	//if(url != NULL) {
	//
	//delete url;
	//url = NULL;
	//}
	//if(user_id != NULL) {
	//
	//delete user_id;
	//user_id = NULL;
	//}
	//if(uuid != NULL) {
	//
	//delete uuid;
	//uuid = NULL;
	//}
	//
}

void
CampaignAdPreview::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *ad_account_idKey = "ad_account_id";
	node = json_object_get_member(pJsonObject, ad_account_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&ad_account_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *ad_group_idKey = "ad_group_id";
	node = json_object_get_member(pJsonObject, ad_group_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&ad_group_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *client_idKey = "client_id";
	node = json_object_get_member(pJsonObject, client_idKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&client_id, node, "int", "");
		} else {
			
		}
	}
	const gchar *expires_atKey = "expires_at";
	node = json_object_get_member(pJsonObject, expires_atKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&expires_at, node, "int", "");
		} else {
			
		}
	}
	const gchar *is_activeKey = "is_active";
	node = json_object_get_member(pJsonObject, is_activeKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_active, node, "bool", "");
		} else {
			
		}
	}
	const gchar *pin_idKey = "pin_id";
	node = json_object_get_member(pJsonObject, pin_idKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&pin_id, node, "int", "");
		} else {
			
		}
	}
	const gchar *pin_promotion_idKey = "pin_promotion_id";
	node = json_object_get_member(pJsonObject, pin_promotion_idKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&pin_promotion_id, node, "int", "");
		} else {
			
		}
	}
	const gchar *promoted_product_group_idKey = "promoted_product_group_id";
	node = json_object_get_member(pJsonObject, promoted_product_group_idKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&promoted_product_group_id, node, "int", "");
		} else {
			
		}
	}
	const gchar *urlKey = "url";
	node = json_object_get_member(pJsonObject, urlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&url, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *user_idKey = "user_id";
	node = json_object_get_member(pJsonObject, user_idKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&user_id, node, "int", "");
		} else {
			
		}
	}
	const gchar *uuidKey = "uuid";
	node = json_object_get_member(pJsonObject, uuidKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&uuid, node, "std::string", "");
		} else {
			
		}
	}
}

CampaignAdPreview::CampaignAdPreview(char* json)
{
	this->fromJson(json);
}

char*
CampaignAdPreview::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getAdAccountId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *ad_account_idKey = "ad_account_id";
	json_object_set_member(pJsonObject, ad_account_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getAdGroupId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *ad_group_idKey = "ad_group_id";
	json_object_set_member(pJsonObject, ad_group_idKey, node);
	if (isprimitive("int")) {
		int obj = getClientId();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *client_idKey = "client_id";
	json_object_set_member(pJsonObject, client_idKey, node);
	if (isprimitive("int")) {
		int obj = getExpiresAt();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *expires_atKey = "expires_at";
	json_object_set_member(pJsonObject, expires_atKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsActive();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_activeKey = "is_active";
	json_object_set_member(pJsonObject, is_activeKey, node);
	if (isprimitive("int")) {
		int obj = getPinId();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *pin_idKey = "pin_id";
	json_object_set_member(pJsonObject, pin_idKey, node);
	if (isprimitive("int")) {
		int obj = getPinPromotionId();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *pin_promotion_idKey = "pin_promotion_id";
	json_object_set_member(pJsonObject, pin_promotion_idKey, node);
	if (isprimitive("int")) {
		int obj = getPromotedProductGroupId();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *promoted_product_group_idKey = "promoted_product_group_id";
	json_object_set_member(pJsonObject, promoted_product_group_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *urlKey = "url";
	json_object_set_member(pJsonObject, urlKey, node);
	if (isprimitive("int")) {
		int obj = getUserId();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *user_idKey = "user_id";
	json_object_set_member(pJsonObject, user_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getUuid();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *uuidKey = "uuid";
	json_object_set_member(pJsonObject, uuidKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
CampaignAdPreview::getAdAccountId()
{
	return ad_account_id;
}

void
CampaignAdPreview::setAdAccountId(std::string  ad_account_id)
{
	this->ad_account_id = ad_account_id;
}

std::string
CampaignAdPreview::getAdGroupId()
{
	return ad_group_id;
}

void
CampaignAdPreview::setAdGroupId(std::string  ad_group_id)
{
	this->ad_group_id = ad_group_id;
}

int
CampaignAdPreview::getClientId()
{
	return client_id;
}

void
CampaignAdPreview::setClientId(int  client_id)
{
	this->client_id = client_id;
}

int
CampaignAdPreview::getExpiresAt()
{
	return expires_at;
}

void
CampaignAdPreview::setExpiresAt(int  expires_at)
{
	this->expires_at = expires_at;
}

bool
CampaignAdPreview::getIsActive()
{
	return is_active;
}

void
CampaignAdPreview::setIsActive(bool  is_active)
{
	this->is_active = is_active;
}

int
CampaignAdPreview::getPinId()
{
	return pin_id;
}

void
CampaignAdPreview::setPinId(int  pin_id)
{
	this->pin_id = pin_id;
}

int
CampaignAdPreview::getPinPromotionId()
{
	return pin_promotion_id;
}

void
CampaignAdPreview::setPinPromotionId(int  pin_promotion_id)
{
	this->pin_promotion_id = pin_promotion_id;
}

int
CampaignAdPreview::getPromotedProductGroupId()
{
	return promoted_product_group_id;
}

void
CampaignAdPreview::setPromotedProductGroupId(int  promoted_product_group_id)
{
	this->promoted_product_group_id = promoted_product_group_id;
}

std::string
CampaignAdPreview::getUrl()
{
	return url;
}

void
CampaignAdPreview::setUrl(std::string  url)
{
	this->url = url;
}

int
CampaignAdPreview::getUserId()
{
	return user_id;
}

void
CampaignAdPreview::setUserId(int  user_id)
{
	this->user_id = user_id;
}

std::string
CampaignAdPreview::getUuid()
{
	return uuid;
}

void
CampaignAdPreview::setUuid(std::string  uuid)
{
	this->uuid = uuid;
}


