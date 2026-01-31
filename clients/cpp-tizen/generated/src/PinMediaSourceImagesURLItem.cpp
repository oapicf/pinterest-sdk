#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PinMediaSourceImagesURLItem.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PinMediaSourceImagesURLItem::PinMediaSourceImagesURLItem()
{
	//__init();
}

PinMediaSourceImagesURLItem::~PinMediaSourceImagesURLItem()
{
	//__cleanup();
}

void
PinMediaSourceImagesURLItem::__init()
{
	//description = std::string();
	//link = std::string();
	//title = std::string();
	//url = std::string();
}

void
PinMediaSourceImagesURLItem::__cleanup()
{
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
	//if(title != NULL) {
	//
	//delete title;
	//title = NULL;
	//}
	//if(url != NULL) {
	//
	//delete url;
	//url = NULL;
	//}
	//
}

void
PinMediaSourceImagesURLItem::fromJson(char* jsonStr)
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
	const gchar *urlKey = "url";
	node = json_object_get_member(pJsonObject, urlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&url, node, "std::string", "");
		} else {
			
		}
	}
}

PinMediaSourceImagesURLItem::PinMediaSourceImagesURLItem(char* json)
{
	this->fromJson(json);
}

char*
PinMediaSourceImagesURLItem::toJson()
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
PinMediaSourceImagesURLItem::getDescription()
{
	return description;
}

void
PinMediaSourceImagesURLItem::setDescription(std::string  description)
{
	this->description = description;
}

std::string
PinMediaSourceImagesURLItem::getLink()
{
	return link;
}

void
PinMediaSourceImagesURLItem::setLink(std::string  link)
{
	this->link = link;
}

std::string
PinMediaSourceImagesURLItem::getTitle()
{
	return title;
}

void
PinMediaSourceImagesURLItem::setTitle(std::string  title)
{
	this->title = title;
}

std::string
PinMediaSourceImagesURLItem::getUrl()
{
	return url;
}

void
PinMediaSourceImagesURLItem::setUrl(std::string  url)
{
	this->url = url;
}


