#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsCreativeAssetsFeedsCreateRequest_default_locale.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsCreativeAssetsFeedsCreateRequest_default_locale::CatalogsCreativeAssetsFeedsCreateRequest_default_locale()
{
	//__init();
}

CatalogsCreativeAssetsFeedsCreateRequest_default_locale::~CatalogsCreativeAssetsFeedsCreateRequest_default_locale()
{
	//__cleanup();
}

void
CatalogsCreativeAssetsFeedsCreateRequest_default_locale::__init()
{
}

void
CatalogsCreativeAssetsFeedsCreateRequest_default_locale::__cleanup()
{
	//
}

void
CatalogsCreativeAssetsFeedsCreateRequest_default_locale::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
}

CatalogsCreativeAssetsFeedsCreateRequest_default_locale::CatalogsCreativeAssetsFeedsCreateRequest_default_locale(char* json)
{
	this->fromJson(json);
}

char*
CatalogsCreativeAssetsFeedsCreateRequest_default_locale::toJson()
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


