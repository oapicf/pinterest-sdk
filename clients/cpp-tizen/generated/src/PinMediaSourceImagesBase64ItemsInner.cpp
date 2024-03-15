#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PinMediaSourceImagesBase64_items_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PinMediaSourceImagesBase64_items_inner::PinMediaSourceImagesBase64_items_inner()
{
	//__init();
}

PinMediaSourceImagesBase64_items_inner::~PinMediaSourceImagesBase64_items_inner()
{
	//__cleanup();
}

void
PinMediaSourceImagesBase64_items_inner::__init()
{
	//title = std::string();
	//description = std::string();
	//link = std::string();
	//content_type = std::string();
	//data = std::string();
}

void
PinMediaSourceImagesBase64_items_inner::__cleanup()
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
	//if(content_type != NULL) {
	//
	//delete content_type;
	//content_type = NULL;
	//}
	//if(data != NULL) {
	//
	//delete data;
	//data = NULL;
	//}
	//
}

void
PinMediaSourceImagesBase64_items_inner::fromJson(char* jsonStr)
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
	const gchar *content_typeKey = "content_type";
	node = json_object_get_member(pJsonObject, content_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&content_type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *dataKey = "data";
	node = json_object_get_member(pJsonObject, dataKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&data, node, "std::string", "");
		} else {
			
		}
	}
}

PinMediaSourceImagesBase64_items_inner::PinMediaSourceImagesBase64_items_inner(char* json)
{
	this->fromJson(json);
}

char*
PinMediaSourceImagesBase64_items_inner::toJson()
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
		std::string obj = getContentType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *content_typeKey = "content_type";
	json_object_set_member(pJsonObject, content_typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getData();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *dataKey = "data";
	json_object_set_member(pJsonObject, dataKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
PinMediaSourceImagesBase64_items_inner::getTitle()
{
	return title;
}

void
PinMediaSourceImagesBase64_items_inner::setTitle(std::string  title)
{
	this->title = title;
}

std::string
PinMediaSourceImagesBase64_items_inner::getDescription()
{
	return description;
}

void
PinMediaSourceImagesBase64_items_inner::setDescription(std::string  description)
{
	this->description = description;
}

std::string
PinMediaSourceImagesBase64_items_inner::getLink()
{
	return link;
}

void
PinMediaSourceImagesBase64_items_inner::setLink(std::string  link)
{
	this->link = link;
}

std::string
PinMediaSourceImagesBase64_items_inner::getContentType()
{
	return content_type;
}

void
PinMediaSourceImagesBase64_items_inner::setContentType(std::string  content_type)
{
	this->content_type = content_type;
}

std::string
PinMediaSourceImagesBase64_items_inner::getData()
{
	return data;
}

void
PinMediaSourceImagesBase64_items_inner::setData(std::string  data)
{
	this->data = data;
}


