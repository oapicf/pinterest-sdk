#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdGroupsAnalyticsResponse_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdGroupsAnalyticsResponse_inner::AdGroupsAnalyticsResponse_inner()
{
	//__init();
}

AdGroupsAnalyticsResponse_inner::~AdGroupsAnalyticsResponse_inner()
{
	//__cleanup();
}

void
AdGroupsAnalyticsResponse_inner::__init()
{
	//aD_GROUP_ID = std::string();
	//dATE = null;
}

void
AdGroupsAnalyticsResponse_inner::__cleanup()
{
	//if(aD_GROUP_ID != NULL) {
	//
	//delete aD_GROUP_ID;
	//aD_GROUP_ID = NULL;
	//}
	//if(dATE != NULL) {
	//
	//delete dATE;
	//dATE = NULL;
	//}
	//
}

void
AdGroupsAnalyticsResponse_inner::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *aD_GROUP_IDKey = "AD_GROUP_ID";
	node = json_object_get_member(pJsonObject, aD_GROUP_IDKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&aD_GROUP_ID, node, "std::string", "");
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

AdGroupsAnalyticsResponse_inner::AdGroupsAnalyticsResponse_inner(char* json)
{
	this->fromJson(json);
}

char*
AdGroupsAnalyticsResponse_inner::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getADGROUPID();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *aD_GROUP_IDKey = "AD_GROUP_ID";
	json_object_set_member(pJsonObject, aD_GROUP_IDKey, node);
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
AdGroupsAnalyticsResponse_inner::getADGROUPID()
{
	return aD_GROUP_ID;
}

void
AdGroupsAnalyticsResponse_inner::setADGROUPID(std::string  aD_GROUP_ID)
{
	this->aD_GROUP_ID = aD_GROUP_ID;
}

Date
AdGroupsAnalyticsResponse_inner::getDATE()
{
	return dATE;
}

void
AdGroupsAnalyticsResponse_inner::setDATE(Date  dATE)
{
	this->dATE = dATE;
}


