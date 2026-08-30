

#include "AdGroupDeliveryEstimates.h"

using namespace Tiny;

AdGroupDeliveryEstimates::AdGroupDeliveryEstimates()
{
	auto_targeting_enabled = bool(false);
	creative_types = std::list<AdGroupAudienceSizingCreativeTypes>();
	keywords = std::list<AdGroupDeliveryEstimatesKeywordsItems>();
	monthly_frequency_cap = int(0);
	optimization_goal_metadata = OptimizationGoalMetadata();
	optimization_type = null;
	placement_group = PlacementGroupType();
	product_group_ids = std::list<std::string>();
	targeting_spec = TargetingSpecOptimal();
}

AdGroupDeliveryEstimates::AdGroupDeliveryEstimates(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdGroupDeliveryEstimates::~AdGroupDeliveryEstimates()
{

}

void
AdGroupDeliveryEstimates::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *auto_targeting_enabledKey = "auto_targeting_enabled";

    if(object.has_key(auto_targeting_enabledKey))
    {
        bourne::json value = object[auto_targeting_enabledKey];



        jsonToValue(&auto_targeting_enabled, value, "bool");


    }

    const char *creative_typesKey = "creative_types";

    if(object.has_key(creative_typesKey))
    {
        bourne::json value = object[creative_typesKey];


        std::list<AdGroupAudienceSizingCreativeTypes> creative_types_list;
        AdGroupAudienceSizingCreativeTypes element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            creative_types_list.push_back(element);
        }
        creative_types = creative_types_list;


    }

    const char *keywordsKey = "keywords";

    if(object.has_key(keywordsKey))
    {
        bourne::json value = object[keywordsKey];


        std::list<AdGroupDeliveryEstimatesKeywordsItems> keywords_list;
        AdGroupDeliveryEstimatesKeywordsItems element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            keywords_list.push_back(element);
        }
        keywords = keywords_list;


    }

    const char *monthly_frequency_capKey = "monthly_frequency_cap";

    if(object.has_key(monthly_frequency_capKey))
    {
        bourne::json value = object[monthly_frequency_capKey];



        jsonToValue(&monthly_frequency_cap, value, "int");


    }

    const char *optimization_goal_metadataKey = "optimization_goal_metadata";

    if(object.has_key(optimization_goal_metadataKey))
    {
        bourne::json value = object[optimization_goal_metadataKey];




        OptimizationGoalMetadata* obj = &optimization_goal_metadata;
		obj->fromJson(value.dump());

    }

    const char *optimization_typeKey = "optimization_type";

    if(object.has_key(optimization_typeKey))
    {
        bourne::json value = object[optimization_typeKey];




        OptimizationType* obj = &optimization_type;
		obj->fromJson(value.dump());

    }

    const char *placement_groupKey = "placement_group";

    if(object.has_key(placement_groupKey))
    {
        bourne::json value = object[placement_groupKey];




        PlacementGroupType* obj = &placement_group;
		obj->fromJson(value.dump());

    }

    const char *product_group_idsKey = "product_group_ids";

    if(object.has_key(product_group_idsKey))
    {
        bourne::json value = object[product_group_idsKey];


        std::list<std::string> product_group_ids_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            product_group_ids_list.push_back(element);
        }
        product_group_ids = product_group_ids_list;


    }

    const char *targeting_specKey = "targeting_spec";

    if(object.has_key(targeting_specKey))
    {
        bourne::json value = object[targeting_specKey];




        TargetingSpecOptimal* obj = &targeting_spec;
		obj->fromJson(value.dump());

    }


}

