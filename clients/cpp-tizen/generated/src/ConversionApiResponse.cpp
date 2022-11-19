#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ConversionApiResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ConversionApiResponse::ConversionApiResponse()
{
	//__init();
}

ConversionApiResponse::~ConversionApiResponse()
{
	//__cleanup();
}

void
ConversionApiResponse::__init()
{
	//num_events_received = int(0);
	//num_events_processed = int(0);
	//new std::list()std::list> events;
}

void
ConversionApiResponse::__cleanup()
{
	//if(num_events_received != NULL) {
	//
	//delete num_events_received;
	//num_events_received = NULL;
	//}
	//if(num_events_processed != NULL) {
	//
	//delete num_events_processed;
	//num_events_processed = NULL;
	//}
	//if(events != NULL) {
	//events.RemoveAll(true);
	//delete events;
	//events = NULL;
	//}
	//
}

void
ConversionApiResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *num_events_receivedKey = "num_events_received";
	node = json_object_get_member(pJsonObject, num_events_receivedKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&num_events_received, node, "int", "");
		} else {
			
		}
	}
	const gchar *num_events_processedKey = "num_events_processed";
	node = json_object_get_member(pJsonObject, num_events_processedKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&num_events_processed, node, "int", "");
		} else {
			
		}
	}
	const gchar *eventsKey = "events";
	node = json_object_get_member(pJsonObject, eventsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ConversionApiResponse_events_inner> new_list;
			ConversionApiResponse_events_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ConversionApiResponse_events_inner")) {
					jsonToValue(&inst, temp_json, "ConversionApiResponse_events_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			events = new_list;
		}
		
	}
}

ConversionApiResponse::ConversionApiResponse(char* json)
{
	this->fromJson(json);
}

char*
ConversionApiResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getNumEventsReceived();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *num_events_receivedKey = "num_events_received";
	json_object_set_member(pJsonObject, num_events_receivedKey, node);
	if (isprimitive("int")) {
		int obj = getNumEventsProcessed();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *num_events_processedKey = "num_events_processed";
	json_object_set_member(pJsonObject, num_events_processedKey, node);
	if (isprimitive("ConversionApiResponse_events_inner")) {
		list<ConversionApiResponse_events_inner> new_list = static_cast<list <ConversionApiResponse_events_inner> > (getEvents());
		node = converttoJson(&new_list, "ConversionApiResponse_events_inner", "array");
	} else {
		node = json_node_alloc();
		list<ConversionApiResponse_events_inner> new_list = static_cast<list <ConversionApiResponse_events_inner> > (getEvents());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ConversionApiResponse_events_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ConversionApiResponse_events_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *eventsKey = "events";
	json_object_set_member(pJsonObject, eventsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
ConversionApiResponse::getNumEventsReceived()
{
	return num_events_received;
}

void
ConversionApiResponse::setNumEventsReceived(int  num_events_received)
{
	this->num_events_received = num_events_received;
}

int
ConversionApiResponse::getNumEventsProcessed()
{
	return num_events_processed;
}

void
ConversionApiResponse::setNumEventsProcessed(int  num_events_processed)
{
	this->num_events_processed = num_events_processed;
}

std::list<ConversionApiResponse_events_inner>
ConversionApiResponse::getEvents()
{
	return events;
}

void
ConversionApiResponse::setEvents(std::list <ConversionApiResponse_events_inner> events)
{
	this->events = events;
}


