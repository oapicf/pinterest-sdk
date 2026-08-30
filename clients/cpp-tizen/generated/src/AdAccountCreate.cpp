#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdAccountCreate.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdAccountCreate::AdAccountCreate()
{
	//__init();
}

AdAccountCreate::~AdAccountCreate()
{
	//__cleanup();
}

void
AdAccountCreate::__init()
{
	//country = new Country();
	//currency = new Currency();
	//name = std::string();
	//owner_user_id = std::string();
	//time_zone = std::string();
}

void
AdAccountCreate::__cleanup()
{
	//if(country != NULL) {
	//
	//delete country;
	//country = NULL;
	//}
	//if(currency != NULL) {
	//
	//delete currency;
	//currency = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(owner_user_id != NULL) {
	//
	//delete owner_user_id;
	//owner_user_id = NULL;
	//}
	//if(time_zone != NULL) {
	//
	//delete time_zone;
	//time_zone = NULL;
	//}
	//
}

void
AdAccountCreate::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *countryKey = "country";
	node = json_object_get_member(pJsonObject, countryKey);
	if (node !=NULL) {
	

		if (isprimitive("Country")) {
			jsonToValue(&country, node, "Country", "Country");
		} else {
			
			Country* obj = static_cast<Country*> (&country);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *currencyKey = "currency";
	node = json_object_get_member(pJsonObject, currencyKey);
	if (node !=NULL) {
	

		if (isprimitive("Currency")) {
			jsonToValue(&currency, node, "Currency", "Currency");
		} else {
			
			Currency* obj = static_cast<Currency*> (&currency);
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
	const gchar *owner_user_idKey = "owner_user_id";
	node = json_object_get_member(pJsonObject, owner_user_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&owner_user_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *time_zoneKey = "time_zone";
	node = json_object_get_member(pJsonObject, time_zoneKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&time_zone, node, "std::string", "");
		} else {
			
		}
	}
}

AdAccountCreate::AdAccountCreate(char* json)
{
	this->fromJson(json);
}

char*
AdAccountCreate::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("Country")) {
		Country obj = getCountry();
		node = converttoJson(&obj, "Country", "");
	}
	else {
		
		Country obj = static_cast<Country> (getCountry());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *countryKey = "country";
	json_object_set_member(pJsonObject, countryKey, node);
	if (isprimitive("Currency")) {
		Currency obj = getCurrency();
		node = converttoJson(&obj, "Currency", "");
	}
	else {
		
		Currency obj = static_cast<Currency> (getCurrency());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *currencyKey = "currency";
	json_object_set_member(pJsonObject, currencyKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getOwnerUserId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *owner_user_idKey = "owner_user_id";
	json_object_set_member(pJsonObject, owner_user_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getTimeZone();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *time_zoneKey = "time_zone";
	json_object_set_member(pJsonObject, time_zoneKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

Country
AdAccountCreate::getCountry()
{
	return country;
}

void
AdAccountCreate::setCountry(Country  country)
{
	this->country = country;
}

Currency
AdAccountCreate::getCurrency()
{
	return currency;
}

void
AdAccountCreate::setCurrency(Currency  currency)
{
	this->currency = currency;
}

std::string
AdAccountCreate::getName()
{
	return name;
}

void
AdAccountCreate::setName(std::string  name)
{
	this->name = name;
}

std::string
AdAccountCreate::getOwnerUserId()
{
	return owner_user_id;
}

void
AdAccountCreate::setOwnerUserId(std::string  owner_user_id)
{
	this->owner_user_id = owner_user_id;
}

std::string
AdAccountCreate::getTimeZone()
{
	return time_zone;
}

void
AdAccountCreate::setTimeZone(std::string  time_zone)
{
	this->time_zone = time_zone;
}


