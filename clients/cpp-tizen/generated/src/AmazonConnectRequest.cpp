#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AmazonConnectRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AmazonConnectRequest::AmazonConnectRequest()
{
	//__init();
}

AmazonConnectRequest::~AmazonConnectRequest()
{
	//__cleanup();
}

void
AmazonConnectRequest::__init()
{
	//amazon_storefront_id = std::string();
	//amazon_storefront_name = std::string();
	//amazon_storefront_url = std::string();
	//amazon_user_id = std::string();
	//is_amazon_account_linked = bool(false);
	//one_time_passcode = std::string();
	//pinterest_user_id = std::string();
}

void
AmazonConnectRequest::__cleanup()
{
	//if(amazon_storefront_id != NULL) {
	//
	//delete amazon_storefront_id;
	//amazon_storefront_id = NULL;
	//}
	//if(amazon_storefront_name != NULL) {
	//
	//delete amazon_storefront_name;
	//amazon_storefront_name = NULL;
	//}
	//if(amazon_storefront_url != NULL) {
	//
	//delete amazon_storefront_url;
	//amazon_storefront_url = NULL;
	//}
	//if(amazon_user_id != NULL) {
	//
	//delete amazon_user_id;
	//amazon_user_id = NULL;
	//}
	//if(is_amazon_account_linked != NULL) {
	//
	//delete is_amazon_account_linked;
	//is_amazon_account_linked = NULL;
	//}
	//if(one_time_passcode != NULL) {
	//
	//delete one_time_passcode;
	//one_time_passcode = NULL;
	//}
	//if(pinterest_user_id != NULL) {
	//
	//delete pinterest_user_id;
	//pinterest_user_id = NULL;
	//}
	//
}

void
AmazonConnectRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *amazon_storefront_idKey = "amazon_storefront_id";
	node = json_object_get_member(pJsonObject, amazon_storefront_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&amazon_storefront_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *amazon_storefront_nameKey = "amazon_storefront_name";
	node = json_object_get_member(pJsonObject, amazon_storefront_nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&amazon_storefront_name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *amazon_storefront_urlKey = "amazon_storefront_url";
	node = json_object_get_member(pJsonObject, amazon_storefront_urlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&amazon_storefront_url, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *amazon_user_idKey = "amazon_user_id";
	node = json_object_get_member(pJsonObject, amazon_user_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&amazon_user_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *is_amazon_account_linkedKey = "is_amazon_account_linked";
	node = json_object_get_member(pJsonObject, is_amazon_account_linkedKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_amazon_account_linked, node, "bool", "");
		} else {
			
		}
	}
	const gchar *one_time_passcodeKey = "one_time_passcode";
	node = json_object_get_member(pJsonObject, one_time_passcodeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&one_time_passcode, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *pinterest_user_idKey = "pinterest_user_id";
	node = json_object_get_member(pJsonObject, pinterest_user_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&pinterest_user_id, node, "std::string", "");
		} else {
			
		}
	}
}

AmazonConnectRequest::AmazonConnectRequest(char* json)
{
	this->fromJson(json);
}

char*
AmazonConnectRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getAmazonStorefrontId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *amazon_storefront_idKey = "amazon_storefront_id";
	json_object_set_member(pJsonObject, amazon_storefront_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getAmazonStorefrontName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *amazon_storefront_nameKey = "amazon_storefront_name";
	json_object_set_member(pJsonObject, amazon_storefront_nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getAmazonStorefrontUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *amazon_storefront_urlKey = "amazon_storefront_url";
	json_object_set_member(pJsonObject, amazon_storefront_urlKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getAmazonUserId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *amazon_user_idKey = "amazon_user_id";
	json_object_set_member(pJsonObject, amazon_user_idKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsAmazonAccountLinked();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_amazon_account_linkedKey = "is_amazon_account_linked";
	json_object_set_member(pJsonObject, is_amazon_account_linkedKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getOneTimePasscode();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *one_time_passcodeKey = "one_time_passcode";
	json_object_set_member(pJsonObject, one_time_passcodeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPinterestUserId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *pinterest_user_idKey = "pinterest_user_id";
	json_object_set_member(pJsonObject, pinterest_user_idKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
AmazonConnectRequest::getAmazonStorefrontId()
{
	return amazon_storefront_id;
}

void
AmazonConnectRequest::setAmazonStorefrontId(std::string  amazon_storefront_id)
{
	this->amazon_storefront_id = amazon_storefront_id;
}

std::string
AmazonConnectRequest::getAmazonStorefrontName()
{
	return amazon_storefront_name;
}

void
AmazonConnectRequest::setAmazonStorefrontName(std::string  amazon_storefront_name)
{
	this->amazon_storefront_name = amazon_storefront_name;
}

std::string
AmazonConnectRequest::getAmazonStorefrontUrl()
{
	return amazon_storefront_url;
}

void
AmazonConnectRequest::setAmazonStorefrontUrl(std::string  amazon_storefront_url)
{
	this->amazon_storefront_url = amazon_storefront_url;
}

std::string
AmazonConnectRequest::getAmazonUserId()
{
	return amazon_user_id;
}

void
AmazonConnectRequest::setAmazonUserId(std::string  amazon_user_id)
{
	this->amazon_user_id = amazon_user_id;
}

bool
AmazonConnectRequest::getIsAmazonAccountLinked()
{
	return is_amazon_account_linked;
}

void
AmazonConnectRequest::setIsAmazonAccountLinked(bool  is_amazon_account_linked)
{
	this->is_amazon_account_linked = is_amazon_account_linked;
}

std::string
AmazonConnectRequest::getOneTimePasscode()
{
	return one_time_passcode;
}

void
AmazonConnectRequest::setOneTimePasscode(std::string  one_time_passcode)
{
	this->one_time_passcode = one_time_passcode;
}

std::string
AmazonConnectRequest::getPinterestUserId()
{
	return pinterest_user_id;
}

void
AmazonConnectRequest::setPinterestUserId(std::string  pinterest_user_id)
{
	this->pinterest_user_id = pinterest_user_id;
}


