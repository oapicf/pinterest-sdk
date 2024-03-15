#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "SSIOAccountPMPName.h"

using namespace std;
using namespace Tizen::ArtikCloud;

SSIOAccountPMPName::SSIOAccountPMPName()
{
	//__init();
}

SSIOAccountPMPName::~SSIOAccountPMPName()
{
	//__cleanup();
}

void
SSIOAccountPMPName::__init()
{
	//name = std::string();
	//id = std::string();
}

void
SSIOAccountPMPName::__cleanup()
{
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//
}

void
SSIOAccountPMPName::fromJson(char* jsonStr)
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
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
}

SSIOAccountPMPName::SSIOAccountPMPName(char* json)
{
	this->fromJson(json);
}

char*
SSIOAccountPMPName::toJson()
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
SSIOAccountPMPName::getName()
{
	return name;
}

void
SSIOAccountPMPName::setName(std::string  name)
{
	this->name = name;
}

std::string
SSIOAccountPMPName::getId()
{
	return id;
}

void
SSIOAccountPMPName::setId(std::string  id)
{
	this->id = id;
}


