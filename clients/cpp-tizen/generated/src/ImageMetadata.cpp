#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ImageMetadata.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ImageMetadata::ImageMetadata()
{
	//__init();
}

ImageMetadata::~ImageMetadata()
{
	//__cleanup();
}

void
ImageMetadata::__init()
{
	//description = std::string();
	//images = new ImageSize();
	//item_type = std::string();
	//link = std::string();
	//title = std::string();
}

void
ImageMetadata::__cleanup()
{
	//if(description != NULL) {
	//
	//delete description;
	//description = NULL;
	//}
	//if(images != NULL) {
	//
	//delete images;
	//images = NULL;
	//}
	//if(item_type != NULL) {
	//
	//delete item_type;
	//item_type = NULL;
	//}
	//if(link != NULL) {
	//
	//delete link;
	//link = NULL;
	//}
	//if(title != NULL) {
	//
	//delete title;
	//title = NULL;
	//}
	//
}

void
ImageMetadata::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *descriptionKey = "description";
	node = json_object_get_member(pJsonObject, descriptionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&description, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *imagesKey = "images";
	node = json_object_get_member(pJsonObject, imagesKey);
	if (node !=NULL) {
	

		if (isprimitive("ImageSize")) {
			jsonToValue(&images, node, "ImageSize", "ImageSize");
		} else {
			
			ImageSize* obj = static_cast<ImageSize*> (&images);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *item_typeKey = "item_type";
	node = json_object_get_member(pJsonObject, item_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&item_type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *linkKey = "link";
	node = json_object_get_member(pJsonObject, linkKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&link, node, "std::string", "");
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

ImageMetadata::ImageMetadata(char* json)
{
	this->fromJson(json);
}

char*
ImageMetadata::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getDescription();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *descriptionKey = "description";
	json_object_set_member(pJsonObject, descriptionKey, node);
	if (isprimitive("ImageSize")) {
		ImageSize obj = getImages();
		node = converttoJson(&obj, "ImageSize", "");
	}
	else {
		
		ImageSize obj = static_cast<ImageSize> (getImages());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *imagesKey = "images";
	json_object_set_member(pJsonObject, imagesKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getItemType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *item_typeKey = "item_type";
	json_object_set_member(pJsonObject, item_typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getLink();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *linkKey = "link";
	json_object_set_member(pJsonObject, linkKey, node);
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
ImageMetadata::getDescription()
{
	return description;
}

void
ImageMetadata::setDescription(std::string  description)
{
	this->description = description;
}

ImageSize
ImageMetadata::getImages()
{
	return images;
}

void
ImageMetadata::setImages(ImageSize  images)
{
	this->images = images;
}

std::string
ImageMetadata::getItemType()
{
	return item_type;
}

void
ImageMetadata::setItemType(std::string  item_type)
{
	this->item_type = item_type;
}

std::string
ImageMetadata::getLink()
{
	return link;
}

void
ImageMetadata::setLink(std::string  link)
{
	this->link = link;
}

std::string
ImageMetadata::getTitle()
{
	return title;
}

void
ImageMetadata::setTitle(std::string  title)
{
	this->title = title;
}


