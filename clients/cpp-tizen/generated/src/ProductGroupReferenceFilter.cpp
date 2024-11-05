#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ProductGroupReferenceFilter.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ProductGroupReferenceFilter::ProductGroupReferenceFilter()
{
	//__init();
}

ProductGroupReferenceFilter::~ProductGroupReferenceFilter()
{
	//__cleanup();
}

void
ProductGroupReferenceFilter::__init()
{
	//pRODUCT_GROUP = new CatalogsProductGroupMultipleStringCriteria();
}

void
ProductGroupReferenceFilter::__cleanup()
{
	//if(pRODUCT_GROUP != NULL) {
	//
	//delete pRODUCT_GROUP;
	//pRODUCT_GROUP = NULL;
	//}
	//
}

void
ProductGroupReferenceFilter::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *pRODUCT_GROUPKey = "PRODUCT_GROUP";
	node = json_object_get_member(pJsonObject, pRODUCT_GROUPKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsProductGroupMultipleStringCriteria")) {
			jsonToValue(&pRODUCT_GROUP, node, "CatalogsProductGroupMultipleStringCriteria", "");
		} else {
			
			CatalogsProductGroupMultipleStringCriteria* obj = static_cast<CatalogsProductGroupMultipleStringCriteria*> (&pRODUCT_GROUP);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ProductGroupReferenceFilter::ProductGroupReferenceFilter(char* json)
{
	this->fromJson(json);
}

char*
ProductGroupReferenceFilter::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CatalogsProductGroupMultipleStringCriteria")) {
		CatalogsProductGroupMultipleStringCriteria obj = getPRODUCTGROUP();
		node = converttoJson(&obj, "CatalogsProductGroupMultipleStringCriteria", "");
	}
	else {
		
		CatalogsProductGroupMultipleStringCriteria obj = static_cast<CatalogsProductGroupMultipleStringCriteria> (getPRODUCTGROUP());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pRODUCT_GROUPKey = "PRODUCT_GROUP";
	json_object_set_member(pJsonObject, pRODUCT_GROUPKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

CatalogsProductGroupMultipleStringCriteria
ProductGroupReferenceFilter::getPRODUCTGROUP()
{
	return pRODUCT_GROUP;
}

void
ProductGroupReferenceFilter::setPRODUCTGROUP(CatalogsProductGroupMultipleStringCriteria  pRODUCT_GROUP)
{
	this->pRODUCT_GROUP = pRODUCT_GROUP;
}


