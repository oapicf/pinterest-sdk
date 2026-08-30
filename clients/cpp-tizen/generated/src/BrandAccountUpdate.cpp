#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "BrandAccountUpdate.h"

using namespace std;
using namespace Tizen::ArtikCloud;

BrandAccountUpdate::BrandAccountUpdate()
{
	//__init();
}

BrandAccountUpdate::~BrandAccountUpdate()
{
	//__cleanup();
}

void
BrandAccountUpdate::__init()
{
	//about = std::string();
	//country = new Country();
	//name = std::string();
	//profile_image = new BrandAccountProfileImageUpdate();
	//username = std::string();
	//website = std::string();
}

void
BrandAccountUpdate::__cleanup()
{
	//if(about != NULL) {
	//
	//delete about;
	//about = NULL;
	//}
	//if(country != NULL) {
	//
	//delete country;
	//country = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(profile_image != NULL) {
	//
	//delete profile_image;
	//profile_image = NULL;
	//}
	//if(username != NULL) {
	//
	//delete username;
	//username = NULL;
	//}
	//if(website != NULL) {
	//
	//delete website;
	//website = NULL;
	//}
	//
}

void
BrandAccountUpdate::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *aboutKey = "about";
	node = json_object_get_member(pJsonObject, aboutKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&about, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *countryKey = "country";
	node = json_object_get_member(pJsonObject, countryKey);
	if (node !=NULL) {
	

		if (isprimitive("Country")) {
			jsonToValue(&country, node, "Country", "Country");
		} else {
			
			Country* obj = static_cast<Country*> (&country);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *profile_imageKey = "profile_image";
	node = json_object_get_member(pJsonObject, profile_imageKey);
	if (node !=NULL) {
	

		if (isprimitive("BrandAccountProfileImageUpdate")) {
			jsonToValue(&profile_image, node, "BrandAccountProfileImageUpdate", "BrandAccountProfileImageUpdate");
		} else {
			
			BrandAccountProfileImageUpdate* obj = static_cast<BrandAccountProfileImageUpdate*> (&profile_image);
			obj->fromJson(json_to_string(node, false));
			
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
	const gchar *websiteKey = "website";
	node = json_object_get_member(pJsonObject, websiteKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&website, node, "std::string", "");
		} else {
			
		}
	}
}

BrandAccountUpdate::BrandAccountUpdate(char* json)
{
	this->fromJson(json);
}

char*
BrandAccountUpdate::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getAbout();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *aboutKey = "about";
	json_object_set_member(pJsonObject, aboutKey, node);
	if (isprimitive("Country")) {
		Country obj = getCountry();
		node = converttoJson(&obj, "Country", "");
	}
	else {
		
		Country obj = static_cast<Country> (getCountry());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *countryKey = "country";
	json_object_set_member(pJsonObject, countryKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("BrandAccountProfileImageUpdate")) {
		BrandAccountProfileImageUpdate obj = getProfileImage();
		node = converttoJson(&obj, "BrandAccountProfileImageUpdate", "");
	}
	else {
		
		BrandAccountProfileImageUpdate obj = static_cast<BrandAccountProfileImageUpdate> (getProfileImage());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *profile_imageKey = "profile_image";
	json_object_set_member(pJsonObject, profile_imageKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getUsername();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *usernameKey = "username";
	json_object_set_member(pJsonObject, usernameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getWebsite();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *websiteKey = "website";
	json_object_set_member(pJsonObject, websiteKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
BrandAccountUpdate::getAbout()
{
	return about;
}

void
BrandAccountUpdate::setAbout(std::string  about)
{
	this->about = about;
}

Country
BrandAccountUpdate::getCountry()
{
	return country;
}

void
BrandAccountUpdate::setCountry(Country  country)
{
	this->country = country;
}

std::string
BrandAccountUpdate::getName()
{
	return name;
}

void
BrandAccountUpdate::setName(std::string  name)
{
	this->name = name;
}

BrandAccountProfileImageUpdate
BrandAccountUpdate::getProfileImage()
{
	return profile_image;
}

void
BrandAccountUpdate::setProfileImage(BrandAccountProfileImageUpdate  profile_image)
{
	this->profile_image = profile_image;
}

std::string
BrandAccountUpdate::getUsername()
{
	return username;
}

void
BrandAccountUpdate::setUsername(std::string  username)
{
	this->username = username;
}

std::string
BrandAccountUpdate::getWebsite()
{
	return website;
}

void
BrandAccountUpdate::setWebsite(std::string  website)
{
	this->website = website;
}


