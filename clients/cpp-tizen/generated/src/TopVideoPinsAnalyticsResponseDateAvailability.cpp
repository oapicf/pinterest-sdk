#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TopVideoPinsAnalyticsResponseDateAvailability.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TopVideoPinsAnalyticsResponseDateAvailability::TopVideoPinsAnalyticsResponseDateAvailability()
{
	//__init();
}

TopVideoPinsAnalyticsResponseDateAvailability::~TopVideoPinsAnalyticsResponseDateAvailability()
{
	//__cleanup();
}

void
TopVideoPinsAnalyticsResponseDateAvailability::__init()
{
	//is_realtime = bool(false);
	//latest_available_timestamp = double(0);
}

void
TopVideoPinsAnalyticsResponseDateAvailability::__cleanup()
{
	//if(is_realtime != NULL) {
	//
	//delete is_realtime;
	//is_realtime = NULL;
	//}
	//if(latest_available_timestamp != NULL) {
	//
	//delete latest_available_timestamp;
	//latest_available_timestamp = NULL;
	//}
	//
}

void
TopVideoPinsAnalyticsResponseDateAvailability::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *is_realtimeKey = "is_realtime";
	node = json_object_get_member(pJsonObject, is_realtimeKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_realtime, node, "bool", "");
		} else {
			
		}
	}
	const gchar *latest_available_timestampKey = "latest_available_timestamp";
	node = json_object_get_member(pJsonObject, latest_available_timestampKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&latest_available_timestamp, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&latest_available_timestamp);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

TopVideoPinsAnalyticsResponseDateAvailability::TopVideoPinsAnalyticsResponseDateAvailability(char* json)
{
	this->fromJson(json);
}

char*
TopVideoPinsAnalyticsResponseDateAvailability::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("bool")) {
		bool obj = getIsRealtime();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_realtimeKey = "is_realtime";
	json_object_set_member(pJsonObject, is_realtimeKey, node);
	if (isprimitive("long long")) {
		long long obj = getLatestAvailableTimestamp();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getLatestAvailableTimestamp());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *latest_available_timestampKey = "latest_available_timestamp";
	json_object_set_member(pJsonObject, latest_available_timestampKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

bool
TopVideoPinsAnalyticsResponseDateAvailability::getIsRealtime()
{
	return is_realtime;
}

void
TopVideoPinsAnalyticsResponseDateAvailability::setIsRealtime(bool  is_realtime)
{
	this->is_realtime = is_realtime;
}

long long
TopVideoPinsAnalyticsResponseDateAvailability::getLatestAvailableTimestamp()
{
	return latest_available_timestamp;
}

void
TopVideoPinsAnalyticsResponseDateAvailability::setLatestAvailableTimestamp(long long  latest_available_timestamp)
{
	this->latest_available_timestamp = latest_available_timestamp;
}


