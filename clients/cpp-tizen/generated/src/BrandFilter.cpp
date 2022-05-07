#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "BrandFilter.h"

using namespace std;
using namespace Tizen::ArtikCloud;

BrandFilter::BrandFilter()
{
	//__init();
}

BrandFilter::~BrandFilter()
{
	//__cleanup();
}

void
BrandFilter::__init()
{
	//bRAND = new CatalogsProductGroupMultipleStringCriteria();
}

void
BrandFilter::__cleanup()
{
	//if(bRAND != NULL) {
	//
	//delete bRAND;
	//bRAND = NULL;
	//}
	//
}

void
BrandFilter::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *bRANDKey = "BRAND";
	node = json_object_get_member(pJsonObject, bRANDKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsProductGroupMultipleStringCriteria")) {
			jsonToValue(&bRAND, node, "CatalogsProductGroupMultipleStringCriteria", "");
		} else {
			
			CatalogsProductGroupMultipleStringCriteria* obj = static_cast<CatalogsProductGroupMultipleStringCriteria*> (&bRAND);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

BrandFilter::BrandFilter(char* json)
{
	this->fromJson(json);
}

char*
BrandFilter::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CatalogsProductGroupMultipleStringCriteria")) {
		CatalogsProductGroupMultipleStringCriteria obj = getBRAND();
		node = converttoJson(&obj, "CatalogsProductGroupMultipleStringCriteria", "");
	}
	else {
		
		CatalogsProductGroupMultipleStringCriteria obj = static_cast<CatalogsProductGroupMultipleStringCriteria> (getBRAND());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *bRANDKey = "BRAND";
	json_object_set_member(pJsonObject, bRANDKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

CatalogsProductGroupMultipleStringCriteria
BrandFilter::getBRAND()
{
	return bRAND;
}

void
BrandFilter::setBRAND(CatalogsProductGroupMultipleStringCriteria  bRAND)
{
	this->bRAND = bRAND;
}


