#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ProductType1Filter.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ProductType1Filter::ProductType1Filter()
{
	//__init();
}

ProductType1Filter::~ProductType1Filter()
{
	//__cleanup();
}

void
ProductType1Filter::__init()
{
	//pRODUCT_TYPE_1 = new CatalogsProductGroupMultipleStringListCriteria();
}

void
ProductType1Filter::__cleanup()
{
	//if(pRODUCT_TYPE_1 != NULL) {
	//
	//delete pRODUCT_TYPE_1;
	//pRODUCT_TYPE_1 = NULL;
	//}
	//
}

void
ProductType1Filter::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *pRODUCT_TYPE_1Key = "PRODUCT_TYPE_1";
	node = json_object_get_member(pJsonObject, pRODUCT_TYPE_1Key);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsProductGroupMultipleStringListCriteria")) {
			jsonToValue(&pRODUCT_TYPE_1, node, "CatalogsProductGroupMultipleStringListCriteria", "");
		} else {
			
			CatalogsProductGroupMultipleStringListCriteria* obj = static_cast<CatalogsProductGroupMultipleStringListCriteria*> (&pRODUCT_TYPE_1);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ProductType1Filter::ProductType1Filter(char* json)
{
	this->fromJson(json);
}

char*
ProductType1Filter::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CatalogsProductGroupMultipleStringListCriteria")) {
		CatalogsProductGroupMultipleStringListCriteria obj = getPRODUCTTYPE1();
		node = converttoJson(&obj, "CatalogsProductGroupMultipleStringListCriteria", "");
	}
	else {
		
		CatalogsProductGroupMultipleStringListCriteria obj = static_cast<CatalogsProductGroupMultipleStringListCriteria> (getPRODUCTTYPE1());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pRODUCT_TYPE_1Key = "PRODUCT_TYPE_1";
	json_object_set_member(pJsonObject, pRODUCT_TYPE_1Key, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

CatalogsProductGroupMultipleStringListCriteria
ProductType1Filter::getPRODUCTTYPE1()
{
	return pRODUCT_TYPE_1;
}

void
ProductType1Filter::setPRODUCTTYPE1(CatalogsProductGroupMultipleStringListCriteria  pRODUCT_TYPE_1)
{
	this->pRODUCT_TYPE_1 = pRODUCT_TYPE_1;
}


