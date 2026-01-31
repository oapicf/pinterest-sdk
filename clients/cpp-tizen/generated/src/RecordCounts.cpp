#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RecordCounts.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RecordCounts::RecordCounts()
{
	//__init();
}

RecordCounts::~RecordCounts()
{
	//__cleanup();
}

void
RecordCounts::__init()
{
	//invalid = int(0);
	//processed = int(0);
	//valid = int(0);
}

void
RecordCounts::__cleanup()
{
	//if(invalid != NULL) {
	//
	//delete invalid;
	//invalid = NULL;
	//}
	//if(processed != NULL) {
	//
	//delete processed;
	//processed = NULL;
	//}
	//if(valid != NULL) {
	//
	//delete valid;
	//valid = NULL;
	//}
	//
}

void
RecordCounts::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *invalidKey = "invalid";
	node = json_object_get_member(pJsonObject, invalidKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&invalid, node, "int", "");
		} else {
			
		}
	}
	const gchar *processedKey = "processed";
	node = json_object_get_member(pJsonObject, processedKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&processed, node, "int", "");
		} else {
			
		}
	}
	const gchar *validKey = "valid";
	node = json_object_get_member(pJsonObject, validKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&valid, node, "int", "");
		} else {
			
		}
	}
}

RecordCounts::RecordCounts(char* json)
{
	this->fromJson(json);
}

char*
RecordCounts::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getInvalid();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *invalidKey = "invalid";
	json_object_set_member(pJsonObject, invalidKey, node);
	if (isprimitive("int")) {
		int obj = getProcessed();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *processedKey = "processed";
	json_object_set_member(pJsonObject, processedKey, node);
	if (isprimitive("int")) {
		int obj = getValid();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *validKey = "valid";
	json_object_set_member(pJsonObject, validKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
RecordCounts::getInvalid()
{
	return invalid;
}

void
RecordCounts::setInvalid(int  invalid)
{
	this->invalid = invalid;
}

int
RecordCounts::getProcessed()
{
	return processed;
}

void
RecordCounts::setProcessed(int  processed)
{
	this->processed = processed;
}

int
RecordCounts::getValid()
{
	return valid;
}

void
RecordCounts::setValid(int  valid)
{
	this->valid = valid;
}


