#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CurrencyFilter.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CurrencyFilter::CurrencyFilter()
{
	//__init();
}

CurrencyFilter::~CurrencyFilter()
{
	//__cleanup();
}

void
CurrencyFilter::__init()
{
	//cURRENCY = new CatalogsProductGroupCurrencyCriteria();
}

void
CurrencyFilter::__cleanup()
{
	//if(cURRENCY != NULL) {
	//
	//delete cURRENCY;
	//cURRENCY = NULL;
	//}
	//
}

void
CurrencyFilter::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cURRENCYKey = "CURRENCY";
	node = json_object_get_member(pJsonObject, cURRENCYKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsProductGroupCurrencyCriteria")) {
			jsonToValue(&cURRENCY, node, "CatalogsProductGroupCurrencyCriteria", "");
		} else {
			
			CatalogsProductGroupCurrencyCriteria* obj = static_cast<CatalogsProductGroupCurrencyCriteria*> (&cURRENCY);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CurrencyFilter::CurrencyFilter(char* json)
{
	this->fromJson(json);
}

char*
CurrencyFilter::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CatalogsProductGroupCurrencyCriteria")) {
		CatalogsProductGroupCurrencyCriteria obj = getCURRENCY();
		node = converttoJson(&obj, "CatalogsProductGroupCurrencyCriteria", "");
	}
	else {
		
		CatalogsProductGroupCurrencyCriteria obj = static_cast<CatalogsProductGroupCurrencyCriteria> (getCURRENCY());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cURRENCYKey = "CURRENCY";
	json_object_set_member(pJsonObject, cURRENCYKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

CatalogsProductGroupCurrencyCriteria
CurrencyFilter::getCURRENCY()
{
	return cURRENCY;
}

void
CurrencyFilter::setCURRENCY(CatalogsProductGroupCurrencyCriteria  cURRENCY)
{
	this->cURRENCY = cURRENCY;
}


