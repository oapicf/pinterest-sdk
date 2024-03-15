#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PriceFilter.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PriceFilter::PriceFilter()
{
	//__init();
}

PriceFilter::~PriceFilter()
{
	//__cleanup();
}

void
PriceFilter::__init()
{
	//pRICE = new Catalogs_product_group_pricing_currency_criteria();
}

void
PriceFilter::__cleanup()
{
	//if(pRICE != NULL) {
	//
	//delete pRICE;
	//pRICE = NULL;
	//}
	//
}

void
PriceFilter::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *pRICEKey = "PRICE";
	node = json_object_get_member(pJsonObject, pRICEKey);
	if (node !=NULL) {
	

		if (isprimitive("Catalogs_product_group_pricing_currency_criteria")) {
			jsonToValue(&pRICE, node, "Catalogs_product_group_pricing_currency_criteria", "Catalogs_product_group_pricing_currency_criteria");
		} else {
			
			Catalogs_product_group_pricing_currency_criteria* obj = static_cast<Catalogs_product_group_pricing_currency_criteria*> (&pRICE);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

PriceFilter::PriceFilter(char* json)
{
	this->fromJson(json);
}

char*
PriceFilter::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("Catalogs_product_group_pricing_currency_criteria")) {
		Catalogs_product_group_pricing_currency_criteria obj = getPRICE();
		node = converttoJson(&obj, "Catalogs_product_group_pricing_currency_criteria", "");
	}
	else {
		
		Catalogs_product_group_pricing_currency_criteria obj = static_cast<Catalogs_product_group_pricing_currency_criteria> (getPRICE());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pRICEKey = "PRICE";
	json_object_set_member(pJsonObject, pRICEKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

Catalogs_product_group_pricing_currency_criteria
PriceFilter::getPRICE()
{
	return pRICE;
}

void
PriceFilter::setPRICE(Catalogs_product_group_pricing_currency_criteria  pRICE)
{
	this->pRICE = pRICE;
}


