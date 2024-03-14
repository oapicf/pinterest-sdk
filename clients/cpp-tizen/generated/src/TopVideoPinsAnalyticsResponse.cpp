#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TopVideoPinsAnalyticsResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TopVideoPinsAnalyticsResponse::TopVideoPinsAnalyticsResponse()
{
	//__init();
}

TopVideoPinsAnalyticsResponse::~TopVideoPinsAnalyticsResponse()
{
	//__cleanup();
}

void
TopVideoPinsAnalyticsResponse::__init()
{
	//date_availability = new TopPinsAnalyticsResponse_date_availability();
	//new std::list()std::list> pins;
	//sort_by = std::string();
}

void
TopVideoPinsAnalyticsResponse::__cleanup()
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
TopVideoPinsAnalyticsResponse::fromJson(char* jsonStr)
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
			list<TopVideoPinsAnalyticsResponse_pins_inner> new_list;
			TopVideoPinsAnalyticsResponse_pins_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("TopVideoPinsAnalyticsResponse_pins_inner")) {
					jsonToValue(&inst, temp_json, "TopVideoPinsAnalyticsResponse_pins_inner", "");
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

TopVideoPinsAnalyticsResponse::TopVideoPinsAnalyticsResponse(char* json)
{
	this->fromJson(json);
}

char*
TopVideoPinsAnalyticsResponse::toJson()
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
	if (isprimitive("TopVideoPinsAnalyticsResponse_pins_inner")) {
		list<TopVideoPinsAnalyticsResponse_pins_inner> new_list = static_cast<list <TopVideoPinsAnalyticsResponse_pins_inner> > (getPins());
		node = converttoJson(&new_list, "TopVideoPinsAnalyticsResponse_pins_inner", "array");
	} else {
		node = json_node_alloc();
		list<TopVideoPinsAnalyticsResponse_pins_inner> new_list = static_cast<list <TopVideoPinsAnalyticsResponse_pins_inner> > (getPins());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<TopVideoPinsAnalyticsResponse_pins_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			TopVideoPinsAnalyticsResponse_pins_inner obj = *it;
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
TopVideoPinsAnalyticsResponse::getDateAvailability()
{
	return date_availability;
}

void
TopVideoPinsAnalyticsResponse::setDateAvailability(TopPinsAnalyticsResponse_date_availability  date_availability)
{
	this->date_availability = date_availability;
}

std::list<TopVideoPinsAnalyticsResponse_pins_inner>
TopVideoPinsAnalyticsResponse::getPins()
{
	return pins;
}

void
TopVideoPinsAnalyticsResponse::setPins(std::list <TopVideoPinsAnalyticsResponse_pins_inner> pins)
{
	this->pins = pins;
}

std::string
TopVideoPinsAnalyticsResponse::getSortBy()
{
	return sort_by;
}

void
TopVideoPinsAnalyticsResponse::setSortBy(std::string  sort_by)
{
	this->sort_by = sort_by;
}


