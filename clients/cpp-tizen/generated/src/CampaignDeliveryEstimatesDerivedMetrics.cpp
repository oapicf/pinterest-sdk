#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CampaignDeliveryEstimatesDerivedMetrics.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CampaignDeliveryEstimatesDerivedMetrics::CampaignDeliveryEstimatesDerivedMetrics()
{
	//__init();
}

CampaignDeliveryEstimatesDerivedMetrics::~CampaignDeliveryEstimatesDerivedMetrics()
{
	//__cleanup();
}

void
CampaignDeliveryEstimatesDerivedMetrics::__init()
{
	//cpc = float(0);
	//cpc_lower = float(0);
	//cpc_upper = float(0);
	//cpm = float(0);
	//cpm_lower = float(0);
	//cpm_upper = float(0);
	//lifetime_frequency = float(0);
	//lifetime_frequency_lower = float(0);
	//lifetime_frequency_upper = float(0);
	//lifetime_impression = float(0);
	//lifetime_impression_lower = float(0);
	//lifetime_impression_upper = float(0);
	//lifetime_reach = float(0);
	//lifetime_reach_lower = float(0);
	//lifetime_reach_upper = float(0);
	//weekly_click = float(0);
	//weekly_click_lower = float(0);
	//weekly_click_upper = float(0);
	//weekly_frequency = float(0);
	//weekly_frequency_lower = float(0);
	//weekly_frequency_upper = float(0);
	//weekly_impression = float(0);
	//weekly_impression_lower = float(0);
	//weekly_impression_upper = float(0);
	//weekly_reach = float(0);
	//weekly_reach_lower = float(0);
	//weekly_reach_upper = float(0);
}

void
CampaignDeliveryEstimatesDerivedMetrics::__cleanup()
{
	//if(cpc != NULL) {
	//
	//delete cpc;
	//cpc = NULL;
	//}
	//if(cpc_lower != NULL) {
	//
	//delete cpc_lower;
	//cpc_lower = NULL;
	//}
	//if(cpc_upper != NULL) {
	//
	//delete cpc_upper;
	//cpc_upper = NULL;
	//}
	//if(cpm != NULL) {
	//
	//delete cpm;
	//cpm = NULL;
	//}
	//if(cpm_lower != NULL) {
	//
	//delete cpm_lower;
	//cpm_lower = NULL;
	//}
	//if(cpm_upper != NULL) {
	//
	//delete cpm_upper;
	//cpm_upper = NULL;
	//}
	//if(lifetime_frequency != NULL) {
	//
	//delete lifetime_frequency;
	//lifetime_frequency = NULL;
	//}
	//if(lifetime_frequency_lower != NULL) {
	//
	//delete lifetime_frequency_lower;
	//lifetime_frequency_lower = NULL;
	//}
	//if(lifetime_frequency_upper != NULL) {
	//
	//delete lifetime_frequency_upper;
	//lifetime_frequency_upper = NULL;
	//}
	//if(lifetime_impression != NULL) {
	//
	//delete lifetime_impression;
	//lifetime_impression = NULL;
	//}
	//if(lifetime_impression_lower != NULL) {
	//
	//delete lifetime_impression_lower;
	//lifetime_impression_lower = NULL;
	//}
	//if(lifetime_impression_upper != NULL) {
	//
	//delete lifetime_impression_upper;
	//lifetime_impression_upper = NULL;
	//}
	//if(lifetime_reach != NULL) {
	//
	//delete lifetime_reach;
	//lifetime_reach = NULL;
	//}
	//if(lifetime_reach_lower != NULL) {
	//
	//delete lifetime_reach_lower;
	//lifetime_reach_lower = NULL;
	//}
	//if(lifetime_reach_upper != NULL) {
	//
	//delete lifetime_reach_upper;
	//lifetime_reach_upper = NULL;
	//}
	//if(weekly_click != NULL) {
	//
	//delete weekly_click;
	//weekly_click = NULL;
	//}
	//if(weekly_click_lower != NULL) {
	//
	//delete weekly_click_lower;
	//weekly_click_lower = NULL;
	//}
	//if(weekly_click_upper != NULL) {
	//
	//delete weekly_click_upper;
	//weekly_click_upper = NULL;
	//}
	//if(weekly_frequency != NULL) {
	//
	//delete weekly_frequency;
	//weekly_frequency = NULL;
	//}
	//if(weekly_frequency_lower != NULL) {
	//
	//delete weekly_frequency_lower;
	//weekly_frequency_lower = NULL;
	//}
	//if(weekly_frequency_upper != NULL) {
	//
	//delete weekly_frequency_upper;
	//weekly_frequency_upper = NULL;
	//}
	//if(weekly_impression != NULL) {
	//
	//delete weekly_impression;
	//weekly_impression = NULL;
	//}
	//if(weekly_impression_lower != NULL) {
	//
	//delete weekly_impression_lower;
	//weekly_impression_lower = NULL;
	//}
	//if(weekly_impression_upper != NULL) {
	//
	//delete weekly_impression_upper;
	//weekly_impression_upper = NULL;
	//}
	//if(weekly_reach != NULL) {
	//
	//delete weekly_reach;
	//weekly_reach = NULL;
	//}
	//if(weekly_reach_lower != NULL) {
	//
	//delete weekly_reach_lower;
	//weekly_reach_lower = NULL;
	//}
	//if(weekly_reach_upper != NULL) {
	//
	//delete weekly_reach_upper;
	//weekly_reach_upper = NULL;
	//}
	//
}

