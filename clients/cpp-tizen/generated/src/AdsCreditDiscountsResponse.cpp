#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdsCreditDiscountsResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdsCreditDiscountsResponse::AdsCreditDiscountsResponse()
{
	//__init();
}

AdsCreditDiscountsResponse::~AdsCreditDiscountsResponse()
{
	//__cleanup();
}

void
AdsCreditDiscountsResponse::__init()
{
	//active = bool(false);
	//advertiser_id = std::string();
	//discountType = std::string();
	//discountInMicroCurrency = double(0);
	//discountCurrency = std::string();
	//title = std::string();
	//remainingDiscountInMicroCurrency = double(0);
}

void
AdsCreditDiscountsResponse::__cleanup()
{
	//if(active != NULL) {
	//
	//delete active;
	//active = NULL;
	//}
	//if(advertiser_id != NULL) {
	//
	//delete advertiser_id;
	//advertiser_id = NULL;
	//}
	//if(discountType != NULL) {
	//
	//delete discountType;
	//discountType = NULL;
	//}
	//if(discountInMicroCurrency != NULL) {
	//
	//delete discountInMicroCurrency;
	//discountInMicroCurrency = NULL;
	//}
	//if(discountCurrency != NULL) {
	//
	//delete discountCurrency;
	//discountCurrency = NULL;
	//}
	//if(title != NULL) {
	//
	//delete title;
	//title = NULL;
	//}
	//if(remainingDiscountInMicroCurrency != NULL) {
	//
	//delete remainingDiscountInMicroCurrency;
	//remainingDiscountInMicroCurrency = NULL;
	//}
	//
}

void
AdsCreditDiscountsResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *activeKey = "active";
	node = json_object_get_member(pJsonObject, activeKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&active, node, "bool", "");
		} else {
			
		}
	}
	const gchar *advertiser_idKey = "advertiser_id";
	node = json_object_get_member(pJsonObject, advertiser_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&advertiser_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *discountTypeKey = "discountType";
	node = json_object_get_member(pJsonObject, discountTypeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&discountType, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *discountInMicroCurrencyKey = "discountInMicroCurrency";
	node = json_object_get_member(pJsonObject, discountInMicroCurrencyKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&discountInMicroCurrency, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&discountInMicroCurrency);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *discountCurrencyKey = "discountCurrency";
	node = json_object_get_member(pJsonObject, discountCurrencyKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&discountCurrency, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *titleKey = "title";
	node = json_object_get_member(pJsonObject, titleKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&title, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *remainingDiscountInMicroCurrencyKey = "remainingDiscountInMicroCurrency";
	node = json_object_get_member(pJsonObject, remainingDiscountInMicroCurrencyKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&remainingDiscountInMicroCurrency, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&remainingDiscountInMicroCurrency);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

AdsCreditDiscountsResponse::AdsCreditDiscountsResponse(char* json)
{
	this->fromJson(json);
}

char*
AdsCreditDiscountsResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("bool")) {
		bool obj = getActive();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *activeKey = "active";
	json_object_set_member(pJsonObject, activeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getAdvertiserId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *advertiser_idKey = "advertiser_id";
	json_object_set_member(pJsonObject, advertiser_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDiscountType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *discountTypeKey = "discountType";
	json_object_set_member(pJsonObject, discountTypeKey, node);
	if (isprimitive("long long")) {
		long long obj = getDiscountInMicroCurrency();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getDiscountInMicroCurrency());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *discountInMicroCurrencyKey = "discountInMicroCurrency";
	json_object_set_member(pJsonObject, discountInMicroCurrencyKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDiscountCurrency();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *discountCurrencyKey = "discountCurrency";
	json_object_set_member(pJsonObject, discountCurrencyKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getTitle();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *titleKey = "title";
	json_object_set_member(pJsonObject, titleKey, node);
	if (isprimitive("long long")) {
		long long obj = getRemainingDiscountInMicroCurrency();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getRemainingDiscountInMicroCurrency());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *remainingDiscountInMicroCurrencyKey = "remainingDiscountInMicroCurrency";
	json_object_set_member(pJsonObject, remainingDiscountInMicroCurrencyKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

bool
AdsCreditDiscountsResponse::getActive()
{
	return active;
}

void
AdsCreditDiscountsResponse::setActive(bool  active)
{
	this->active = active;
}

std::string
AdsCreditDiscountsResponse::getAdvertiserId()
{
	return advertiser_id;
}

void
AdsCreditDiscountsResponse::setAdvertiserId(std::string  advertiser_id)
{
	this->advertiser_id = advertiser_id;
}

std::string
AdsCreditDiscountsResponse::getDiscountType()
{
	return discountType;
}

void
AdsCreditDiscountsResponse::setDiscountType(std::string  discountType)
{
	this->discountType = discountType;
}

long long
AdsCreditDiscountsResponse::getDiscountInMicroCurrency()
{
	return discountInMicroCurrency;
}

void
AdsCreditDiscountsResponse::setDiscountInMicroCurrency(long long  discountInMicroCurrency)
{
	this->discountInMicroCurrency = discountInMicroCurrency;
}

std::string
AdsCreditDiscountsResponse::getDiscountCurrency()
{
	return discountCurrency;
}

void
AdsCreditDiscountsResponse::setDiscountCurrency(std::string  discountCurrency)
{
	this->discountCurrency = discountCurrency;
}

std::string
AdsCreditDiscountsResponse::getTitle()
{
	return title;
}

void
AdsCreditDiscountsResponse::setTitle(std::string  title)
{
	this->title = title;
}

long long
AdsCreditDiscountsResponse::getRemainingDiscountInMicroCurrency()
{
	return remainingDiscountInMicroCurrency;
}

void
AdsCreditDiscountsResponse::setRemainingDiscountInMicroCurrency(long long  remainingDiscountInMicroCurrency)
{
	this->remainingDiscountInMicroCurrency = remainingDiscountInMicroCurrency;
}


