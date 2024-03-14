#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdPreviewCreateFromImage.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdPreviewCreateFromImage::AdPreviewCreateFromImage()
{
	//__init();
}

AdPreviewCreateFromImage::~AdPreviewCreateFromImage()
{
	//__cleanup();
}

void
AdPreviewCreateFromImage::__init()
{
	//image_url = std::string();
	//title = std::string();
}

void
AdPreviewCreateFromImage::__cleanup()
{
	//if(image_url != NULL) {
	//
	//delete image_url;
	//image_url = NULL;
	//}
	//if(title != NULL) {
	//
	//delete title;
	//title = NULL;
	//}
	//
}

void
AdPreviewCreateFromImage::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *image_urlKey = "image_url";
	node = json_object_get_member(pJsonObject, image_urlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&image_url, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *titleKey = "title";
	node = json_object_get_member(pJsonObject, titleKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&title, node, "std::string", "");
		} else {
			
		}
	}
}

AdPreviewCreateFromImage::AdPreviewCreateFromImage(char* json)
{
	this->fromJson(json);
}

char*
AdPreviewCreateFromImage::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getImageUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *image_urlKey = "image_url";
	json_object_set_member(pJsonObject, image_urlKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getTitle();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *titleKey = "title";
	json_object_set_member(pJsonObject, titleKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
AdPreviewCreateFromImage::getImageUrl()
{
	return image_url;
}

void
AdPreviewCreateFromImage::setImageUrl(std::string  image_url)
{
	this->image_url = image_url;
}

std::string
AdPreviewCreateFromImage::getTitle()
{
	return title;
}

void
AdPreviewCreateFromImage::setTitle(std::string  title)
{
	this->title = title;
}


