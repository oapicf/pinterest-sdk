#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CampaignBidOptionsUpdate.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CampaignBidOptionsUpdate::CampaignBidOptionsUpdate()
{
	//__init();
}

CampaignBidOptionsUpdate::~CampaignBidOptionsUpdate()
{
	//__cleanup();
}

void
CampaignBidOptionsUpdate::__init()
{
	//age_bucket_multipliers = null;
	//app_type_multipliers = null;
	//audience_multipliers = null;
	//freq_bid_multiplier_time_window = null;
	//frequency_multipliers = null;
	//gender_multipliers = null;
	//placement_multipliers = null;
	//new std::list()std::list> update_mask;
}

void
CampaignBidOptionsUpdate::__cleanup()
{
	//if(age_bucket_multipliers != NULL) {
	//
	//delete age_bucket_multipliers;
	//age_bucket_multipliers = NULL;
	//}
	//if(app_type_multipliers != NULL) {
	//
	//delete app_type_multipliers;
	//app_type_multipliers = NULL;
	//}
	//if(audience_multipliers != NULL) {
	//
	//delete audience_multipliers;
	//audience_multipliers = NULL;
	//}
	//if(freq_bid_multiplier_time_window != NULL) {
	//
	//delete freq_bid_multiplier_time_window;
	//freq_bid_multiplier_time_window = NULL;
	//}
	//if(frequency_multipliers != NULL) {
	//
	//delete frequency_multipliers;
	//frequency_multipliers = NULL;
	//}
	//if(gender_multipliers != NULL) {
	//
	//delete gender_multipliers;
	//gender_multipliers = NULL;
	//}
	//if(placement_multipliers != NULL) {
	//
	//delete placement_multipliers;
	//placement_multipliers = NULL;
	//}
	//if(update_mask != NULL) {
	//update_mask.RemoveAll(true);
	//delete update_mask;
	//update_mask = NULL;
	//}
	//
}

