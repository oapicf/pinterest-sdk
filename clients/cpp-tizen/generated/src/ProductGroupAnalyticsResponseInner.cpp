#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ProductGroupAnalyticsResponse_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ProductGroupAnalyticsResponse_inner::ProductGroupAnalyticsResponse_inner()
{
	//__init();
}

ProductGroupAnalyticsResponse_inner::~ProductGroupAnalyticsResponse_inner()
{
	//__cleanup();
}

void
ProductGroupAnalyticsResponse_inner::__init()
{
	//pRODUCT_GROUP_ID = std::string();
	//dATE = null;
}

void
ProductGroupAnalyticsResponse_inner::__cleanup()
{
	//if(pRODUCT_GROUP_ID != NULL) {
	//
	//delete pRODUCT_GROUP_ID;
	//pRODUCT_GROUP_ID = NULL;
	//}
	//if(dATE != NULL) {
	//
	//delete dATE;
	//dATE = NULL;
	//}
	//
}

void
ProductGroupAnalyticsResponse_inner::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *pRODUCT_GROUP_IDKey = "PRODUCT_GROUP_ID";
	node = json_object_get_member(pJsonObject, pRODUCT_GROUP_IDKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&pRODUCT_GROUP_ID, node, "std::string", "");
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

ProductGroupAnalyticsResponse_inner::ProductGroupAnalyticsResponse_inner(char* json)
{
	this->fromJson(json);
}

char*
ProductGroupAnalyticsResponse_inner::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getPRODUCTGROUPID();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *pRODUCT_GROUP_IDKey = "PRODUCT_GROUP_ID";
	json_object_set_member(pJsonObject, pRODUCT_GROUP_IDKey, node);
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
ProductGroupAnalyticsResponse_inner::getPRODUCTGROUPID()
{
	return pRODUCT_GROUP_ID;
}

void
ProductGroupAnalyticsResponse_inner::setPRODUCTGROUPID(std::string  pRODUCT_GROUP_ID)
{
	this->pRODUCT_GROUP_ID = pRODUCT_GROUP_ID;
}

Date
ProductGroupAnalyticsResponse_inner::getDATE()
{
	return dATE;
}

void
ProductGroupAnalyticsResponse_inner::setDATE(Date  dATE)
{
	this->dATE = dATE;
}


