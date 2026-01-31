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
	//app_type_multipliers = new AppTypeMultipliers();
	//audience_multipliers = new CampaignAudienceMultipliers();
	//placement_multipliers = new PlacementMultipliers();
	//new std::list()std::list> update_mask;
}

void
CampaignBidOptionsUpdate::__cleanup()
{
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
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getUpdateMask());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getUpdateMask());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
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

std::list<std::string>
CampaignBidOptionsUpdate::getUpdateMask()
{
	return update_mask;
}

void
CampaignBidOptionsUpdate::setUpdateMask(std::list <std::string> update_mask)
{
	this->update_mask = update_mask;
}


