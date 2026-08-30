#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdvertiserDefinedEventInput.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdvertiserDefinedEventInput::AdvertiserDefinedEventInput()
{
	//__init();
}

AdvertiserDefinedEventInput::~AdvertiserDefinedEventInput()
{
	//__cleanup();
}

void
AdvertiserDefinedEventInput::__init()
{
	//mapped_conversion_type = null;
	//name = std::string();
}

void
AdvertiserDefinedEventInput::__cleanup()
{
	//if(mapped_conversion_type != NULL) {
	//
	//delete mapped_conversion_type;
	//mapped_conversion_type = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//
}

void
AdvertiserDefinedEventInput::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *mapped_conversion_typeKey = "mapped_conversion_type";
	node = json_object_get_member(pJsonObject, mapped_conversion_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("AdvertiserDefinedEventMappingType")) {
			jsonToValue(&mapped_conversion_type, node, "AdvertiserDefinedEventMappingType", "AdvertiserDefinedEventMappingType");
		} else {
			
			AdvertiserDefinedEventMappingType* obj = static_cast<AdvertiserDefinedEventMappingType*> (&mapped_conversion_type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
}

AdvertiserDefinedEventInput::AdvertiserDefinedEventInput(char* json)
{
	this->fromJson(json);
}

char*
AdvertiserDefinedEventInput::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("AdvertiserDefinedEventMappingType")) {
		AdvertiserDefinedEventMappingType obj = getMappedConversionType();
		node = converttoJson(&obj, "AdvertiserDefinedEventMappingType", "");
	}
	else {
		
		AdvertiserDefinedEventMappingType obj = static_cast<AdvertiserDefinedEventMappingType> (getMappedConversionType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *mapped_conversion_typeKey = "mapped_conversion_type";
	json_object_set_member(pJsonObject, mapped_conversion_typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

AdvertiserDefinedEventMappingType
AdvertiserDefinedEventInput::getMappedConversionType()
{
	return mapped_conversion_type;
}

void
AdvertiserDefinedEventInput::setMappedConversionType(AdvertiserDefinedEventMappingType  mapped_conversion_type)
{
	this->mapped_conversion_type = mapped_conversion_type;
}

std::string
AdvertiserDefinedEventInput::getName()
{
	return name;
}

void
AdvertiserDefinedEventInput::setName(std::string  name)
{
	this->name = name;
}


