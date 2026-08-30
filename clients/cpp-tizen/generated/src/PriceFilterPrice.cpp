#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PriceFilterPrice.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PriceFilterPrice::PriceFilterPrice()
{
	//__init();
}

PriceFilterPrice::~PriceFilterPrice()
{
	//__cleanup();
}

void
PriceFilterPrice::__init()
{
	//currency = new NonNullableCatalogsCurrency();
	//negated = bool(false);
	//r_operator = new NumericFilterOperatorType();
	//value = double(0);
}

void
PriceFilterPrice::__cleanup()
{
	//if(currency != NULL) {
	//
	//delete currency;
	//currency = NULL;
	//}
	//if(negated != NULL) {
	//
	//delete negated;
	//negated = NULL;
	//}
	//if(r_operator != NULL) {
	//
	//delete r_operator;
	//r_operator = NULL;
	//}
	//if(value != NULL) {
	//
	//delete value;
	//value = NULL;
	//}
	//
}

void
PriceFilterPrice::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *currencyKey = "currency";
	node = json_object_get_member(pJsonObject, currencyKey);
	if (node !=NULL) {
	

		if (isprimitive("NonNullableCatalogsCurrency")) {
			jsonToValue(&currency, node, "NonNullableCatalogsCurrency", "NonNullableCatalogsCurrency");
		} else {
			
			NonNullableCatalogsCurrency* obj = static_cast<NonNullableCatalogsCurrency*> (&currency);
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
	const gchar *r_operatorKey = "operator";
	node = json_object_get_member(pJsonObject, r_operatorKey);
	if (node !=NULL) {
	

		if (isprimitive("NumericFilterOperatorType")) {
			jsonToValue(&r_operator, node, "NumericFilterOperatorType", "NumericFilterOperatorType");
		} else {
			
			NumericFilterOperatorType* obj = static_cast<NumericFilterOperatorType*> (&r_operator);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *valueKey = "value";
	node = json_object_get_member(pJsonObject, valueKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&value, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&value);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

PriceFilterPrice::PriceFilterPrice(char* json)
{
	this->fromJson(json);
}

char*
PriceFilterPrice::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("NonNullableCatalogsCurrency")) {
		NonNullableCatalogsCurrency obj = getCurrency();
		node = converttoJson(&obj, "NonNullableCatalogsCurrency", "");
	}
	else {
		
		NonNullableCatalogsCurrency obj = static_cast<NonNullableCatalogsCurrency> (getCurrency());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *currencyKey = "currency";
	json_object_set_member(pJsonObject, currencyKey, node);
	if (isprimitive("bool")) {
		bool obj = getNegated();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *negatedKey = "negated";
	json_object_set_member(pJsonObject, negatedKey, node);
	if (isprimitive("NumericFilterOperatorType")) {
		NumericFilterOperatorType obj = getROperator();
		node = converttoJson(&obj, "NumericFilterOperatorType", "");
	}
	else {
		
		NumericFilterOperatorType obj = static_cast<NumericFilterOperatorType> (getROperator());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *r_operatorKey = "operator";
	json_object_set_member(pJsonObject, r_operatorKey, node);
	if (isprimitive("long long")) {
		long long obj = getValue();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getValue());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *valueKey = "value";
	json_object_set_member(pJsonObject, valueKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

NonNullableCatalogsCurrency
PriceFilterPrice::getCurrency()
{
	return currency;
}

void
PriceFilterPrice::setCurrency(NonNullableCatalogsCurrency  currency)
{
	this->currency = currency;
}

bool
PriceFilterPrice::getNegated()
{
	return negated;
}

void
PriceFilterPrice::setNegated(bool  negated)
{
	this->negated = negated;
}

NumericFilterOperatorType
PriceFilterPrice::getROperator()
{
	return r_operator;
}

void
PriceFilterPrice::setROperator(NumericFilterOperatorType  r_operator)
{
	this->r_operator = r_operator;
}

long long
PriceFilterPrice::getValue()
{
	return value;
}

void
PriceFilterPrice::setValue(long long  value)
{
	this->value = value;
}


