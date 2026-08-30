#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdAccountsCountry.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdAccountsCountry::AdAccountsCountry()
{
	//__init();
}

AdAccountsCountry::~AdAccountsCountry()
{
	//__cleanup();
}

void
AdAccountsCountry::__init()
{
	//code = null;
	//currency = std::string();
	//index = double(0);
	//name = std::string();
}

void
AdAccountsCountry::__cleanup()
{
	//if(code != NULL) {
	//
	//delete code;
	//code = NULL;
	//}
	//if(currency != NULL) {
	//
	//delete currency;
	//currency = NULL;
	//}
	//if(index != NULL) {
	//
	//delete index;
	//index = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//
}

void
AdAccountsCountry::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *codeKey = "code";
	node = json_object_get_member(pJsonObject, codeKey);
	if (node !=NULL) {
	

		if (isprimitive("Country")) {
			jsonToValue(&code, node, "Country", "Country");
		} else {
			
			Country* obj = static_cast<Country*> (&code);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *currencyKey = "currency";
	node = json_object_get_member(pJsonObject, currencyKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&currency, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *indexKey = "index";
	node = json_object_get_member(pJsonObject, indexKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&index, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&index);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
}

AdAccountsCountry::AdAccountsCountry(char* json)
{
	this->fromJson(json);
}

char*
AdAccountsCountry::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("Country")) {
		Country obj = getCode();
		node = converttoJson(&obj, "Country", "");
	}
	else {
		
		Country obj = static_cast<Country> (getCode());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *codeKey = "code";
	json_object_set_member(pJsonObject, codeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCurrency();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *currencyKey = "currency";
	json_object_set_member(pJsonObject, currencyKey, node);
	if (isprimitive("long long")) {
		long long obj = getIndex();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getIndex());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *indexKey = "index";
	json_object_set_member(pJsonObject, indexKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

Country
AdAccountsCountry::getCode()
{
	return code;
}

void
AdAccountsCountry::setCode(Country  code)
{
	this->code = code;
}

std::string
AdAccountsCountry::getCurrency()
{
	return currency;
}

void
AdAccountsCountry::setCurrency(std::string  currency)
{
	this->currency = currency;
}

long long
AdAccountsCountry::getIndex()
{
	return index;
}

void
AdAccountsCountry::setIndex(long long  index)
{
	this->index = index;
}

std::string
AdAccountsCountry::getName()
{
	return name;
}

void
AdAccountsCountry::setName(std::string  name)
{
	this->name = name;
}


