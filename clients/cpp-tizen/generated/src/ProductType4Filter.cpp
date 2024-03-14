#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ProductType4Filter.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ProductType4Filter::ProductType4Filter()
{
	//__init();
}

ProductType4Filter::~ProductType4Filter()
{
	//__cleanup();
}

void
ProductType4Filter::__init()
{
	//pRODUCT_TYPE_4 = new CatalogsProductGroupMultipleStringListCriteria();
}

void
ProductType4Filter::__cleanup()
{
	//if(pRODUCT_TYPE_4 != NULL) {
	//
	//delete pRODUCT_TYPE_4;
	//pRODUCT_TYPE_4 = NULL;
	//}
	//
}

void
ProductType4Filter::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *pRODUCT_TYPE_4Key = "PRODUCT_TYPE_4";
	node = json_object_get_member(pJsonObject, pRODUCT_TYPE_4Key);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsProductGroupMultipleStringListCriteria")) {
			jsonToValue(&pRODUCT_TYPE_4, node, "CatalogsProductGroupMultipleStringListCriteria", "");
		} else {
			
			CatalogsProductGroupMultipleStringListCriteria* obj = static_cast<CatalogsProductGroupMultipleStringListCriteria*> (&pRODUCT_TYPE_4);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ProductType4Filter::ProductType4Filter(char* json)
{
	this->fromJson(json);
}

char*
ProductType4Filter::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CatalogsProductGroupMultipleStringListCriteria")) {
		CatalogsProductGroupMultipleStringListCriteria obj = getPRODUCTTYPE4();
		node = converttoJson(&obj, "CatalogsProductGroupMultipleStringListCriteria", "");
	}
	else {
		
		CatalogsProductGroupMultipleStringListCriteria obj = static_cast<CatalogsProductGroupMultipleStringListCriteria> (getPRODUCTTYPE4());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pRODUCT_TYPE_4Key = "PRODUCT_TYPE_4";
	json_object_set_member(pJsonObject, pRODUCT_TYPE_4Key, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

CatalogsProductGroupMultipleStringListCriteria
ProductType4Filter::getPRODUCTTYPE4()
{
	return pRODUCT_TYPE_4;
}

void
ProductType4Filter::setPRODUCTTYPE4(CatalogsProductGroupMultipleStringListCriteria  pRODUCT_TYPE_4)
{
	this->pRODUCT_TYPE_4 = pRODUCT_TYPE_4;
}


