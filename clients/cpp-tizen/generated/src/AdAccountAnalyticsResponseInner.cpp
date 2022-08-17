#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdAccountAnalyticsResponse_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdAccountAnalyticsResponse_inner::AdAccountAnalyticsResponse_inner()
{
	//__init();
}

AdAccountAnalyticsResponse_inner::~AdAccountAnalyticsResponse_inner()
{
	//__cleanup();
}

void
AdAccountAnalyticsResponse_inner::__init()
{
	//aD_ACCOUNT_ID = std::string();
	//dATE = null;
}

void
AdAccountAnalyticsResponse_inner::__cleanup()
{
	//if(aD_ACCOUNT_ID != NULL) {
	//
	//delete aD_ACCOUNT_ID;
	//aD_ACCOUNT_ID = NULL;
	//}
	//if(dATE != NULL) {
	//
	//delete dATE;
	//dATE = NULL;
	//}
	//
}

void
AdAccountAnalyticsResponse_inner::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *aD_ACCOUNT_IDKey = "AD_ACCOUNT_ID";
	node = json_object_get_member(pJsonObject, aD_ACCOUNT_IDKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&aD_ACCOUNT_ID, node, "std::string", "");
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

AdAccountAnalyticsResponse_inner::AdAccountAnalyticsResponse_inner(char* json)
{
	this->fromJson(json);
}

char*
AdAccountAnalyticsResponse_inner::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getADACCOUNTID();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *aD_ACCOUNT_IDKey = "AD_ACCOUNT_ID";
	json_object_set_member(pJsonObject, aD_ACCOUNT_IDKey, node);
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
AdAccountAnalyticsResponse_inner::getADACCOUNTID()
{
	return aD_ACCOUNT_ID;
}

void
AdAccountAnalyticsResponse_inner::setADACCOUNTID(std::string  aD_ACCOUNT_ID)
{
	this->aD_ACCOUNT_ID = aD_ACCOUNT_ID;
}

Date
AdAccountAnalyticsResponse_inner::getDATE()
{
	return dATE;
}

void
AdAccountAnalyticsResponse_inner::setDATE(Date  dATE)
{
	this->dATE = dATE;
}


