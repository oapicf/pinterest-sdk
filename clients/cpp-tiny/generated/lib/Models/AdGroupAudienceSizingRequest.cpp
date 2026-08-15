

#include "AdGroupAudienceSizingRequest.h"

using namespace Tiny;

AdGroupAudienceSizingRequest::AdGroupAudienceSizingRequest()
{
	auto_targeting_enabled = bool(false);
	creative_types = std::list<std::string>();
	keywords = std::list<AdGroupAudienceSizingRequest_keywords_inner>();
	placement_group = std::string();
	product_group_ids = std::list<std::string>();
	targeting_spec = TargetingSpec();
}

AdGroupAudienceSizingRequest::AdGroupAudienceSizingRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdGroupAudienceSizingRequest::~AdGroupAudienceSizingRequest()
{

}

void
AdGroupAudienceSizingRequest::fromJson(std::string jsonObj)
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


        std::list<std::string> creative_types_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            creative_types_list.push_back(element);
        }
        creative_types = creative_types_list;


    }

    const char *keywordsKey = "keywords";

    if(object.has_key(keywordsKey))
    {
        bourne::json value = object[keywordsKey];


        std::list<AdGroupAudienceSizingRequest_keywords_inner> keywords_list;
        AdGroupAudienceSizingRequest_keywords_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            keywords_list.push_back(element);
        }
        keywords = keywords_list;


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




        TargetingSpec* obj = &targeting_spec;
		obj->fromJson(value.dump());

    }


}

bourne::json
AdGroupAudienceSizingRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["auto_targeting_enabled"] = isAutoTargetingEnabled();





    std::list<std::string> creative_types_list = getCreativeTypes();
    bourne::json creative_types_arr = bourne::json::array();

    for(auto& var : creative_types_list)
    {
        creative_types_arr.append(var);
    }
    object["creative_types"] = creative_types_arr;








    std::list<AdGroupAudienceSizingRequest_keywords_inner> keywords_list = getKeywords();
    bourne::json keywords_arr = bourne::json::array();

    for(auto& var : keywords_list)
    {
        AdGroupAudienceSizingRequest_keywords_inner obj = var;
        keywords_arr.append(obj.toJson());
    }
    object["keywords"] = keywords_arr;








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
AdGroupAudienceSizingRequest::isAutoTargetingEnabled()
{
	return auto_targeting_enabled;
}

void
AdGroupAudienceSizingRequest::setAutoTargetingEnabled(bool  auto_targeting_enabled)
{
	this->auto_targeting_enabled = auto_targeting_enabled;
}

std::list<std::string>
AdGroupAudienceSizingRequest::getCreativeTypes()
{
	return creative_types;
}

void
AdGroupAudienceSizingRequest::setCreativeTypes(std::list <std::string> creative_types)
{
	this->creative_types = creative_types;
}

std::list<AdGroupAudienceSizingRequest_keywords_inner>
AdGroupAudienceSizingRequest::getKeywords()
{
	return keywords;
}

void
AdGroupAudienceSizingRequest::setKeywords(std::list <AdGroupAudienceSizingRequest_keywords_inner> keywords)
{
	this->keywords = keywords;
}

PlacementGroupType
AdGroupAudienceSizingRequest::getPlacementGroup()
{
	return placement_group;
}

void
AdGroupAudienceSizingRequest::setPlacementGroup(PlacementGroupType  placement_group)
{
	this->placement_group = placement_group;
}

std::list<std::string>
AdGroupAudienceSizingRequest::getProductGroupIds()
{
	return product_group_ids;
}

void
AdGroupAudienceSizingRequest::setProductGroupIds(std::list <std::string> product_group_ids)
{
	this->product_group_ids = product_group_ids;
}

TargetingSpec
AdGroupAudienceSizingRequest::getTargetingSpec()
{
	return targeting_spec;
}

void
AdGroupAudienceSizingRequest::setTargetingSpec(TargetingSpec  targeting_spec)
{
	this->targeting_spec = targeting_spec;
}



