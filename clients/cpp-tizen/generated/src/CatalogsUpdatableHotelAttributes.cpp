#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsUpdatableHotelAttributes.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsUpdatableHotelAttributes::CatalogsUpdatableHotelAttributes()
{
	//__init();
}

CatalogsUpdatableHotelAttributes::~CatalogsUpdatableHotelAttributes()
{
	//__cleanup();
}

void
CatalogsUpdatableHotelAttributes::__init()
{
	//name = std::string();
	//link = std::string();
	//description = std::string();
	//brand = std::string();
	//latitude = double(0);
	//longitude = double(0);
	//new std::list()std::list> neighborhood;
	//address = new CatalogsHotelAddress();
	//custom_label_0 = std::string();
	//custom_label_1 = std::string();
	//custom_label_2 = std::string();
	//custom_label_3 = std::string();
	//custom_label_4 = std::string();
	//category = std::string();
	//base_price = std::string();
	//sale_price = std::string();
	//guest_ratings = new CatalogsHotelGuestRatings();
}

void
CatalogsUpdatableHotelAttributes::__cleanup()
{
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(link != NULL) {
	//
	//delete link;
	//link = NULL;
	//}
	//if(description != NULL) {
	//
	//delete description;
	//description = NULL;
	//}
	//if(brand != NULL) {
	//
	//delete brand;
	//brand = NULL;
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
	//if(neighborhood != NULL) {
	//neighborhood.RemoveAll(true);
	//delete neighborhood;
	//neighborhood = NULL;
	//}
	//if(address != NULL) {
	//
	//delete address;
	//address = NULL;
	//}
	//if(custom_label_0 != NULL) {
	//
	//delete custom_label_0;
	//custom_label_0 = NULL;
	//}
	//if(custom_label_1 != NULL) {
	//
	//delete custom_label_1;
	//custom_label_1 = NULL;
	//}
	//if(custom_label_2 != NULL) {
	//
	//delete custom_label_2;
	//custom_label_2 = NULL;
	//}
	//if(custom_label_3 != NULL) {
	//
	//delete custom_label_3;
	//custom_label_3 = NULL;
	//}
	//if(custom_label_4 != NULL) {
	//
	//delete custom_label_4;
	//custom_label_4 = NULL;
	//}
	//if(category != NULL) {
	//
	//delete category;
	//category = NULL;
	//}
	//if(base_price != NULL) {
	//
	//delete base_price;
	//base_price = NULL;
	//}
	//if(sale_price != NULL) {
	//
	//delete sale_price;
	//sale_price = NULL;
	//}
	//if(guest_ratings != NULL) {
	//
	//delete guest_ratings;
	//guest_ratings = NULL;
	//}
	//
}

void
CatalogsUpdatableHotelAttributes::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *linkKey = "link";
	node = json_object_get_member(pJsonObject, linkKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&link, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *descriptionKey = "description";
	node = json_object_get_member(pJsonObject, descriptionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&description, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *brandKey = "brand";
	node = json_object_get_member(pJsonObject, brandKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&brand, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *latitudeKey = "latitude";
	node = json_object_get_member(pJsonObject, latitudeKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&latitude, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&latitude);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *longitudeKey = "longitude";
	node = json_object_get_member(pJsonObject, longitudeKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&longitude, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&longitude);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *neighborhoodKey = "neighborhood";
	node = json_object_get_member(pJsonObject, neighborhoodKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			neighborhood = new_list;
		}
		
	}
	const gchar *addressKey = "address";
	node = json_object_get_member(pJsonObject, addressKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsHotelAddress")) {
			jsonToValue(&address, node, "CatalogsHotelAddress", "CatalogsHotelAddress");
		} else {
			
			CatalogsHotelAddress* obj = static_cast<CatalogsHotelAddress*> (&address);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *custom_label_0Key = "custom_label_0";
	node = json_object_get_member(pJsonObject, custom_label_0Key);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&custom_label_0, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *custom_label_1Key = "custom_label_1";
	node = json_object_get_member(pJsonObject, custom_label_1Key);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&custom_label_1, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *custom_label_2Key = "custom_label_2";
	node = json_object_get_member(pJsonObject, custom_label_2Key);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&custom_label_2, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *custom_label_3Key = "custom_label_3";
	node = json_object_get_member(pJsonObject, custom_label_3Key);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&custom_label_3, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *custom_label_4Key = "custom_label_4";
	node = json_object_get_member(pJsonObject, custom_label_4Key);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&custom_label_4, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *categoryKey = "category";
	node = json_object_get_member(pJsonObject, categoryKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&category, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *base_priceKey = "base_price";
	node = json_object_get_member(pJsonObject, base_priceKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&base_price, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *sale_priceKey = "sale_price";
	node = json_object_get_member(pJsonObject, sale_priceKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&sale_price, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *guest_ratingsKey = "guest_ratings";
	node = json_object_get_member(pJsonObject, guest_ratingsKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsHotelGuestRatings")) {
			jsonToValue(&guest_ratings, node, "CatalogsHotelGuestRatings", "CatalogsHotelGuestRatings");
		} else {
			
			CatalogsHotelGuestRatings* obj = static_cast<CatalogsHotelGuestRatings*> (&guest_ratings);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CatalogsUpdatableHotelAttributes::CatalogsUpdatableHotelAttributes(char* json)
{
	this->fromJson(json);
}

char*
CatalogsUpdatableHotelAttributes::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getLink();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *linkKey = "link";
	json_object_set_member(pJsonObject, linkKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDescription();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *descriptionKey = "description";
	json_object_set_member(pJsonObject, descriptionKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getBrand();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *brandKey = "brand";
	json_object_set_member(pJsonObject, brandKey, node);
	if (isprimitive("long long")) {
		long long obj = getLatitude();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getLatitude());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *latitudeKey = "latitude";
	json_object_set_member(pJsonObject, latitudeKey, node);
	if (isprimitive("long long")) {
		long long obj = getLongitude();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getLongitude());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *longitudeKey = "longitude";
	json_object_set_member(pJsonObject, longitudeKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getNeighborhood());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getNeighborhood());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *neighborhoodKey = "neighborhood";
	json_object_set_member(pJsonObject, neighborhoodKey, node);
	if (isprimitive("CatalogsHotelAddress")) {
		CatalogsHotelAddress obj = getAddress();
		node = converttoJson(&obj, "CatalogsHotelAddress", "");
	}
	else {
		
		CatalogsHotelAddress obj = static_cast<CatalogsHotelAddress> (getAddress());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *addressKey = "address";
	json_object_set_member(pJsonObject, addressKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCustomLabel0();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *custom_label_0Key = "custom_label_0";
	json_object_set_member(pJsonObject, custom_label_0Key, node);
	if (isprimitive("std::string")) {
		std::string obj = getCustomLabel1();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *custom_label_1Key = "custom_label_1";
	json_object_set_member(pJsonObject, custom_label_1Key, node);
	if (isprimitive("std::string")) {
		std::string obj = getCustomLabel2();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *custom_label_2Key = "custom_label_2";
	json_object_set_member(pJsonObject, custom_label_2Key, node);
	if (isprimitive("std::string")) {
		std::string obj = getCustomLabel3();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *custom_label_3Key = "custom_label_3";
	json_object_set_member(pJsonObject, custom_label_3Key, node);
	if (isprimitive("std::string")) {
		std::string obj = getCustomLabel4();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *custom_label_4Key = "custom_label_4";
	json_object_set_member(pJsonObject, custom_label_4Key, node);
	if (isprimitive("std::string")) {
		std::string obj = getCategory();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *categoryKey = "category";
	json_object_set_member(pJsonObject, categoryKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getBasePrice();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *base_priceKey = "base_price";
	json_object_set_member(pJsonObject, base_priceKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getSalePrice();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *sale_priceKey = "sale_price";
	json_object_set_member(pJsonObject, sale_priceKey, node);
	if (isprimitive("CatalogsHotelGuestRatings")) {
		CatalogsHotelGuestRatings obj = getGuestRatings();
		node = converttoJson(&obj, "CatalogsHotelGuestRatings", "");
	}
	else {
		
		CatalogsHotelGuestRatings obj = static_cast<CatalogsHotelGuestRatings> (getGuestRatings());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *guest_ratingsKey = "guest_ratings";
	json_object_set_member(pJsonObject, guest_ratingsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
CatalogsUpdatableHotelAttributes::getName()
{
	return name;
}

void
CatalogsUpdatableHotelAttributes::setName(std::string  name)
{
	this->name = name;
}

std::string
CatalogsUpdatableHotelAttributes::getLink()
{
	return link;
}

void
CatalogsUpdatableHotelAttributes::setLink(std::string  link)
{
	this->link = link;
}

std::string
CatalogsUpdatableHotelAttributes::getDescription()
{
	return description;
}

void
CatalogsUpdatableHotelAttributes::setDescription(std::string  description)
{
	this->description = description;
}

std::string
CatalogsUpdatableHotelAttributes::getBrand()
{
	return brand;
}

void
CatalogsUpdatableHotelAttributes::setBrand(std::string  brand)
{
	this->brand = brand;
}

long long
CatalogsUpdatableHotelAttributes::getLatitude()
{
	return latitude;
}

void
CatalogsUpdatableHotelAttributes::setLatitude(long long  latitude)
{
	this->latitude = latitude;
}

long long
CatalogsUpdatableHotelAttributes::getLongitude()
{
	return longitude;
}

void
CatalogsUpdatableHotelAttributes::setLongitude(long long  longitude)
{
	this->longitude = longitude;
}

std::list<std::string>
CatalogsUpdatableHotelAttributes::getNeighborhood()
{
	return neighborhood;
}

void
CatalogsUpdatableHotelAttributes::setNeighborhood(std::list <std::string> neighborhood)
{
	this->neighborhood = neighborhood;
}

CatalogsHotelAddress
CatalogsUpdatableHotelAttributes::getAddress()
{
	return address;
}

void
CatalogsUpdatableHotelAttributes::setAddress(CatalogsHotelAddress  address)
{
	this->address = address;
}

std::string
CatalogsUpdatableHotelAttributes::getCustomLabel0()
{
	return custom_label_0;
}

void
CatalogsUpdatableHotelAttributes::setCustomLabel0(std::string  custom_label_0)
{
	this->custom_label_0 = custom_label_0;
}

std::string
CatalogsUpdatableHotelAttributes::getCustomLabel1()
{
	return custom_label_1;
}

void
CatalogsUpdatableHotelAttributes::setCustomLabel1(std::string  custom_label_1)
{
	this->custom_label_1 = custom_label_1;
}

std::string
CatalogsUpdatableHotelAttributes::getCustomLabel2()
{
	return custom_label_2;
}

void
CatalogsUpdatableHotelAttributes::setCustomLabel2(std::string  custom_label_2)
{
	this->custom_label_2 = custom_label_2;
}

std::string
CatalogsUpdatableHotelAttributes::getCustomLabel3()
{
	return custom_label_3;
}

void
CatalogsUpdatableHotelAttributes::setCustomLabel3(std::string  custom_label_3)
{
	this->custom_label_3 = custom_label_3;
}

std::string
CatalogsUpdatableHotelAttributes::getCustomLabel4()
{
	return custom_label_4;
}

void
CatalogsUpdatableHotelAttributes::setCustomLabel4(std::string  custom_label_4)
{
	this->custom_label_4 = custom_label_4;
}

std::string
CatalogsUpdatableHotelAttributes::getCategory()
{
	return category;
}

void
CatalogsUpdatableHotelAttributes::setCategory(std::string  category)
{
	this->category = category;
}

std::string
CatalogsUpdatableHotelAttributes::getBasePrice()
{
	return base_price;
}

void
CatalogsUpdatableHotelAttributes::setBasePrice(std::string  base_price)
{
	this->base_price = base_price;
}

std::string
CatalogsUpdatableHotelAttributes::getSalePrice()
{
	return sale_price;
}

void
CatalogsUpdatableHotelAttributes::setSalePrice(std::string  sale_price)
{
	this->sale_price = sale_price;
}

CatalogsHotelGuestRatings
CatalogsUpdatableHotelAttributes::getGuestRatings()
{
	return guest_ratings;
}

void
CatalogsUpdatableHotelAttributes::setGuestRatings(CatalogsHotelGuestRatings  guest_ratings)
{
	this->guest_ratings = guest_ratings;
}


