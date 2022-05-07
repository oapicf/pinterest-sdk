#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GoogleProductCategory1Filter.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GoogleProductCategory1Filter::GoogleProductCategory1Filter()
{
	//__init();
}

GoogleProductCategory1Filter::~GoogleProductCategory1Filter()
{
	//__cleanup();
}

void
GoogleProductCategory1Filter::__init()
{
	//gOOGLE_PRODUCT_CATEGORY_1 = new CatalogsProductGroupMultipleStringListCriteria();
}

void
GoogleProductCategory1Filter::__cleanup()
{
	//if(gOOGLE_PRODUCT_CATEGORY_1 != NULL) {
	//
	//delete gOOGLE_PRODUCT_CATEGORY_1;
	//gOOGLE_PRODUCT_CATEGORY_1 = NULL;
	//}
	//
}

void
GoogleProductCategory1Filter::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *gOOGLE_PRODUCT_CATEGORY_1Key = "GOOGLE_PRODUCT_CATEGORY_1";
	node = json_object_get_member(pJsonObject, gOOGLE_PRODUCT_CATEGORY_1Key);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsProductGroupMultipleStringListCriteria")) {
			jsonToValue(&gOOGLE_PRODUCT_CATEGORY_1, node, "CatalogsProductGroupMultipleStringListCriteria", "");
		} else {
			
			CatalogsProductGroupMultipleStringListCriteria* obj = static_cast<CatalogsProductGroupMultipleStringListCriteria*> (&gOOGLE_PRODUCT_CATEGORY_1);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

GoogleProductCategory1Filter::GoogleProductCategory1Filter(char* json)
{
	this->fromJson(json);
}

char*
GoogleProductCategory1Filter::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CatalogsProductGroupMultipleStringListCriteria")) {
		CatalogsProductGroupMultipleStringListCriteria obj = getGOOGLEPRODUCTCATEGORY1();
		node = converttoJson(&obj, "CatalogsProductGroupMultipleStringListCriteria", "");
	}
	else {
		
		CatalogsProductGroupMultipleStringListCriteria obj = static_cast<CatalogsProductGroupMultipleStringListCriteria> (getGOOGLEPRODUCTCATEGORY1());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *gOOGLE_PRODUCT_CATEGORY_1Key = "GOOGLE_PRODUCT_CATEGORY_1";
	json_object_set_member(pJsonObject, gOOGLE_PRODUCT_CATEGORY_1Key, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

CatalogsProductGroupMultipleStringListCriteria
GoogleProductCategory1Filter::getGOOGLEPRODUCTCATEGORY1()
{
	return gOOGLE_PRODUCT_CATEGORY_1;
}

void
GoogleProductCategory1Filter::setGOOGLEPRODUCTCATEGORY1(CatalogsProductGroupMultipleStringListCriteria  gOOGLE_PRODUCT_CATEGORY_1)
{
	this->gOOGLE_PRODUCT_CATEGORY_1 = gOOGLE_PRODUCT_CATEGORY_1;
}