void
CampaignDeliveryEstimatesDerivedMetrics::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cpcKey = "cpc";
	node = json_object_get_member(pJsonObject, cpcKey);
	if (node !=NULL) {
	

		if (isprimitive("float")) {
			jsonToValue(&cpc, node, "float", "");
		} else {
			
		}
	}
	const gchar *cpc_lowerKey = "cpc_lower";
	node = json_object_get_member(pJsonObject, cpc_lowerKey);
	if (node !=NULL) {
	

		if (isprimitive("float")) {
			jsonToValue(&cpc_lower, node, "float", "");
		} else {
			
		}
	}
	const gchar *cpc_upperKey = "cpc_upper";
	node = json_object_get_member(pJsonObject, cpc_upperKey);
	if (node !=NULL) {
	

		if (isprimitive("float")) {
			jsonToValue(&cpc_upper, node, "float", "");
		} else {
			
		}
	}
	const gchar *cpmKey = "cpm";
	node = json_object_get_member(pJsonObject, cpmKey);
	if (node !=NULL) {
	

		if (isprimitive("float")) {
			jsonToValue(&cpm, node, "float", "");
		} else {
			
		}
	}
	const gchar *cpm_lowerKey = "cpm_lower";
	node = json_object_get_member(pJsonObject, cpm_lowerKey);
	if (node !=NULL) {
	

		if (isprimitive("float")) {
			jsonToValue(&cpm_lower, node, "float", "");
		} else {
			
		}
	}
	const gchar *cpm_upperKey = "cpm_upper";
	node = json_object_get_member(pJsonObject, cpm_upperKey);
	if (node !=NULL) {
	

		if (isprimitive("float")) {
			jsonToValue(&cpm_upper, node, "float", "");
		} else {
			
		}
	}
	const gchar *lifetime_frequencyKey = "lifetime_frequency";
	node = json_object_get_member(pJsonObject, lifetime_frequencyKey);
	if (node !=NULL) {
	

		if (isprimitive("float")) {
			jsonToValue(&lifetime_frequency, node, "float", "");
		} else {
			
		}
	}
	const gchar *lifetime_frequency_lowerKey = "lifetime_frequency_lower";
	node = json_object_get_member(pJsonObject, lifetime_frequency_lowerKey);
	if (node !=NULL) {
	

		if (isprimitive("float")) {
			jsonToValue(&lifetime_frequency_lower, node, "float", "");
		} else {
			
		}
	}
	const gchar *lifetime_frequency_upperKey = "lifetime_frequency_upper";
	node = json_object_get_member(pJsonObject, lifetime_frequency_upperKey);
	if (node !=NULL) {
	

		if (isprimitive("float")) {
			jsonToValue(&lifetime_frequency_upper, node, "float", "");
		} else {
			
		}
	}
	const gchar *lifetime_impressionKey = "lifetime_impression";
	node = json_object_get_member(pJsonObject, lifetime_impressionKey);
	if (node !=NULL) {
	

		if (isprimitive("float")) {
			jsonToValue(&lifetime_impression, node, "float", "");
		} else {
			
		}
	}
	const gchar *lifetime_impression_lowerKey = "lifetime_impression_lower";
	node = json_object_get_member(pJsonObject, lifetime_impression_lowerKey);
	if (node !=NULL) {
	

		if (isprimitive("float")) {
			jsonToValue(&lifetime_impression_lower, node, "float", "");
		} else {
			
		}
	}
	const gchar *lifetime_impression_upperKey = "lifetime_impression_upper";
	node = json_object_get_member(pJsonObject, lifetime_impression_upperKey);
	if (node !=NULL) {
	

		if (isprimitive("float")) {
			jsonToValue(&lifetime_impression_upper, node, "float", "");
		} else {
			
		}
	}
	const gchar *lifetime_reachKey = "lifetime_reach";
	node = json_object_get_member(pJsonObject, lifetime_reachKey);
	if (node !=NULL) {
	

		if (isprimitive("float")) {
			jsonToValue(&lifetime_reach, node, "float", "");
		} else {
			
		}
	}
	const gchar *lifetime_reach_lowerKey = "lifetime_reach_lower";
	node = json_object_get_member(pJsonObject, lifetime_reach_lowerKey);
	if (node !=NULL) {
	

		if (isprimitive("float")) {
			jsonToValue(&lifetime_reach_lower, node, "float", "");
		} else {
			
		}
	}
	const gchar *lifetime_reach_upperKey = "lifetime_reach_upper";
	node = json_object_get_member(pJsonObject, lifetime_reach_upperKey);
	if (node !=NULL) {
	

		if (isprimitive("float")) {
			jsonToValue(&lifetime_reach_upper, node, "float", "");
		} else {
			
		}
	}
	const gchar *weekly_clickKey = "weekly_click";
	node = json_object_get_member(pJsonObject, weekly_clickKey);
	if (node !=NULL) {
	

		if (isprimitive("float")) {
			jsonToValue(&weekly_click, node, "float", "");
		} else {
			
		}
	}
	const gchar *weekly_click_lowerKey = "weekly_click_lower";
	node = json_object_get_member(pJsonObject, weekly_click_lowerKey);
	if (node !=NULL) {
	

		if (isprimitive("float")) {
			jsonToValue(&weekly_click_lower, node, "float", "");
		} else {
			
		}
	}
	const gchar *weekly_click_upperKey = "weekly_click_upper";
	node = json_object_get_member(pJsonObject, weekly_click_upperKey);
	if (node !=NULL) {
	

		if (isprimitive("float")) {
			jsonToValue(&weekly_click_upper, node, "float", "");
		} else {
			
		}
	}
	const gchar *weekly_frequencyKey = "weekly_frequency";
	node = json_object_get_member(pJsonObject, weekly_frequencyKey);
	if (node !=NULL) {
	

		if (isprimitive("float")) {
			jsonToValue(&weekly_frequency, node, "float", "");
		} else {
			
		}
	}
	const gchar *weekly_frequency_lowerKey = "weekly_frequency_lower";
	node = json_object_get_member(pJsonObject, weekly_frequency_lowerKey);
	if (node !=NULL) {
	

		if (isprimitive("float")) {
			jsonToValue(&weekly_frequency_lower, node, "float", "");
		} else {
			
		}
	}
	const gchar *weekly_frequency_upperKey = "weekly_frequency_upper";
	node = json_object_get_member(pJsonObject, weekly_frequency_upperKey);
	if (node !=NULL) {
	

		if (isprimitive("float")) {
			jsonToValue(&weekly_frequency_upper, node, "float", "");
		} else {
			
		}
	}
	const gchar *weekly_impressionKey = "weekly_impression";
	node = json_object_get_member(pJsonObject, weekly_impressionKey);
	if (node !=NULL) {
	

		if (isprimitive("float")) {
			jsonToValue(&weekly_impression, node, "float", "");
		} else {
			
		}
	}
	const gchar *weekly_impression_lowerKey = "weekly_impression_lower";
	node = json_object_get_member(pJsonObject, weekly_impression_lowerKey);
	if (node !=NULL) {
	

		if (isprimitive("float")) {
			jsonToValue(&weekly_impression_lower, node, "float", "");
		} else {
			
		}
	}
	const gchar *weekly_impression_upperKey = "weekly_impression_upper";
	node = json_object_get_member(pJsonObject, weekly_impression_upperKey);
	if (node !=NULL) {
	

		if (isprimitive("float")) {
			jsonToValue(&weekly_impression_upper, node, "float", "");
		} else {
			
		}
	}
	const gchar *weekly_reachKey = "weekly_reach";
	node = json_object_get_member(pJsonObject, weekly_reachKey);
	if (node !=NULL) {
	

		if (isprimitive("float")) {
			jsonToValue(&weekly_reach, node, "float", "");
		} else {
			
		}
	}
	const gchar *weekly_reach_lowerKey = "weekly_reach_lower";
	node = json_object_get_member(pJsonObject, weekly_reach_lowerKey);
	if (node !=NULL) {
	

		if (isprimitive("float")) {
			jsonToValue(&weekly_reach_lower, node, "float", "");
		} else {
			
		}
	}
	const gchar *weekly_reach_upperKey = "weekly_reach_upper";
	node = json_object_get_member(pJsonObject, weekly_reach_upperKey);
	if (node !=NULL) {
	

		if (isprimitive("float")) {
			jsonToValue(&weekly_reach_upper, node, "float", "");
		} else {
			
		}
	}
}

