#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ProductGroupAnalyticsItems.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ProductGroupAnalyticsItems::ProductGroupAnalyticsItems()
{
	//__init();
}

ProductGroupAnalyticsItems::~ProductGroupAnalyticsItems()
{
	//__cleanup();
}

void
ProductGroupAnalyticsItems::__init()
{
	//dATE = null;
	//pRODUCT_GROUP_ID = std::string();
}

void
ProductGroupAnalyticsItems::__cleanup()
{
	//if(dATE != NULL) {
	//
	//delete dATE;
	//dATE = NULL;
	//}
	//if(pRODUCT_GROUP_ID != NULL) {
	//
	//delete pRODUCT_GROUP_ID;
	//pRODUCT_GROUP_ID = NULL;
	//}
	//
}

void
ProductGroupAnalyticsItems::fromJson(char* jsonStr)
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
	const gchar *pRODUCT_GROUP_IDKey = "PRODUCT_GROUP_ID";
	node = json_object_get_member(pJsonObject, pRODUCT_GROUP_IDKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&pRODUCT_GROUP_ID, node, "std::string", "");
		} else {
			
		}
	}
}

ProductGroupAnalyticsItems::ProductGroupAnalyticsItems(char* json)
{
	this->fromJson(json);
}

char*
ProductGroupAnalyticsItems::toJson()
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
		std::string obj = getPRODUCTGROUPID();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *pRODUCT_GROUP_IDKey = "PRODUCT_GROUP_ID";
	json_object_set_member(pJsonObject, pRODUCT_GROUP_IDKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

Date
ProductGroupAnalyticsItems::getDATE()
{
	return dATE;
}

void
ProductGroupAnalyticsItems::setDATE(Date  dATE)
{
	this->dATE = dATE;
}

std::string
ProductGroupAnalyticsItems::getPRODUCTGROUPID()
{
	return pRODUCT_GROUP_ID;
}

void
ProductGroupAnalyticsItems::setPRODUCTGROUPID(std::string  pRODUCT_GROUP_ID)
{
	this->pRODUCT_GROUP_ID = pRODUCT_GROUP_ID;
}


