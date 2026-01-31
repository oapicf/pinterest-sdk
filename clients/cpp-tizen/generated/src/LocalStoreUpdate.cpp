#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "LocalStoreUpdate.h"

using namespace std;
using namespace Tizen::ArtikCloud;

LocalStoreUpdate::LocalStoreUpdate()
{
	//__init();
}

LocalStoreUpdate::~LocalStoreUpdate()
{
	//__cleanup();
}

void
LocalStoreUpdate::__init()
{
	//address_primary = std::string();
	//address_secondary = std::string();
	//city = std::string();
	//country = null;
	//id = std::string();
	//latitude = float(0);
	//longitude = float(0);
	//name = std::string();
	//postal_code = std::string();
	//region = std::string();
	//store_code = std::string();
}

void
LocalStoreUpdate::__cleanup()
{
	//if(address_primary != NULL) {
	//
	//delete address_primary;
	//address_primary = NULL;
	//}
	//if(address_secondary != NULL) {
	//
	//delete address_secondary;
	//address_secondary = NULL;
	//}
	//if(city != NULL) {
	//
	//delete city;
	//city = NULL;
	//}
	//if(country != NULL) {
	//
	//delete country;
	//country = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(latitude != NULL) {
	//
	//delete latitude;
	//latitude = NULL;
	//}
	//if(longitude != NULL) {
	//
	//delete longitude;
	//longitude = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(postal_code != NULL) {
	//
	//delete postal_code;
	//postal_code = NULL;
	//}
	//if(region != NULL) {
	//
	//delete region;
	//region = NULL;
	//}
	//if(store_code != NULL) {
	//
	//delete store_code;
	//store_code = NULL;
	//}
	//
}

void
LocalStoreUpdate::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *address_primaryKey = "address_primary";
	node = json_object_get_member(pJsonObject, address_primaryKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&address_primary, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *address_secondaryKey = "address_secondary";
	node = json_object_get_member(pJsonObject, address_secondaryKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&address_secondary, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *cityKey = "city";
	node = json_object_get_member(pJsonObject, cityKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&city, node, "std::string", "");
		} else {
			
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
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *latitudeKey = "latitude";
	node = json_object_get_member(pJsonObject, latitudeKey);
	if (node !=NULL) {
	

		if (isprimitive("float")) {
			jsonToValue(&latitude, node, "float", "");
		} else {
			
		}
	}
	const gchar *longitudeKey = "longitude";
	node = json_object_get_member(pJsonObject, longitudeKey);
	if (node !=NULL) {
	

		if (isprimitive("float")) {
			jsonToValue(&longitude, node, "float", "");
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
	const gchar *postal_codeKey = "postal_code";
	node = json_object_get_member(pJsonObject, postal_codeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&postal_code, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *regionKey = "region";
	node = json_object_get_member(pJsonObject, regionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&region, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *store_codeKey = "store_code";
	node = json_object_get_member(pJsonObject, store_codeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&store_code, node, "std::string", "");
		} else {
			
		}
	}
}

LocalStoreUpdate::LocalStoreUpdate(char* json)
{
	this->fromJson(json);
}

char*
LocalStoreUpdate::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getAddressPrimary();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *address_primaryKey = "address_primary";
	json_object_set_member(pJsonObject, address_primaryKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getAddressSecondary();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *address_secondaryKey = "address_secondary";
	json_object_set_member(pJsonObject, address_secondaryKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCity();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *cityKey = "city";
	json_object_set_member(pJsonObject, cityKey, node);
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
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("float")) {
		float obj = getLatitude();
		node = converttoJson(&obj, "float", "");
	}
	else {
		
	}
	const gchar *latitudeKey = "latitude";
	json_object_set_member(pJsonObject, latitudeKey, node);
	if (isprimitive("float")) {
		float obj = getLongitude();
		node = converttoJson(&obj, "float", "");
	}
	else {
		
	}
	const gchar *longitudeKey = "longitude";
	json_object_set_member(pJsonObject, longitudeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPostalCode();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *postal_codeKey = "postal_code";
	json_object_set_member(pJsonObject, postal_codeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getRegion();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *regionKey = "region";
	json_object_set_member(pJsonObject, regionKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getStoreCode();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *store_codeKey = "store_code";
	json_object_set_member(pJsonObject, store_codeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
LocalStoreUpdate::getAddressPrimary()
{
	return address_primary;
}

void
LocalStoreUpdate::setAddressPrimary(std::string  address_primary)
{
	this->address_primary = address_primary;
}

std::string
LocalStoreUpdate::getAddressSecondary()
{
	return address_secondary;
}

void
LocalStoreUpdate::setAddressSecondary(std::string  address_secondary)
{
	this->address_secondary = address_secondary;
}

std::string
LocalStoreUpdate::getCity()
{
	return city;
}

void
LocalStoreUpdate::setCity(std::string  city)
{
	this->city = city;
}

Country
LocalStoreUpdate::getCountry()
{
	return country;
}

void
LocalStoreUpdate::setCountry(Country  country)
{
	this->country = country;
}

std::string
LocalStoreUpdate::getId()
{
	return id;
}

void
LocalStoreUpdate::setId(std::string  id)
{
	this->id = id;
}

float
LocalStoreUpdate::getLatitude()
{
	return latitude;
}

void
LocalStoreUpdate::setLatitude(float  latitude)
{
	this->latitude = latitude;
}

float
LocalStoreUpdate::getLongitude()
{
	return longitude;
}

void
LocalStoreUpdate::setLongitude(float  longitude)
{
	this->longitude = longitude;
}

std::string
LocalStoreUpdate::getName()
{
	return name;
}

void
LocalStoreUpdate::setName(std::string  name)
{
	this->name = name;
}

std::string
LocalStoreUpdate::getPostalCode()
{
	return postal_code;
}

void
LocalStoreUpdate::setPostalCode(std::string  postal_code)
{
	this->postal_code = postal_code;
}

std::string
LocalStoreUpdate::getRegion()
{
	return region;
}

void
LocalStoreUpdate::setRegion(std::string  region)
{
	this->region = region;
}

std::string
LocalStoreUpdate::getStoreCode()
{
	return store_code;
}

void
LocalStoreUpdate::setStoreCode(std::string  store_code)
{
	this->store_code = store_code;
}


