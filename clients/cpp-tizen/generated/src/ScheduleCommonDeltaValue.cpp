#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ScheduleCommonDeltaValue.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ScheduleCommonDeltaValue::ScheduleCommonDeltaValue()
{
	//__init();
}

ScheduleCommonDeltaValue::~ScheduleCommonDeltaValue()
{
	//__cleanup();
}

void
ScheduleCommonDeltaValue::__init()
{
	//age_bucket_multipliers = new ScheduleAgeBucketMultipliers();
	//app_type_multipliers = new ScheduleAppTypeMultipliers();
	//audience_multipliers = new ScheduleAudienceMultipliers();
	//gender_multipliers = new ScheduleBidOptions_gender_multipliers();
	//placement_multipliers = new ScheduleBidOptions_placement_multipliers();
}

void
ScheduleCommonDeltaValue::__cleanup()
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
ScheduleCommonDeltaValue::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *age_bucket_multipliersKey = "age_bucket_multipliers";
	node = json_object_get_member(pJsonObject, age_bucket_multipliersKey);
	if (node !=NULL) {
	

		if (isprimitive("ScheduleAgeBucketMultipliers")) {
			jsonToValue(&age_bucket_multipliers, node, "ScheduleAgeBucketMultipliers", "ScheduleAgeBucketMultipliers");
		} else {
			
			ScheduleAgeBucketMultipliers* obj = static_cast<ScheduleAgeBucketMultipliers*> (&age_bucket_multipliers);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *app_type_multipliersKey = "app_type_multipliers";
	node = json_object_get_member(pJsonObject, app_type_multipliersKey);
	if (node !=NULL) {
	

		if (isprimitive("ScheduleAppTypeMultipliers")) {
			jsonToValue(&app_type_multipliers, node, "ScheduleAppTypeMultipliers", "ScheduleAppTypeMultipliers");
		} else {
			
			ScheduleAppTypeMultipliers* obj = static_cast<ScheduleAppTypeMultipliers*> (&app_type_multipliers);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *audience_multipliersKey = "audience_multipliers";
	node = json_object_get_member(pJsonObject, audience_multipliersKey);
	if (node !=NULL) {
	

		if (isprimitive("ScheduleAudienceMultipliers")) {
			jsonToValue(&audience_multipliers, node, "ScheduleAudienceMultipliers", "ScheduleAudienceMultipliers");
		} else {
			
			ScheduleAudienceMultipliers* obj = static_cast<ScheduleAudienceMultipliers*> (&audience_multipliers);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *gender_multipliersKey = "gender_multipliers";
	node = json_object_get_member(pJsonObject, gender_multipliersKey);
	if (node !=NULL) {
	

		if (isprimitive("ScheduleBidOptions_gender_multipliers")) {
			jsonToValue(&gender_multipliers, node, "ScheduleBidOptions_gender_multipliers", "ScheduleBidOptions_gender_multipliers");
		} else {
			
			ScheduleBidOptions_gender_multipliers* obj = static_cast<ScheduleBidOptions_gender_multipliers*> (&gender_multipliers);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *placement_multipliersKey = "placement_multipliers";
	node = json_object_get_member(pJsonObject, placement_multipliersKey);
	if (node !=NULL) {
	

		if (isprimitive("ScheduleBidOptions_placement_multipliers")) {
			jsonToValue(&placement_multipliers, node, "ScheduleBidOptions_placement_multipliers", "ScheduleBidOptions_placement_multipliers");
		} else {
			
			ScheduleBidOptions_placement_multipliers* obj = static_cast<ScheduleBidOptions_placement_multipliers*> (&placement_multipliers);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ScheduleCommonDeltaValue::ScheduleCommonDeltaValue(char* json)
{
	this->fromJson(json);
}

char*
ScheduleCommonDeltaValue::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ScheduleAgeBucketMultipliers")) {
		ScheduleAgeBucketMultipliers obj = getAgeBucketMultipliers();
		node = converttoJson(&obj, "ScheduleAgeBucketMultipliers", "");
	}
	else {
		
		ScheduleAgeBucketMultipliers obj = static_cast<ScheduleAgeBucketMultipliers> (getAgeBucketMultipliers());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *age_bucket_multipliersKey = "age_bucket_multipliers";
	json_object_set_member(pJsonObject, age_bucket_multipliersKey, node);
	if (isprimitive("ScheduleAppTypeMultipliers")) {
		ScheduleAppTypeMultipliers obj = getAppTypeMultipliers();
		node = converttoJson(&obj, "ScheduleAppTypeMultipliers", "");
	}
	else {
		
		ScheduleAppTypeMultipliers obj = static_cast<ScheduleAppTypeMultipliers> (getAppTypeMultipliers());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *app_type_multipliersKey = "app_type_multipliers";
	json_object_set_member(pJsonObject, app_type_multipliersKey, node);
	if (isprimitive("ScheduleAudienceMultipliers")) {
		ScheduleAudienceMultipliers obj = getAudienceMultipliers();
		node = converttoJson(&obj, "ScheduleAudienceMultipliers", "");
	}
	else {
		
		ScheduleAudienceMultipliers obj = static_cast<ScheduleAudienceMultipliers> (getAudienceMultipliers());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *audience_multipliersKey = "audience_multipliers";
	json_object_set_member(pJsonObject, audience_multipliersKey, node);
	if (isprimitive("ScheduleBidOptions_gender_multipliers")) {
		ScheduleBidOptions_gender_multipliers obj = getGenderMultipliers();
		node = converttoJson(&obj, "ScheduleBidOptions_gender_multipliers", "");
	}
	else {
		
		ScheduleBidOptions_gender_multipliers obj = static_cast<ScheduleBidOptions_gender_multipliers> (getGenderMultipliers());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *gender_multipliersKey = "gender_multipliers";
	json_object_set_member(pJsonObject, gender_multipliersKey, node);
	if (isprimitive("ScheduleBidOptions_placement_multipliers")) {
		ScheduleBidOptions_placement_multipliers obj = getPlacementMultipliers();
		node = converttoJson(&obj, "ScheduleBidOptions_placement_multipliers", "");
	}
	else {
		
		ScheduleBidOptions_placement_multipliers obj = static_cast<ScheduleBidOptions_placement_multipliers> (getPlacementMultipliers());
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

ScheduleAgeBucketMultipliers
ScheduleCommonDeltaValue::getAgeBucketMultipliers()
{
	return age_bucket_multipliers;
}

void
ScheduleCommonDeltaValue::setAgeBucketMultipliers(ScheduleAgeBucketMultipliers  age_bucket_multipliers)
{
	this->age_bucket_multipliers = age_bucket_multipliers;
}

ScheduleAppTypeMultipliers
ScheduleCommonDeltaValue::getAppTypeMultipliers()
{
	return app_type_multipliers;
}

void
ScheduleCommonDeltaValue::setAppTypeMultipliers(ScheduleAppTypeMultipliers  app_type_multipliers)
{
	this->app_type_multipliers = app_type_multipliers;
}

ScheduleAudienceMultipliers
ScheduleCommonDeltaValue::getAudienceMultipliers()
{
	return audience_multipliers;
}

void
ScheduleCommonDeltaValue::setAudienceMultipliers(ScheduleAudienceMultipliers  audience_multipliers)
{
	this->audience_multipliers = audience_multipliers;
}

ScheduleBidOptions_gender_multipliers
ScheduleCommonDeltaValue::getGenderMultipliers()
{
	return gender_multipliers;
}

void
ScheduleCommonDeltaValue::setGenderMultipliers(ScheduleBidOptions_gender_multipliers  gender_multipliers)
{
	this->gender_multipliers = gender_multipliers;
}

ScheduleBidOptions_placement_multipliers
ScheduleCommonDeltaValue::getPlacementMultipliers()
{
	return placement_multipliers;
}

void
ScheduleCommonDeltaValue::setPlacementMultipliers(ScheduleBidOptions_placement_multipliers  placement_multipliers)
{
	this->placement_multipliers = placement_multipliers;
}


