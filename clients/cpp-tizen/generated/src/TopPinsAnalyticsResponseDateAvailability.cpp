#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TopPinsAnalyticsResponse_date_availability.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TopPinsAnalyticsResponse_date_availability::TopPinsAnalyticsResponse_date_availability()
{
	//__init();
}

TopPinsAnalyticsResponse_date_availability::~TopPinsAnalyticsResponse_date_availability()
{
	//__cleanup();
}

void
TopPinsAnalyticsResponse_date_availability::__init()
{
	//latest_available_timestamp = double(0);
	//is_realtime = bool(false);
}

void
TopPinsAnalyticsResponse_date_availability::__cleanup()
{
	//if(latest_available_timestamp != NULL) {
	//
	//delete latest_available_timestamp;
	//latest_available_timestamp = NULL;
	//}
	//if(is_realtime != NULL) {
	//
	//delete is_realtime;
	//is_realtime = NULL;
	//}
	//
}

void
TopPinsAnalyticsResponse_date_availability::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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
	const gchar *is_realtimeKey = "is_realtime";
	node = json_object_get_member(pJsonObject, is_realtimeKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_realtime, node, "bool", "");
		} else {
			
		}
	}
}

TopPinsAnalyticsResponse_date_availability::TopPinsAnalyticsResponse_date_availability(char* json)
{
	this->fromJson(json);
}

char*
TopPinsAnalyticsResponse_date_availability::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
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
	if (isprimitive("bool")) {
		bool obj = getIsRealtime();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_realtimeKey = "is_realtime";
	json_object_set_member(pJsonObject, is_realtimeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
TopPinsAnalyticsResponse_date_availability::getLatestAvailableTimestamp()
{
	return latest_available_timestamp;
}

void
TopPinsAnalyticsResponse_date_availability::setLatestAvailableTimestamp(long long  latest_available_timestamp)
{
	this->latest_available_timestamp = latest_available_timestamp;
}

bool
TopPinsAnalyticsResponse_date_availability::getIsRealtime()
{
	return is_realtime;
}

void
TopPinsAnalyticsResponse_date_availability::setIsRealtime(bool  is_realtime)
{
	this->is_realtime = is_realtime;
}


