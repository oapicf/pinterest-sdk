#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsDeleteCreativeAssetsItem.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsDeleteCreativeAssetsItem::CatalogsDeleteCreativeAssetsItem()
{
	//__init();
}

CatalogsDeleteCreativeAssetsItem::~CatalogsDeleteCreativeAssetsItem()
{
	//__cleanup();
}

void
CatalogsDeleteCreativeAssetsItem::__init()
{
	//creative_assets_id = std::string();
	//operation = std::string();
}

void
CatalogsDeleteCreativeAssetsItem::__cleanup()
{
	//if(creative_assets_id != NULL) {
	//
	//delete creative_assets_id;
	//creative_assets_id = NULL;
	//}
	//if(operation != NULL) {
	//
	//delete operation;
	//operation = NULL;
	//}
	//
}

void
CatalogsDeleteCreativeAssetsItem::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *creative_assets_idKey = "creative_assets_id";
	node = json_object_get_member(pJsonObject, creative_assets_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&creative_assets_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *operationKey = "operation";
	node = json_object_get_member(pJsonObject, operationKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&operation, node, "std::string", "");
		} else {
			
		}
	}
}

CatalogsDeleteCreativeAssetsItem::CatalogsDeleteCreativeAssetsItem(char* json)
{
	this->fromJson(json);
}

char*
CatalogsDeleteCreativeAssetsItem::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getCreativeAssetsId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *creative_assets_idKey = "creative_assets_id";
	json_object_set_member(pJsonObject, creative_assets_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getOperation();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *operationKey = "operation";
	json_object_set_member(pJsonObject, operationKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
CatalogsDeleteCreativeAssetsItem::getCreativeAssetsId()
{
	return creative_assets_id;
}

void
CatalogsDeleteCreativeAssetsItem::setCreativeAssetsId(std::string  creative_assets_id)
{
	this->creative_assets_id = creative_assets_id;
}

std::string
CatalogsDeleteCreativeAssetsItem::getOperation()
{
	return operation;
}

void
CatalogsDeleteCreativeAssetsItem::setOperation(std::string  operation)
{
	this->operation = operation;
}


