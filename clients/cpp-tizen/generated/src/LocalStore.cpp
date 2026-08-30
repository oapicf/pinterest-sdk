#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "LocalStore.h"

using namespace std;
using namespace Tizen::ArtikCloud;

LocalStore::LocalStore()
{
	//__init();
}

LocalStore::~LocalStore()
{
	//__cleanup();
}

void
LocalStore::__init()
{
	//address_primary = std::string();
	//address_secondary = std::string();
	//city = std::string();
	//country = null;
	//created_at = null;
	//id = std::string();
	//latitude = float(0);
	//longitude = float(0);
	//name = std::string();
	//postal_code = std::string();
	//region = std::string();
	//store_code = std::string();
	//updated_at = null;
}

void
LocalStore::__cleanup()
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
	//if(created_at != NULL) {
	//
	//delete created_at;
	//created_at = NULL;
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
	//if(updated_at != NULL) {
	//
	//delete updated_at;
	//updated_at = NULL;
	//}
	//
}

void
LocalStore::fromJson(char* jsonStr)
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
	const gchar *created_atKey = "created_at";
	node = json_object_get_member(pJsonObject, created_atKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&created_at, node, "std::string", "");
		} else {
			
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
	const gchar *updated_atKey = "updated_at";
	node = json_object_get_member(pJsonObject, updated_atKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&updated_at, node, "std::string", "");
		} else {
			
		}
	}
}

LocalStore::LocalStore(char* json)
{
	this->fromJson(json);
}

char*
LocalStore::toJson()
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
		std::string obj = getCreatedAt();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *created_atKey = "created_at";
	json_object_set_member(pJsonObject, created_atKey, node);
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
	if (isprimitive("std::string")) {
		std::string obj = getUpdatedAt();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *updated_atKey = "updated_at";
	json_object_set_member(pJsonObject, updated_atKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
LocalStore::getAddressPrimary()
{
	return address_primary;
}

void
LocalStore::setAddressPrimary(std::string  address_primary)
{
	this->address_primary = address_primary;
}

std::string
LocalStore::getAddressSecondary()
{
	return address_secondary;
}

void
LocalStore::setAddressSecondary(std::string  address_secondary)
{
	this->address_secondary = address_secondary;
}

std::string
LocalStore::getCity()
{
	return city;
}

void
LocalStore::setCity(std::string  city)
{
	this->city = city;
}

Country
LocalStore::getCountry()
{
	return country;
}

void
LocalStore::setCountry(Country  country)
{
	this->country = country;
}

std::string
LocalStore::getCreatedAt()
{
	return created_at;
}

void
LocalStore::setCreatedAt(std::string  created_at)
{
	this->created_at = created_at;
}

std::string
LocalStore::getId()
{
	return id;
}

void
LocalStore::setId(std::string  id)
{
	this->id = id;
}

float
LocalStore::getLatitude()
{
	return latitude;
}

void
LocalStore::setLatitude(float  latitude)
{
	this->latitude = latitude;
}

float
LocalStore::getLongitude()
{
	return longitude;
}

void
LocalStore::setLongitude(float  longitude)
{
	this->longitude = longitude;
}

std::string
LocalStore::getName()
{
	return name;
}

void
LocalStore::setName(std::string  name)
{
	this->name = name;
}

std::string
LocalStore::getPostalCode()
{
	return postal_code;
}

void
LocalStore::setPostalCode(std::string  postal_code)
{
	this->postal_code = postal_code;
}

std::string
LocalStore::getRegion()
{
	return region;
}

void
LocalStore::setRegion(std::string  region)
{
	this->region = region;
}

std::string
LocalStore::getStoreCode()
{
	return store_code;
}

void
LocalStore::setStoreCode(std::string  store_code)
{
	this->store_code = store_code;
}

std::string
LocalStore::getUpdatedAt()
{
	return updated_at;
}

void
LocalStore::setUpdatedAt(std::string  updated_at)
{
	this->updated_at = updated_at;
}


