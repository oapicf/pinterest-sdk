#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CampaignDeliveryEstimatesCampaign.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CampaignDeliveryEstimatesCampaign::CampaignDeliveryEstimatesCampaign()
{
	//__init();
}

CampaignDeliveryEstimatesCampaign::~CampaignDeliveryEstimatesCampaign()
{
	//__cleanup();
}

void
CampaignDeliveryEstimatesCampaign::__init()
{
	//new std::list()std::list> ad_groups;
	//budget_duration_type = null;
	//daily_spend_cap = int(0);
	//end_date = std::string();
	//lifetime_spend_cap = int(0);
	//objective_type = new DeliveryEstimateObjectiveType();
	//start_date = std::string();
}

void
CampaignDeliveryEstimatesCampaign::__cleanup()
{
	//if(ad_groups != NULL) {
	//ad_groups.RemoveAll(true);
	//delete ad_groups;
	//ad_groups = NULL;
	//}
	//if(budget_duration_type != NULL) {
	//
	//delete budget_duration_type;
	//budget_duration_type = NULL;
	//}
	//if(daily_spend_cap != NULL) {
	//
	//delete daily_spend_cap;
	//daily_spend_cap = NULL;
	//}
	//if(end_date != NULL) {
	//
	//delete end_date;
	//end_date = NULL;
	//}
	//if(lifetime_spend_cap != NULL) {
	//
	//delete lifetime_spend_cap;
	//lifetime_spend_cap = NULL;
	//}
	//if(objective_type != NULL) {
	//
	//delete objective_type;
	//objective_type = NULL;
	//}
	//if(start_date != NULL) {
	//
	//delete start_date;
	//start_date = NULL;
	//}
	//
}

void
CampaignDeliveryEstimatesCampaign::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *ad_groupsKey = "ad_groups";
	node = json_object_get_member(pJsonObject, ad_groupsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<AdGroupDeliveryEstimates> new_list;
			AdGroupDeliveryEstimates inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("AdGroupDeliveryEstimates")) {
					jsonToValue(&inst, temp_json, "AdGroupDeliveryEstimates", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			ad_groups = new_list;
		}
		
	}
	const gchar *budget_duration_typeKey = "budget_duration_type";
	node = json_object_get_member(pJsonObject, budget_duration_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("BudgetDurationType")) {
			jsonToValue(&budget_duration_type, node, "BudgetDurationType", "BudgetDurationType");
		} else {
			
			BudgetDurationType* obj = static_cast<BudgetDurationType*> (&budget_duration_type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *daily_spend_capKey = "daily_spend_cap";
	node = json_object_get_member(pJsonObject, daily_spend_capKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&daily_spend_cap, node, "int", "");
		} else {
			
		}
	}
	const gchar *end_dateKey = "end_date";
	node = json_object_get_member(pJsonObject, end_dateKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&end_date, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *lifetime_spend_capKey = "lifetime_spend_cap";
	node = json_object_get_member(pJsonObject, lifetime_spend_capKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&lifetime_spend_cap, node, "int", "");
		} else {
			
		}
	}
	const gchar *objective_typeKey = "objective_type";
	node = json_object_get_member(pJsonObject, objective_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("DeliveryEstimateObjectiveType")) {
			jsonToValue(&objective_type, node, "DeliveryEstimateObjectiveType", "DeliveryEstimateObjectiveType");
		} else {
			
			DeliveryEstimateObjectiveType* obj = static_cast<DeliveryEstimateObjectiveType*> (&objective_type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *start_dateKey = "start_date";
	node = json_object_get_member(pJsonObject, start_dateKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&start_date, node, "std::string", "");
		} else {
			
		}
	}
}

CampaignDeliveryEstimatesCampaign::CampaignDeliveryEstimatesCampaign(char* json)
{
	this->fromJson(json);
}

