#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PinMediaSourceImagesURL_items_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PinMediaSourceImagesURL_items_inner::PinMediaSourceImagesURL_items_inner()
{
	//__init();
}

PinMediaSourceImagesURL_items_inner::~PinMediaSourceImagesURL_items_inner()
{
	//__cleanup();
}

void
PinMediaSourceImagesURL_items_inner::__init()
{
	//title = std::string();
	//description = std::string();
	//link = std::string();
	//url = std::string();
}

void
PinMediaSourceImagesURL_items_inner::__cleanup()
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
	//if(url != NULL) {
	//
	//delete url;
	//url = NULL;
	//}
	//
}

void
PinMediaSourceImagesURL_items_inner::fromJson(char* jsonStr)
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
	const gchar *urlKey = "url";
	node = json_object_get_member(pJsonObject, urlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&url, node, "std::string", "");
		} else {
			
		}
	}
}

PinMediaSourceImagesURL_items_inner::PinMediaSourceImagesURL_items_inner(char* json)
{
	this->fromJson(json);
}

char*
PinMediaSourceImagesURL_items_inner::toJson()
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
	if (isprimitive("std::string")) {
		std::string obj = getUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *urlKey = "url";
	json_object_set_member(pJsonObject, urlKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
PinMediaSourceImagesURL_items_inner::getTitle()
{
	return title;
}

void
PinMediaSourceImagesURL_items_inner::setTitle(std::string  title)
{
	this->title = title;
}

std::string
PinMediaSourceImagesURL_items_inner::getDescription()
{
	return description;
}

void
PinMediaSourceImagesURL_items_inner::setDescription(std::string  description)
{
	this->description = description;
}

std::string
PinMediaSourceImagesURL_items_inner::getLink()
{
	return link;
}

void
PinMediaSourceImagesURL_items_inner::setLink(std::string  link)
{
	this->link = link;
}

std::string
PinMediaSourceImagesURL_items_inner::getUrl()
{
	return url;
}

void
PinMediaSourceImagesURL_items_inner::setUrl(std::string  url)
{
	this->url = url;
}


