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
	//pRICE = new PriceFilterPrice();
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
	

		if (isprimitive("PriceFilterPrice")) {
			jsonToValue(&pRICE, node, "PriceFilterPrice", "PriceFilterPrice");
		} else {
			
			PriceFilterPrice* obj = static_cast<PriceFilterPrice*> (&pRICE);
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
	if (isprimitive("PriceFilterPrice")) {
		PriceFilterPrice obj = getPRICE();
		node = converttoJson(&obj, "PriceFilterPrice", "");
	}
	else {
		
		PriceFilterPrice obj = static_cast<PriceFilterPrice> (getPRICE());
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

PriceFilterPrice
PriceFilter::getPRICE()
{
	return pRICE;
}

void
PriceFilter::setPRICE(PriceFilterPrice  pRICE)
{
	this->pRICE = pRICE;
}


