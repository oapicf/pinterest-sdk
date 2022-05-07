#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "MaxPriceFilter.h"

using namespace std;
using namespace Tizen::ArtikCloud;

MaxPriceFilter::MaxPriceFilter()
{
	//__init();
}

MaxPriceFilter::~MaxPriceFilter()
{
	//__cleanup();
}

void
MaxPriceFilter::__init()
{
	//mAX_PRICE = new CatalogsProductGroupPricingCriteria();
}

void
MaxPriceFilter::__cleanup()
{
	//if(mAX_PRICE != NULL) {
	//
	//delete mAX_PRICE;
	//mAX_PRICE = NULL;
	//}
	//
}

void
MaxPriceFilter::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *mAX_PRICEKey = "MAX_PRICE";
	node = json_object_get_member(pJsonObject, mAX_PRICEKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsProductGroupPricingCriteria")) {
			jsonToValue(&mAX_PRICE, node, "CatalogsProductGroupPricingCriteria", "");
		} else {
			
			CatalogsProductGroupPricingCriteria* obj = static_cast<CatalogsProductGroupPricingCriteria*> (&mAX_PRICE);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

MaxPriceFilter::MaxPriceFilter(char* json)
{
	this->fromJson(json);
}

char*
MaxPriceFilter::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CatalogsProductGroupPricingCriteria")) {
		CatalogsProductGroupPricingCriteria obj = getMAXPRICE();
		node = converttoJson(&obj, "CatalogsProductGroupPricingCriteria", "");
	}
	else {
		
		CatalogsProductGroupPricingCriteria obj = static_cast<CatalogsProductGroupPricingCriteria> (getMAXPRICE());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *mAX_PRICEKey = "MAX_PRICE";
	json_object_set_member(pJsonObject, mAX_PRICEKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

CatalogsProductGroupPricingCriteria
MaxPriceFilter::getMAXPRICE()
{
	return mAX_PRICE;
}

void
MaxPriceFilter::setMAXPRICE(CatalogsProductGroupPricingCriteria  mAX_PRICE)
{
	this->mAX_PRICE = mAX_PRICE;
}