char*
CampaignDeliveryEstimatesCampaign::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("AdGroupDeliveryEstimates")) {
		list<AdGroupDeliveryEstimates> new_list = static_cast<list <AdGroupDeliveryEstimates> > (getAdGroups());
		node = converttoJson(&new_list, "AdGroupDeliveryEstimates", "array");
	} else {
		node = json_node_alloc();
		list<AdGroupDeliveryEstimates> new_list = static_cast<list <AdGroupDeliveryEstimates> > (getAdGroups());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<AdGroupDeliveryEstimates>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			AdGroupDeliveryEstimates obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *ad_groupsKey = "ad_groups";
	json_object_set_member(pJsonObject, ad_groupsKey, node);
	if (isprimitive("BudgetDurationType")) {
		BudgetDurationType obj = getBudgetDurationType();
		node = converttoJson(&obj, "BudgetDurationType", "");
	}
	else {
		
		BudgetDurationType obj = static_cast<BudgetDurationType> (getBudgetDurationType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *budget_duration_typeKey = "budget_duration_type";
	json_object_set_member(pJsonObject, budget_duration_typeKey, node);
	if (isprimitive("int")) {
		int obj = getDailySpendCap();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *daily_spend_capKey = "daily_spend_cap";
	json_object_set_member(pJsonObject, daily_spend_capKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getEndDate();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *end_dateKey = "end_date";
	json_object_set_member(pJsonObject, end_dateKey, node);
	if (isprimitive("int")) {
		int obj = getLifetimeSpendCap();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *lifetime_spend_capKey = "lifetime_spend_cap";
	json_object_set_member(pJsonObject, lifetime_spend_capKey, node);
	if (isprimitive("DeliveryEstimateObjectiveType")) {
		DeliveryEstimateObjectiveType obj = getObjectiveType();
		node = converttoJson(&obj, "DeliveryEstimateObjectiveType", "");
	}
	else {
		
		DeliveryEstimateObjectiveType obj = static_cast<DeliveryEstimateObjectiveType> (getObjectiveType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *objective_typeKey = "objective_type";
	json_object_set_member(pJsonObject, objective_typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getStartDate();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *start_dateKey = "start_date";
	json_object_set_member(pJsonObject, start_dateKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<AdGroupDeliveryEstimates>
CampaignDeliveryEstimatesCampaign::getAdGroups()
{
	return ad_groups;
}

void
CampaignDeliveryEstimatesCampaign::setAdGroups(std::list <AdGroupDeliveryEstimates> ad_groups)
{
	this->ad_groups = ad_groups;
}

BudgetDurationType
CampaignDeliveryEstimatesCampaign::getBudgetDurationType()
{
	return budget_duration_type;
}

void
CampaignDeliveryEstimatesCampaign::setBudgetDurationType(BudgetDurationType  budget_duration_type)
{
	this->budget_duration_type = budget_duration_type;
}

int
CampaignDeliveryEstimatesCampaign::getDailySpendCap()
{
	return daily_spend_cap;
}

void
CampaignDeliveryEstimatesCampaign::setDailySpendCap(int  daily_spend_cap)
{
	this->daily_spend_cap = daily_spend_cap;
}

std::string
CampaignDeliveryEstimatesCampaign::getEndDate()
{
	return end_date;
}

void
CampaignDeliveryEstimatesCampaign::setEndDate(std::string  end_date)
{
	this->end_date = end_date;
}

int
CampaignDeliveryEstimatesCampaign::getLifetimeSpendCap()
{
	return lifetime_spend_cap;
}

void
CampaignDeliveryEstimatesCampaign::setLifetimeSpendCap(int  lifetime_spend_cap)
{
	this->lifetime_spend_cap = lifetime_spend_cap;
}

DeliveryEstimateObjectiveType
CampaignDeliveryEstimatesCampaign::getObjectiveType()
{
	return objective_type;
}

void
CampaignDeliveryEstimatesCampaign::setObjectiveType(DeliveryEstimateObjectiveType  objective_type)
{
	this->objective_type = objective_type;
}

std::string
CampaignDeliveryEstimatesCampaign::getStartDate()
{
	return start_date;
}

void
CampaignDeliveryEstimatesCampaign::setStartDate(std::string  start_date)
{
	this->start_date = start_date;
}