void
CampaignBidOptionsUpdate::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *age_bucket_multipliersKey = "age_bucket_multipliers";
	node = json_object_get_member(pJsonObject, age_bucket_multipliersKey);
	if (node !=NULL) {
	

		if (isprimitive("AgeBucketMultipliers")) {
			jsonToValue(&age_bucket_multipliers, node, "AgeBucketMultipliers", "AgeBucketMultipliers");
		} else {
			
			AgeBucketMultipliers* obj = static_cast<AgeBucketMultipliers*> (&age_bucket_multipliers);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *app_type_multipliersKey = "app_type_multipliers";
	node = json_object_get_member(pJsonObject, app_type_multipliersKey);
	if (node !=NULL) {
	

		if (isprimitive("AppTypeMultipliers")) {
			jsonToValue(&app_type_multipliers, node, "AppTypeMultipliers", "AppTypeMultipliers");
		} else {
			
			AppTypeMultipliers* obj = static_cast<AppTypeMultipliers*> (&app_type_multipliers);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *audience_multipliersKey = "audience_multipliers";
	node = json_object_get_member(pJsonObject, audience_multipliersKey);
	if (node !=NULL) {
	

		if (isprimitive("CampaignAudienceMultipliers")) {
			jsonToValue(&audience_multipliers, node, "CampaignAudienceMultipliers", "CampaignAudienceMultipliers");
		} else {
			
			CampaignAudienceMultipliers* obj = static_cast<CampaignAudienceMultipliers*> (&audience_multipliers);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *freq_bid_multiplier_time_windowKey = "freq_bid_multiplier_time_window";
	node = json_object_get_member(pJsonObject, freq_bid_multiplier_time_windowKey);
	if (node !=NULL) {
	

		if (isprimitive("FreqBidMultiplierTimeWindow")) {
			jsonToValue(&freq_bid_multiplier_time_window, node, "FreqBidMultiplierTimeWindow", "FreqBidMultiplierTimeWindow");
		} else {
			
			FreqBidMultiplierTimeWindow* obj = static_cast<FreqBidMultiplierTimeWindow*> (&freq_bid_multiplier_time_window);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *frequency_multipliersKey = "frequency_multipliers";
	node = json_object_get_member(pJsonObject, frequency_multipliersKey);
	if (node !=NULL) {
	

		if (isprimitive("FrequencyMultipliers")) {
			jsonToValue(&frequency_multipliers, node, "FrequencyMultipliers", "FrequencyMultipliers");
		} else {
			
			FrequencyMultipliers* obj = static_cast<FrequencyMultipliers*> (&frequency_multipliers);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *gender_multipliersKey = "gender_multipliers";
	node = json_object_get_member(pJsonObject, gender_multipliersKey);
	if (node !=NULL) {
	

		if (isprimitive("GenderMultipliers")) {
			jsonToValue(&gender_multipliers, node, "GenderMultipliers", "GenderMultipliers");
		} else {
			
			GenderMultipliers* obj = static_cast<GenderMultipliers*> (&gender_multipliers);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *placement_multipliersKey = "placement_multipliers";
	node = json_object_get_member(pJsonObject, placement_multipliersKey);
	if (node !=NULL) {
	

		if (isprimitive("PlacementMultipliers")) {
			jsonToValue(&placement_multipliers, node, "PlacementMultipliers", "PlacementMultipliers");
		} else {
			
			PlacementMultipliers* obj = static_cast<PlacementMultipliers*> (&placement_multipliers);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *update_maskKey = "update_mask";
	node = json_object_get_member(pJsonObject, update_maskKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<CampaignBidOptionsUpdateMaskItems> new_list;
			CampaignBidOptionsUpdateMaskItems inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("CampaignBidOptionsUpdateMaskItems")) {
					jsonToValue(&inst, temp_json, "CampaignBidOptionsUpdateMaskItems", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			update_mask = new_list;
		}
		
	}
}

CampaignBidOptionsUpdate::CampaignBidOptionsUpdate(char* json)
{
	this->fromJson(json);
}

char*
CampaignBidOptionsUpdate::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("AgeBucketMultipliers")) {
		AgeBucketMultipliers obj = getAgeBucketMultipliers();
		node = converttoJson(&obj, "AgeBucketMultipliers", "");
	}
	else {
		
		AgeBucketMultipliers obj = static_cast<AgeBucketMultipliers> (getAgeBucketMultipliers());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *age_bucket_multipliersKey = "age_bucket_multipliers";
	json_object_set_member(pJsonObject, age_bucket_multipliersKey, node);
	if (isprimitive("AppTypeMultipliers")) {
		AppTypeMultipliers obj = getAppTypeMultipliers();
		node = converttoJson(&obj, "AppTypeMultipliers", "");
	}
	else {
		
		AppTypeMultipliers obj = static_cast<AppTypeMultipliers> (getAppTypeMultipliers());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *app_type_multipliersKey = "app_type_multipliers";
	json_object_set_member(pJsonObject, app_type_multipliersKey, node);
	if (isprimitive("CampaignAudienceMultipliers")) {
		CampaignAudienceMultipliers obj = getAudienceMultipliers();
		node = converttoJson(&obj, "CampaignAudienceMultipliers", "");
	}
	else {
		
		CampaignAudienceMultipliers obj = static_cast<CampaignAudienceMultipliers> (getAudienceMultipliers());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *audience_multipliersKey = "audience_multipliers";
	json_object_set_member(pJsonObject, audience_multipliersKey, node);
	if (isprimitive("FreqBidMultiplierTimeWindow")) {
		FreqBidMultiplierTimeWindow obj = getFreqBidMultiplierTimeWindow();
		node = converttoJson(&obj, "FreqBidMultiplierTimeWindow", "");
	}
	else {
		
		FreqBidMultiplierTimeWindow obj = static_cast<FreqBidMultiplierTimeWindow> (getFreqBidMultiplierTimeWindow());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *freq_bid_multiplier_time_windowKey = "freq_bid_multiplier_time_window";
	json_object_set_member(pJsonObject, freq_bid_multiplier_time_windowKey, node);
	if (isprimitive("FrequencyMultipliers")) {
		FrequencyMultipliers obj = getFrequencyMultipliers();
		node = converttoJson(&obj, "FrequencyMultipliers", "");
	}
	else {
		
		FrequencyMultipliers obj = static_cast<FrequencyMultipliers> (getFrequencyMultipliers());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *frequency_multipliersKey = "frequency_multipliers";
	json_object_set_member(pJsonObject, frequency_multipliersKey, node);
	if (isprimitive("GenderMultipliers")) {
		GenderMultipliers obj = getGenderMultipliers();
		node = converttoJson(&obj, "GenderMultipliers", "");
	}
	else {
		
		GenderMultipliers obj = static_cast<GenderMultipliers> (getGenderMultipliers());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *gender_multipliersKey = "gender_multipliers";
	json_object_set_member(pJsonObject, gender_multipliersKey, node);
	if (isprimitive("PlacementMultipliers")) {
		PlacementMultipliers obj = getPlacementMultipliers();
		node = converttoJson(&obj, "PlacementMultipliers", "");
	}
	else {
		
		PlacementMultipliers obj = static_cast<PlacementMultipliers> (getPlacementMultipliers());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *placement_multipliersKey = "placement_multipliers";
	json_object_set_member(pJsonObject, placement_multipliersKey, node);
	if (isprimitive("CampaignBidOptionsUpdateMaskItems")) {
		list<CampaignBidOptionsUpdateMaskItems> new_list = static_cast<list <CampaignBidOptionsUpdateMaskItems> > (getUpdateMask());
		node = converttoJson(&new_list, "CampaignBidOptionsUpdateMaskItems", "array");
	} else {
		node = json_node_alloc();
		list<CampaignBidOptionsUpdateMaskItems> new_list = static_cast<list <CampaignBidOptionsUpdateMaskItems> > (getUpdateMask());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<CampaignBidOptionsUpdateMaskItems>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			CampaignBidOptionsUpdateMaskItems obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *update_maskKey = "update_mask";
	json_object_set_member(pJsonObject, update_maskKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

AgeBucketMultipliers
CampaignBidOptionsUpdate::getAgeBucketMultipliers()
{
	return age_bucket_multipliers;
}

void
CampaignBidOptionsUpdate::setAgeBucketMultipliers(AgeBucketMultipliers  age_bucket_multipliers)
{
	this->age_bucket_multipliers = age_bucket_multipliers;
}

AppTypeMultipliers
CampaignBidOptionsUpdate::getAppTypeMultipliers()
{
	return app_type_multipliers;
}

void
CampaignBidOptionsUpdate::setAppTypeMultipliers(AppTypeMultipliers  app_type_multipliers)
{
	this->app_type_multipliers = app_type_multipliers;
}

CampaignAudienceMultipliers
CampaignBidOptionsUpdate::getAudienceMultipliers()
{
	return audience_multipliers;
}

void
CampaignBidOptionsUpdate::setAudienceMultipliers(CampaignAudienceMultipliers  audience_multipliers)
{
	this->audience_multipliers = audience_multipliers;
}

FreqBidMultiplierTimeWindow
CampaignBidOptionsUpdate::getFreqBidMultiplierTimeWindow()
{
	return freq_bid_multiplier_time_window;
}

void
CampaignBidOptionsUpdate::setFreqBidMultiplierTimeWindow(FreqBidMultiplierTimeWindow  freq_bid_multiplier_time_window)
{
	this->freq_bid_multiplier_time_window = freq_bid_multiplier_time_window;
}

FrequencyMultipliers
CampaignBidOptionsUpdate::getFrequencyMultipliers()
{
	return frequency_multipliers;
}

void
CampaignBidOptionsUpdate::setFrequencyMultipliers(FrequencyMultipliers  frequency_multipliers)
{
	this->frequency_multipliers = frequency_multipliers;
}

GenderMultipliers
CampaignBidOptionsUpdate::getGenderMultipliers()
{
	return gender_multipliers;
}

void
CampaignBidOptionsUpdate::setGenderMultipliers(GenderMultipliers  gender_multipliers)
{
	this->gender_multipliers = gender_multipliers;
}

PlacementMultipliers
CampaignBidOptionsUpdate::getPlacementMultipliers()
{
	return placement_multipliers;
}

void
CampaignBidOptionsUpdate::setPlacementMultipliers(PlacementMultipliers  placement_multipliers)
{
	this->placement_multipliers = placement_multipliers;
}

std::list<CampaignBidOptionsUpdateMaskItems>
CampaignBidOptionsUpdate::getUpdateMask()
{
	return update_mask;
}

void
CampaignBidOptionsUpdate::setUpdateMask(std::list <CampaignBidOptionsUpdateMaskItems> update_mask)
{
	this->update_mask = update_mask;
}


