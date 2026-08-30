#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Schedule_delta_value.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Schedule_delta_value::Schedule_delta_value()
{
	//__init();
}

Schedule_delta_value::~Schedule_delta_value()
{
	//__cleanup();
}

void
Schedule_delta_value::__init()
{
	//age_bucket_multipliers = new BidOptionsAgeBucketMultipliers();
	//app_type_multipliers = new BidOptionsAppTypeMultipliers();
	//new std::list()std::list> audience_multipliers;
	//gender_multipliers = new BidOptionsGenderMultipliers();
	//placement_multipliers = new BidOptionsPlacementMultipliers();
}

void
Schedule_delta_value::__cleanup()
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
	//audience_multipliers.RemoveAll(true);
	//delete audience_multipliers;
	//audience_multipliers = NULL;
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
	//
}

void
Schedule_delta_value::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *age_bucket_multipliersKey = "age_bucket_multipliers";
	node = json_object_get_member(pJsonObject, age_bucket_multipliersKey);
	if (node !=NULL) {
	

		if (isprimitive("BidOptionsAgeBucketMultipliers")) {
			jsonToValue(&age_bucket_multipliers, node, "BidOptionsAgeBucketMultipliers", "BidOptionsAgeBucketMultipliers");
		} else {
			
			BidOptionsAgeBucketMultipliers* obj = static_cast<BidOptionsAgeBucketMultipliers*> (&age_bucket_multipliers);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *app_type_multipliersKey = "app_type_multipliers";
	node = json_object_get_member(pJsonObject, app_type_multipliersKey);
	if (node !=NULL) {
	

		if (isprimitive("BidOptionsAppTypeMultipliers")) {
			jsonToValue(&app_type_multipliers, node, "BidOptionsAppTypeMultipliers", "BidOptionsAppTypeMultipliers");
		} else {
			
			BidOptionsAppTypeMultipliers* obj = static_cast<BidOptionsAppTypeMultipliers*> (&app_type_multipliers);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *audience_multipliersKey = "audience_multipliers";
	node = json_object_get_member(pJsonObject, audience_multipliersKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<BidOptionsAudienceMultipliers> new_list;
			BidOptionsAudienceMultipliers inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("BidOptionsAudienceMultipliers")) {
					jsonToValue(&inst, temp_json, "BidOptionsAudienceMultipliers", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			audience_multipliers = new_list;
		}
		
	}
	const gchar *gender_multipliersKey = "gender_multipliers";
	node = json_object_get_member(pJsonObject, gender_multipliersKey);
	if (node !=NULL) {
	

		if (isprimitive("BidOptionsGenderMultipliers")) {
			jsonToValue(&gender_multipliers, node, "BidOptionsGenderMultipliers", "BidOptionsGenderMultipliers");
		} else {
			
			BidOptionsGenderMultipliers* obj = static_cast<BidOptionsGenderMultipliers*> (&gender_multipliers);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *placement_multipliersKey = "placement_multipliers";
	node = json_object_get_member(pJsonObject, placement_multipliersKey);
	if (node !=NULL) {
	

		if (isprimitive("BidOptionsPlacementMultipliers")) {
			jsonToValue(&placement_multipliers, node, "BidOptionsPlacementMultipliers", "BidOptionsPlacementMultipliers");
		} else {
			
			BidOptionsPlacementMultipliers* obj = static_cast<BidOptionsPlacementMultipliers*> (&placement_multipliers);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

Schedule_delta_value::Schedule_delta_value(char* json)
{
	this->fromJson(json);
}

char*
Schedule_delta_value::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("BidOptionsAgeBucketMultipliers")) {
		BidOptionsAgeBucketMultipliers obj = getAgeBucketMultipliers();
		node = converttoJson(&obj, "BidOptionsAgeBucketMultipliers", "");
	}
	else {
		
		BidOptionsAgeBucketMultipliers obj = static_cast<BidOptionsAgeBucketMultipliers> (getAgeBucketMultipliers());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *age_bucket_multipliersKey = "age_bucket_multipliers";
	json_object_set_member(pJsonObject, age_bucket_multipliersKey, node);
	if (isprimitive("BidOptionsAppTypeMultipliers")) {
		BidOptionsAppTypeMultipliers obj = getAppTypeMultipliers();
		node = converttoJson(&obj, "BidOptionsAppTypeMultipliers", "");
	}
	else {
		
		BidOptionsAppTypeMultipliers obj = static_cast<BidOptionsAppTypeMultipliers> (getAppTypeMultipliers());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *app_type_multipliersKey = "app_type_multipliers";
	json_object_set_member(pJsonObject, app_type_multipliersKey, node);
	if (isprimitive("BidOptionsAudienceMultipliers")) {
		list<BidOptionsAudienceMultipliers> new_list = static_cast<list <BidOptionsAudienceMultipliers> > (getAudienceMultipliers());
		node = converttoJson(&new_list, "BidOptionsAudienceMultipliers", "array");
	} else {
		node = json_node_alloc();
		list<BidOptionsAudienceMultipliers> new_list = static_cast<list <BidOptionsAudienceMultipliers> > (getAudienceMultipliers());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<BidOptionsAudienceMultipliers>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			BidOptionsAudienceMultipliers obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *audience_multipliersKey = "audience_multipliers";
	json_object_set_member(pJsonObject, audience_multipliersKey, node);
	if (isprimitive("BidOptionsGenderMultipliers")) {
		BidOptionsGenderMultipliers obj = getGenderMultipliers();
		node = converttoJson(&obj, "BidOptionsGenderMultipliers", "");
	}
	else {
		
		BidOptionsGenderMultipliers obj = static_cast<BidOptionsGenderMultipliers> (getGenderMultipliers());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *gender_multipliersKey = "gender_multipliers";
	json_object_set_member(pJsonObject, gender_multipliersKey, node);
	if (isprimitive("BidOptionsPlacementMultipliers")) {
		BidOptionsPlacementMultipliers obj = getPlacementMultipliers();
		node = converttoJson(&obj, "BidOptionsPlacementMultipliers", "");
	}
	else {
		
		BidOptionsPlacementMultipliers obj = static_cast<BidOptionsPlacementMultipliers> (getPlacementMultipliers());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *placement_multipliersKey = "placement_multipliers";
	json_object_set_member(pJsonObject, placement_multipliersKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

BidOptionsAgeBucketMultipliers
Schedule_delta_value::getAgeBucketMultipliers()
{
	return age_bucket_multipliers;
}

void
Schedule_delta_value::setAgeBucketMultipliers(BidOptionsAgeBucketMultipliers  age_bucket_multipliers)
{
	this->age_bucket_multipliers = age_bucket_multipliers;
}

BidOptionsAppTypeMultipliers
Schedule_delta_value::getAppTypeMultipliers()
{
	return app_type_multipliers;
}

void
Schedule_delta_value::setAppTypeMultipliers(BidOptionsAppTypeMultipliers  app_type_multipliers)
{
	this->app_type_multipliers = app_type_multipliers;
}

std::list<BidOptionsAudienceMultipliers>
Schedule_delta_value::getAudienceMultipliers()
{
	return audience_multipliers;
}

void
Schedule_delta_value::setAudienceMultipliers(std::list <BidOptionsAudienceMultipliers> audience_multipliers)
{
	this->audience_multipliers = audience_multipliers;
}

BidOptionsGenderMultipliers
Schedule_delta_value::getGenderMultipliers()
{
	return gender_multipliers;
}

void
Schedule_delta_value::setGenderMultipliers(BidOptionsGenderMultipliers  gender_multipliers)
{
	this->gender_multipliers = gender_multipliers;
}

BidOptionsPlacementMultipliers
Schedule_delta_value::getPlacementMultipliers()
{
	return placement_multipliers;
}

void
Schedule_delta_value::setPlacementMultipliers(BidOptionsPlacementMultipliers  placement_multipliers)
{
	this->placement_multipliers = placement_multipliers;
}


