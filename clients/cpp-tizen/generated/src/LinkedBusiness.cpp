#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "LinkedBusiness.h"

using namespace std;
using namespace Tizen::ArtikCloud;

LinkedBusiness::LinkedBusiness()
{
	//__init();
}

LinkedBusiness::~LinkedBusiness()
{
	//__cleanup();
}

void
LinkedBusiness::__init()
{
	//username = std::string();
	//image_small_url = std::string();
	//image_medium_url = std::string();
	//image_large_url = std::string();
	//image_xlarge_url = std::string();
}

void
LinkedBusiness::__cleanup()
{
	//if(username != NULL) {
	//
	//delete username;
	//username = NULL;
	//}
	//if(image_small_url != NULL) {
	//
	//delete image_small_url;
	//image_small_url = NULL;
	//}
	//if(image_medium_url != NULL) {
	//
	//delete image_medium_url;
	//image_medium_url = NULL;
	//}
	//if(image_large_url != NULL) {
	//
	//delete image_large_url;
	//image_large_url = NULL;
	//}
	//if(image_xlarge_url != NULL) {
	//
	//delete image_xlarge_url;
	//image_xlarge_url = NULL;
	//}
	//
}

void
LinkedBusiness::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *usernameKey = "username";
	node = json_object_get_member(pJsonObject, usernameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&username, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *image_small_urlKey = "image_small_url";
	node = json_object_get_member(pJsonObject, image_small_urlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&image_small_url, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *image_medium_urlKey = "image_medium_url";
	node = json_object_get_member(pJsonObject, image_medium_urlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&image_medium_url, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *image_large_urlKey = "image_large_url";
	node = json_object_get_member(pJsonObject, image_large_urlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&image_large_url, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *image_xlarge_urlKey = "image_xlarge_url";
	node = json_object_get_member(pJsonObject, image_xlarge_urlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&image_xlarge_url, node, "std::string", "");
		} else {
			
		}
	}
}

LinkedBusiness::LinkedBusiness(char* json)
{
	this->fromJson(json);
}

char*
LinkedBusiness::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getUsername();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *usernameKey = "username";
	json_object_set_member(pJsonObject, usernameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getImageSmallUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *image_small_urlKey = "image_small_url";
	json_object_set_member(pJsonObject, image_small_urlKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getImageMediumUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *image_medium_urlKey = "image_medium_url";
	json_object_set_member(pJsonObject, image_medium_urlKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getImageLargeUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *image_large_urlKey = "image_large_url";
	json_object_set_member(pJsonObject, image_large_urlKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getImageXlargeUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *image_xlarge_urlKey = "image_xlarge_url";
	json_object_set_member(pJsonObject, image_xlarge_urlKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
LinkedBusiness::getUsername()
{
	return username;
}

void
LinkedBusiness::setUsername(std::string  username)
{
	this->username = username;
}

std::string
LinkedBusiness::getImageSmallUrl()
{
	return image_small_url;
}

void
LinkedBusiness::setImageSmallUrl(std::string  image_small_url)
{
	this->image_small_url = image_small_url;
}

std::string
LinkedBusiness::getImageMediumUrl()
{
	return image_medium_url;
}

void
LinkedBusiness::setImageMediumUrl(std::string  image_medium_url)
{
	this->image_medium_url = image_medium_url;
}

std::string
LinkedBusiness::getImageLargeUrl()
{
	return image_large_url;
}

void
LinkedBusiness::setImageLargeUrl(std::string  image_large_url)
{
	this->image_large_url = image_large_url;
}

std::string
LinkedBusiness::getImageXlargeUrl()
{
	return image_xlarge_url;
}

void
LinkedBusiness::setImageXlargeUrl(std::string  image_xlarge_url)
{
	this->image_xlarge_url = image_xlarge_url;
}


