#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Interest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Interest::Interest()
{
	//__init();
}

Interest::~Interest()
{
	//__cleanup();
}

void
Interest::__init()
{
	//canonical_url = std::string();
	//id = std::string();
	//key = std::string();
	//name = std::string();
}

void
Interest::__cleanup()
{
	//if(canonical_url != NULL) {
	//
	//delete canonical_url;
	//canonical_url = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
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
	//
}

void
Interest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *canonical_urlKey = "canonical_url";
	node = json_object_get_member(pJsonObject, canonical_urlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&canonical_url, node, "std::string", "");
		} else {
			
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
}

Interest::Interest(char* json)
{
	this->fromJson(json);
}

char*
Interest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getCanonicalUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *canonical_urlKey = "canonical_url";
	json_object_set_member(pJsonObject, canonical_urlKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
Interest::getCanonicalUrl()
{
	return canonical_url;
}

void
Interest::setCanonicalUrl(std::string  canonical_url)
{
	this->canonical_url = canonical_url;
}

std::string
Interest::getId()
{
	return id;
}

void
Interest::setId(std::string  id)
{
	this->id = id;
}

std::string
Interest::getKey()
{
	return key;
}

void
Interest::setKey(std::string  key)
{
	this->key = key;
}

std::string
Interest::getName()
{
	return name;
}

void
Interest::setName(std::string  name)
{
	this->name = name;
}


