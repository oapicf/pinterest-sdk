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
	//country = new Country();
	//created_time = int(0);
	//currency = new Currency();
	//id = std::string();
	//name = std::string();
	//owner = null;
	//new std::list()std::list> permissions;
	//updated_time = int(0);
}

void
AdAccount::__cleanup()
{
	//if(country != NULL) {
	//
	//delete country;
	//country = NULL;
	//}
	//if(created_time != NULL) {
	//
	//delete created_time;
	//created_time = NULL;
	//}
	//if(currency != NULL) {
	//
	//delete currency;
	//currency = NULL;
	//}
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
	//if(permissions != NULL) {
	//permissions.RemoveAll(true);
	//delete permissions;
	//permissions = NULL;
	//}
	//if(updated_time != NULL) {
	//
	//delete updated_time;
	//updated_time = NULL;
	//}
	//
}

void
AdAccount::fromJson(char* jsonStr)
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
	const gchar *created_timeKey = "created_time";
	node = json_object_get_member(pJsonObject, created_timeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&created_time, node, "int", "");
		} else {
			
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
	

		if (isprimitive("AdAccountOwner")) {
			jsonToValue(&owner, node, "AdAccountOwner", "AdAccountOwner");
		} else {
			
			AdAccountOwner* obj = static_cast<AdAccountOwner*> (&owner);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *permissionsKey = "permissions";
	node = json_object_get_member(pJsonObject, permissionsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<BusinessAccessRole> new_list;
			BusinessAccessRole inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("BusinessAccessRole")) {
					jsonToValue(&inst, temp_json, "BusinessAccessRole", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			permissions = new_list;
		}
		
	}
	const gchar *updated_timeKey = "updated_time";
	node = json_object_get_member(pJsonObject, updated_timeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&updated_time, node, "int", "");
		} else {
			
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
	if (isprimitive("int")) {
		int obj = getCreatedTime();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *created_timeKey = "created_time";
	json_object_set_member(pJsonObject, created_timeKey, node);
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
	if (isprimitive("AdAccountOwner")) {
		AdAccountOwner obj = getOwner();
		node = converttoJson(&obj, "AdAccountOwner", "");
	}
	else {
		
		AdAccountOwner obj = static_cast<AdAccountOwner> (getOwner());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *ownerKey = "owner";
	json_object_set_member(pJsonObject, ownerKey, node);
	if (isprimitive("BusinessAccessRole")) {
		list<BusinessAccessRole> new_list = static_cast<list <BusinessAccessRole> > (getPermissions());
		node = converttoJson(&new_list, "BusinessAccessRole", "array");
	} else {
		node = json_node_alloc();
		list<BusinessAccessRole> new_list = static_cast<list <BusinessAccessRole> > (getPermissions());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<BusinessAccessRole>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			BusinessAccessRole obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *permissionsKey = "permissions";
	json_object_set_member(pJsonObject, permissionsKey, node);
	if (isprimitive("int")) {
		int obj = getUpdatedTime();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *updated_timeKey = "updated_time";
	json_object_set_member(pJsonObject, updated_timeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
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

int
AdAccount::getCreatedTime()
{
	return created_time;
}

void
AdAccount::setCreatedTime(int  created_time)
{
	this->created_time = created_time;
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

AdAccountOwner
AdAccount::getOwner()
{
	return owner;
}

void
AdAccount::setOwner(AdAccountOwner  owner)
{
	this->owner = owner;
}

std::list<BusinessAccessRole>
AdAccount::getPermissions()
{
	return permissions;
}

void
AdAccount::setPermissions(std::list <BusinessAccessRole> permissions)
{
	this->permissions = permissions;
}

int
AdAccount::getUpdatedTime()
{
	return updated_time;
}

void
AdAccount::setUpdatedTime(int  updated_time)
{
	this->updated_time = updated_time;
}


