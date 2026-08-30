#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdsAnalytics.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdsAnalytics::AdsAnalytics()
{
	//__init();
}

AdsAnalytics::~AdsAnalytics()
{
	//__cleanup();
}

void
AdsAnalytics::__init()
{
	//aD_ID = std::string();
	//dATE = null;
}

void
AdsAnalytics::__cleanup()
{
	//if(aD_ID != NULL) {
	//
	//delete aD_ID;
	//aD_ID = NULL;
	//}
	//if(dATE != NULL) {
	//
	//delete dATE;
	//dATE = NULL;
	//}
	//
}

void
AdsAnalytics::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *aD_IDKey = "AD_ID";
	node = json_object_get_member(pJsonObject, aD_IDKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&aD_ID, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *dATEKey = "DATE";
	node = json_object_get_member(pJsonObject, dATEKey);
	if (node !=NULL) {
	

		if (isprimitive("Date")) {
			jsonToValue(&dATE, node, "Date", "Date");
		} else {
			
		}
	}
}

AdsAnalytics::AdsAnalytics(char* json)
{
	this->fromJson(json);
}

char*
AdsAnalytics::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getADID();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *aD_IDKey = "AD_ID";
	json_object_set_member(pJsonObject, aD_IDKey, node);
	if (isprimitive("Date")) {
		Date obj = getDATE();
		node = converttoJson(&obj, "Date", "");
	}
	else {
		
	}
	const gchar *dATEKey = "DATE";
	json_object_set_member(pJsonObject, dATEKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
AdsAnalytics::getADID()
{
	return aD_ID;
}

void
AdsAnalytics::setADID(std::string  aD_ID)
{
	this->aD_ID = aD_ID;
}

Date
AdsAnalytics::getDATE()
{
	return dATE;
}

void
AdsAnalytics::setDATE(Date  dATE)
{
	this->dATE = dATE;
}


