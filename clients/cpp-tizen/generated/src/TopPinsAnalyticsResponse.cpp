#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TopPinsAnalyticsResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TopPinsAnalyticsResponse::TopPinsAnalyticsResponse()
{
	//__init();
}

TopPinsAnalyticsResponse::~TopPinsAnalyticsResponse()
{
	//__cleanup();
}

void
TopPinsAnalyticsResponse::__init()
{
	//date_availability = new TopPinsAnalyticsResponse_date_availability();
	//new std::list()std::list> pins;
	//sort_by = std::string();
}

void
TopPinsAnalyticsResponse::__cleanup()
{
	//if(date_availability != NULL) {
	//
	//delete date_availability;
	//date_availability = NULL;
	//}
	//if(pins != NULL) {
	//pins.RemoveAll(true);
	//delete pins;
	//pins = NULL;
	//}
	//if(sort_by != NULL) {
	//
	//delete sort_by;
	//sort_by = NULL;
	//}
	//
}

void
TopPinsAnalyticsResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *date_availabilityKey = "date_availability";
	node = json_object_get_member(pJsonObject, date_availabilityKey);
	if (node !=NULL) {
	

		if (isprimitive("TopPinsAnalyticsResponse_date_availability")) {
			jsonToValue(&date_availability, node, "TopPinsAnalyticsResponse_date_availability", "TopPinsAnalyticsResponse_date_availability");
		} else {
			
			TopPinsAnalyticsResponse_date_availability* obj = static_cast<TopPinsAnalyticsResponse_date_availability*> (&date_availability);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *pinsKey = "pins";
	node = json_object_get_member(pJsonObject, pinsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<TopPinsAnalyticsResponse_pins_inner> new_list;
			TopPinsAnalyticsResponse_pins_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("TopPinsAnalyticsResponse_pins_inner")) {
					jsonToValue(&inst, temp_json, "TopPinsAnalyticsResponse_pins_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			pins = new_list;
		}
		
	}
	const gchar *sort_byKey = "sort_by";
	node = json_object_get_member(pJsonObject, sort_byKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&sort_by, node, "std::string", "");
		} else {
			
		}
	}
}

TopPinsAnalyticsResponse::TopPinsAnalyticsResponse(char* json)
{
	this->fromJson(json);
}

char*
TopPinsAnalyticsResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("TopPinsAnalyticsResponse_date_availability")) {
		TopPinsAnalyticsResponse_date_availability obj = getDateAvailability();
		node = converttoJson(&obj, "TopPinsAnalyticsResponse_date_availability", "");
	}
	else {
		
		TopPinsAnalyticsResponse_date_availability obj = static_cast<TopPinsAnalyticsResponse_date_availability> (getDateAvailability());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *date_availabilityKey = "date_availability";
	json_object_set_member(pJsonObject, date_availabilityKey, node);
	if (isprimitive("TopPinsAnalyticsResponse_pins_inner")) {
		list<TopPinsAnalyticsResponse_pins_inner> new_list = static_cast<list <TopPinsAnalyticsResponse_pins_inner> > (getPins());
		node = converttoJson(&new_list, "TopPinsAnalyticsResponse_pins_inner", "array");
	} else {
		node = json_node_alloc();
		list<TopPinsAnalyticsResponse_pins_inner> new_list = static_cast<list <TopPinsAnalyticsResponse_pins_inner> > (getPins());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<TopPinsAnalyticsResponse_pins_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			TopPinsAnalyticsResponse_pins_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *pinsKey = "pins";
	json_object_set_member(pJsonObject, pinsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getSortBy();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *sort_byKey = "sort_by";
	json_object_set_member(pJsonObject, sort_byKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

TopPinsAnalyticsResponse_date_availability
TopPinsAnalyticsResponse::getDateAvailability()
{
	return date_availability;
}

void
TopPinsAnalyticsResponse::setDateAvailability(TopPinsAnalyticsResponse_date_availability  date_availability)
{
	this->date_availability = date_availability;
}

std::list<TopPinsAnalyticsResponse_pins_inner>
TopPinsAnalyticsResponse::getPins()
{
	return pins;
}

void
TopPinsAnalyticsResponse::setPins(std::list <TopPinsAnalyticsResponse_pins_inner> pins)
{
	this->pins = pins;
}

std::string
TopPinsAnalyticsResponse::getSortBy()
{
	return sort_by;
}

void
TopPinsAnalyticsResponse::setSortBy(std::string  sort_by)
{
	this->sort_by = sort_by;
}


