#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsFeedProductCounts.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsFeedProductCounts::CatalogsFeedProductCounts()
{
	//__init();
}

CatalogsFeedProductCounts::~CatalogsFeedProductCounts()
{
	//__cleanup();
}

void
CatalogsFeedProductCounts::__init()
{
	//original = int(0);
	//ingested = int(0);
}

void
CatalogsFeedProductCounts::__cleanup()
{
	//if(original != NULL) {
	//
	//delete original;
	//original = NULL;
	//}
	//if(ingested != NULL) {
	//
	//delete ingested;
	//ingested = NULL;
	//}
	//
}

void
CatalogsFeedProductCounts::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *originalKey = "original";
	node = json_object_get_member(pJsonObject, originalKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&original, node, "int", "");
		} else {
			
		}
	}
	const gchar *ingestedKey = "ingested";
	node = json_object_get_member(pJsonObject, ingestedKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&ingested, node, "int", "");
		} else {
			
		}
	}
}

CatalogsFeedProductCounts::CatalogsFeedProductCounts(char* json)
{
	this->fromJson(json);
}

char*
CatalogsFeedProductCounts::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getOriginal();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *originalKey = "original";
	json_object_set_member(pJsonObject, originalKey, node);
	if (isprimitive("int")) {
		int obj = getIngested();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *ingestedKey = "ingested";
	json_object_set_member(pJsonObject, ingestedKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
CatalogsFeedProductCounts::getOriginal()
{
	return original;
}

void
CatalogsFeedProductCounts::setOriginal(int  original)
{
	this->original = original;
}

int
CatalogsFeedProductCounts::getIngested()
{
	return ingested;
}

void
CatalogsFeedProductCounts::setIngested(int  ingested)
{
	this->ingested = ingested;
}


