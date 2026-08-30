#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdGroupCreateRequestAllOf1.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdGroupCreateRequestAllOf1::AdGroupCreateRequestAllOf1()
{
	//__init();
}

AdGroupCreateRequestAllOf1::~AdGroupCreateRequestAllOf1()
{
	//__cleanup();
}

void
AdGroupCreateRequestAllOf1::__init()
{
	//auto_targeting_enabled = bool(false);
	//bid_multiplier = double(0);
	//budget_type = null;
	//pacing_delivery_type = null;
}

void
AdGroupCreateRequestAllOf1::__cleanup()
{
	//if(auto_targeting_enabled != NULL) {
	//
	//delete auto_targeting_enabled;
	//auto_targeting_enabled = NULL;
	//}
	//if(bid_multiplier != NULL) {
	//
	//delete bid_multiplier;
	//bid_multiplier = NULL;
	//}
	//if(budget_type != NULL) {
	//
	//delete budget_type;
	//budget_type = NULL;
	//}
	//if(pacing_delivery_type != NULL) {
	//
	//delete pacing_delivery_type;
	//pacing_delivery_type = NULL;
	//}
	//
}

void
AdGroupCreateRequestAllOf1::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *auto_targeting_enabledKey = "auto_targeting_enabled";
	node = json_object_get_member(pJsonObject, auto_targeting_enabledKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&auto_targeting_enabled, node, "bool", "");
		} else {
			
		}
	}
	const gchar *bid_multiplierKey = "bid_multiplier";
	node = json_object_get_member(pJsonObject, bid_multiplierKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&bid_multiplier, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&bid_multiplier);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *budget_typeKey = "budget_type";
	node = json_object_get_member(pJsonObject, budget_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("BudgetType")) {
			jsonToValue(&budget_type, node, "BudgetType", "BudgetType");
		} else {
			
			BudgetType* obj = static_cast<BudgetType*> (&budget_type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *pacing_delivery_typeKey = "pacing_delivery_type";
	node = json_object_get_member(pJsonObject, pacing_delivery_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("PacingDeliveryType")) {
			jsonToValue(&pacing_delivery_type, node, "PacingDeliveryType", "PacingDeliveryType");
		} else {
			
			PacingDeliveryType* obj = static_cast<PacingDeliveryType*> (&pacing_delivery_type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

AdGroupCreateRequestAllOf1::AdGroupCreateRequestAllOf1(char* json)
{
	this->fromJson(json);
}

char*
AdGroupCreateRequestAllOf1::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("bool")) {
		bool obj = getAutoTargetingEnabled();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *auto_targeting_enabledKey = "auto_targeting_enabled";
	json_object_set_member(pJsonObject, auto_targeting_enabledKey, node);
	if (isprimitive("long long")) {
		long long obj = getBidMultiplier();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getBidMultiplier());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *bid_multiplierKey = "bid_multiplier";
	json_object_set_member(pJsonObject, bid_multiplierKey, node);
	if (isprimitive("BudgetType")) {
		BudgetType obj = getBudgetType();
		node = converttoJson(&obj, "BudgetType", "");
	}
	else {
		
		BudgetType obj = static_cast<BudgetType> (getBudgetType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *budget_typeKey = "budget_type";
	json_object_set_member(pJsonObject, budget_typeKey, node);
	if (isprimitive("PacingDeliveryType")) {
		PacingDeliveryType obj = getPacingDeliveryType();
		node = converttoJson(&obj, "PacingDeliveryType", "");
	}
	else {
		
		PacingDeliveryType obj = static_cast<PacingDeliveryType> (getPacingDeliveryType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pacing_delivery_typeKey = "pacing_delivery_type";
	json_object_set_member(pJsonObject, pacing_delivery_typeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

bool
AdGroupCreateRequestAllOf1::getAutoTargetingEnabled()
{
	return auto_targeting_enabled;
}

void
AdGroupCreateRequestAllOf1::setAutoTargetingEnabled(bool  auto_targeting_enabled)
{
	this->auto_targeting_enabled = auto_targeting_enabled;
}

long long
AdGroupCreateRequestAllOf1::getBidMultiplier()
{
	return bid_multiplier;
}

void
AdGroupCreateRequestAllOf1::setBidMultiplier(long long  bid_multiplier)
{
	this->bid_multiplier = bid_multiplier;
}

BudgetType
AdGroupCreateRequestAllOf1::getBudgetType()
{
	return budget_type;
}

void
AdGroupCreateRequestAllOf1::setBudgetType(BudgetType  budget_type)
{
	this->budget_type = budget_type;
}

PacingDeliveryType
AdGroupCreateRequestAllOf1::getPacingDeliveryType()
{
	return pacing_delivery_type;
}

void
AdGroupCreateRequestAllOf1::setPacingDeliveryType(PacingDeliveryType  pacing_delivery_type)
{
	this->pacing_delivery_type = pacing_delivery_type;
}


