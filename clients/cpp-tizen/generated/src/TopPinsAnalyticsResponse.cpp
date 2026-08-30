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
	//date_availability = new TopPinsAnalyticsResponseDateAvailability();
	//new std::list()std::list> pins;
	//sort_by = new TopPinsSortBy();
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
	

		if (isprimitive("TopPinsAnalyticsResponseDateAvailability")) {
			jsonToValue(&date_availability, node, "TopPinsAnalyticsResponseDateAvailability", "TopPinsAnalyticsResponseDateAvailability");
		} else {
			
			TopPinsAnalyticsResponseDateAvailability* obj = static_cast<TopPinsAnalyticsResponseDateAvailability*> (&date_availability);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *pinsKey = "pins";
	node = json_object_get_member(pJsonObject, pinsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<TopPinsAnalyticsResponsePinsItems> new_list;
			TopPinsAnalyticsResponsePinsItems inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("TopPinsAnalyticsResponsePinsItems")) {
					jsonToValue(&inst, temp_json, "TopPinsAnalyticsResponsePinsItems", "");
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
	

		if (isprimitive("TopPinsSortBy")) {
			jsonToValue(&sort_by, node, "TopPinsSortBy", "TopPinsSortBy");
		} else {
			
			TopPinsSortBy* obj = static_cast<TopPinsSortBy*> (&sort_by);
			obj->fromJson(json_to_string(node, false));
			
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
	if (isprimitive("TopPinsAnalyticsResponseDateAvailability")) {
		TopPinsAnalyticsResponseDateAvailability obj = getDateAvailability();
		node = converttoJson(&obj, "TopPinsAnalyticsResponseDateAvailability", "");
	}
	else {
		
		TopPinsAnalyticsResponseDateAvailability obj = static_cast<TopPinsAnalyticsResponseDateAvailability> (getDateAvailability());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *date_availabilityKey = "date_availability";
	json_object_set_member(pJsonObject, date_availabilityKey, node);
	if (isprimitive("TopPinsAnalyticsResponsePinsItems")) {
		list<TopPinsAnalyticsResponsePinsItems> new_list = static_cast<list <TopPinsAnalyticsResponsePinsItems> > (getPins());
		node = converttoJson(&new_list, "TopPinsAnalyticsResponsePinsItems", "array");
	} else {
		node = json_node_alloc();
		list<TopPinsAnalyticsResponsePinsItems> new_list = static_cast<list <TopPinsAnalyticsResponsePinsItems> > (getPins());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<TopPinsAnalyticsResponsePinsItems>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			TopPinsAnalyticsResponsePinsItems obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *pinsKey = "pins";
	json_object_set_member(pJsonObject, pinsKey, node);
	if (isprimitive("TopPinsSortBy")) {
		TopPinsSortBy obj = getSortBy();
		node = converttoJson(&obj, "TopPinsSortBy", "");
	}
	else {
		
		TopPinsSortBy obj = static_cast<TopPinsSortBy> (getSortBy());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
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

TopPinsAnalyticsResponseDateAvailability
TopPinsAnalyticsResponse::getDateAvailability()
{
	return date_availability;
}

void
TopPinsAnalyticsResponse::setDateAvailability(TopPinsAnalyticsResponseDateAvailability  date_availability)
{
	this->date_availability = date_availability;
}

std::list<TopPinsAnalyticsResponsePinsItems>
TopPinsAnalyticsResponse::getPins()
{
	return pins;
}

void
TopPinsAnalyticsResponse::setPins(std::list <TopPinsAnalyticsResponsePinsItems> pins)
{
	this->pins = pins;
}

TopPinsSortBy
TopPinsAnalyticsResponse::getSortBy()
{
	return sort_by;
}

void
TopPinsAnalyticsResponse::setSortBy(TopPinsSortBy  sort_by)
{
	this->sort_by = sort_by;
}


