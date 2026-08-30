#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CampaignUpdateRequestAllOf2.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CampaignUpdateRequestAllOf2::CampaignUpdateRequestAllOf2()
{
	//__init();
}

CampaignUpdateRequestAllOf2::~CampaignUpdateRequestAllOf2()
{
	//__cleanup();
}

void
CampaignUpdateRequestAllOf2::__init()
{
	//bid_options = new CampaignBidOptionsUpdate();
	//intended_promotion_type = new IntendedPromotionType();
	//is_ltv_optimized = bool(false);
	//is_performance_plus = bool(false);
	//is_top_of_search = bool(false);
	//objective_type = null;
}

void
CampaignUpdateRequestAllOf2::__cleanup()
{
	//if(bid_options != NULL) {
	//
	//delete bid_options;
	//bid_options = NULL;
	//}
	//if(intended_promotion_type != NULL) {
	//
	//delete intended_promotion_type;
	//intended_promotion_type = NULL;
	//}
	//if(is_ltv_optimized != NULL) {
	//
	//delete is_ltv_optimized;
	//is_ltv_optimized = NULL;
	//}
	//if(is_performance_plus != NULL) {
	//
	//delete is_performance_plus;
	//is_performance_plus = NULL;
	//}
	//if(is_top_of_search != NULL) {
	//
	//delete is_top_of_search;
	//is_top_of_search = NULL;
	//}
	//if(objective_type != NULL) {
	//
	//delete objective_type;
	//objective_type = NULL;
	//}
	//
}

void
CampaignUpdateRequestAllOf2::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *bid_optionsKey = "bid_options";
	node = json_object_get_member(pJsonObject, bid_optionsKey);
	if (node !=NULL) {
	

		if (isprimitive("CampaignBidOptionsUpdate")) {
			jsonToValue(&bid_options, node, "CampaignBidOptionsUpdate", "CampaignBidOptionsUpdate");
		} else {
			
			CampaignBidOptionsUpdate* obj = static_cast<CampaignBidOptionsUpdate*> (&bid_options);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *intended_promotion_typeKey = "intended_promotion_type";
	node = json_object_get_member(pJsonObject, intended_promotion_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("IntendedPromotionType")) {
			jsonToValue(&intended_promotion_type, node, "IntendedPromotionType", "IntendedPromotionType");
		} else {
			
			IntendedPromotionType* obj = static_cast<IntendedPromotionType*> (&intended_promotion_type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *is_ltv_optimizedKey = "is_ltv_optimized";
	node = json_object_get_member(pJsonObject, is_ltv_optimizedKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_ltv_optimized, node, "bool", "");
		} else {
			
		}
	}
	const gchar *is_performance_plusKey = "is_performance_plus";
	node = json_object_get_member(pJsonObject, is_performance_plusKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_performance_plus, node, "bool", "");
		} else {
			
		}
	}
	const gchar *is_top_of_searchKey = "is_top_of_search";
	node = json_object_get_member(pJsonObject, is_top_of_searchKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_top_of_search, node, "bool", "");
		} else {
			
		}
	}
	const gchar *objective_typeKey = "objective_type";
	node = json_object_get_member(pJsonObject, objective_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("ObjectiveType")) {
			jsonToValue(&objective_type, node, "ObjectiveType", "ObjectiveType");
		} else {
			
			ObjectiveType* obj = static_cast<ObjectiveType*> (&objective_type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CampaignUpdateRequestAllOf2::CampaignUpdateRequestAllOf2(char* json)
{
	this->fromJson(json);
}

char*
CampaignUpdateRequestAllOf2::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CampaignBidOptionsUpdate")) {
		CampaignBidOptionsUpdate obj = getBidOptions();
		node = converttoJson(&obj, "CampaignBidOptionsUpdate", "");
	}
	else {
		
		CampaignBidOptionsUpdate obj = static_cast<CampaignBidOptionsUpdate> (getBidOptions());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *bid_optionsKey = "bid_options";
	json_object_set_member(pJsonObject, bid_optionsKey, node);
	if (isprimitive("IntendedPromotionType")) {
		IntendedPromotionType obj = getIntendedPromotionType();
		node = converttoJson(&obj, "IntendedPromotionType", "");
	}
	else {
		
		IntendedPromotionType obj = static_cast<IntendedPromotionType> (getIntendedPromotionType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *intended_promotion_typeKey = "intended_promotion_type";
	json_object_set_member(pJsonObject, intended_promotion_typeKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsLtvOptimized();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_ltv_optimizedKey = "is_ltv_optimized";
	json_object_set_member(pJsonObject, is_ltv_optimizedKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsPerformancePlus();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_performance_plusKey = "is_performance_plus";
	json_object_set_member(pJsonObject, is_performance_plusKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsTopOfSearch();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_top_of_searchKey = "is_top_of_search";
	json_object_set_member(pJsonObject, is_top_of_searchKey, node);
	if (isprimitive("ObjectiveType")) {
		ObjectiveType obj = getObjectiveType();
		node = converttoJson(&obj, "ObjectiveType", "");
	}
	else {
		
		ObjectiveType obj = static_cast<ObjectiveType> (getObjectiveType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *objective_typeKey = "objective_type";
	json_object_set_member(pJsonObject, objective_typeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

CampaignBidOptionsUpdate
CampaignUpdateRequestAllOf2::getBidOptions()
{
	return bid_options;
}

void
CampaignUpdateRequestAllOf2::setBidOptions(CampaignBidOptionsUpdate  bid_options)
{
	this->bid_options = bid_options;
}

IntendedPromotionType
CampaignUpdateRequestAllOf2::getIntendedPromotionType()
{
	return intended_promotion_type;
}

void
CampaignUpdateRequestAllOf2::setIntendedPromotionType(IntendedPromotionType  intended_promotion_type)
{
	this->intended_promotion_type = intended_promotion_type;
}

bool
CampaignUpdateRequestAllOf2::getIsLtvOptimized()
{
	return is_ltv_optimized;
}

void
CampaignUpdateRequestAllOf2::setIsLtvOptimized(bool  is_ltv_optimized)
{
	this->is_ltv_optimized = is_ltv_optimized;
}

bool
CampaignUpdateRequestAllOf2::getIsPerformancePlus()
{
	return is_performance_plus;
}

void
CampaignUpdateRequestAllOf2::setIsPerformancePlus(bool  is_performance_plus)
{
	this->is_performance_plus = is_performance_plus;
}

bool
CampaignUpdateRequestAllOf2::getIsTopOfSearch()
{
	return is_top_of_search;
}

void
CampaignUpdateRequestAllOf2::setIsTopOfSearch(bool  is_top_of_search)
{
	this->is_top_of_search = is_top_of_search;
}

ObjectiveType
CampaignUpdateRequestAllOf2::getObjectiveType()
{
	return objective_type;
}

void
CampaignUpdateRequestAllOf2::setObjectiveType(ObjectiveType  objective_type)
{
	this->objective_type = objective_type;
}


