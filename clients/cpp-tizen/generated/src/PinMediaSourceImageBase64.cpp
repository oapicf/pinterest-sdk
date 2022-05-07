#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PinMediaSourceImageBase64.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PinMediaSourceImageBase64::PinMediaSourceImageBase64()
{
	//__init();
}

PinMediaSourceImageBase64::~PinMediaSourceImageBase64()
{
	//__cleanup();
}

void
PinMediaSourceImageBase64::__init()
{
	//source_type = std::string();
	//content_type = std::string();
	//data = std::string();
}

void
PinMediaSourceImageBase64::__cleanup()
{
	//if(source_type != NULL) {
	//
	//delete source_type;
	//source_type = NULL;
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
PinMediaSourceImageBase64::fromJson(char* jsonStr)
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

PinMediaSourceImageBase64::PinMediaSourceImageBase64(char* json)
{
	this->fromJson(json);
}

char*
PinMediaSourceImageBase64::toJson()
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
PinMediaSourceImageBase64::getSourceType()
{
	return source_type;
}

void
PinMediaSourceImageBase64::setSourceType(std::string  source_type)
{
	this->source_type = source_type;
}

std::string
PinMediaSourceImageBase64::getContentType()
{
	return content_type;
}

void
PinMediaSourceImageBase64::setContentType(std::string  content_type)
{
	this->content_type = content_type;
}

std::string
PinMediaSourceImageBase64::getData()
{
	return data;
}

void
PinMediaSourceImageBase64::setData(std::string  data)
{
	this->data = data;
}


