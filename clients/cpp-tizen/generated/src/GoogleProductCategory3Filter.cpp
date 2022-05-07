#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GoogleProductCategory3Filter.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GoogleProductCategory3Filter::GoogleProductCategory3Filter()
{
	//__init();
}

GoogleProductCategory3Filter::~GoogleProductCategory3Filter()
{
	//__cleanup();
}

void
GoogleProductCategory3Filter::__init()
{
	//gOOGLE_PRODUCT_CATEGORY_3 = new CatalogsProductGroupMultipleStringListCriteria();
}

void
GoogleProductCategory3Filter::__cleanup()
{
	//if(gOOGLE_PRODUCT_CATEGORY_3 != NULL) {
	//
	//delete gOOGLE_PRODUCT_CATEGORY_3;
	//gOOGLE_PRODUCT_CATEGORY_3 = NULL;
	//}
	//
}

void
GoogleProductCategory3Filter::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *gOOGLE_PRODUCT_CATEGORY_3Key = "GOOGLE_PRODUCT_CATEGORY_3";
	node = json_object_get_member(pJsonObject, gOOGLE_PRODUCT_CATEGORY_3Key);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsProductGroupMultipleStringListCriteria")) {
			jsonToValue(&gOOGLE_PRODUCT_CATEGORY_3, node, "CatalogsProductGroupMultipleStringListCriteria", "");
		} else {
			
			CatalogsProductGroupMultipleStringListCriteria* obj = static_cast<CatalogsProductGroupMultipleStringListCriteria*> (&gOOGLE_PRODUCT_CATEGORY_3);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

GoogleProductCategory3Filter::GoogleProductCategory3Filter(char* json)
{
	this->fromJson(json);
}

char*
GoogleProductCategory3Filter::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CatalogsProductGroupMultipleStringListCriteria")) {
		CatalogsProductGroupMultipleStringListCriteria obj = getGOOGLEPRODUCTCATEGORY3();
		node = converttoJson(&obj, "CatalogsProductGroupMultipleStringListCriteria", "");
	}
	else {
		
		CatalogsProductGroupMultipleStringListCriteria obj = static_cast<CatalogsProductGroupMultipleStringListCriteria> (getGOOGLEPRODUCTCATEGORY3());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *gOOGLE_PRODUCT_CATEGORY_3Key = "GOOGLE_PRODUCT_CATEGORY_3";
	json_object_set_member(pJsonObject, gOOGLE_PRODUCT_CATEGORY_3Key, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

CatalogsProductGroupMultipleStringListCriteria
GoogleProductCategory3Filter::getGOOGLEPRODUCTCATEGORY3()
{
	return gOOGLE_PRODUCT_CATEGORY_3;
}

void
GoogleProductCategory3Filter::setGOOGLEPRODUCTCATEGORY3(CatalogsProductGroupMultipleStringListCriteria  gOOGLE_PRODUCT_CATEGORY_3)
{
	this->gOOGLE_PRODUCT_CATEGORY_3 = gOOGLE_PRODUCT_CATEGORY_3;
}


