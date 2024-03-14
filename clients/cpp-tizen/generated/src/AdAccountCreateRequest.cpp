#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdAccountCreateRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdAccountCreateRequest::AdAccountCreateRequest()
{
	//__init();
}

AdAccountCreateRequest::~AdAccountCreateRequest()
{
	//__cleanup();
}

void
AdAccountCreateRequest::__init()
{
	//country = new Country();
	//name = std::string();
	//owner_user_id = std::string();
}

void
AdAccountCreateRequest::__cleanup()
{
	//if(country != NULL) {
	//
	//delete country;
	//country = NULL;
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
	//
}

void
AdAccountCreateRequest::fromJson(char* jsonStr)
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
}

AdAccountCreateRequest::AdAccountCreateRequest(char* json)
{
	this->fromJson(json);
}

char*
AdAccountCreateRequest::toJson()
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

Country
AdAccountCreateRequest::getCountry()
{
	return country;
}

void
AdAccountCreateRequest::setCountry(Country  country)
{
	this->country = country;
}

std::string
AdAccountCreateRequest::getName()
{
	return name;
}

void
AdAccountCreateRequest::setName(std::string  name)
{
	this->name = name;
}

std::string
AdAccountCreateRequest::getOwnerUserId()
{
	return owner_user_id;
}

void
AdAccountCreateRequest::setOwnerUserId(std::string  owner_user_id)
{
	this->owner_user_id = owner_user_id;
}


