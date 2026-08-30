

#include "ScheduleCommonDeltaValue.h"

using namespace Tiny;

ScheduleCommonDeltaValue::ScheduleCommonDeltaValue()
{
	age_bucket_multipliers = ScheduleAgeBucketMultipliers();
	app_type_multipliers = ScheduleAppTypeMultipliers();
	audience_multipliers = ScheduleAudienceMultipliers();
	gender_multipliers = ScheduleBidOptions_gender_multipliers();
	placement_multipliers = ScheduleBidOptions_placement_multipliers();
}

ScheduleCommonDeltaValue::ScheduleCommonDeltaValue(std::string jsonString)
{
	this->fromJson(jsonString);
}

ScheduleCommonDeltaValue::~ScheduleCommonDeltaValue()
{

}

void
ScheduleCommonDeltaValue::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *age_bucket_multipliersKey = "age_bucket_multipliers";

    if(object.has_key(age_bucket_multipliersKey))
    {
        bourne::json value = object[age_bucket_multipliersKey];




        ScheduleAgeBucketMultipliers* obj = &age_bucket_multipliers;
		obj->fromJson(value.dump());

    }

    const char *app_type_multipliersKey = "app_type_multipliers";

    if(object.has_key(app_type_multipliersKey))
    {
        bourne::json value = object[app_type_multipliersKey];




        ScheduleAppTypeMultipliers* obj = &app_type_multipliers;
		obj->fromJson(value.dump());

    }

    const char *audience_multipliersKey = "audience_multipliers";

    if(object.has_key(audience_multipliersKey))
    {
        bourne::json value = object[audience_multipliersKey];




        ScheduleAudienceMultipliers* obj = &audience_multipliers;
		obj->fromJson(value.dump());

    }

    const char *gender_multipliersKey = "gender_multipliers";

    if(object.has_key(gender_multipliersKey))
    {
        bourne::json value = object[gender_multipliersKey];




        ScheduleBidOptions_gender_multipliers* obj = &gender_multipliers;
		obj->fromJson(value.dump());

    }

    const char *placement_multipliersKey = "placement_multipliers";

    if(object.has_key(placement_multipliersKey))
    {
        bourne::json value = object[placement_multipliersKey];




        ScheduleBidOptions_placement_multipliers* obj = &placement_multipliers;
		obj->fromJson(value.dump());

    }


}

bourne::json
ScheduleCommonDeltaValue::toJson()
{
    bourne::json object = bourne::json::object();






	object["age_bucket_multipliers"] = getAgeBucketMultipliers().toJson();






	object["app_type_multipliers"] = getAppTypeMultipliers().toJson();






	object["audience_multipliers"] = getAudienceMultipliers().toJson();






	object["gender_multipliers"] = getGenderMultipliers().toJson();






	object["placement_multipliers"] = getPlacementMultipliers().toJson();


    return object;

}

ScheduleAgeBucketMultipliers&lt;std::string, double&gt;
ScheduleCommonDeltaValue::getAgeBucketMultipliers()
{
	return age_bucket_multipliers;
}

void
ScheduleCommonDeltaValue::setAgeBucketMultipliers(ScheduleAgeBucketMultipliers&lt;std::string, double&gt; age_bucket_multipliers)
{
	this->age_bucket_multipliers = age_bucket_multipliers;
}

ScheduleAppTypeMultipliers&lt;std::string, double&gt;
ScheduleCommonDeltaValue::getAppTypeMultipliers()
{
	return app_type_multipliers;
}

void
ScheduleCommonDeltaValue::setAppTypeMultipliers(ScheduleAppTypeMultipliers&lt;std::string, double&gt; app_type_multipliers)
{
	this->app_type_multipliers = app_type_multipliers;
}

ScheduleAudienceMultipliers&lt;std::string, double&gt;
ScheduleCommonDeltaValue::getAudienceMultipliers()
{
	return audience_multipliers;
}

void
ScheduleCommonDeltaValue::setAudienceMultipliers(ScheduleAudienceMultipliers&lt;std::string, double&gt; audience_multipliers)
{
	this->audience_multipliers = audience_multipliers;
}

ScheduleBidOptions_gender_multipliers&lt;std::string, double&gt;
ScheduleCommonDeltaValue::getGenderMultipliers()
{
	return gender_multipliers;
}

void
ScheduleCommonDeltaValue::setGenderMultipliers(ScheduleBidOptions_gender_multipliers&lt;std::string, double&gt; gender_multipliers)
{
	this->gender_multipliers = gender_multipliers;
}

ScheduleBidOptions_placement_multipliers
ScheduleCommonDeltaValue::getPlacementMultipliers()
{
	return placement_multipliers;
}

void
ScheduleCommonDeltaValue::setPlacementMultipliers(ScheduleBidOptions_placement_multipliers placement_multipliers)
{
	this->placement_multipliers = placement_multipliers;
}



