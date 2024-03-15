#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsHotelAddress.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsHotelAddress::CatalogsHotelAddress()
{
	//__init();
}

CatalogsHotelAddress::~CatalogsHotelAddress()
{
	//__cleanup();
}

void
CatalogsHotelAddress::__init()
{
	//addr1 = std::string();
	//city = std::string();
	//region = std::string();
	//country = std::string();
	//postal_code = std::string();
}

void
CatalogsHotelAddress::__cleanup()
{
	//if(addr1 != NULL) {
	//
	//delete addr1;
	//addr1 = NULL;
	//}
	//if(city != NULL) {
	//
	//delete city;
	//city = NULL;
	//}
	//if(region != NULL) {
	//
	//delete region;
	//region = NULL;
	//}
	//if(country != NULL) {
	//
	//delete country;
	//country = NULL;
	//}
	//if(postal_code != NULL) {
	//
	//delete postal_code;
	//postal_code = NULL;
	//}
	//
}

void
CatalogsHotelAddress::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *addr1Key = "addr1";
	node = json_object_get_member(pJsonObject, addr1Key);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&addr1, node, "std::string", "");
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
	const gchar *regionKey = "region";
	node = json_object_get_member(pJsonObject, regionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&region, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *countryKey = "country";
	node = json_object_get_member(pJsonObject, countryKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&country, node, "std::string", "");
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
}

CatalogsHotelAddress::CatalogsHotelAddress(char* json)
{
	this->fromJson(json);
}

char*
CatalogsHotelAddress::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getAddr1();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *addr1Key = "addr1";
	json_object_set_member(pJsonObject, addr1Key, node);
	if (isprimitive("std::string")) {
		std::string obj = getCity();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *cityKey = "city";
	json_object_set_member(pJsonObject, cityKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getRegion();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *regionKey = "region";
	json_object_set_member(pJsonObject, regionKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCountry();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *countryKey = "country";
	json_object_set_member(pJsonObject, countryKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPostalCode();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *postal_codeKey = "postal_code";
	json_object_set_member(pJsonObject, postal_codeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
CatalogsHotelAddress::getAddr1()
{
	return addr1;
}

void
CatalogsHotelAddress::setAddr1(std::string  addr1)
{
	this->addr1 = addr1;
}

std::string
CatalogsHotelAddress::getCity()
{
	return city;
}

void
CatalogsHotelAddress::setCity(std::string  city)
{
	this->city = city;
}

std::string
CatalogsHotelAddress::getRegion()
{
	return region;
}

void
CatalogsHotelAddress::setRegion(std::string  region)
{
	this->region = region;
}

std::string
CatalogsHotelAddress::getCountry()
{
	return country;
}

void
CatalogsHotelAddress::setCountry(std::string  country)
{
	this->country = country;
}

std::string
CatalogsHotelAddress::getPostalCode()
{
	return postal_code;
}

void
CatalogsHotelAddress::setPostalCode(std::string  postal_code)
{
	this->postal_code = postal_code;
}


