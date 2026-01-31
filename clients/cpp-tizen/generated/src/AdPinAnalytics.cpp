#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdPinAnalytics.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdPinAnalytics::AdPinAnalytics()
{
	//__init();
}

AdPinAnalytics::~AdPinAnalytics()
{
	//__cleanup();
}

void
AdPinAnalytics::__init()
{
	//dATE = null;
	//pIN_ID = std::string();
}

void
AdPinAnalytics::__cleanup()
{
	//if(dATE != NULL) {
	//
	//delete dATE;
	//dATE = NULL;
	//}
	//if(pIN_ID != NULL) {
	//
	//delete pIN_ID;
	//pIN_ID = NULL;
	//}
	//
}

void
AdPinAnalytics::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *dATEKey = "DATE";
	node = json_object_get_member(pJsonObject, dATEKey);
	if (node !=NULL) {
	

		if (isprimitive("Date")) {
			jsonToValue(&dATE, node, "Date", "Date");
		} else {
			
		}
	}
	const gchar *pIN_IDKey = "PIN_ID";
	node = json_object_get_member(pJsonObject, pIN_IDKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&pIN_ID, node, "std::string", "");
		} else {
			
		}
	}
}

AdPinAnalytics::AdPinAnalytics(char* json)
{
	this->fromJson(json);
}

char*
AdPinAnalytics::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("Date")) {
		Date obj = getDATE();
		node = converttoJson(&obj, "Date", "");
	}
	else {
		
	}
	const gchar *dATEKey = "DATE";
	json_object_set_member(pJsonObject, dATEKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPINID();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *pIN_IDKey = "PIN_ID";
	json_object_set_member(pJsonObject, pIN_IDKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

Date
AdPinAnalytics::getDATE()
{
	return dATE;
}

void
AdPinAnalytics::setDATE(Date  dATE)
{
	this->dATE = dATE;
}

std::string
AdPinAnalytics::getPINID()
{
	return pIN_ID;
}

void
AdPinAnalytics::setPINID(std::string  pIN_ID)
{
	this->pIN_ID = pIN_ID;
}


