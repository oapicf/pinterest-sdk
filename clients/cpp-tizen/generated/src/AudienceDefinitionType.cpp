#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AudienceDefinitionType.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AudienceDefinitionType::AudienceDefinitionType()
{
	//__init();
}

AudienceDefinitionType::~AudienceDefinitionType()
{
	//__cleanup();
}

void
AudienceDefinitionType::__init()
{
	//scope = std::string();
}

void
AudienceDefinitionType::__cleanup()
{
	//if(scope != NULL) {
	//
	//delete scope;
	//scope = NULL;
	//}
	//
}

void
AudienceDefinitionType::fromJson(char* jsonStr)
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

AudienceDefinitionType::AudienceDefinitionType(char* json)
{
	this->fromJson(json);
}

char*
AudienceDefinitionType::toJson()
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
AudienceDefinitionType::getScope()
{
	return scope;
}

void
AudienceDefinitionType::setScope(std::string  scope)
{
	this->scope = scope;
}


