#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CartingRetailer.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CartingRetailer::CartingRetailer()
{
	//__init();
}

CartingRetailer::~CartingRetailer()
{
	//__cleanup();
}

void
CartingRetailer::__init()
{
	//retailer_id = std::string();
	//retailer_name = std::string();
}

void
CartingRetailer::__cleanup()
{
	//if(retailer_id != NULL) {
	//
	//delete retailer_id;
	//retailer_id = NULL;
	//}
	//if(retailer_name != NULL) {
	//
	//delete retailer_name;
	//retailer_name = NULL;
	//}
	//
}

void
CartingRetailer::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *retailer_idKey = "retailer_id";
	node = json_object_get_member(pJsonObject, retailer_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&retailer_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *retailer_nameKey = "retailer_name";
	node = json_object_get_member(pJsonObject, retailer_nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&retailer_name, node, "std::string", "");
		} else {
			
		}
	}
}

CartingRetailer::CartingRetailer(char* json)
{
	this->fromJson(json);
}

char*
CartingRetailer::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getRetailerId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *retailer_idKey = "retailer_id";
	json_object_set_member(pJsonObject, retailer_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getRetailerName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *retailer_nameKey = "retailer_name";
	json_object_set_member(pJsonObject, retailer_nameKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
CartingRetailer::getRetailerId()
{
	return retailer_id;
}

void
CartingRetailer::setRetailerId(std::string  retailer_id)
{
	this->retailer_id = retailer_id;
}

std::string
CartingRetailer::getRetailerName()
{
	return retailer_name;
}

void
CartingRetailer::setRetailerName(std::string  retailer_name)
{
	this->retailer_name = retailer_name;
}


