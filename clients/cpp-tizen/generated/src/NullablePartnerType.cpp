#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "NullablePartnerType.h"

using namespace std;
using namespace Tizen::ArtikCloud;

NullablePartnerType::NullablePartnerType()
{
	//__init();
}

NullablePartnerType::~NullablePartnerType()
{
	//__cleanup();
}

void
NullablePartnerType::__init()
{
}

void
NullablePartnerType::__cleanup()
{
	//
}

void
NullablePartnerType::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
}

NullablePartnerType::NullablePartnerType(char* json)
{
	this->fromJson(json);
}

char*
NullablePartnerType::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}


