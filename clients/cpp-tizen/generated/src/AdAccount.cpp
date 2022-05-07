#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdAccount.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdAccount::AdAccount()
{
	//__init();
}

AdAccount::~AdAccount()
{
	//__cleanup();
}

void
AdAccount::__init()
{
	//id = std::string();
	//name = std::string();
	//owner = new Ad_account_owner();
	//country = new Country();
	//currency = new Currency();
}

void
AdAccount::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(owner != NULL) {
	//
	//delete owner;
	//owner = NULL;
	//}
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
	//
}

void
AdAccount::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
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
	const gchar *ownerKey = "owner";
	node = json_object_get_member(pJsonObject, ownerKey);
	if (node !=NULL) {
	

		if (isprimitive("Ad_account_owner")) {
			jsonToValue(&owner, node, "Ad_account_owner", "Ad_account_owner");
		} else {
			
			Ad_account_owner* obj = static_cast<Ad_account_owner*> (&owner);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
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
}

AdAccount::AdAccount(char* json)
{
	this->fromJson(json);
}

char*
AdAccount::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("Ad_account_owner")) {
		Ad_account_owner obj = getOwner();
		node = converttoJson(&obj, "Ad_account_owner", "");
	}
	else {
		
		Ad_account_owner obj = static_cast<Ad_account_owner> (getOwner());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *ownerKey = "owner";
	json_object_set_member(pJsonObject, ownerKey, node);
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
AdAccount::getId()
{
	return id;
}

void
AdAccount::setId(std::string  id)
{
	this->id = id;
}

std::string
AdAccount::getName()
{
	return name;
}

void
AdAccount::setName(std::string  name)
{
	this->name = name;
}

Ad_account_owner
AdAccount::getOwner()
{
	return owner;
}

void
AdAccount::setOwner(Ad_account_owner  owner)
{
	this->owner = owner;
}

Country
AdAccount::getCountry()
{
	return country;
}

void
AdAccount::setCountry(Country  country)
{
	this->country = country;
}

Currency
AdAccount::getCurrency()
{
	return currency;
}

void
AdAccount::setCurrency(Currency  currency)
{
	this->currency = currency;
}


