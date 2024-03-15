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
	//id = std::string();
	//profile_image = std::string();
	//website_url = std::string();
	//username = std::string();
	//about = std::string();
	//business_name = std::string();
	//board_count = int(0);
	//pin_count = int(0);
	//follower_count = int(0);
	//following_count = int(0);
	//monthly_views = int(0);
}

void
Account::__cleanup()
{
	//if(account_type != NULL) {
	//
	//delete account_type;
	//account_type = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
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
	//if(about != NULL) {
	//
	//delete about;
	//about = NULL;
	//}
	//if(business_name != NULL) {
	//
	//delete business_name;
	//business_name = NULL;
	//}
	//if(board_count != NULL) {
	//
	//delete board_count;
	//board_count = NULL;
	//}
	//if(pin_count != NULL) {
	//
	//delete pin_count;
	//pin_count = NULL;
	//}
	//if(follower_count != NULL) {
	//
	//delete follower_count;
	//follower_count = NULL;
	//}
	//if(following_count != NULL) {
	//
	//delete following_count;
	//following_count = NULL;
	//}
	//if(monthly_views != NULL) {
	//
	//delete monthly_views;
	//monthly_views = NULL;
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
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
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
	const gchar *aboutKey = "about";
	node = json_object_get_member(pJsonObject, aboutKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&about, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *business_nameKey = "business_name";
	node = json_object_get_member(pJsonObject, business_nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&business_name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *board_countKey = "board_count";
	node = json_object_get_member(pJsonObject, board_countKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&board_count, node, "int", "");
		} else {
			
		}
	}
	const gchar *pin_countKey = "pin_count";
	node = json_object_get_member(pJsonObject, pin_countKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&pin_count, node, "int", "");
		} else {
			
		}
	}
	const gchar *follower_countKey = "follower_count";
	node = json_object_get_member(pJsonObject, follower_countKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&follower_count, node, "int", "");
		} else {
			
		}
	}
	const gchar *following_countKey = "following_count";
	node = json_object_get_member(pJsonObject, following_countKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&following_count, node, "int", "");
		} else {
			
		}
	}
	const gchar *monthly_viewsKey = "monthly_views";
	node = json_object_get_member(pJsonObject, monthly_viewsKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&monthly_views, node, "int", "");
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
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
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
	if (isprimitive("std::string")) {
		std::string obj = getAbout();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *aboutKey = "about";
	json_object_set_member(pJsonObject, aboutKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getBusinessName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *business_nameKey = "business_name";
	json_object_set_member(pJsonObject, business_nameKey, node);
	if (isprimitive("int")) {
		int obj = getBoardCount();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *board_countKey = "board_count";
	json_object_set_member(pJsonObject, board_countKey, node);
	if (isprimitive("int")) {
		int obj = getPinCount();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *pin_countKey = "pin_count";
	json_object_set_member(pJsonObject, pin_countKey, node);
	if (isprimitive("int")) {
		int obj = getFollowerCount();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *follower_countKey = "follower_count";
	json_object_set_member(pJsonObject, follower_countKey, node);
	if (isprimitive("int")) {
		int obj = getFollowingCount();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *following_countKey = "following_count";
	json_object_set_member(pJsonObject, following_countKey, node);
	if (isprimitive("int")) {
		int obj = getMonthlyViews();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *monthly_viewsKey = "monthly_views";
	json_object_set_member(pJsonObject, monthly_viewsKey, node);
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
Account::getId()
{
	return id;
}

void
Account::setId(std::string  id)
{
	this->id = id;
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

std::string
Account::getAbout()
{
	return about;
}

void
Account::setAbout(std::string  about)
{
	this->about = about;
}

std::string
Account::getBusinessName()
{
	return business_name;
}

void
Account::setBusinessName(std::string  business_name)
{
	this->business_name = business_name;
}

int
Account::getBoardCount()
{
	return board_count;
}

void
Account::setBoardCount(int  board_count)
{
	this->board_count = board_count;
}

int
Account::getPinCount()
{
	return pin_count;
}

void
Account::setPinCount(int  pin_count)
{
	this->pin_count = pin_count;
}

int
Account::getFollowerCount()
{
	return follower_count;
}

void
Account::setFollowerCount(int  follower_count)
{
	this->follower_count = follower_count;
}

int
Account::getFollowingCount()
{
	return following_count;
}

void
Account::setFollowingCount(int  following_count)
{
	this->following_count = following_count;
}

int
Account::getMonthlyViews()
{
	return monthly_views;
}

void
Account::setMonthlyViews(int  monthly_views)
{
	this->monthly_views = monthly_views;
}


