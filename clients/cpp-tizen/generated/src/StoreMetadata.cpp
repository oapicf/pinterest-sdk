#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "StoreMetadata.h"

using namespace std;
using namespace Tizen::ArtikCloud;

StoreMetadata::StoreMetadata()
{
	//__init();
}

StoreMetadata::~StoreMetadata()
{
	//__cleanup();
}

void
StoreMetadata::__init()
{
	//geohash = std::string();
	//latitude = double(0);
	//longitude = double(0);
	//store_code = std::string();
	//store_id = std::string();
	//store_name = std::string();
}

void
StoreMetadata::__cleanup()
{
	//if(geohash != NULL) {
	//
	//delete geohash;
	//geohash = NULL;
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
	//if(store_code != NULL) {
	//
	//delete store_code;
	//store_code = NULL;
	//}
	//if(store_id != NULL) {
	//
	//delete store_id;
	//store_id = NULL;
	//}
	//if(store_name != NULL) {
	//
	//delete store_name;
	//store_name = NULL;
	//}
	//
}

void
StoreMetadata::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *geohashKey = "geohash";
	node = json_object_get_member(pJsonObject, geohashKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&geohash, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *latitudeKey = "latitude";
	node = json_object_get_member(pJsonObject, latitudeKey);
	if (node !=NULL) {
	

		if (isprimitive("double")) {
			jsonToValue(&latitude, node, "double", "");
		} else {
			
		}
	}
	const gchar *longitudeKey = "longitude";
	node = json_object_get_member(pJsonObject, longitudeKey);
	if (node !=NULL) {
	

		if (isprimitive("double")) {
			jsonToValue(&longitude, node, "double", "");
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
	const gchar *store_idKey = "store_id";
	node = json_object_get_member(pJsonObject, store_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&store_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *store_nameKey = "store_name";
	node = json_object_get_member(pJsonObject, store_nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&store_name, node, "std::string", "");
		} else {
			
		}
	}
}

StoreMetadata::StoreMetadata(char* json)
{
	this->fromJson(json);
}

char*
StoreMetadata::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getGeohash();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *geohashKey = "geohash";
	json_object_set_member(pJsonObject, geohashKey, node);
	if (isprimitive("double")) {
		double obj = getLatitude();
		node = converttoJson(&obj, "double", "");
	}
	else {
		
	}
	const gchar *latitudeKey = "latitude";
	json_object_set_member(pJsonObject, latitudeKey, node);
	if (isprimitive("double")) {
		double obj = getLongitude();
		node = converttoJson(&obj, "double", "");
	}
	else {
		
	}
	const gchar *longitudeKey = "longitude";
	json_object_set_member(pJsonObject, longitudeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getStoreCode();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *store_codeKey = "store_code";
	json_object_set_member(pJsonObject, store_codeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getStoreId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *store_idKey = "store_id";
	json_object_set_member(pJsonObject, store_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getStoreName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *store_nameKey = "store_name";
	json_object_set_member(pJsonObject, store_nameKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
StoreMetadata::getGeohash()
{
	return geohash;
}

void
StoreMetadata::setGeohash(std::string  geohash)
{
	this->geohash = geohash;
}

double
StoreMetadata::getLatitude()
{
	return latitude;
}

void
StoreMetadata::setLatitude(double  latitude)
{
	this->latitude = latitude;
}

double
StoreMetadata::getLongitude()
{
	return longitude;
}

void
StoreMetadata::setLongitude(double  longitude)
{
	this->longitude = longitude;
}

std::string
StoreMetadata::getStoreCode()
{
	return store_code;
}

void
StoreMetadata::setStoreCode(std::string  store_code)
{
	this->store_code = store_code;
}

std::string
StoreMetadata::getStoreId()
{
	return store_id;
}

void
StoreMetadata::setStoreId(std::string  store_id)
{
	this->store_id = store_id;
}

std::string
StoreMetadata::getStoreName()
{
	return store_name;
}

void
StoreMetadata::setStoreName(std::string  store_name)
{
	this->store_name = store_name;
}


