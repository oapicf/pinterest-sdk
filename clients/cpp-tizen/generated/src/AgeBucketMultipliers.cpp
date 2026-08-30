#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AgeBucketMultipliers.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AgeBucketMultipliers::AgeBucketMultipliers()
{
	//__init();
}

AgeBucketMultipliers::~AgeBucketMultipliers()
{
	//__cleanup();
}

void
AgeBucketMultipliers::__init()
{
	//aGE_BUCKET = null;
}

void
AgeBucketMultipliers::__cleanup()
{
	//if(aGE_BUCKET != NULL) {
	//
	//delete aGE_BUCKET;
	//aGE_BUCKET = NULL;
	//}
	//
}

void
AgeBucketMultipliers::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *aGE_BUCKETKey = "AGE_BUCKET";
	node = json_object_get_member(pJsonObject, aGE_BUCKETKey);
	if (node !=NULL) {
	

		if (isprimitive("TargetingSpecAgeBucket")) {
			jsonToValue(&aGE_BUCKET, node, "TargetingSpecAgeBucket", "TargetingSpecAgeBucket");
		} else {
			
			TargetingSpecAgeBucket* obj = static_cast<TargetingSpecAgeBucket*> (&aGE_BUCKET);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

AgeBucketMultipliers::AgeBucketMultipliers(char* json)
{
	this->fromJson(json);
}

char*
AgeBucketMultipliers::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("TargetingSpecAgeBucket")) {
		TargetingSpecAgeBucket obj = getAGEBUCKET();
		node = converttoJson(&obj, "TargetingSpecAgeBucket", "");
	}
	else {
		
		TargetingSpecAgeBucket obj = static_cast<TargetingSpecAgeBucket> (getAGEBUCKET());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
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

TargetingSpecAgeBucket
AgeBucketMultipliers::getAGEBUCKET()
{
	return aGE_BUCKET;
}

void
AgeBucketMultipliers::setAGEBUCKET(TargetingSpecAgeBucket  aGE_BUCKET)
{
	this->aGE_BUCKET = aGE_BUCKET;
}


