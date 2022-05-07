#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ProductType3Filter.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ProductType3Filter::ProductType3Filter()
{
	//__init();
}

ProductType3Filter::~ProductType3Filter()
{
	//__cleanup();
}

void
ProductType3Filter::__init()
{
	//pRODUCT_TYPE_3 = new CatalogsProductGroupMultipleStringListCriteria();
}

void
ProductType3Filter::__cleanup()
{
	//if(pRODUCT_TYPE_3 != NULL) {
	//
	//delete pRODUCT_TYPE_3;
	//pRODUCT_TYPE_3 = NULL;
	//}
	//
}

void
ProductType3Filter::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *pRODUCT_TYPE_3Key = "PRODUCT_TYPE_3";
	node = json_object_get_member(pJsonObject, pRODUCT_TYPE_3Key);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsProductGroupMultipleStringListCriteria")) {
			jsonToValue(&pRODUCT_TYPE_3, node, "CatalogsProductGroupMultipleStringListCriteria", "");
		} else {
			
			CatalogsProductGroupMultipleStringListCriteria* obj = static_cast<CatalogsProductGroupMultipleStringListCriteria*> (&pRODUCT_TYPE_3);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ProductType3Filter::ProductType3Filter(char* json)
{
	this->fromJson(json);
}

char*
ProductType3Filter::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CatalogsProductGroupMultipleStringListCriteria")) {
		CatalogsProductGroupMultipleStringListCriteria obj = getPRODUCTTYPE3();
		node = converttoJson(&obj, "CatalogsProductGroupMultipleStringListCriteria", "");
	}
	else {
		
		CatalogsProductGroupMultipleStringListCriteria obj = static_cast<CatalogsProductGroupMultipleStringListCriteria> (getPRODUCTTYPE3());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pRODUCT_TYPE_3Key = "PRODUCT_TYPE_3";
	json_object_set_member(pJsonObject, pRODUCT_TYPE_3Key, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

CatalogsProductGroupMultipleStringListCriteria
ProductType3Filter::getPRODUCTTYPE3()
{
	return pRODUCT_TYPE_3;
}

void
ProductType3Filter::setPRODUCTTYPE3(CatalogsProductGroupMultipleStringListCriteria  pRODUCT_TYPE_3)
{
	this->pRODUCT_TYPE_3 = pRODUCT_TYPE_3;
}


