#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PinMediaSourceImagesBase64Item.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PinMediaSourceImagesBase64Item::PinMediaSourceImagesBase64Item()
{
	//__init();
}

PinMediaSourceImagesBase64Item::~PinMediaSourceImagesBase64Item()
{
	//__cleanup();
}

void
PinMediaSourceImagesBase64Item::__init()
{
	//content_type = new ContentType();
	//data = std::string();
	//description = std::string();
	//link = std::string();
	//title = std::string();
}

void
PinMediaSourceImagesBase64Item::__cleanup()
{
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
	//
}

void
PinMediaSourceImagesBase64Item::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *content_typeKey = "content_type";
	node = json_object_get_member(pJsonObject, content_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("ContentType")) {
			jsonToValue(&content_type, node, "ContentType", "ContentType");
		} else {
			
			ContentType* obj = static_cast<ContentType*> (&content_type);
			obj->fromJson(json_to_string(node, false));
			
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
}

PinMediaSourceImagesBase64Item::PinMediaSourceImagesBase64Item(char* json)
{
	this->fromJson(json);
}

char*
PinMediaSourceImagesBase64Item::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ContentType")) {
		ContentType obj = getContentType();
		node = converttoJson(&obj, "ContentType", "");
	}
	else {
		
		ContentType obj = static_cast<ContentType> (getContentType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ContentType
PinMediaSourceImagesBase64Item::getContentType()
{
	return content_type;
}

void
PinMediaSourceImagesBase64Item::setContentType(ContentType  content_type)
{
	this->content_type = content_type;
}

std::string
PinMediaSourceImagesBase64Item::getData()
{
	return data;
}

void
PinMediaSourceImagesBase64Item::setData(std::string  data)
{
	this->data = data;
}

std::string
PinMediaSourceImagesBase64Item::getDescription()
{
	return description;
}

void
PinMediaSourceImagesBase64Item::setDescription(std::string  description)
{
	this->description = description;
}

std::string
PinMediaSourceImagesBase64Item::getLink()
{
	return link;
}

void
PinMediaSourceImagesBase64Item::setLink(std::string  link)
{
	this->link = link;
}

std::string
PinMediaSourceImagesBase64Item::getTitle()
{
	return title;
}

void
PinMediaSourceImagesBase64Item::setTitle(std::string  title)
{
	this->title = title;
}


