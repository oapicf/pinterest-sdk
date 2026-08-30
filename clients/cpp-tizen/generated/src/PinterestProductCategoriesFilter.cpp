#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PinterestProductCategoriesFilter.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PinterestProductCategoriesFilter::PinterestProductCategoriesFilter()
{
	//__init();
}

PinterestProductCategoriesFilter::~PinterestProductCategoriesFilter()
{
	//__cleanup();
}

void
PinterestProductCategoriesFilter::__init()
{
	//pINTEREST_PRODUCT_CATEGORIES = new CatalogsProductGroupMultiplePinterestProductCategoryCriteria();
}

void
PinterestProductCategoriesFilter::__cleanup()
{
	//if(pINTEREST_PRODUCT_CATEGORIES != NULL) {
	//
	//delete pINTEREST_PRODUCT_CATEGORIES;
	//pINTEREST_PRODUCT_CATEGORIES = NULL;
	//}
	//
}

void
PinterestProductCategoriesFilter::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *pINTEREST_PRODUCT_CATEGORIESKey = "PINTEREST_PRODUCT_CATEGORIES";
	node = json_object_get_member(pJsonObject, pINTEREST_PRODUCT_CATEGORIESKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsProductGroupMultiplePinterestProductCategoryCriteria")) {
			jsonToValue(&pINTEREST_PRODUCT_CATEGORIES, node, "CatalogsProductGroupMultiplePinterestProductCategoryCriteria", "CatalogsProductGroupMultiplePinterestProductCategoryCriteria");
		} else {
			
			CatalogsProductGroupMultiplePinterestProductCategoryCriteria* obj = static_cast<CatalogsProductGroupMultiplePinterestProductCategoryCriteria*> (&pINTEREST_PRODUCT_CATEGORIES);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

PinterestProductCategoriesFilter::PinterestProductCategoriesFilter(char* json)
{
	this->fromJson(json);
}

char*
PinterestProductCategoriesFilter::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CatalogsProductGroupMultiplePinterestProductCategoryCriteria")) {
		CatalogsProductGroupMultiplePinterestProductCategoryCriteria obj = getPINTERESTPRODUCTCATEGORIES();
		node = converttoJson(&obj, "CatalogsProductGroupMultiplePinterestProductCategoryCriteria", "");
	}
	else {
		
		CatalogsProductGroupMultiplePinterestProductCategoryCriteria obj = static_cast<CatalogsProductGroupMultiplePinterestProductCategoryCriteria> (getPINTERESTPRODUCTCATEGORIES());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pINTEREST_PRODUCT_CATEGORIESKey = "PINTEREST_PRODUCT_CATEGORIES";
	json_object_set_member(pJsonObject, pINTEREST_PRODUCT_CATEGORIESKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

CatalogsProductGroupMultiplePinterestProductCategoryCriteria
PinterestProductCategoriesFilter::getPINTERESTPRODUCTCATEGORIES()
{
	return pINTEREST_PRODUCT_CATEGORIES;
}

void
PinterestProductCategoriesFilter::setPINTERESTPRODUCTCATEGORIES(CatalogsProductGroupMultiplePinterestProductCategoryCriteria  pINTEREST_PRODUCT_CATEGORIES)
{
	this->pINTEREST_PRODUCT_CATEGORIES = pINTEREST_PRODUCT_CATEGORIES;
}


