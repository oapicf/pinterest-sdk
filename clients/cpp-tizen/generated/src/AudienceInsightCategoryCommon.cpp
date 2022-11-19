#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AudienceInsightCategoryCommon.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AudienceInsightCategoryCommon::AudienceInsightCategoryCommon()
{
	//__init();
}

AudienceInsightCategoryCommon::~AudienceInsightCategoryCommon()
{
	//__cleanup();
}

void
AudienceInsightCategoryCommon::__init()
{
	//key = std::string();
	//name = std::string();
	//ratio = double(0);
	//index = double(0);
	//id = std::string();
}

void
AudienceInsightCategoryCommon::__cleanup()
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
	//if(index != NULL) {
	//
	//delete index;
	//index = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//
}

void
AudienceInsightCategoryCommon::fromJson(char* jsonStr)
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
	const gchar *indexKey = "index";
	node = json_object_get_member(pJsonObject, indexKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&index, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&index);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
}

AudienceInsightCategoryCommon::AudienceInsightCategoryCommon(char* json)
{
	this->fromJson(json);
}

char*
AudienceInsightCategoryCommon::toJson()
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
	if (isprimitive("long long")) {
		long long obj = getIndex();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getIndex());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *indexKey = "index";
	json_object_set_member(pJsonObject, indexKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
AudienceInsightCategoryCommon::getKey()
{
	return key;
}

void
AudienceInsightCategoryCommon::setKey(std::string  key)
{
	this->key = key;
}

std::string
AudienceInsightCategoryCommon::getName()
{
	return name;
}

void
AudienceInsightCategoryCommon::setName(std::string  name)
{
	this->name = name;
}

long long
AudienceInsightCategoryCommon::getRatio()
{
	return ratio;
}

void
AudienceInsightCategoryCommon::setRatio(long long  ratio)
{
	this->ratio = ratio;
}

long long
AudienceInsightCategoryCommon::getIndex()
{
	return index;
}

void
AudienceInsightCategoryCommon::setIndex(long long  index)
{
	this->index = index;
}

std::string
AudienceInsightCategoryCommon::getId()
{
	return id;
}

void
AudienceInsightCategoryCommon::setId(std::string  id)
{
	this->id = id;
}


