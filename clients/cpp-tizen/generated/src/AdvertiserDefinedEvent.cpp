#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdvertiserDefinedEvent.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdvertiserDefinedEvent::AdvertiserDefinedEvent()
{
	//__init();
}

AdvertiserDefinedEvent::~AdvertiserDefinedEvent()
{
	//__cleanup();
}

void
AdvertiserDefinedEvent::__init()
{
	//name = std::string();
	//mapped_conversion_type = std::string();
}

void
AdvertiserDefinedEvent::__cleanup()
{
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(mapped_conversion_type != NULL) {
	//
	//delete mapped_conversion_type;
	//mapped_conversion_type = NULL;
	//}
	//
}

void
AdvertiserDefinedEvent::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *mapped_conversion_typeKey = "mapped_conversion_type";
	node = json_object_get_member(pJsonObject, mapped_conversion_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&mapped_conversion_type, node, "std::string", "");
		} else {
			
		}
	}
}

AdvertiserDefinedEvent::AdvertiserDefinedEvent(char* json)
{
	this->fromJson(json);
}

char*
AdvertiserDefinedEvent::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getMappedConversionType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *mapped_conversion_typeKey = "mapped_conversion_type";
	json_object_set_member(pJsonObject, mapped_conversion_typeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
AdvertiserDefinedEvent::getName()
{
	return name;
}

void
AdvertiserDefinedEvent::setName(std::string  name)
{
	this->name = name;
}

std::string
AdvertiserDefinedEvent::getMappedConversionType()
{
	return mapped_conversion_type;
}

void
AdvertiserDefinedEvent::setMappedConversionType(std::string  mapped_conversion_type)
{
	this->mapped_conversion_type = mapped_conversion_type;
}


