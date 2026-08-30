#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "FrequencyGoalMetadata.h"

using namespace std;
using namespace Tizen::ArtikCloud;

FrequencyGoalMetadata::FrequencyGoalMetadata()
{
	//__init();
}

FrequencyGoalMetadata::~FrequencyGoalMetadata()
{
	//__cleanup();
}

void
FrequencyGoalMetadata::__init()
{
	//frequency = int(0);
	//timerange = new FrequencyGoalMetadataTimerange();
}

void
FrequencyGoalMetadata::__cleanup()
{
	//if(frequency != NULL) {
	//
	//delete frequency;
	//frequency = NULL;
	//}
	//if(timerange != NULL) {
	//
	//delete timerange;
	//timerange = NULL;
	//}
	//
}

void
FrequencyGoalMetadata::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *frequencyKey = "frequency";
	node = json_object_get_member(pJsonObject, frequencyKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&frequency, node, "int", "");
		} else {
			
		}
	}
	const gchar *timerangeKey = "timerange";
	node = json_object_get_member(pJsonObject, timerangeKey);
	if (node !=NULL) {
	

		if (isprimitive("FrequencyGoalMetadataTimerange")) {
			jsonToValue(&timerange, node, "FrequencyGoalMetadataTimerange", "FrequencyGoalMetadataTimerange");
		} else {
			
			FrequencyGoalMetadataTimerange* obj = static_cast<FrequencyGoalMetadataTimerange*> (&timerange);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

FrequencyGoalMetadata::FrequencyGoalMetadata(char* json)
{
	this->fromJson(json);
}

char*
FrequencyGoalMetadata::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getFrequency();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *frequencyKey = "frequency";
	json_object_set_member(pJsonObject, frequencyKey, node);
	if (isprimitive("FrequencyGoalMetadataTimerange")) {
		FrequencyGoalMetadataTimerange obj = getTimerange();
		node = converttoJson(&obj, "FrequencyGoalMetadataTimerange", "");
	}
	else {
		
		FrequencyGoalMetadataTimerange obj = static_cast<FrequencyGoalMetadataTimerange> (getTimerange());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *timerangeKey = "timerange";
	json_object_set_member(pJsonObject, timerangeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
FrequencyGoalMetadata::getFrequency()
{
	return frequency;
}

void
FrequencyGoalMetadata::setFrequency(int  frequency)
{
	this->frequency = frequency;
}

FrequencyGoalMetadataTimerange
FrequencyGoalMetadata::getTimerange()
{
	return timerange;
}

void
FrequencyGoalMetadata::setTimerange(FrequencyGoalMetadataTimerange  timerange)
{
	this->timerange = timerange;
}


