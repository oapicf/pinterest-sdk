#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GoogleProductCategory4Filter.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GoogleProductCategory4Filter::GoogleProductCategory4Filter()
{
	//__init();
}

GoogleProductCategory4Filter::~GoogleProductCategory4Filter()
{
	//__cleanup();
}

void
GoogleProductCategory4Filter::__init()
{
	//gOOGLE_PRODUCT_CATEGORY_4 = new CatalogsProductGroupMultipleStringListCriteria();
}

void
GoogleProductCategory4Filter::__cleanup()
{
	//if(gOOGLE_PRODUCT_CATEGORY_4 != NULL) {
	//
	//delete gOOGLE_PRODUCT_CATEGORY_4;
	//gOOGLE_PRODUCT_CATEGORY_4 = NULL;
	//}
	//
}

void
GoogleProductCategory4Filter::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *gOOGLE_PRODUCT_CATEGORY_4Key = "GOOGLE_PRODUCT_CATEGORY_4";
	node = json_object_get_member(pJsonObject, gOOGLE_PRODUCT_CATEGORY_4Key);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsProductGroupMultipleStringListCriteria")) {
			jsonToValue(&gOOGLE_PRODUCT_CATEGORY_4, node, "CatalogsProductGroupMultipleStringListCriteria", "");
		} else {
			
			CatalogsProductGroupMultipleStringListCriteria* obj = static_cast<CatalogsProductGroupMultipleStringListCriteria*> (&gOOGLE_PRODUCT_CATEGORY_4);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

GoogleProductCategory4Filter::GoogleProductCategory4Filter(char* json)
{
	this->fromJson(json);
}

char*
GoogleProductCategory4Filter::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CatalogsProductGroupMultipleStringListCriteria")) {
		CatalogsProductGroupMultipleStringListCriteria obj = getGOOGLEPRODUCTCATEGORY4();
		node = converttoJson(&obj, "CatalogsProductGroupMultipleStringListCriteria", "");
	}
	else {
		
		CatalogsProductGroupMultipleStringListCriteria obj = static_cast<CatalogsProductGroupMultipleStringListCriteria> (getGOOGLEPRODUCTCATEGORY4());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *gOOGLE_PRODUCT_CATEGORY_4Key = "GOOGLE_PRODUCT_CATEGORY_4";
	json_object_set_member(pJsonObject, gOOGLE_PRODUCT_CATEGORY_4Key, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

CatalogsProductGroupMultipleStringListCriteria
GoogleProductCategory4Filter::getGOOGLEPRODUCTCATEGORY4()
{
	return gOOGLE_PRODUCT_CATEGORY_4;
}

void
GoogleProductCategory4Filter::setGOOGLEPRODUCTCATEGORY4(CatalogsProductGroupMultipleStringListCriteria  gOOGLE_PRODUCT_CATEGORY_4)
{
	this->gOOGLE_PRODUCT_CATEGORY_4 = gOOGLE_PRODUCT_CATEGORY_4;
}


