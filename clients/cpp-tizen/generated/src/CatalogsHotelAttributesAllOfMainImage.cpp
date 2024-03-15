#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsHotelAttributes_allOf_main_image.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsHotelAttributes_allOf_main_image::CatalogsHotelAttributes_allOf_main_image()
{
	//__init();
}

CatalogsHotelAttributes_allOf_main_image::~CatalogsHotelAttributes_allOf_main_image()
{
	//__cleanup();
}

void
CatalogsHotelAttributes_allOf_main_image::__init()
{
	//link = std::string();
	//new std::list()std::list> tag;
}

void
CatalogsHotelAttributes_allOf_main_image::__cleanup()
{
	//if(link != NULL) {
	//
	//delete link;
	//link = NULL;
	//}
	//if(tag != NULL) {
	//tag.RemoveAll(true);
	//delete tag;
	//tag = NULL;
	//}
	//
}

void
CatalogsHotelAttributes_allOf_main_image::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *linkKey = "link";
	node = json_object_get_member(pJsonObject, linkKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&link, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *tagKey = "tag";
	node = json_object_get_member(pJsonObject, tagKey);
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
			tag = new_list;
		}
		
	}
}

CatalogsHotelAttributes_allOf_main_image::CatalogsHotelAttributes_allOf_main_image(char* json)
{
	this->fromJson(json);
}

char*
CatalogsHotelAttributes_allOf_main_image::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getLink();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *linkKey = "link";
	json_object_set_member(pJsonObject, linkKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getTag());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getTag());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *tagKey = "tag";
	json_object_set_member(pJsonObject, tagKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
CatalogsHotelAttributes_allOf_main_image::getLink()
{
	return link;
}

void
CatalogsHotelAttributes_allOf_main_image::setLink(std::string  link)
{
	this->link = link;
}

std::list<std::string>
CatalogsHotelAttributes_allOf_main_image::getTag()
{
	return tag;
}

void
CatalogsHotelAttributes_allOf_main_image::setTag(std::list <std::string> tag)
{
	this->tag = tag;
}