bourne::json
AdGroupDeliveryEstimates::toJson()
{
    bourne::json object = bourne::json::object();





    object["auto_targeting_enabled"] = isAutoTargetingEnabled();





    std::list<AdGroupAudienceSizingCreativeTypes> creative_types_list = getCreativeTypes();
    bourne::json creative_types_arr = bourne::json::array();

    for(auto& var : creative_types_list)
    {
        AdGroupAudienceSizingCreativeTypes obj = var;
        creative_types_arr.append(obj.toJson());
    }
    object["creative_types"] = creative_types_arr;






    std::list<AdGroupDeliveryEstimatesKeywordsItems> keywords_list = getKeywords();
    bourne::json keywords_arr = bourne::json::array();

    for(auto& var : keywords_list)
    {
        AdGroupDeliveryEstimatesKeywordsItems obj = var;
        keywords_arr.append(obj.toJson());
    }
    object["keywords"] = keywords_arr;







    object["monthly_frequency_cap"] = getMonthlyFrequencyCap();







	object["optimization_goal_metadata"] = getOptimizationGoalMetadata().toJson();






	object["optimization_type"] = getOptimizationType().toJson();






	object["placement_group"] = getPlacementGroup().toJson();




    std::list<std::string> product_group_ids_list = getProductGroupIds();
    bourne::json product_group_ids_arr = bourne::json::array();

    for(auto& var : product_group_ids_list)
    {
        product_group_ids_arr.append(var);
    }
    object["product_group_ids"] = product_group_ids_arr;










	object["targeting_spec"] = getTargetingSpec().toJson();


    return object;

}

bool
AdGroupDeliveryEstimates::isAutoTargetingEnabled()
{
	return auto_targeting_enabled;
}

void
AdGroupDeliveryEstimates::setAutoTargetingEnabled(bool auto_targeting_enabled)
{
	this->auto_targeting_enabled = auto_targeting_enabled;
}

std::list<AdGroupAudienceSizingCreativeTypes>
AdGroupDeliveryEstimates::getCreativeTypes()
{
	return creative_types;
}

void
AdGroupDeliveryEstimates::setCreativeTypes(std::list<AdGroupAudienceSizingCreativeTypes> creative_types)
{
	this->creative_types = creative_types;
}

std::list<AdGroupDeliveryEstimatesKeywordsItems>
AdGroupDeliveryEstimates::getKeywords()
{
	return keywords;
}

void
AdGroupDeliveryEstimates::setKeywords(std::list<AdGroupDeliveryEstimatesKeywordsItems> keywords)
{
	this->keywords = keywords;
}

int
AdGroupDeliveryEstimates::getMonthlyFrequencyCap()
{
	return monthly_frequency_cap;
}

void
AdGroupDeliveryEstimates::setMonthlyFrequencyCap(int monthly_frequency_cap)
{
	this->monthly_frequency_cap = monthly_frequency_cap;
}

OptimizationGoalMetadata
AdGroupDeliveryEstimates::getOptimizationGoalMetadata()
{
	return optimization_goal_metadata;
}

void
AdGroupDeliveryEstimates::setOptimizationGoalMetadata(OptimizationGoalMetadata optimization_goal_metadata)
{
	this->optimization_goal_metadata = optimization_goal_metadata;
}

OptimizationType
AdGroupDeliveryEstimates::getOptimizationType()
{
	return optimization_type;
}

void
AdGroupDeliveryEstimates::setOptimizationType(OptimizationType optimization_type)
{
	this->optimization_type = optimization_type;
}

PlacementGroupType
AdGroupDeliveryEstimates::getPlacementGroup()
{
	return placement_group;
}

void
AdGroupDeliveryEstimates::setPlacementGroup(PlacementGroupType placement_group)
{
	this->placement_group = placement_group;
}

std::list<std::string>
AdGroupDeliveryEstimates::getProductGroupIds()
{
	return product_group_ids;
}

void
AdGroupDeliveryEstimates::setProductGroupIds(std::list<std::string> product_group_ids)
{
	this->product_group_ids = product_group_ids;
}

TargetingSpecOptimal
AdGroupDeliveryEstimates::getTargetingSpec()
{
	return targeting_spec;
}

void
AdGroupDeliveryEstimates::setTargetingSpec(TargetingSpecOptimal targeting_spec)
{
	this->targeting_spec = targeting_spec;
}



