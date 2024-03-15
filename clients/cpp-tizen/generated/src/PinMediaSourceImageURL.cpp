#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PinMediaSourceImageURL.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PinMediaSourceImageURL::PinMediaSourceImageURL()
{
	//__init();
}

PinMediaSourceImageURL::~PinMediaSourceImageURL()
{
	//__cleanup();
}

void
PinMediaSourceImageURL::__init()
{
	//source_type = std::string();
	//url = std::string();
	//is_standard = bool(false);
}

void
PinMediaSourceImageURL::__cleanup()
{
	//if(source_type != NULL) {
	//
	//delete source_type;
	//source_type = NULL;
	//}
	//if(url != NULL) {
	//
	//delete url;
	//url = NULL;
	//}
	//if(is_standard != NULL) {
	//
	//delete is_standard;
	//is_standard = NULL;
	//}
	//
}

void
PinMediaSourceImageURL::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *source_typeKey = "source_type";
	node = json_object_get_member(pJsonObject, source_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&source_type, node, "std::string", "");
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
	const gchar *is_standardKey = "is_standard";
	node = json_object_get_member(pJsonObject, is_standardKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_standard, node, "bool", "");
		} else {
			
		}
	}
}

PinMediaSourceImageURL::PinMediaSourceImageURL(char* json)
{
	this->fromJson(json);
}

char*
PinMediaSourceImageURL::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getSourceType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *source_typeKey = "source_type";
	json_object_set_member(pJsonObject, source_typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *urlKey = "url";
	json_object_set_member(pJsonObject, urlKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsStandard();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_standardKey = "is_standard";
	json_object_set_member(pJsonObject, is_standardKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
PinMediaSourceImageURL::getSourceType()
{
	return source_type;
}

void
PinMediaSourceImageURL::setSourceType(std::string  source_type)
{
	this->source_type = source_type;
}

std::string
PinMediaSourceImageURL::getUrl()
{
	return url;
}

void
PinMediaSourceImageURL::setUrl(std::string  url)
{
	this->url = url;
}

bool
PinMediaSourceImageURL::getIsStandard()
{
	return is_standard;
}

void
PinMediaSourceImageURL::setIsStandard(bool  is_standard)
{
	this->is_standard = is_standard;
}


