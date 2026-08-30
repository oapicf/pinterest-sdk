

#include "Schedule_delta_value.h"

using namespace Tiny;

Schedule_delta_value::Schedule_delta_value()
{
	age_bucket_multipliers = BidOptionsAgeBucketMultipliers();
	app_type_multipliers = BidOptionsAppTypeMultipliers();
	audience_multipliers = std::list<BidOptionsAudienceMultipliers>();
	gender_multipliers = BidOptionsGenderMultipliers();
	placement_multipliers = BidOptionsPlacementMultipliers();
}

Schedule_delta_value::Schedule_delta_value(std::string jsonString)
{
	this->fromJson(jsonString);
}

Schedule_delta_value::~Schedule_delta_value()
{

}

void
Schedule_delta_value::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *age_bucket_multipliersKey = "age_bucket_multipliers";

    if(object.has_key(age_bucket_multipliersKey))
    {
        bourne::json value = object[age_bucket_multipliersKey];




        BidOptionsAgeBucketMultipliers* obj = &age_bucket_multipliers;
		obj->fromJson(value.dump());

    }

    const char *app_type_multipliersKey = "app_type_multipliers";

    if(object.has_key(app_type_multipliersKey))
    {
        bourne::json value = object[app_type_multipliersKey];




        BidOptionsAppTypeMultipliers* obj = &app_type_multipliers;
		obj->fromJson(value.dump());

    }

    const char *audience_multipliersKey = "audience_multipliers";

    if(object.has_key(audience_multipliersKey))
    {
        bourne::json value = object[audience_multipliersKey];


        std::list<BidOptionsAudienceMultipliers> audience_multipliers_list;
        BidOptionsAudienceMultipliers element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            audience_multipliers_list.push_back(element);
        }
        audience_multipliers = audience_multipliers_list;


    }

    const char *gender_multipliersKey = "gender_multipliers";

    if(object.has_key(gender_multipliersKey))
    {
        bourne::json value = object[gender_multipliersKey];




        BidOptionsGenderMultipliers* obj = &gender_multipliers;
		obj->fromJson(value.dump());

    }

    const char *placement_multipliersKey = "placement_multipliers";

    if(object.has_key(placement_multipliersKey))
    {
        bourne::json value = object[placement_multipliersKey];




        BidOptionsPlacementMultipliers* obj = &placement_multipliers;
		obj->fromJson(value.dump());

    }


}

bourne::json
Schedule_delta_value::toJson()
{
    bourne::json object = bourne::json::object();






	object["age_bucket_multipliers"] = getAgeBucketMultipliers().toJson();






	object["app_type_multipliers"] = getAppTypeMultipliers().toJson();




    std::list<BidOptionsAudienceMultipliers> audience_multipliers_list = getAudienceMultipliers();
    bourne::json audience_multipliers_arr = bourne::json::array();

    for(auto& var : audience_multipliers_list)
    {
        BidOptionsAudienceMultipliers obj = var;
        audience_multipliers_arr.append(obj.toJson());
    }
    object["audience_multipliers"] = audience_multipliers_arr;








	object["gender_multipliers"] = getGenderMultipliers().toJson();






	object["placement_multipliers"] = getPlacementMultipliers().toJson();


    return object;

}

BidOptionsAgeBucketMultipliers
Schedule_delta_value::getAgeBucketMultipliers()
{
	return age_bucket_multipliers;
}

void
Schedule_delta_value::setAgeBucketMultipliers(BidOptionsAgeBucketMultipliers age_bucket_multipliers)
{
	this->age_bucket_multipliers = age_bucket_multipliers;
}

BidOptionsAppTypeMultipliers
Schedule_delta_value::getAppTypeMultipliers()
{
	return app_type_multipliers;
}

void
Schedule_delta_value::setAppTypeMultipliers(BidOptionsAppTypeMultipliers app_type_multipliers)
{
	this->app_type_multipliers = app_type_multipliers;
}

std::list<BidOptionsAudienceMultipliers>
Schedule_delta_value::getAudienceMultipliers()
{
	return audience_multipliers;
}

void
Schedule_delta_value::setAudienceMultipliers(std::list<BidOptionsAudienceMultipliers> audience_multipliers)
{
	this->audience_multipliers = audience_multipliers;
}

BidOptionsGenderMultipliers
Schedule_delta_value::getGenderMultipliers()
{
	return gender_multipliers;
}

void
Schedule_delta_value::setGenderMultipliers(BidOptionsGenderMultipliers gender_multipliers)
{
	this->gender_multipliers = gender_multipliers;
}

BidOptionsPlacementMultipliers
Schedule_delta_value::getPlacementMultipliers()
{
	return placement_multipliers;
}

void
Schedule_delta_value::setPlacementMultipliers(BidOptionsPlacementMultipliers placement_multipliers)
{
	this->placement_multipliers = placement_multipliers;
}



