#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ProductType2Filter.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ProductType2Filter::ProductType2Filter()
{
	//__init();
}

ProductType2Filter::~ProductType2Filter()
{
	//__cleanup();
}

void
ProductType2Filter::__init()
{
	//pRODUCT_TYPE_2 = new CatalogsProductGroupMultipleStringListCriteria();
}

void
ProductType2Filter::__cleanup()
{
	//if(pRODUCT_TYPE_2 != NULL) {
	//
	//delete pRODUCT_TYPE_2;
	//pRODUCT_TYPE_2 = NULL;
	//}
	//
}

void
ProductType2Filter::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *pRODUCT_TYPE_2Key = "PRODUCT_TYPE_2";
	node = json_object_get_member(pJsonObject, pRODUCT_TYPE_2Key);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsProductGroupMultipleStringListCriteria")) {
			jsonToValue(&pRODUCT_TYPE_2, node, "CatalogsProductGroupMultipleStringListCriteria", "");
		} else {
			
			CatalogsProductGroupMultipleStringListCriteria* obj = static_cast<CatalogsProductGroupMultipleStringListCriteria*> (&pRODUCT_TYPE_2);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ProductType2Filter::ProductType2Filter(char* json)
{
	this->fromJson(json);
}

char*
ProductType2Filter::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CatalogsProductGroupMultipleStringListCriteria")) {
		CatalogsProductGroupMultipleStringListCriteria obj = getPRODUCTTYPE2();
		node = converttoJson(&obj, "CatalogsProductGroupMultipleStringListCriteria", "");
	}
	else {
		
		CatalogsProductGroupMultipleStringListCriteria obj = static_cast<CatalogsProductGroupMultipleStringListCriteria> (getPRODUCTTYPE2());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pRODUCT_TYPE_2Key = "PRODUCT_TYPE_2";
	json_object_set_member(pJsonObject, pRODUCT_TYPE_2Key, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

CatalogsProductGroupMultipleStringListCriteria
ProductType2Filter::getPRODUCTTYPE2()
{
	return pRODUCT_TYPE_2;
}

void
ProductType2Filter::setPRODUCTTYPE2(CatalogsProductGroupMultipleStringListCriteria  pRODUCT_TYPE_2)
{
	this->pRODUCT_TYPE_2 = pRODUCT_TYPE_2;
}


