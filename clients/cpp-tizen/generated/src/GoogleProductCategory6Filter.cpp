#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GoogleProductCategory6Filter.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GoogleProductCategory6Filter::GoogleProductCategory6Filter()
{
	//__init();
}

GoogleProductCategory6Filter::~GoogleProductCategory6Filter()
{
	//__cleanup();
}

void
GoogleProductCategory6Filter::__init()
{
	//gOOGLE_PRODUCT_CATEGORY_6 = new CatalogsProductGroupMultipleStringListCriteria();
}

void
GoogleProductCategory6Filter::__cleanup()
{
	//if(gOOGLE_PRODUCT_CATEGORY_6 != NULL) {
	//
	//delete gOOGLE_PRODUCT_CATEGORY_6;
	//gOOGLE_PRODUCT_CATEGORY_6 = NULL;
	//}
	//
}

void
GoogleProductCategory6Filter::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *gOOGLE_PRODUCT_CATEGORY_6Key = "GOOGLE_PRODUCT_CATEGORY_6";
	node = json_object_get_member(pJsonObject, gOOGLE_PRODUCT_CATEGORY_6Key);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsProductGroupMultipleStringListCriteria")) {
			jsonToValue(&gOOGLE_PRODUCT_CATEGORY_6, node, "CatalogsProductGroupMultipleStringListCriteria", "");
		} else {
			
			CatalogsProductGroupMultipleStringListCriteria* obj = static_cast<CatalogsProductGroupMultipleStringListCriteria*> (&gOOGLE_PRODUCT_CATEGORY_6);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

GoogleProductCategory6Filter::GoogleProductCategory6Filter(char* json)
{
	this->fromJson(json);
}

char*
GoogleProductCategory6Filter::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CatalogsProductGroupMultipleStringListCriteria")) {
		CatalogsProductGroupMultipleStringListCriteria obj = getGOOGLEPRODUCTCATEGORY6();
		node = converttoJson(&obj, "CatalogsProductGroupMultipleStringListCriteria", "");
	}
	else {
		
		CatalogsProductGroupMultipleStringListCriteria obj = static_cast<CatalogsProductGroupMultipleStringListCriteria> (getGOOGLEPRODUCTCATEGORY6());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *gOOGLE_PRODUCT_CATEGORY_6Key = "GOOGLE_PRODUCT_CATEGORY_6";
	json_object_set_member(pJsonObject, gOOGLE_PRODUCT_CATEGORY_6Key, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

CatalogsProductGroupMultipleStringListCriteria
GoogleProductCategory6Filter::getGOOGLEPRODUCTCATEGORY6()
{
	return gOOGLE_PRODUCT_CATEGORY_6;
}

void
GoogleProductCategory6Filter::setGOOGLEPRODUCTCATEGORY6(CatalogsProductGroupMultipleStringListCriteria  gOOGLE_PRODUCT_CATEGORY_6)
{
	this->gOOGLE_PRODUCT_CATEGORY_6 = gOOGLE_PRODUCT_CATEGORY_6;
}


