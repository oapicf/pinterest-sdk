#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PinMediaMetadata.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PinMediaMetadata::PinMediaMetadata()
{
	//__init();
}

PinMediaMetadata::~PinMediaMetadata()
{
	//__cleanup();
}

void
PinMediaMetadata::__init()
{
	//item_type = std::string();
	//new std::map()std::map> images;
	//cover_image_url = std::string();
	//duration = double(0);
	//height = int(0);
	//width = int(0);
}

void
PinMediaMetadata::__cleanup()
{
	//if(item_type != NULL) {
	//
	//delete item_type;
	//item_type = NULL;
	//}
	//if(images != NULL) {
	//images.RemoveAll(true);
	//delete images;
	//images = NULL;
	//}
	//if(cover_image_url != NULL) {
	//
	//delete cover_image_url;
	//cover_image_url = NULL;
	//}
	//if(duration != NULL) {
	//
	//delete duration;
	//duration = NULL;
	//}
	//if(height != NULL) {
	//
	//delete height;
	//height = NULL;
	//}
	//if(width != NULL) {
	//
	//delete width;
	//width = NULL;
	//}
	//
}

void
PinMediaMetadata::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *item_typeKey = "item_type";
	node = json_object_get_member(pJsonObject, item_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&item_type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *imagesKey = "images";
	node = json_object_get_member(pJsonObject, imagesKey);
	if (node !=NULL) {
	
		{
			JsonObject* json_obj = json_node_get_object(node);
			map<string,string> new_map;
			json_object_foreach_member(json_obj,helper_func,&new_map);
			images = new_map;
		}
		
	}
	const gchar *cover_image_urlKey = "cover_image_url";
	node = json_object_get_member(pJsonObject, cover_image_urlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&cover_image_url, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *durationKey = "duration";
	node = json_object_get_member(pJsonObject, durationKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&duration, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&duration);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *heightKey = "height";
	node = json_object_get_member(pJsonObject, heightKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&height, node, "int", "");
		} else {
			
		}
	}
	const gchar *widthKey = "width";
	node = json_object_get_member(pJsonObject, widthKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&width, node, "int", "");
		} else {
			
		}
	}
}

PinMediaMetadata::PinMediaMetadata(char* json)
{
	this->fromJson(json);
}

char*
PinMediaMetadata::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getItemType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *item_typeKey = "item_type";
	json_object_set_member(pJsonObject, item_typeKey, node);


	{
		JsonObject* json_obj;
		map<string, string> new_list = static_cast<map <string, string> > (getImages());
		json_obj = json_object_new();
		for (map<string, string>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			string obj = (*it).first;
			string obj2 = (*it).second;
			JsonNode* tempnode = json_from_string(obj2.c_str(),NULL);
			json_object_set_member(json_obj, obj.c_str(), tempnode);
		}
	node = json_node_alloc();
	json_node_init_object(node, json_obj);
	json_object_unref(json_obj);
	}

	const gchar *imagesKey = "images";
	json_object_set_member(pJsonObject, imagesKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCoverImageUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *cover_image_urlKey = "cover_image_url";
	json_object_set_member(pJsonObject, cover_image_urlKey, node);
	if (isprimitive("long long")) {
		long long obj = getDuration();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getDuration());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *durationKey = "duration";
	json_object_set_member(pJsonObject, durationKey, node);
	if (isprimitive("int")) {
		int obj = getHeight();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *heightKey = "height";
	json_object_set_member(pJsonObject, heightKey, node);
	if (isprimitive("int")) {
		int obj = getWidth();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *widthKey = "width";
	json_object_set_member(pJsonObject, widthKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
PinMediaMetadata::getItemType()
{
	return item_type;
}

void
PinMediaMetadata::setItemType(std::string  item_type)
{
	this->item_type = item_type;
}

std::map<string, string>
PinMediaMetadata::getImages()
{
	return images;
}

void
PinMediaMetadata::setImages(std::map <string, string> images)
{
	this->images = images;
}

std::string
PinMediaMetadata::getCoverImageUrl()
{
	return cover_image_url;
}

void
PinMediaMetadata::setCoverImageUrl(std::string  cover_image_url)
{
	this->cover_image_url = cover_image_url;
}

long long
PinMediaMetadata::getDuration()
{
	return duration;
}

void
PinMediaMetadata::setDuration(long long  duration)
{
	this->duration = duration;
}

int
PinMediaMetadata::getHeight()
{
	return height;
}

void
PinMediaMetadata::setHeight(int  height)
{
	this->height = height;
}

int
PinMediaMetadata::getWidth()
{
	return width;
}

void
PinMediaMetadata::setWidth(int  width)
{
	this->width = width;
}


