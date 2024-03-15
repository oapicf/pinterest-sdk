#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsHotelAttributes.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsHotelAttributes::CatalogsHotelAttributes()
{
	//__init();
}

CatalogsHotelAttributes::~CatalogsHotelAttributes()
{
	//__cleanup();
}

void
CatalogsHotelAttributes::__init()
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
	//main_image = new CatalogsHotelAttributes_allOf_main_image();
	//new std::list()std::list> additional_image_link;
}

void
CatalogsHotelAttributes::__cleanup()
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
	//if(main_image != NULL) {
	//
	//delete main_image;
	//main_image = NULL;
	//}
	//if(additional_image_link != NULL) {
	//additional_image_link.RemoveAll(true);
	//delete additional_image_link;
	//additional_image_link = NULL;
	//}
	//
}

void
CatalogsHotelAttributes::fromJson(char* jsonStr)
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
	const gchar *main_imageKey = "main_image";
	node = json_object_get_member(pJsonObject, main_imageKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsHotelAttributes_allOf_main_image")) {
			jsonToValue(&main_image, node, "CatalogsHotelAttributes_allOf_main_image", "CatalogsHotelAttributes_allOf_main_image");
		} else {
			
			CatalogsHotelAttributes_allOf_main_image* obj = static_cast<CatalogsHotelAttributes_allOf_main_image*> (&main_image);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *additional_image_linkKey = "additional_image_link";
	node = json_object_get_member(pJsonObject, additional_image_linkKey);
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
			additional_image_link = new_list;
		}
		
	}
}

CatalogsHotelAttributes::CatalogsHotelAttributes(char* json)
{
	this->fromJson(json);
}

char*
CatalogsHotelAttributes::toJson()
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
	if (isprimitive("CatalogsHotelAttributes_allOf_main_image")) {
		CatalogsHotelAttributes_allOf_main_image obj = getMainImage();
		node = converttoJson(&obj, "CatalogsHotelAttributes_allOf_main_image", "");
	}
	else {
		
		CatalogsHotelAttributes_allOf_main_image obj = static_cast<CatalogsHotelAttributes_allOf_main_image> (getMainImage());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *main_imageKey = "main_image";
	json_object_set_member(pJsonObject, main_imageKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getAdditionalImageLink());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getAdditionalImageLink());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *additional_image_linkKey = "additional_image_link";
	json_object_set_member(pJsonObject, additional_image_linkKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
CatalogsHotelAttributes::getName()
{
	return name;
}

void
CatalogsHotelAttributes::setName(std::string  name)
{
	this->name = name;
}

std::string
CatalogsHotelAttributes::getLink()
{
	return link;
}

void
CatalogsHotelAttributes::setLink(std::string  link)
{
	this->link = link;
}

std::string
CatalogsHotelAttributes::getDescription()
{
	return description;
}

void
CatalogsHotelAttributes::setDescription(std::string  description)
{
	this->description = description;
}

std::string
CatalogsHotelAttributes::getBrand()
{
	return brand;
}

void
CatalogsHotelAttributes::setBrand(std::string  brand)
{
	this->brand = brand;
}

long long
CatalogsHotelAttributes::getLatitude()
{
	return latitude;
}

void
CatalogsHotelAttributes::setLatitude(long long  latitude)
{
	this->latitude = latitude;
}

long long
CatalogsHotelAttributes::getLongitude()
{
	return longitude;
}

void
CatalogsHotelAttributes::setLongitude(long long  longitude)
{
	this->longitude = longitude;
}

std::list<std::string>
CatalogsHotelAttributes::getNeighborhood()
{
	return neighborhood;
}

void
CatalogsHotelAttributes::setNeighborhood(std::list <std::string> neighborhood)
{
	this->neighborhood = neighborhood;
}

CatalogsHotelAddress
CatalogsHotelAttributes::getAddress()
{
	return address;
}

void
CatalogsHotelAttributes::setAddress(CatalogsHotelAddress  address)
{
	this->address = address;
}

std::string
CatalogsHotelAttributes::getCustomLabel0()
{
	return custom_label_0;
}

void
CatalogsHotelAttributes::setCustomLabel0(std::string  custom_label_0)
{
	this->custom_label_0 = custom_label_0;
}

std::string
CatalogsHotelAttributes::getCustomLabel1()
{
	return custom_label_1;
}

void
CatalogsHotelAttributes::setCustomLabel1(std::string  custom_label_1)
{
	this->custom_label_1 = custom_label_1;
}

std::string
CatalogsHotelAttributes::getCustomLabel2()
{
	return custom_label_2;
}

void
CatalogsHotelAttributes::setCustomLabel2(std::string  custom_label_2)
{
	this->custom_label_2 = custom_label_2;
}

std::string
CatalogsHotelAttributes::getCustomLabel3()
{
	return custom_label_3;
}

void
CatalogsHotelAttributes::setCustomLabel3(std::string  custom_label_3)
{
	this->custom_label_3 = custom_label_3;
}

std::string
CatalogsHotelAttributes::getCustomLabel4()
{
	return custom_label_4;
}

void
CatalogsHotelAttributes::setCustomLabel4(std::string  custom_label_4)
{
	this->custom_label_4 = custom_label_4;
}

std::string
CatalogsHotelAttributes::getCategory()
{
	return category;
}

void
CatalogsHotelAttributes::setCategory(std::string  category)
{
	this->category = category;
}

std::string
CatalogsHotelAttributes::getBasePrice()
{
	return base_price;
}

void
CatalogsHotelAttributes::setBasePrice(std::string  base_price)
{
	this->base_price = base_price;
}

std::string
CatalogsHotelAttributes::getSalePrice()
{
	return sale_price;
}

void
CatalogsHotelAttributes::setSalePrice(std::string  sale_price)
{
	this->sale_price = sale_price;
}

CatalogsHotelGuestRatings
CatalogsHotelAttributes::getGuestRatings()
{
	return guest_ratings;
}

void
CatalogsHotelAttributes::setGuestRatings(CatalogsHotelGuestRatings  guest_ratings)
{
	this->guest_ratings = guest_ratings;
}

CatalogsHotelAttributes_allOf_main_image
CatalogsHotelAttributes::getMainImage()
{
	return main_image;
}

void
CatalogsHotelAttributes::setMainImage(CatalogsHotelAttributes_allOf_main_image  main_image)
{
	this->main_image = main_image;
}

std::list<std::string>
CatalogsHotelAttributes::getAdditionalImageLink()
{
	return additional_image_link;
}

void
CatalogsHotelAttributes::setAdditionalImageLink(std::list <std::string> additional_image_link)
{
	this->additional_image_link = additional_image_link;
}


