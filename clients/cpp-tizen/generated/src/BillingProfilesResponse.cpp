#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "BillingProfilesResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

BillingProfilesResponse::BillingProfilesResponse()
{
	//__init();
}

BillingProfilesResponse::~BillingProfilesResponse()
{
	//__cleanup();
}

void
BillingProfilesResponse::__init()
{
	//advertiser_id = std::string();
	//billing_type = std::string();
	//card_type = std::string();
	//id = std::string();
	//payment_method_brand = std::string();
	//status = std::string();
}

void
BillingProfilesResponse::__cleanup()
{
	//if(advertiser_id != NULL) {
	//
	//delete advertiser_id;
	//advertiser_id = NULL;
	//}
	//if(billing_type != NULL) {
	//
	//delete billing_type;
	//billing_type = NULL;
	//}
	//if(card_type != NULL) {
	//
	//delete card_type;
	//card_type = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(payment_method_brand != NULL) {
	//
	//delete payment_method_brand;
	//payment_method_brand = NULL;
	//}
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//
}

void
BillingProfilesResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *advertiser_idKey = "advertiser_id";
	node = json_object_get_member(pJsonObject, advertiser_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&advertiser_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *billing_typeKey = "billing_type";
	node = json_object_get_member(pJsonObject, billing_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&billing_type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *card_typeKey = "card_type";
	node = json_object_get_member(pJsonObject, card_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&card_type, node, "std::string", "");
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
	const gchar *payment_method_brandKey = "payment_method_brand";
	node = json_object_get_member(pJsonObject, payment_method_brandKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&payment_method_brand, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&status, node, "std::string", "");
		} else {
			
		}
	}
}

BillingProfilesResponse::BillingProfilesResponse(char* json)
{
	this->fromJson(json);
}

char*
BillingProfilesResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getAdvertiserId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *advertiser_idKey = "advertiser_id";
	json_object_set_member(pJsonObject, advertiser_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getBillingType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *billing_typeKey = "billing_type";
	json_object_set_member(pJsonObject, billing_typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCardType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *card_typeKey = "card_type";
	json_object_set_member(pJsonObject, card_typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPaymentMethodBrand();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *payment_method_brandKey = "payment_method_brand";
	json_object_set_member(pJsonObject, payment_method_brandKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getStatus();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
BillingProfilesResponse::getAdvertiserId()
{
	return advertiser_id;
}

void
BillingProfilesResponse::setAdvertiserId(std::string  advertiser_id)
{
	this->advertiser_id = advertiser_id;
}

std::string
BillingProfilesResponse::getBillingType()
{
	return billing_type;
}

void
BillingProfilesResponse::setBillingType(std::string  billing_type)
{
	this->billing_type = billing_type;
}

std::string
BillingProfilesResponse::getCardType()
{
	return card_type;
}

void
BillingProfilesResponse::setCardType(std::string  card_type)
{
	this->card_type = card_type;
}

std::string
BillingProfilesResponse::getId()
{
	return id;
}

void
BillingProfilesResponse::setId(std::string  id)
{
	this->id = id;
}

std::string
BillingProfilesResponse::getPaymentMethodBrand()
{
	return payment_method_brand;
}

void
BillingProfilesResponse::setPaymentMethodBrand(std::string  payment_method_brand)
{
	this->payment_method_brand = payment_method_brand;
}

std::string
BillingProfilesResponse::getStatus()
{
	return status;
}

void
BillingProfilesResponse::setStatus(std::string  status)
{
	this->status = status;
}


