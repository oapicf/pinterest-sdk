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
	//item_type = std::string();
	//new std::map()std::map> images;
}

void
ImageMetadata::__cleanup()
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
	//
}

void
ImageMetadata::fromJson(char* jsonStr)
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
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

std::map<string, string>
ImageMetadata::getImages()
{
	return images;
}

void
ImageMetadata::setImages(std::map <string, string> images)
{
	this->images = images;
}


