#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ScheduleAgeBucketMultipliers.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ScheduleAgeBucketMultipliers::ScheduleAgeBucketMultipliers()
{
	//__init();
}

ScheduleAgeBucketMultipliers::~ScheduleAgeBucketMultipliers()
{
	//__cleanup();
}

void
ScheduleAgeBucketMultipliers::__init()
{
	//aGE_BUCKET = std::string();
}

void
ScheduleAgeBucketMultipliers::__cleanup()
{
	//if(aGE_BUCKET != NULL) {
	//
	//delete aGE_BUCKET;
	//aGE_BUCKET = NULL;
	//}
	//
}

void
ScheduleAgeBucketMultipliers::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *aGE_BUCKETKey = "AGE_BUCKET";
	node = json_object_get_member(pJsonObject, aGE_BUCKETKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&aGE_BUCKET, node, "std::string", "");
		} else {
			
		}
	}
}

ScheduleAgeBucketMultipliers::ScheduleAgeBucketMultipliers(char* json)
{
	this->fromJson(json);
}

char*
ScheduleAgeBucketMultipliers::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getAGEBUCKET();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *aGE_BUCKETKey = "AGE_BUCKET";
	json_object_set_member(pJsonObject, aGE_BUCKETKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
ScheduleAgeBucketMultipliers::getAGEBUCKET()
{
	return aGE_BUCKET;
}

void
ScheduleAgeBucketMultipliers::setAGEBUCKET(std::string  aGE_BUCKET)
{
	this->aGE_BUCKET = aGE_BUCKET;
}


