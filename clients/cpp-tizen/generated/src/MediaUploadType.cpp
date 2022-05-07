#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "MediaUploadType.h"

using namespace std;
using namespace Tizen::ArtikCloud;

MediaUploadType::MediaUploadType()
{
	//__init();
}

MediaUploadType::~MediaUploadType()
{
	//__cleanup();
}

void
MediaUploadType::__init()
{
}

void
MediaUploadType::__cleanup()
{
	//
}

void
MediaUploadType::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
}

MediaUploadType::MediaUploadType(char* json)
{
	this->fromJson(json);
}

char*
MediaUploadType::toJson()
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


