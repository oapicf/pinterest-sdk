#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "MinPriceFilter.h"

using namespace std;
using namespace Tizen::ArtikCloud;

MinPriceFilter::MinPriceFilter()
{
	//__init();
}

MinPriceFilter::~MinPriceFilter()
{
	//__cleanup();
}

void
MinPriceFilter::__init()
{
	//mIN_PRICE = new CatalogsProductGroupPricingCriteria();
}

void
MinPriceFilter::__cleanup()
{
	//if(mIN_PRICE != NULL) {
	//
	//delete mIN_PRICE;
	//mIN_PRICE = NULL;
	//}
	//
}

void
MinPriceFilter::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *mIN_PRICEKey = "MIN_PRICE";
	node = json_object_get_member(pJsonObject, mIN_PRICEKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsProductGroupPricingCriteria")) {
			jsonToValue(&mIN_PRICE, node, "CatalogsProductGroupPricingCriteria", "");
		} else {
			
			CatalogsProductGroupPricingCriteria* obj = static_cast<CatalogsProductGroupPricingCriteria*> (&mIN_PRICE);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

MinPriceFilter::MinPriceFilter(char* json)
{
	this->fromJson(json);
}

char*
MinPriceFilter::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CatalogsProductGroupPricingCriteria")) {
		CatalogsProductGroupPricingCriteria obj = getMINPRICE();
		node = converttoJson(&obj, "CatalogsProductGroupPricingCriteria", "");
	}
	else {
		
		CatalogsProductGroupPricingCriteria obj = static_cast<CatalogsProductGroupPricingCriteria> (getMINPRICE());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *mIN_PRICEKey = "MIN_PRICE";
	json_object_set_member(pJsonObject, mIN_PRICEKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

CatalogsProductGroupPricingCriteria
MinPriceFilter::getMINPRICE()
{
	return mIN_PRICE;
}

void
MinPriceFilter::setMINPRICE(CatalogsProductGroupPricingCriteria  mIN_PRICE)
{
	this->mIN_PRICE = mIN_PRICE;
}


