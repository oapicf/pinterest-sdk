#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ConversionEvents.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ConversionEvents::ConversionEvents()
{
	//__init();
}

ConversionEvents::~ConversionEvents()
{
	//__cleanup();
}

void
ConversionEvents::__init()
{
	//new std::list()std::list> events;
	//num_events_processed = int(0);
	//num_events_received = int(0);
}

void
ConversionEvents::__cleanup()
{
	//if(events != NULL) {
	//events.RemoveAll(true);
	//delete events;
	//events = NULL;
	//}
	//if(num_events_processed != NULL) {
	//
	//delete num_events_processed;
	//num_events_processed = NULL;
	//}
	//if(num_events_received != NULL) {
	//
	//delete num_events_received;
	//num_events_received = NULL;
	//}
	//
}

void
ConversionEvents::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *eventsKey = "events";
	node = json_object_get_member(pJsonObject, eventsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ConversionApiResponseEventsItems> new_list;
			ConversionApiResponseEventsItems inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ConversionApiResponseEventsItems")) {
					jsonToValue(&inst, temp_json, "ConversionApiResponseEventsItems", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			events = new_list;
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
	const gchar *num_events_receivedKey = "num_events_received";
	node = json_object_get_member(pJsonObject, num_events_receivedKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&num_events_received, node, "int", "");
		} else {
			
		}
	}
}

ConversionEvents::ConversionEvents(char* json)
{
	this->fromJson(json);
}

char*
ConversionEvents::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConversionApiResponseEventsItems")) {
		list<ConversionApiResponseEventsItems> new_list = static_cast<list <ConversionApiResponseEventsItems> > (getEvents());
		node = converttoJson(&new_list, "ConversionApiResponseEventsItems", "array");
	} else {
		node = json_node_alloc();
		list<ConversionApiResponseEventsItems> new_list = static_cast<list <ConversionApiResponseEventsItems> > (getEvents());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ConversionApiResponseEventsItems>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ConversionApiResponseEventsItems obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *eventsKey = "events";
	json_object_set_member(pJsonObject, eventsKey, node);
	if (isprimitive("int")) {
		int obj = getNumEventsProcessed();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *num_events_processedKey = "num_events_processed";
	json_object_set_member(pJsonObject, num_events_processedKey, node);
	if (isprimitive("int")) {
		int obj = getNumEventsReceived();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *num_events_receivedKey = "num_events_received";
	json_object_set_member(pJsonObject, num_events_receivedKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<ConversionApiResponseEventsItems>
ConversionEvents::getEvents()
{
	return events;
}

void
ConversionEvents::setEvents(std::list <ConversionApiResponseEventsItems> events)
{
	this->events = events;
}

int
ConversionEvents::getNumEventsProcessed()
{
	return num_events_processed;
}

void
ConversionEvents::setNumEventsProcessed(int  num_events_processed)
{
	this->num_events_processed = num_events_processed;
}

int
ConversionEvents::getNumEventsReceived()
{
	return num_events_received;
}

void
ConversionEvents::setNumEventsReceived(int  num_events_received)
{
	this->num_events_received = num_events_received;
}


