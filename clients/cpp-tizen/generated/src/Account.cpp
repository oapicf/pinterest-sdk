#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Account.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Account::Account()
{
	//__init();
}

Account::~Account()
{
	//__cleanup();
}

void
Account::__init()
{
	//account_type = std::string();
	//profile_image = std::string();
	//website_url = std::string();
	//username = std::string();
}

void
Account::__cleanup()
{
	//if(account_type != NULL) {
	//
	//delete account_type;
	//account_type = NULL;
	//}
	//if(profile_image != NULL) {
	//
	//delete profile_image;
	//profile_image = NULL;
	//}
	//if(website_url != NULL) {
	//
	//delete website_url;
	//website_url = NULL;
	//}
	//if(username != NULL) {
	//
	//delete username;
	//username = NULL;
	//}
	//
}

void
Account::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *account_typeKey = "account_type";
	node = json_object_get_member(pJsonObject, account_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&account_type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *profile_imageKey = "profile_image";
	node = json_object_get_member(pJsonObject, profile_imageKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&profile_image, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *website_urlKey = "website_url";
	node = json_object_get_member(pJsonObject, website_urlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&website_url, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *usernameKey = "username";
	node = json_object_get_member(pJsonObject, usernameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&username, node, "std::string", "");
		} else {
			
		}
	}
}

Account::Account(char* json)
{
	this->fromJson(json);
}

char*
Account::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getAccountType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *account_typeKey = "account_type";
	json_object_set_member(pJsonObject, account_typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getProfileImage();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *profile_imageKey = "profile_image";
	json_object_set_member(pJsonObject, profile_imageKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getWebsiteUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *website_urlKey = "website_url";
	json_object_set_member(pJsonObject, website_urlKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getUsername();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *usernameKey = "username";
	json_object_set_member(pJsonObject, usernameKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
Account::getAccountType()
{
	return account_type;
}

void
Account::setAccountType(std::string  account_type)
{
	this->account_type = account_type;
}

std::string
Account::getProfileImage()
{
	return profile_image;
}

void
Account::setProfileImage(std::string  profile_image)
{
	this->profile_image = profile_image;
}

std::string
Account::getWebsiteUrl()
{
	return website_url;
}

void
Account::setWebsiteUrl(std::string  website_url)
{
	this->website_url = website_url;
}

std::string
Account::getUsername()
{
	return username;
}

void
Account::setUsername(std::string  username)
{
	this->username = username;
}


