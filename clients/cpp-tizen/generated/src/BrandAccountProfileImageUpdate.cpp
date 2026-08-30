#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "BrandAccountProfileImageUpdate.h"

using namespace std;
using namespace Tizen::ArtikCloud;

BrandAccountProfileImageUpdate::BrandAccountProfileImageUpdate()
{
	//__init();
}

BrandAccountProfileImageUpdate::~BrandAccountProfileImageUpdate()
{
	//__cleanup();
}

void
BrandAccountProfileImageUpdate::__init()
{
	//content_type = std::string();
	//data = std::string();
}

void
BrandAccountProfileImageUpdate::__cleanup()
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
	//
}

void
BrandAccountProfileImageUpdate::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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

BrandAccountProfileImageUpdate::BrandAccountProfileImageUpdate(char* json)
{
	this->fromJson(json);
}

char*
BrandAccountProfileImageUpdate::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
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
BrandAccountProfileImageUpdate::getContentType()
{
	return content_type;
}

void
BrandAccountProfileImageUpdate::setContentType(std::string  content_type)
{
	this->content_type = content_type;
}

std::string
BrandAccountProfileImageUpdate::getData()
{
	return data;
}

void
BrandAccountProfileImageUpdate::setData(std::string  data)
{
	this->data = data;
}


