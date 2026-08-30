#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "BoardSectionUpdateWithRequiredBody.h"

using namespace std;
using namespace Tizen::ArtikCloud;

BoardSectionUpdateWithRequiredBody::BoardSectionUpdateWithRequiredBody()
{
	//__init();
}

BoardSectionUpdateWithRequiredBody::~BoardSectionUpdateWithRequiredBody()
{
	//__cleanup();
}

void
BoardSectionUpdateWithRequiredBody::__init()
{
	//id = std::string();
	//name = std::string();
}

void
BoardSectionUpdateWithRequiredBody::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//
}

void
BoardSectionUpdateWithRequiredBody::fromJson(char* jsonStr)
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
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
}

BoardSectionUpdateWithRequiredBody::BoardSectionUpdateWithRequiredBody(char* json)
{
	this->fromJson(json);
}

char*
BoardSectionUpdateWithRequiredBody::toJson()
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
BoardSectionUpdateWithRequiredBody::getId()
{
	return id;
}

void
BoardSectionUpdateWithRequiredBody::setId(std::string  id)
{
	this->id = id;
}

std::string
BoardSectionUpdateWithRequiredBody::getName()
{
	return name;
}

void
BoardSectionUpdateWithRequiredBody::setName(std::string  name)
{
	this->name = name;
}


