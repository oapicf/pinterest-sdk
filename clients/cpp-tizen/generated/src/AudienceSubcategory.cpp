#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AudienceSubcategory.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AudienceSubcategory::AudienceSubcategory()
{
	//__init();
}

AudienceSubcategory::~AudienceSubcategory()
{
	//__cleanup();
}

void
AudienceSubcategory::__init()
{
	//id = std::string();
	//index = double(0);
	//key = std::string();
	//name = std::string();
	//ratio = double(0);
}

void
AudienceSubcategory::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(index != NULL) {
	//
	//delete index;
	//index = NULL;
	//}
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
AudienceSubcategory::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
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

AudienceSubcategory::AudienceSubcategory(char* json)
{
	this->fromJson(json);
}

char*
AudienceSubcategory::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
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
AudienceSubcategory::getId()
{
	return id;
}

void
AudienceSubcategory::setId(std::string  id)
{
	this->id = id;
}

long long
AudienceSubcategory::getIndex()
{
	return index;
}

void
AudienceSubcategory::setIndex(long long  index)
{
	this->index = index;
}

std::string
AudienceSubcategory::getKey()
{
	return key;
}

void
AudienceSubcategory::setKey(std::string  key)
{
	this->key = key;
}

std::string
AudienceSubcategory::getName()
{
	return name;
}

void
AudienceSubcategory::setName(std::string  name)
{
	this->name = name;
}

long long
AudienceSubcategory::getRatio()
{
	return ratio;
}

void
AudienceSubcategory::setRatio(long long  ratio)
{
	this->ratio = ratio;
}