CampaignDeliveryEstimatesDerivedMetrics::CampaignDeliveryEstimatesDerivedMetrics(char* json)
{
	this->fromJson(json);
}

char*
CampaignDeliveryEstimatesDerivedMetrics::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("float")) {
		float obj = getCpc();
		node = converttoJson(&obj, "float", "");
	}
	else {
		
	}
	const gchar *cpcKey = "cpc";
	json_object_set_member(pJsonObject, cpcKey, node);
	if (isprimitive("float")) {
		float obj = getCpcLower();
		node = converttoJson(&obj, "float", "");
	}
	else {
		
	}
	const gchar *cpc_lowerKey = "cpc_lower";
	json_object_set_member(pJsonObject, cpc_lowerKey, node);
	if (isprimitive("float")) {
		float obj = getCpcUpper();
		node = converttoJson(&obj, "float", "");
	}
	else {
		
	}
	const gchar *cpc_upperKey = "cpc_upper";
	json_object_set_member(pJsonObject, cpc_upperKey, node);
	if (isprimitive("float")) {
		float obj = getCpm();
		node = converttoJson(&obj, "float", "");
	}
	else {
		
	}
	const gchar *cpmKey = "cpm";
	json_object_set_member(pJsonObject, cpmKey, node);
	if (isprimitive("float")) {
		float obj = getCpmLower();
		node = converttoJson(&obj, "float", "");
	}
	else {
		
	}
	const gchar *cpm_lowerKey = "cpm_lower";
	json_object_set_member(pJsonObject, cpm_lowerKey, node);
	if (isprimitive("float")) {
		float obj = getCpmUpper();
		node = converttoJson(&obj, "float", "");
	}
	else {
		
	}
	const gchar *cpm_upperKey = "cpm_upper";
	json_object_set_member(pJsonObject, cpm_upperKey, node);
	if (isprimitive("float")) {
		float obj = getLifetimeFrequency();
		node = converttoJson(&obj, "float", "");
	}
	else {
		
	}
	const gchar *lifetime_frequencyKey = "lifetime_frequency";
	json_object_set_member(pJsonObject, lifetime_frequencyKey, node);
	if (isprimitive("float")) {
		float obj = getLifetimeFrequencyLower();
		node = converttoJson(&obj, "float", "");
	}
	else {
		
	}
	const gchar *lifetime_frequency_lowerKey = "lifetime_frequency_lower";
	json_object_set_member(pJsonObject, lifetime_frequency_lowerKey, node);
	if (isprimitive("float")) {
		float obj = getLifetimeFrequencyUpper();
		node = converttoJson(&obj, "float", "");
	}
	else {
		
	}
	const gchar *lifetime_frequency_upperKey = "lifetime_frequency_upper";
	json_object_set_member(pJsonObject, lifetime_frequency_upperKey, node);
	if (isprimitive("float")) {
		float obj = getLifetimeImpression();
		node = converttoJson(&obj, "float", "");
	}
	else {
		
	}
	const gchar *lifetime_impressionKey = "lifetime_impression";
	json_object_set_member(pJsonObject, lifetime_impressionKey, node);
	if (isprimitive("float")) {
		float obj = getLifetimeImpressionLower();
		node = converttoJson(&obj, "float", "");
	}
	else {
		
	}
	const gchar *lifetime_impression_lowerKey = "lifetime_impression_lower";
	json_object_set_member(pJsonObject, lifetime_impression_lowerKey, node);
	if (isprimitive("float")) {
		float obj = getLifetimeImpressionUpper();
		node = converttoJson(&obj, "float", "");
	}
	else {
		
	}
	const gchar *lifetime_impression_upperKey = "lifetime_impression_upper";
	json_object_set_member(pJsonObject, lifetime_impression_upperKey, node);
	if (isprimitive("float")) {
		float obj = getLifetimeReach();
		node = converttoJson(&obj, "float", "");
	}
	else {
		
	}
	const gchar *lifetime_reachKey = "lifetime_reach";
	json_object_set_member(pJsonObject, lifetime_reachKey, node);
	if (isprimitive("float")) {
		float obj = getLifetimeReachLower();
		node = converttoJson(&obj, "float", "");
	}
	else {
		
	}
	const gchar *lifetime_reach_lowerKey = "lifetime_reach_lower";
	json_object_set_member(pJsonObject, lifetime_reach_lowerKey, node);
	if (isprimitive("float")) {
		float obj = getLifetimeReachUpper();
		node = converttoJson(&obj, "float", "");
	}
	else {
		
	}
	const gchar *lifetime_reach_upperKey = "lifetime_reach_upper";
	json_object_set_member(pJsonObject, lifetime_reach_upperKey, node);
	if (isprimitive("float")) {
		float obj = getWeeklyClick();
		node = converttoJson(&obj, "float", "");
	}
	else {
		
	}
	const gchar *weekly_clickKey = "weekly_click";
	json_object_set_member(pJsonObject, weekly_clickKey, node);
	if (isprimitive("float")) {
		float obj = getWeeklyClickLower();
		node = converttoJson(&obj, "float", "");
	}
	else {
		
	}
	const gchar *weekly_click_lowerKey = "weekly_click_lower";
	json_object_set_member(pJsonObject, weekly_click_lowerKey, node);
	if (isprimitive("float")) {
		float obj = getWeeklyClickUpper();
		node = converttoJson(&obj, "float", "");
	}
	else {
		
	}
	const gchar *weekly_click_upperKey = "weekly_click_upper";
	json_object_set_member(pJsonObject, weekly_click_upperKey, node);
	if (isprimitive("float")) {
		float obj = getWeeklyFrequency();
		node = converttoJson(&obj, "float", "");
	}
	else {
		
	}
	const gchar *weekly_frequencyKey = "weekly_frequency";
	json_object_set_member(pJsonObject, weekly_frequencyKey, node);
	if (isprimitive("float")) {
		float obj = getWeeklyFrequencyLower();
		node = converttoJson(&obj, "float", "");
	}
	else {
		
	}
	const gchar *weekly_frequency_lowerKey = "weekly_frequency_lower";
	json_object_set_member(pJsonObject, weekly_frequency_lowerKey, node);
	if (isprimitive("float")) {
		float obj = getWeeklyFrequencyUpper();
		node = converttoJson(&obj, "float", "");
	}
	else {
		
	}
	const gchar *weekly_frequency_upperKey = "weekly_frequency_upper";
	json_object_set_member(pJsonObject, weekly_frequency_upperKey, node);
	if (isprimitive("float")) {
		float obj = getWeeklyImpression();
		node = converttoJson(&obj, "float", "");
	}
	else {
		
	}
	const gchar *weekly_impressionKey = "weekly_impression";
	json_object_set_member(pJsonObject, weekly_impressionKey, node);
	if (isprimitive("float")) {
		float obj = getWeeklyImpressionLower();
		node = converttoJson(&obj, "float", "");
	}
	else {
		
	}
	const gchar *weekly_impression_lowerKey = "weekly_impression_lower";
	json_object_set_member(pJsonObject, weekly_impression_lowerKey, node);
	if (isprimitive("float")) {
		float obj = getWeeklyImpressionUpper();
		node = converttoJson(&obj, "float", "");
	}
	else {
		
	}
	const gchar *weekly_impression_upperKey = "weekly_impression_upper";
	json_object_set_member(pJsonObject, weekly_impression_upperKey, node);
	if (isprimitive("float")) {
		float obj = getWeeklyReach();
		node = converttoJson(&obj, "float", "");
	}
	else {
		
	}
	const gchar *weekly_reachKey = "weekly_reach";
	json_object_set_member(pJsonObject, weekly_reachKey, node);
	if (isprimitive("float")) {
		float obj = getWeeklyReachLower();
		node = converttoJson(&obj, "float", "");
	}
	else {
		
	}
	const gchar *weekly_reach_lowerKey = "weekly_reach_lower";
	json_object_set_member(pJsonObject, weekly_reach_lowerKey, node);
	if (isprimitive("float")) {
		float obj = getWeeklyReachUpper();
		node = converttoJson(&obj, "float", "");
	}
	else {
		
	}
	const gchar *weekly_reach_upperKey = "weekly_reach_upper";
	json_object_set_member(pJsonObject, weekly_reach_upperKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

float
CampaignDeliveryEstimatesDerivedMetrics::getCpc()
{
	return cpc;
}

void
CampaignDeliveryEstimatesDerivedMetrics::setCpc(float  cpc)
{
	this->cpc = cpc;
}

float
CampaignDeliveryEstimatesDerivedMetrics::getCpcLower()
{
	return cpc_lower;
}

void
CampaignDeliveryEstimatesDerivedMetrics::setCpcLower(float  cpc_lower)
{
	this->cpc_lower = cpc_lower;
}

float
CampaignDeliveryEstimatesDerivedMetrics::getCpcUpper()
{
	return cpc_upper;
}

void
CampaignDeliveryEstimatesDerivedMetrics::setCpcUpper(float  cpc_upper)
{
	this->cpc_upper = cpc_upper;
}

float
CampaignDeliveryEstimatesDerivedMetrics::getCpm()
{
	return cpm;
}

void
CampaignDeliveryEstimatesDerivedMetrics::setCpm(float  cpm)
{
	this->cpm = cpm;
}

float
CampaignDeliveryEstimatesDerivedMetrics::getCpmLower()
{
	return cpm_lower;
}

void
CampaignDeliveryEstimatesDerivedMetrics::setCpmLower(float  cpm_lower)
{
	this->cpm_lower = cpm_lower;
}

float
CampaignDeliveryEstimatesDerivedMetrics::getCpmUpper()
{
	return cpm_upper;
}

void
CampaignDeliveryEstimatesDerivedMetrics::setCpmUpper(float  cpm_upper)
{
	this->cpm_upper = cpm_upper;
}

float
CampaignDeliveryEstimatesDerivedMetrics::getLifetimeFrequency()
{
	return lifetime_frequency;
}

void
CampaignDeliveryEstimatesDerivedMetrics::setLifetimeFrequency(float  lifetime_frequency)
{
	this->lifetime_frequency = lifetime_frequency;
}

float
CampaignDeliveryEstimatesDerivedMetrics::getLifetimeFrequencyLower()
{
	return lifetime_frequency_lower;
}

void
CampaignDeliveryEstimatesDerivedMetrics::setLifetimeFrequencyLower(float  lifetime_frequency_lower)
{
	this->lifetime_frequency_lower = lifetime_frequency_lower;
}

float
CampaignDeliveryEstimatesDerivedMetrics::getLifetimeFrequencyUpper()
{
	return lifetime_frequency_upper;
}

void
CampaignDeliveryEstimatesDerivedMetrics::setLifetimeFrequencyUpper(float  lifetime_frequency_upper)
{
	this->lifetime_frequency_upper = lifetime_frequency_upper;
}

float
CampaignDeliveryEstimatesDerivedMetrics::getLifetimeImpression()
{
	return lifetime_impression;
}

void
CampaignDeliveryEstimatesDerivedMetrics::setLifetimeImpression(float  lifetime_impression)
{
	this->lifetime_impression = lifetime_impression;
}

float
CampaignDeliveryEstimatesDerivedMetrics::getLifetimeImpressionLower()
{
	return lifetime_impression_lower;
}

void
CampaignDeliveryEstimatesDerivedMetrics::setLifetimeImpressionLower(float  lifetime_impression_lower)
{
	this->lifetime_impression_lower = lifetime_impression_lower;
}

float
CampaignDeliveryEstimatesDerivedMetrics::getLifetimeImpressionUpper()
{
	return lifetime_impression_upper;
}

void
CampaignDeliveryEstimatesDerivedMetrics::setLifetimeImpressionUpper(float  lifetime_impression_upper)
{
	this->lifetime_impression_upper = lifetime_impression_upper;
}

float
CampaignDeliveryEstimatesDerivedMetrics::getLifetimeReach()
{
	return lifetime_reach;
}

void
CampaignDeliveryEstimatesDerivedMetrics::setLifetimeReach(float  lifetime_reach)
{
	this->lifetime_reach = lifetime_reach;
}

float
CampaignDeliveryEstimatesDerivedMetrics::getLifetimeReachLower()
{
	return lifetime_reach_lower;
}

void
CampaignDeliveryEstimatesDerivedMetrics::setLifetimeReachLower(float  lifetime_reach_lower)
{
	this->lifetime_reach_lower = lifetime_reach_lower;
}

float
CampaignDeliveryEstimatesDerivedMetrics::getLifetimeReachUpper()
{
	return lifetime_reach_upper;
}

void
CampaignDeliveryEstimatesDerivedMetrics::setLifetimeReachUpper(float  lifetime_reach_upper)
{
	this->lifetime_reach_upper = lifetime_reach_upper;
}

float
CampaignDeliveryEstimatesDerivedMetrics::getWeeklyClick()
{
	return weekly_click;
}

void
CampaignDeliveryEstimatesDerivedMetrics::setWeeklyClick(float  weekly_click)
{
	this->weekly_click = weekly_click;
}

float
CampaignDeliveryEstimatesDerivedMetrics::getWeeklyClickLower()
{
	return weekly_click_lower;
}

void
CampaignDeliveryEstimatesDerivedMetrics::setWeeklyClickLower(float  weekly_click_lower)
{
	this->weekly_click_lower = weekly_click_lower;
}

float
CampaignDeliveryEstimatesDerivedMetrics::getWeeklyClickUpper()
{
	return weekly_click_upper;
}

void
CampaignDeliveryEstimatesDerivedMetrics::setWeeklyClickUpper(float  weekly_click_upper)
{
	this->weekly_click_upper = weekly_click_upper;
}

float
CampaignDeliveryEstimatesDerivedMetrics::getWeeklyFrequency()
{
	return weekly_frequency;
}

void
CampaignDeliveryEstimatesDerivedMetrics::setWeeklyFrequency(float  weekly_frequency)
{
	this->weekly_frequency = weekly_frequency;
}

float
CampaignDeliveryEstimatesDerivedMetrics::getWeeklyFrequencyLower()
{
	return weekly_frequency_lower;
}

void
CampaignDeliveryEstimatesDerivedMetrics::setWeeklyFrequencyLower(float  weekly_frequency_lower)
{
	this->weekly_frequency_lower = weekly_frequency_lower;
}

float
CampaignDeliveryEstimatesDerivedMetrics::getWeeklyFrequencyUpper()
{
	return weekly_frequency_upper;
}

void
CampaignDeliveryEstimatesDerivedMetrics::setWeeklyFrequencyUpper(float  weekly_frequency_upper)
{
	this->weekly_frequency_upper = weekly_frequency_upper;
}

float
CampaignDeliveryEstimatesDerivedMetrics::getWeeklyImpression()
{
	return weekly_impression;
}

void
CampaignDeliveryEstimatesDerivedMetrics::setWeeklyImpression(float  weekly_impression)
{
	this->weekly_impression = weekly_impression;
}

float
CampaignDeliveryEstimatesDerivedMetrics::getWeeklyImpressionLower()
{
	return weekly_impression_lower;
}

void
CampaignDeliveryEstimatesDerivedMetrics::setWeeklyImpressionLower(float  weekly_impression_lower)
{
	this->weekly_impression_lower = weekly_impression_lower;
}

float
CampaignDeliveryEstimatesDerivedMetrics::getWeeklyImpressionUpper()
{
	return weekly_impression_upper;
}

void
CampaignDeliveryEstimatesDerivedMetrics::setWeeklyImpressionUpper(float  weekly_impression_upper)
{
	this->weekly_impression_upper = weekly_impression_upper;
}

float
CampaignDeliveryEstimatesDerivedMetrics::getWeeklyReach()
{
	return weekly_reach;
}

void
CampaignDeliveryEstimatesDerivedMetrics::setWeeklyReach(float  weekly_reach)
{
	this->weekly_reach = weekly_reach;
}

float
CampaignDeliveryEstimatesDerivedMetrics::getWeeklyReachLower()
{
	return weekly_reach_lower;
}

void
CampaignDeliveryEstimatesDerivedMetrics::setWeeklyReachLower(float  weekly_reach_lower)
{
	this->weekly_reach_lower = weekly_reach_lower;
}

float
CampaignDeliveryEstimatesDerivedMetrics::getWeeklyReachUpper()
{
	return weekly_reach_upper;
}

void
CampaignDeliveryEstimatesDerivedMetrics::setWeeklyReachUpper(float  weekly_reach_upper)
{
	this->weekly_reach_upper = weekly_reach_upper;
}


