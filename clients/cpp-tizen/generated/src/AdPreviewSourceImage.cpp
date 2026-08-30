#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdPreviewSourceImage.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdPreviewSourceImage::AdPreviewSourceImage()
{
	//__init();
}

AdPreviewSourceImage::~AdPreviewSourceImage()
{
	//__cleanup();
}

void
AdPreviewSourceImage::__init()
{
	//image_url = std::string();
	//promotion_id = std::string();
	//title = std::string();
}

void
AdPreviewSourceImage::__cleanup()
{
	//if(image_url != NULL) {
	//
	//delete image_url;
	//image_url = NULL;
	//}
	//if(promotion_id != NULL) {
	//
	//delete promotion_id;
	//promotion_id = NULL;
	//}
	//if(title != NULL) {
	//
	//delete title;
	//title = NULL;
	//}
	//
}

void
AdPreviewSourceImage::fromJson(char* jsonStr)
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
	const gchar *promotion_idKey = "promotion_id";
	node = json_object_get_member(pJsonObject, promotion_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&promotion_id, node, "std::string", "");
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

AdPreviewSourceImage::AdPreviewSourceImage(char* json)
{
	this->fromJson(json);
}

char*
AdPreviewSourceImage::toJson()
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
		std::string obj = getPromotionId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *promotion_idKey = "promotion_id";
	json_object_set_member(pJsonObject, promotion_idKey, node);
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
AdPreviewSourceImage::getImageUrl()
{
	return image_url;
}

void
AdPreviewSourceImage::setImageUrl(std::string  image_url)
{
	this->image_url = image_url;
}

std::string
AdPreviewSourceImage::getPromotionId()
{
	return promotion_id;
}

void
AdPreviewSourceImage::setPromotionId(std::string  promotion_id)
{
	this->promotion_id = promotion_id;
}

std::string
AdPreviewSourceImage::getTitle()
{
	return title;
}

void
AdPreviewSourceImage::setTitle(std::string  title)
{
	this->title = title;
}


