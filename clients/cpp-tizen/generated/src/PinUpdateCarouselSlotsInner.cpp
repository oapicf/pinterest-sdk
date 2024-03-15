#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PinUpdate_carousel_slots_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PinUpdate_carousel_slots_inner::PinUpdate_carousel_slots_inner()
{
	//__init();
}

PinUpdate_carousel_slots_inner::~PinUpdate_carousel_slots_inner()
{
	//__cleanup();
}

void
PinUpdate_carousel_slots_inner::__init()
{
	//title = std::string();
	//description = std::string();
	//link = std::string();
}

void
PinUpdate_carousel_slots_inner::__cleanup()
{
	//if(title != NULL) {
	//
	//delete title;
	//title = NULL;
	//}
	//if(description != NULL) {
	//
	//delete description;
	//description = NULL;
	//}
	//if(link != NULL) {
	//
	//delete link;
	//link = NULL;
	//}
	//
}

void
PinUpdate_carousel_slots_inner::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *titleKey = "title";
	node = json_object_get_member(pJsonObject, titleKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&title, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *descriptionKey = "description";
	node = json_object_get_member(pJsonObject, descriptionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&description, node, "std::string", "");
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
}

PinUpdate_carousel_slots_inner::PinUpdate_carousel_slots_inner(char* json)
{
	this->fromJson(json);
}

char*
PinUpdate_carousel_slots_inner::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getTitle();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *titleKey = "title";
	json_object_set_member(pJsonObject, titleKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDescription();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *descriptionKey = "description";
	json_object_set_member(pJsonObject, descriptionKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getLink();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *linkKey = "link";
	json_object_set_member(pJsonObject, linkKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
PinUpdate_carousel_slots_inner::getTitle()
{
	return title;
}

void
PinUpdate_carousel_slots_inner::setTitle(std::string  title)
{
	this->title = title;
}

std::string
PinUpdate_carousel_slots_inner::getDescription()
{
	return description;
}

void
PinUpdate_carousel_slots_inner::setDescription(std::string  description)
{
	this->description = description;
}

std::string
PinUpdate_carousel_slots_inner::getLink()
{
	return link;
}

void
PinUpdate_carousel_slots_inner::setLink(std::string  link)
{
	this->link = link;
}


