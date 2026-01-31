#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Brand_accounts_create_request.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Brand_accounts_create_request::Brand_accounts_create_request()
{
	//__init();
}

Brand_accounts_create_request::~Brand_accounts_create_request()
{
	//__cleanup();
}

void
Brand_accounts_create_request::__init()
{
	//name = std::string();
	//username = std::string();
	//country = new Country();
	//about = std::string();
	//website = std::string();
	//profile_image = new Image_Base64();
}

void
Brand_accounts_create_request::__cleanup()
{
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(username != NULL) {
	//
	//delete username;
	//username = NULL;
	//}
	//if(country != NULL) {
	//
	//delete country;
	//country = NULL;
	//}
	//if(about != NULL) {
	//
	//delete about;
	//about = NULL;
	//}
	//if(website != NULL) {
	//
	//delete website;
	//website = NULL;
	//}
	//if(profile_image != NULL) {
	//
	//delete profile_image;
	//profile_image = NULL;
	//}
	//
}

void
Brand_accounts_create_request::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
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
	const gchar *aboutKey = "about";
	node = json_object_get_member(pJsonObject, aboutKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&about, node, "std::string", "");
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
	const gchar *profile_imageKey = "profile_image";
	node = json_object_get_member(pJsonObject, profile_imageKey);
	if (node !=NULL) {
	

		if (isprimitive("Image_Base64")) {
			jsonToValue(&profile_image, node, "Image_Base64", "Image_Base64");
		} else {
			
			Image_Base64* obj = static_cast<Image_Base64*> (&profile_image);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

Brand_accounts_create_request::Brand_accounts_create_request(char* json)
{
	this->fromJson(json);
}

char*
Brand_accounts_create_request::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getUsername();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *usernameKey = "username";
	json_object_set_member(pJsonObject, usernameKey, node);
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
		std::string obj = getAbout();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *aboutKey = "about";
	json_object_set_member(pJsonObject, aboutKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getWebsite();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *websiteKey = "website";
	json_object_set_member(pJsonObject, websiteKey, node);
	if (isprimitive("Image_Base64")) {
		Image_Base64 obj = getProfileImage();
		node = converttoJson(&obj, "Image_Base64", "");
	}
	else {
		
		Image_Base64 obj = static_cast<Image_Base64> (getProfileImage());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *profile_imageKey = "profile_image";
	json_object_set_member(pJsonObject, profile_imageKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
Brand_accounts_create_request::getName()
{
	return name;
}

void
Brand_accounts_create_request::setName(std::string  name)
{
	this->name = name;
}

std::string
Brand_accounts_create_request::getUsername()
{
	return username;
}

void
Brand_accounts_create_request::setUsername(std::string  username)
{
	this->username = username;
}

Country
Brand_accounts_create_request::getCountry()
{
	return country;
}

void
Brand_accounts_create_request::setCountry(Country  country)
{
	this->country = country;
}

std::string
Brand_accounts_create_request::getAbout()
{
	return about;
}

void
Brand_accounts_create_request::setAbout(std::string  about)
{
	this->about = about;
}

std::string
Brand_accounts_create_request::getWebsite()
{
	return website;
}

void
Brand_accounts_create_request::setWebsite(std::string  website)
{
	this->website = website;
}

Image_Base64
Brand_accounts_create_request::getProfileImage()
{
	return profile_image;
}

void
Brand_accounts_create_request::setProfileImage(Image_Base64  profile_image)
{
	this->profile_image = profile_image;
}


