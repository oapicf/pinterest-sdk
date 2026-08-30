#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "BrandAccountCreate.h"

using namespace std;
using namespace Tizen::ArtikCloud;

BrandAccountCreate::BrandAccountCreate()
{
	//__init();
}

BrandAccountCreate::~BrandAccountCreate()
{
	//__cleanup();
}

void
BrandAccountCreate::__init()
{
	//about = std::string();
	//country = new Country();
	//name = std::string();
	//profile_image = new BrandAccountProfileImage();
	//username = std::string();
	//website = std::string();
}

void
BrandAccountCreate::__cleanup()
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
BrandAccountCreate::fromJson(char* jsonStr)
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
	

		if (isprimitive("BrandAccountProfileImage")) {
			jsonToValue(&profile_image, node, "BrandAccountProfileImage", "BrandAccountProfileImage");
		} else {
			
			BrandAccountProfileImage* obj = static_cast<BrandAccountProfileImage*> (&profile_image);
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

BrandAccountCreate::BrandAccountCreate(char* json)
{
	this->fromJson(json);
}

char*
BrandAccountCreate::toJson()
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
	if (isprimitive("BrandAccountProfileImage")) {
		BrandAccountProfileImage obj = getProfileImage();
		node = converttoJson(&obj, "BrandAccountProfileImage", "");
	}
	else {
		
		BrandAccountProfileImage obj = static_cast<BrandAccountProfileImage> (getProfileImage());
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
BrandAccountCreate::getAbout()
{
	return about;
}

void
BrandAccountCreate::setAbout(std::string  about)
{
	this->about = about;
}

Country
BrandAccountCreate::getCountry()
{
	return country;
}

void
BrandAccountCreate::setCountry(Country  country)
{
	this->country = country;
}

std::string
BrandAccountCreate::getName()
{
	return name;
}

void
BrandAccountCreate::setName(std::string  name)
{
	this->name = name;
}

BrandAccountProfileImage
BrandAccountCreate::getProfileImage()
{
	return profile_image;
}

void
BrandAccountCreate::setProfileImage(BrandAccountProfileImage  profile_image)
{
	this->profile_image = profile_image;
}

std::string
BrandAccountCreate::getUsername()
{
	return username;
}

void
BrandAccountCreate::setUsername(std::string  username)
{
	this->username = username;
}

std::string
BrandAccountCreate::getWebsite()
{
	return website;
}

void
BrandAccountCreate::setWebsite(std::string  website)
{
	this->website = website;
}


