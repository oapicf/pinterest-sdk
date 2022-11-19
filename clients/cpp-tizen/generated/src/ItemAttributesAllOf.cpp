#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ItemAttributes_allOf.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ItemAttributes_allOf::ItemAttributes_allOf()
{
	//__init();
}

ItemAttributes_allOf::~ItemAttributes_allOf()
{
	//__cleanup();
}

void
ItemAttributes_allOf::__init()
{
	//new std::list()std::list> additional_image_link;
	//new std::list()std::list> image_link;
}

void
ItemAttributes_allOf::__cleanup()
{
	//if(additional_image_link != NULL) {
	//additional_image_link.RemoveAll(true);
	//delete additional_image_link;
	//additional_image_link = NULL;
	//}
	//if(image_link != NULL) {
	//image_link.RemoveAll(true);
	//delete image_link;
	//image_link = NULL;
	//}
	//
}

void
ItemAttributes_allOf::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *additional_image_linkKey = "additional_image_link";
	node = json_object_get_member(pJsonObject, additional_image_linkKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			additional_image_link = new_list;
		}
		
	}
	const gchar *image_linkKey = "image_link";
	node = json_object_get_member(pJsonObject, image_linkKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			image_link = new_list;
		}
		
	}
}

ItemAttributes_allOf::ItemAttributes_allOf(char* json)
{
	this->fromJson(json);
}

char*
ItemAttributes_allOf::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getAdditionalImageLink());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getAdditionalImageLink());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *additional_image_linkKey = "additional_image_link";
	json_object_set_member(pJsonObject, additional_image_linkKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getImageLink());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getImageLink());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *image_linkKey = "image_link";
	json_object_set_member(pJsonObject, image_linkKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<std::string>
ItemAttributes_allOf::getAdditionalImageLink()
{
	return additional_image_link;
}

void
ItemAttributes_allOf::setAdditionalImageLink(std::list <std::string> additional_image_link)
{
	this->additional_image_link = additional_image_link;
}

std::list<std::string>
ItemAttributes_allOf::getImageLink()
{
	return image_link;
}

void
ItemAttributes_allOf::setImageLink(std::list <std::string> image_link)
{
	this->image_link = image_link;
}


