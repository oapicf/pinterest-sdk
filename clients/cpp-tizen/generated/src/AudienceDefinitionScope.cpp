#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AudienceDefinitionScope.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AudienceDefinitionScope::AudienceDefinitionScope()
{
	//__init();
}

AudienceDefinitionScope::~AudienceDefinitionScope()
{
	//__cleanup();
}

void
AudienceDefinitionScope::__init()
{
	//scope = std::string();
}

void
AudienceDefinitionScope::__cleanup()
{
	//if(scope != NULL) {
	//
	//delete scope;
	//scope = NULL;
	//}
	//
}

void
AudienceDefinitionScope::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *scopeKey = "scope";
	node = json_object_get_member(pJsonObject, scopeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&scope, node, "std::string", "");
		} else {
			
		}
	}
}

AudienceDefinitionScope::AudienceDefinitionScope(char* json)
{
	this->fromJson(json);
}

char*
AudienceDefinitionScope::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getScope();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
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
AudienceDefinitionScope::getScope()
{
	return scope;
}

void
AudienceDefinitionScope::setScope(std::string  scope)
{
	this->scope = scope;
}


