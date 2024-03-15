#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AudienceDefinition.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AudienceDefinition::AudienceDefinition()
{
	//__init();
}

AudienceDefinition::~AudienceDefinition()
{
	//__cleanup();
}

void
AudienceDefinition::__init()
{
	//date = std::string();
	//type = std::string();
	//scope = std::string();
}

void
AudienceDefinition::__cleanup()
{
	//if(date != NULL) {
	//
	//delete date;
	//date = NULL;
	//}
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(scope != NULL) {
	//
	//delete scope;
	//scope = NULL;
	//}
	//
}

void
AudienceDefinition::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *dateKey = "date";
	node = json_object_get_member(pJsonObject, dateKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&date, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&type, node, "std::string", "");
		} else {
			
			std::string* obj = static_cast<std::string*> (&type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *scopeKey = "scope";
	node = json_object_get_member(pJsonObject, scopeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&scope, node, "std::string", "");
		} else {
			
			std::string* obj = static_cast<std::string*> (&scope);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

AudienceDefinition::AudienceDefinition(char* json)
{
	this->fromJson(json);
}

char*
AudienceDefinition::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getDate();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *dateKey = "date";
	json_object_set_member(pJsonObject, dateKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
		std::string obj = static_cast<std::string> (getType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getScope();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
		std::string obj = static_cast<std::string> (getScope());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *scopeKey = "scope";
	json_object_set_member(pJsonObject, scopeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
AudienceDefinition::getDate()
{
	return date;
}

void
AudienceDefinition::setDate(std::string  date)
{
	this->date = date;
}

std::string
AudienceDefinition::getType()
{
	return type;
}

void
AudienceDefinition::setType(std::string  type)
{
	this->type = type;
}

std::string
AudienceDefinition::getScope()
{
	return scope;
}

void
AudienceDefinition::setScope(std::string  scope)
{
	this->scope = scope;
}


