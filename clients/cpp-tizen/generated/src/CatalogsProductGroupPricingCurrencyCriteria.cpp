#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Catalogs_product_group_pricing_currency_criteria.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Catalogs_product_group_pricing_currency_criteria::Catalogs_product_group_pricing_currency_criteria()
{
	//__init();
}

Catalogs_product_group_pricing_currency_criteria::~Catalogs_product_group_pricing_currency_criteria()
{
	//__cleanup();
}

void
Catalogs_product_group_pricing_currency_criteria::__init()
{
	//r_operator = std::string();
	//value = double(0);
	//currency = new NonNullableCatalogsCurrency();
	//negated = bool(false);
}

void
Catalogs_product_group_pricing_currency_criteria::__cleanup()
{
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
	//
}

void
Catalogs_product_group_pricing_currency_criteria::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *r_operatorKey = "operator";
	node = json_object_get_member(pJsonObject, r_operatorKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&r_operator, node, "std::string", "");
		} else {
			
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
}

Catalogs_product_group_pricing_currency_criteria::Catalogs_product_group_pricing_currency_criteria(char* json)
{
	this->fromJson(json);
}

char*
Catalogs_product_group_pricing_currency_criteria::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getROperator();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
Catalogs_product_group_pricing_currency_criteria::getROperator()
{
	return r_operator;
}

void
Catalogs_product_group_pricing_currency_criteria::setROperator(std::string  r_operator)
{
	this->r_operator = r_operator;
}

long long
Catalogs_product_group_pricing_currency_criteria::getValue()
{
	return value;
}

void
Catalogs_product_group_pricing_currency_criteria::setValue(long long  value)
{
	this->value = value;
}

NonNullableCatalogsCurrency
Catalogs_product_group_pricing_currency_criteria::getCurrency()
{
	return currency;
}

void
Catalogs_product_group_pricing_currency_criteria::setCurrency(NonNullableCatalogsCurrency  currency)
{
	this->currency = currency;
}

bool
Catalogs_product_group_pricing_currency_criteria::getNegated()
{
	return negated;
}

void
Catalogs_product_group_pricing_currency_criteria::setNegated(bool  negated)
{
	this->negated = negated;
}


