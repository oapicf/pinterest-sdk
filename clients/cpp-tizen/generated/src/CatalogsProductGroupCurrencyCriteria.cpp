#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsProductGroupCurrencyCriteria.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsProductGroupCurrencyCriteria::CatalogsProductGroupCurrencyCriteria()
{
	//__init();
}

CatalogsProductGroupCurrencyCriteria::~CatalogsProductGroupCurrencyCriteria()
{
	//__cleanup();
}

void
CatalogsProductGroupCurrencyCriteria::__init()
{
	//values = new NonNullableCatalogsCurrency();
	//negated = bool(false);
}

void
CatalogsProductGroupCurrencyCriteria::__cleanup()
{
	//if(values != NULL) {
	//
	//delete values;
	//values = NULL;
	//}
	//if(negated != NULL) {
	//
	//delete negated;
	//negated = NULL;
	//}
	//
}

void
CatalogsProductGroupCurrencyCriteria::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *valuesKey = "values";
	node = json_object_get_member(pJsonObject, valuesKey);
	if (node !=NULL) {
	

		if (isprimitive("NonNullableCatalogsCurrency")) {
			jsonToValue(&values, node, "NonNullableCatalogsCurrency", "NonNullableCatalogsCurrency");
		} else {
			
			NonNullableCatalogsCurrency* obj = static_cast<NonNullableCatalogsCurrency*> (&values);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *negatedKey = "negated";
	node = json_object_get_member(pJsonObject, negatedKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&negated, node, "bool", "");
		} else {
			
		}
	}
}

CatalogsProductGroupCurrencyCriteria::CatalogsProductGroupCurrencyCriteria(char* json)
{
	this->fromJson(json);
}

char*
CatalogsProductGroupCurrencyCriteria::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("NonNullableCatalogsCurrency")) {
		NonNullableCatalogsCurrency obj = getValues();
		node = converttoJson(&obj, "NonNullableCatalogsCurrency", "");
	}
	else {
		
		NonNullableCatalogsCurrency obj = static_cast<NonNullableCatalogsCurrency> (getValues());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *valuesKey = "values";
	json_object_set_member(pJsonObject, valuesKey, node);
	if (isprimitive("bool")) {
		bool obj = getNegated();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *negatedKey = "negated";
	json_object_set_member(pJsonObject, negatedKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

NonNullableCatalogsCurrency
CatalogsProductGroupCurrencyCriteria::getValues()
{
	return values;
}

void
CatalogsProductGroupCurrencyCriteria::setValues(NonNullableCatalogsCurrency  values)
{
	this->values = values;
}

bool
CatalogsProductGroupCurrencyCriteria::getNegated()
{
	return negated;
}

void
CatalogsProductGroupCurrencyCriteria::setNegated(bool  negated)
{
	this->negated = negated;
}


