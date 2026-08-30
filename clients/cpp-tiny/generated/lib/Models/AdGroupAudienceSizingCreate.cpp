

#include "AdGroupAudienceSizingCreate.h"

using namespace Tiny;

AdGroupAudienceSizingCreate::AdGroupAudienceSizingCreate()
{
	auto_targeting_enabled = bool(false);
	creative_types = std::list<AdGroupAudienceSizingCreativeTypes>();
	keywords = std::list<AdGroupAudienceSizingKeyword>();
	placement_group = null;
	product_group_ids = std::list<std::string>();
	targeting_spec = TargetingSpecOptimal();
}

AdGroupAudienceSizingCreate::AdGroupAudienceSizingCreate(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdGroupAudienceSizingCreate::~AdGroupAudienceSizingCreate()
{

}

void
AdGroupAudienceSizingCreate::fromJson(std::string jsonObj)
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


        std::list<AdGroupAudienceSizingKeyword> keywords_list;
        AdGroupAudienceSizingKeyword element;
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




        AdgroupPlacementGroupType* obj = &placement_group;
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
AdGroupAudienceSizingCreate::toJson()
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






    std::list<AdGroupAudienceSizingKeyword> keywords_list = getKeywords();
    bourne::json keywords_arr = bourne::json::array();

    for(auto& var : keywords_list)
    {
        AdGroupAudienceSizingKeyword obj = var;
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
AdGroupAudienceSizingCreate::isAutoTargetingEnabled()
{
	return auto_targeting_enabled;
}

void
AdGroupAudienceSizingCreate::setAutoTargetingEnabled(bool auto_targeting_enabled)
{
	this->auto_targeting_enabled = auto_targeting_enabled;
}

std::list<AdGroupAudienceSizingCreativeTypes>
AdGroupAudienceSizingCreate::getCreativeTypes()
{
	return creative_types;
}

void
AdGroupAudienceSizingCreate::setCreativeTypes(std::list<AdGroupAudienceSizingCreativeTypes> creative_types)
{
	this->creative_types = creative_types;
}

std::list<AdGroupAudienceSizingKeyword>
AdGroupAudienceSizingCreate::getKeywords()
{
	return keywords;
}

void
AdGroupAudienceSizingCreate::setKeywords(std::list<AdGroupAudienceSizingKeyword> keywords)
{
	this->keywords = keywords;
}

AdgroupPlacementGroupType
AdGroupAudienceSizingCreate::getPlacementGroup()
{
	return placement_group;
}

void
AdGroupAudienceSizingCreate::setPlacementGroup(AdgroupPlacementGroupType placement_group)
{
	this->placement_group = placement_group;
}

std::list<std::string>
AdGroupAudienceSizingCreate::getProductGroupIds()
{
	return product_group_ids;
}

void
AdGroupAudienceSizingCreate::setProductGroupIds(std::list<std::string> product_group_ids)
{
	this->product_group_ids = product_group_ids;
}

TargetingSpecOptimal
AdGroupAudienceSizingCreate::getTargetingSpec()
{
	return targeting_spec;
}

void
AdGroupAudienceSizingCreate::setTargetingSpec(TargetingSpecOptimal targeting_spec)
{
	this->targeting_spec = targeting_spec;
}



