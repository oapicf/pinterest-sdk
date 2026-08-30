#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "BidOptionsPlacementMultipliers.h"

using namespace std;
using namespace Tizen::ArtikCloud;

BidOptionsPlacementMultipliers::BidOptionsPlacementMultipliers()
{
	//__init();
}

BidOptionsPlacementMultipliers::~BidOptionsPlacementMultipliers()
{
	//__cleanup();
}

void
BidOptionsPlacementMultipliers::__init()
{
	//browse = double(0);
	//related_pins = double(0);
	//search = double(0);
}

void
BidOptionsPlacementMultipliers::__cleanup()
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
BidOptionsPlacementMultipliers::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *browseKey = "browse";
	node = json_object_get_member(pJsonObject, browseKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&browse, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&browse);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *related_pinsKey = "related_pins";
	node = json_object_get_member(pJsonObject, related_pinsKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&related_pins, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&related_pins);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *searchKey = "search";
	node = json_object_get_member(pJsonObject, searchKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&search, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&search);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

BidOptionsPlacementMultipliers::BidOptionsPlacementMultipliers(char* json)
{
	this->fromJson(json);
}

char*
BidOptionsPlacementMultipliers::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getBrowse();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getBrowse());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *browseKey = "browse";
	json_object_set_member(pJsonObject, browseKey, node);
	if (isprimitive("long long")) {
		long long obj = getRelatedPins();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getRelatedPins());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *related_pinsKey = "related_pins";
	json_object_set_member(pJsonObject, related_pinsKey, node);
	if (isprimitive("long long")) {
		long long obj = getSearch();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getSearch());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
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

long long
BidOptionsPlacementMultipliers::getBrowse()
{
	return browse;
}

void
BidOptionsPlacementMultipliers::setBrowse(long long  browse)
{
	this->browse = browse;
}

long long
BidOptionsPlacementMultipliers::getRelatedPins()
{
	return related_pins;
}

void
BidOptionsPlacementMultipliers::setRelatedPins(long long  related_pins)
{
	this->related_pins = related_pins;
}

long long
BidOptionsPlacementMultipliers::getSearch()
{
	return search;
}

void
BidOptionsPlacementMultipliers::setSearch(long long  search)
{
	this->search = search;
}


