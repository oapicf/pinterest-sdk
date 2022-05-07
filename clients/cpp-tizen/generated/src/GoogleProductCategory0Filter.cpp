#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GoogleProductCategory0Filter.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GoogleProductCategory0Filter::GoogleProductCategory0Filter()
{
	//__init();
}

GoogleProductCategory0Filter::~GoogleProductCategory0Filter()
{
	//__cleanup();
}

void
GoogleProductCategory0Filter::__init()
{
	//gOOGLE_PRODUCT_CATEGORY_0 = new CatalogsProductGroupMultipleStringListCriteria();
}

void
GoogleProductCategory0Filter::__cleanup()
{
	//if(gOOGLE_PRODUCT_CATEGORY_0 != NULL) {
	//
	//delete gOOGLE_PRODUCT_CATEGORY_0;
	//gOOGLE_PRODUCT_CATEGORY_0 = NULL;
	//}
	//
}

void
GoogleProductCategory0Filter::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *gOOGLE_PRODUCT_CATEGORY_0Key = "GOOGLE_PRODUCT_CATEGORY_0";
	node = json_object_get_member(pJsonObject, gOOGLE_PRODUCT_CATEGORY_0Key);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsProductGroupMultipleStringListCriteria")) {
			jsonToValue(&gOOGLE_PRODUCT_CATEGORY_0, node, "CatalogsProductGroupMultipleStringListCriteria", "");
		} else {
			
			CatalogsProductGroupMultipleStringListCriteria* obj = static_cast<CatalogsProductGroupMultipleStringListCriteria*> (&gOOGLE_PRODUCT_CATEGORY_0);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

GoogleProductCategory0Filter::GoogleProductCategory0Filter(char* json)
{
	this->fromJson(json);
}

char*
GoogleProductCategory0Filter::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CatalogsProductGroupMultipleStringListCriteria")) {
		CatalogsProductGroupMultipleStringListCriteria obj = getGOOGLEPRODUCTCATEGORY0();
		node = converttoJson(&obj, "CatalogsProductGroupMultipleStringListCriteria", "");
	}
	else {
		
		CatalogsProductGroupMultipleStringListCriteria obj = static_cast<CatalogsProductGroupMultipleStringListCriteria> (getGOOGLEPRODUCTCATEGORY0());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *gOOGLE_PRODUCT_CATEGORY_0Key = "GOOGLE_PRODUCT_CATEGORY_0";
	json_object_set_member(pJsonObject, gOOGLE_PRODUCT_CATEGORY_0Key, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

CatalogsProductGroupMultipleStringListCriteria
GoogleProductCategory0Filter::getGOOGLEPRODUCTCATEGORY0()
{
	return gOOGLE_PRODUCT_CATEGORY_0;
}

void
GoogleProductCategory0Filter::setGOOGLEPRODUCTCATEGORY0(CatalogsProductGroupMultipleStringListCriteria  gOOGLE_PRODUCT_CATEGORY_0)
{
	this->gOOGLE_PRODUCT_CATEGORY_0 = gOOGLE_PRODUCT_CATEGORY_0;
}


