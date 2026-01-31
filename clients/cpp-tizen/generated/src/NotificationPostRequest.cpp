#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Notification_post_request.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Notification_post_request::Notification_post_request()
{
	//__init();
}

Notification_post_request::~Notification_post_request()
{
	//__cleanup();
}

void
Notification_post_request::__init()
{
}

void
Notification_post_request::__cleanup()
{
	//
}

void
Notification_post_request::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
}

Notification_post_request::Notification_post_request(char* json)
{
	this->fromJson(json);
}

char*
Notification_post_request::toJson()
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


