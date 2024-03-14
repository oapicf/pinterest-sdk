#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "BidFloor.h"

using namespace std;
using namespace Tizen::ArtikCloud;

BidFloor::BidFloor()
{
	//__init();
}

BidFloor::~BidFloor()
{
	//__cleanup();
}

void
BidFloor::__init()
{
	//new std::list()std::list> bid_floors;
	//type = std::string();
}

void
BidFloor::__cleanup()
{
	//if(bid_floors != NULL) {
	//bid_floors.RemoveAll(true);
	//delete bid_floors;
	//bid_floors = NULL;
	//}
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//
}

void
BidFloor::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *bid_floorsKey = "bid_floors";
	node = json_object_get_member(pJsonObject, bid_floorsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<int> new_list;
			int inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("int")) {
					jsonToValue(&inst, temp_json, "int", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			bid_floors = new_list;
		}
		
	}
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&type, node, "std::string", "");
		} else {
			
		}
	}
}

BidFloor::BidFloor(char* json)
{
	this->fromJson(json);
}

char*
BidFloor::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		list<int> new_list = static_cast<list <int> > (getBidFloors());
		node = converttoJson(&new_list, "int", "array");
	} else {
		node = json_node_alloc();
		list<int> new_list = static_cast<list <int> > (getBidFloors());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *bid_floorsKey = "bid_floors";
	json_object_set_member(pJsonObject, bid_floorsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<int>
BidFloor::getBidFloors()
{
	return bid_floors;
}

void
BidFloor::setBidFloors(std::list <int> bid_floors)
{
	this->bid_floors = bid_floors;
}

std::string
BidFloor::getType()
{
	return type;
}

void
BidFloor::setType(std::string  type)
{
	this->type = type;
}


