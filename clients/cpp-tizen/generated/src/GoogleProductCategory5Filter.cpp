#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GoogleProductCategory5Filter.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GoogleProductCategory5Filter::GoogleProductCategory5Filter()
{
	//__init();
}

GoogleProductCategory5Filter::~GoogleProductCategory5Filter()
{
	//__cleanup();
}

void
GoogleProductCategory5Filter::__init()
{
	//gOOGLE_PRODUCT_CATEGORY_5 = new CatalogsProductGroupMultipleStringListCriteria();
}

void
GoogleProductCategory5Filter::__cleanup()
{
	//if(gOOGLE_PRODUCT_CATEGORY_5 != NULL) {
	//
	//delete gOOGLE_PRODUCT_CATEGORY_5;
	//gOOGLE_PRODUCT_CATEGORY_5 = NULL;
	//}
	//
}

void
GoogleProductCategory5Filter::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *gOOGLE_PRODUCT_CATEGORY_5Key = "GOOGLE_PRODUCT_CATEGORY_5";
	node = json_object_get_member(pJsonObject, gOOGLE_PRODUCT_CATEGORY_5Key);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsProductGroupMultipleStringListCriteria")) {
			jsonToValue(&gOOGLE_PRODUCT_CATEGORY_5, node, "CatalogsProductGroupMultipleStringListCriteria", "");
		} else {
			
			CatalogsProductGroupMultipleStringListCriteria* obj = static_cast<CatalogsProductGroupMultipleStringListCriteria*> (&gOOGLE_PRODUCT_CATEGORY_5);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

GoogleProductCategory5Filter::GoogleProductCategory5Filter(char* json)
{
	this->fromJson(json);
}

char*
GoogleProductCategory5Filter::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CatalogsProductGroupMultipleStringListCriteria")) {
		CatalogsProductGroupMultipleStringListCriteria obj = getGOOGLEPRODUCTCATEGORY5();
		node = converttoJson(&obj, "CatalogsProductGroupMultipleStringListCriteria", "");
	}
	else {
		
		CatalogsProductGroupMultipleStringListCriteria obj = static_cast<CatalogsProductGroupMultipleStringListCriteria> (getGOOGLEPRODUCTCATEGORY5());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *gOOGLE_PRODUCT_CATEGORY_5Key = "GOOGLE_PRODUCT_CATEGORY_5";
	json_object_set_member(pJsonObject, gOOGLE_PRODUCT_CATEGORY_5Key, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

CatalogsProductGroupMultipleStringListCriteria
GoogleProductCategory5Filter::getGOOGLEPRODUCTCATEGORY5()
{
	return gOOGLE_PRODUCT_CATEGORY_5;
}

void
GoogleProductCategory5Filter::setGOOGLEPRODUCTCATEGORY5(CatalogsProductGroupMultipleStringListCriteria  gOOGLE_PRODUCT_CATEGORY_5)
{
	this->gOOGLE_PRODUCT_CATEGORY_5 = gOOGLE_PRODUCT_CATEGORY_5;
}


