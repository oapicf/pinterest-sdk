#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GoogleProductCategory2Filter.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GoogleProductCategory2Filter::GoogleProductCategory2Filter()
{
	//__init();
}

GoogleProductCategory2Filter::~GoogleProductCategory2Filter()
{
	//__cleanup();
}

void
GoogleProductCategory2Filter::__init()
{
	//gOOGLE_PRODUCT_CATEGORY_2 = new CatalogsProductGroupMultipleStringListCriteria();
}

void
GoogleProductCategory2Filter::__cleanup()
{
	//if(gOOGLE_PRODUCT_CATEGORY_2 != NULL) {
	//
	//delete gOOGLE_PRODUCT_CATEGORY_2;
	//gOOGLE_PRODUCT_CATEGORY_2 = NULL;
	//}
	//
}

void
GoogleProductCategory2Filter::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *gOOGLE_PRODUCT_CATEGORY_2Key = "GOOGLE_PRODUCT_CATEGORY_2";
	node = json_object_get_member(pJsonObject, gOOGLE_PRODUCT_CATEGORY_2Key);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsProductGroupMultipleStringListCriteria")) {
			jsonToValue(&gOOGLE_PRODUCT_CATEGORY_2, node, "CatalogsProductGroupMultipleStringListCriteria", "");
		} else {
			
			CatalogsProductGroupMultipleStringListCriteria* obj = static_cast<CatalogsProductGroupMultipleStringListCriteria*> (&gOOGLE_PRODUCT_CATEGORY_2);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

GoogleProductCategory2Filter::GoogleProductCategory2Filter(char* json)
{
	this->fromJson(json);
}

char*
GoogleProductCategory2Filter::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CatalogsProductGroupMultipleStringListCriteria")) {
		CatalogsProductGroupMultipleStringListCriteria obj = getGOOGLEPRODUCTCATEGORY2();
		node = converttoJson(&obj, "CatalogsProductGroupMultipleStringListCriteria", "");
	}
	else {
		
		CatalogsProductGroupMultipleStringListCriteria obj = static_cast<CatalogsProductGroupMultipleStringListCriteria> (getGOOGLEPRODUCTCATEGORY2());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *gOOGLE_PRODUCT_CATEGORY_2Key = "GOOGLE_PRODUCT_CATEGORY_2";
	json_object_set_member(pJsonObject, gOOGLE_PRODUCT_CATEGORY_2Key, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

CatalogsProductGroupMultipleStringListCriteria
GoogleProductCategory2Filter::getGOOGLEPRODUCTCATEGORY2()
{
	return gOOGLE_PRODUCT_CATEGORY_2;
}

void
GoogleProductCategory2Filter::setGOOGLEPRODUCTCATEGORY2(CatalogsProductGroupMultipleStringListCriteria  gOOGLE_PRODUCT_CATEGORY_2)
{
	this->gOOGLE_PRODUCT_CATEGORY_2 = gOOGLE_PRODUCT_CATEGORY_2;
}


