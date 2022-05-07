#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PinMediaWithImage.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PinMediaWithImage::PinMediaWithImage()
{
	//__init();
}

PinMediaWithImage::~PinMediaWithImage()
{
	//__cleanup();
}

void
PinMediaWithImage::__init()
{
	//new std::map()std::map> images;
	//media_type = std::string();
}

void
PinMediaWithImage::__cleanup()
{
	//if(images != NULL) {
	//images.RemoveAll(true);
	//delete images;
	//images = NULL;
	//}
	//if(media_type != NULL) {
	//
	//delete media_type;
	//media_type = NULL;
	//}
	//
}

void
PinMediaWithImage::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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
	const gchar *media_typeKey = "media_type";
	node = json_object_get_member(pJsonObject, media_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&media_type, node, "std::string", "");
		} else {
			
		}
	}
}

PinMediaWithImage::PinMediaWithImage(char* json)
{
	this->fromJson(json);
}

char*
PinMediaWithImage::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;


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
		std::string obj = getMediaType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *media_typeKey = "media_type";
	json_object_set_member(pJsonObject, media_typeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::map<string, string>
PinMediaWithImage::getImages()
{
	return images;
}

void
PinMediaWithImage::setImages(std::map <string, string> images)
{
	this->images = images;
}

std::string
PinMediaWithImage::getMediaType()
{
	return media_type;
}

void
PinMediaWithImage::setMediaType(std::string  media_type)
{
	this->media_type = media_type;
}


