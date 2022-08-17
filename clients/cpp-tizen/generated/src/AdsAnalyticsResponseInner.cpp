#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdsAnalyticsResponse_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdsAnalyticsResponse_inner::AdsAnalyticsResponse_inner()
{
	//__init();
}

AdsAnalyticsResponse_inner::~AdsAnalyticsResponse_inner()
{
	//__cleanup();
}

void
AdsAnalyticsResponse_inner::__init()
{
	//aD_ID = std::string();
	//dATE = null;
}

void
AdsAnalyticsResponse_inner::__cleanup()
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
AdsAnalyticsResponse_inner::fromJson(char* jsonStr)
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

AdsAnalyticsResponse_inner::AdsAnalyticsResponse_inner(char* json)
{
	this->fromJson(json);
}

char*
AdsAnalyticsResponse_inner::toJson()
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
AdsAnalyticsResponse_inner::getADID()
{
	return aD_ID;
}

void
AdsAnalyticsResponse_inner::setADID(std::string  aD_ID)
{
	this->aD_ID = aD_ID;
}

Date
AdsAnalyticsResponse_inner::getDATE()
{
	return dATE;
}

void
AdsAnalyticsResponse_inner::setDATE(Date  dATE)
{
	this->dATE = dATE;
}


