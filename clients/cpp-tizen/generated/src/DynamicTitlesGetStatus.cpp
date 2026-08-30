#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "DynamicTitlesGetStatus.h"

using namespace std;
using namespace Tizen::ArtikCloud;

DynamicTitlesGetStatus::DynamicTitlesGetStatus()
{
	//__init();
}

DynamicTitlesGetStatus::~DynamicTitlesGetStatus()
{
	//__cleanup();
}

void
DynamicTitlesGetStatus::__init()
{
	//generated_count = int(0);
	//is_ready = bool(false);
	//reviewed_count = int(0);
}

void
DynamicTitlesGetStatus::__cleanup()
{
	//if(generated_count != NULL) {
	//
	//delete generated_count;
	//generated_count = NULL;
	//}
	//if(is_ready != NULL) {
	//
	//delete is_ready;
	//is_ready = NULL;
	//}
	//if(reviewed_count != NULL) {
	//
	//delete reviewed_count;
	//reviewed_count = NULL;
	//}
	//
}

void
DynamicTitlesGetStatus::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *generated_countKey = "generated_count";
	node = json_object_get_member(pJsonObject, generated_countKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&generated_count, node, "int", "");
		} else {
			
		}
	}
	const gchar *is_readyKey = "is_ready";
	node = json_object_get_member(pJsonObject, is_readyKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_ready, node, "bool", "");
		} else {
			
		}
	}
	const gchar *reviewed_countKey = "reviewed_count";
	node = json_object_get_member(pJsonObject, reviewed_countKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&reviewed_count, node, "int", "");
		} else {
			
		}
	}
}

DynamicTitlesGetStatus::DynamicTitlesGetStatus(char* json)
{
	this->fromJson(json);
}

char*
DynamicTitlesGetStatus::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getGeneratedCount();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *generated_countKey = "generated_count";
	json_object_set_member(pJsonObject, generated_countKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsReady();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_readyKey = "is_ready";
	json_object_set_member(pJsonObject, is_readyKey, node);
	if (isprimitive("int")) {
		int obj = getReviewedCount();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *reviewed_countKey = "reviewed_count";
	json_object_set_member(pJsonObject, reviewed_countKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
DynamicTitlesGetStatus::getGeneratedCount()
{
	return generated_count;
}

void
DynamicTitlesGetStatus::setGeneratedCount(int  generated_count)
{
	this->generated_count = generated_count;
}

bool
DynamicTitlesGetStatus::getIsReady()
{
	return is_ready;
}

void
DynamicTitlesGetStatus::setIsReady(bool  is_ready)
{
	this->is_ready = is_ready;
}

int
DynamicTitlesGetStatus::getReviewedCount()
{
	return reviewed_count;
}

void
DynamicTitlesGetStatus::setReviewedCount(int  reviewed_count)
{
	this->reviewed_count = reviewed_count;
}


