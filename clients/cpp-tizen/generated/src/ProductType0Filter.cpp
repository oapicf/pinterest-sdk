#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ProductType0Filter.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ProductType0Filter::ProductType0Filter()
{
	//__init();
}

ProductType0Filter::~ProductType0Filter()
{
	//__cleanup();
}

void
ProductType0Filter::__init()
{
	//pRODUCT_TYPE_0 = new CatalogsProductGroupMultipleStringListCriteria();
}

void
ProductType0Filter::__cleanup()
{
	//if(pRODUCT_TYPE_0 != NULL) {
	//
	//delete pRODUCT_TYPE_0;
	//pRODUCT_TYPE_0 = NULL;
	//}
	//
}

void
ProductType0Filter::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *pRODUCT_TYPE_0Key = "PRODUCT_TYPE_0";
	node = json_object_get_member(pJsonObject, pRODUCT_TYPE_0Key);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsProductGroupMultipleStringListCriteria")) {
			jsonToValue(&pRODUCT_TYPE_0, node, "CatalogsProductGroupMultipleStringListCriteria", "");
		} else {
			
			CatalogsProductGroupMultipleStringListCriteria* obj = static_cast<CatalogsProductGroupMultipleStringListCriteria*> (&pRODUCT_TYPE_0);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ProductType0Filter::ProductType0Filter(char* json)
{
	this->fromJson(json);
}

char*
ProductType0Filter::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CatalogsProductGroupMultipleStringListCriteria")) {
		CatalogsProductGroupMultipleStringListCriteria obj = getPRODUCTTYPE0();
		node = converttoJson(&obj, "CatalogsProductGroupMultipleStringListCriteria", "");
	}
	else {
		
		CatalogsProductGroupMultipleStringListCriteria obj = static_cast<CatalogsProductGroupMultipleStringListCriteria> (getPRODUCTTYPE0());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pRODUCT_TYPE_0Key = "PRODUCT_TYPE_0";
	json_object_set_member(pJsonObject, pRODUCT_TYPE_0Key, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

CatalogsProductGroupMultipleStringListCriteria
ProductType0Filter::getPRODUCTTYPE0()
{
	return pRODUCT_TYPE_0;
}

void
ProductType0Filter::setPRODUCTTYPE0(CatalogsProductGroupMultipleStringListCriteria  pRODUCT_TYPE_0)
{
	this->pRODUCT_TYPE_0 = pRODUCT_TYPE_0;
}


