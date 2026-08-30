#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "SchedulePlacementMultipliers.h"

using namespace std;
using namespace Tizen::ArtikCloud;

SchedulePlacementMultipliers::SchedulePlacementMultipliers()
{
	//__init();
}

SchedulePlacementMultipliers::~SchedulePlacementMultipliers()
{
	//__cleanup();
}

void
SchedulePlacementMultipliers::__init()
{
	//browse = double(0);
	//related_pins = double(0);
	//search = double(0);
}

void
SchedulePlacementMultipliers::__cleanup()
{
	//if(browse != NULL) {
	//
	//delete browse;
	//browse = NULL;
	//}
	//if(related_pins != NULL) {
	//
	//delete related_pins;
	//related_pins = NULL;
	//}
	//if(search != NULL) {
	//
	//delete search;
	//search = NULL;
	//}
	//
}

void
SchedulePlacementMultipliers::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *browseKey = "browse";
	node = json_object_get_member(pJsonObject, browseKey);
	if (node !=NULL) {
	

		if (isprimitive("double")) {
			jsonToValue(&browse, node, "double", "");
		} else {
			
		}
	}
	const gchar *related_pinsKey = "related_pins";
	node = json_object_get_member(pJsonObject, related_pinsKey);
	if (node !=NULL) {
	

		if (isprimitive("double")) {
			jsonToValue(&related_pins, node, "double", "");
		} else {
			
		}
	}
	const gchar *searchKey = "search";
	node = json_object_get_member(pJsonObject, searchKey);
	if (node !=NULL) {
	

		if (isprimitive("double")) {
			jsonToValue(&search, node, "double", "");
		} else {
			
		}
	}
}

SchedulePlacementMultipliers::SchedulePlacementMultipliers(char* json)
{
	this->fromJson(json);
}

char*
SchedulePlacementMultipliers::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("double")) {
		double obj = getBrowse();
		node = converttoJson(&obj, "double", "");
	}
	else {
		
	}
	const gchar *browseKey = "browse";
	json_object_set_member(pJsonObject, browseKey, node);
	if (isprimitive("double")) {
		double obj = getRelatedPins();
		node = converttoJson(&obj, "double", "");
	}
	else {
		
	}
	const gchar *related_pinsKey = "related_pins";
	json_object_set_member(pJsonObject, related_pinsKey, node);
	if (isprimitive("double")) {
		double obj = getSearch();
		node = converttoJson(&obj, "double", "");
	}
	else {
		
	}
	const gchar *searchKey = "search";
	json_object_set_member(pJsonObject, searchKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

double
SchedulePlacementMultipliers::getBrowse()
{
	return browse;
}

void
SchedulePlacementMultipliers::setBrowse(double  browse)
{
	this->browse = browse;
}

double
SchedulePlacementMultipliers::getRelatedPins()
{
	return related_pins;
}

void
SchedulePlacementMultipliers::setRelatedPins(double  related_pins)
{
	this->related_pins = related_pins;
}

double
SchedulePlacementMultipliers::getSearch()
{
	return search;
}

void
SchedulePlacementMultipliers::setSearch(double  search)
{
	this->search = search;
}


