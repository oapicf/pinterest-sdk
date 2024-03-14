#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AudienceCreateRequest_1_audience_type.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AudienceCreateRequest_1_audience_type::AudienceCreateRequest_1_audience_type()
{
	//__init();
}

AudienceCreateRequest_1_audience_type::~AudienceCreateRequest_1_audience_type()
{
	//__cleanup();
}

void
AudienceCreateRequest_1_audience_type::__init()
{
}

void
AudienceCreateRequest_1_audience_type::__cleanup()
{
	//
}

void
AudienceCreateRequest_1_audience_type::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
}

AudienceCreateRequest_1_audience_type::AudienceCreateRequest_1_audience_type(char* json)
{
	this->fromJson(json);
}

char*
AudienceCreateRequest_1_audience_type::toJson()
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


