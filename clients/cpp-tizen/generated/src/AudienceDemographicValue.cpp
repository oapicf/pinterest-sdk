#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AudienceDemographicValue.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AudienceDemographicValue::AudienceDemographicValue()
{
	//__init();
}

AudienceDemographicValue::~AudienceDemographicValue()
{
	//__cleanup();
}

void
AudienceDemographicValue::__init()
{
	//key = std::string();
	//name = std::string();
	//ratio = double(0);
}

void
AudienceDemographicValue::__cleanup()
{
	//if(key != NULL) {
	//
	//delete key;
	//key = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(ratio != NULL) {
	//
	//delete ratio;
	//ratio = NULL;
	//}
	//
}

void
AudienceDemographicValue::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *keyKey = "key";
	node = json_object_get_member(pJsonObject, keyKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&key, node, "std::string", "");
		} else {
			
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
	const gchar *ratioKey = "ratio";
	node = json_object_get_member(pJsonObject, ratioKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&ratio, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&ratio);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

AudienceDemographicValue::AudienceDemographicValue(char* json)
{
	this->fromJson(json);
}

char*
AudienceDemographicValue::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getKey();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *keyKey = "key";
	json_object_set_member(pJsonObject, keyKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("long long")) {
		long long obj = getRatio();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getRatio());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *ratioKey = "ratio";
	json_object_set_member(pJsonObject, ratioKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
AudienceDemographicValue::getKey()
{
	return key;
}

void
AudienceDemographicValue::setKey(std::string  key)
{
	this->key = key;
}

std::string
AudienceDemographicValue::getName()
{
	return name;
}

void
AudienceDemographicValue::setName(std::string  name)
{
	this->name = name;
}

long long
AudienceDemographicValue::getRatio()
{
	return ratio;
}

void
AudienceDemographicValue::setRatio(long long  ratio)
{
	this->ratio = ratio;
}


