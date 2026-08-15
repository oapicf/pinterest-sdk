

#include "TargetingTemplateCreate.h"

using namespace Tiny;

TargetingTemplateCreate::TargetingTemplateCreate()
{
	auto_targeting_enabled = bool(false);
	keywords = std::list<TargetingTemplateKeyword>();
	name = std::string();
	placement_group = PlacementGroupType();
	targeting_attributes = TargetingSpec();
	tracking_urls = TrackingUrls();
}

TargetingTemplateCreate::TargetingTemplateCreate(std::string jsonString)
{
	this->fromJson(jsonString);
}

TargetingTemplateCreate::~TargetingTemplateCreate()
{

}

void
TargetingTemplateCreate::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *auto_targeting_enabledKey = "auto_targeting_enabled";

    if(object.has_key(auto_targeting_enabledKey))
    {
        bourne::json value = object[auto_targeting_enabledKey];



        jsonToValue(&auto_targeting_enabled, value, "bool");


    }

    const char *keywordsKey = "keywords";

    if(object.has_key(keywordsKey))
    {
        bourne::json value = object[keywordsKey];


        std::list<TargetingTemplateKeyword> keywords_list;
        TargetingTemplateKeyword element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            keywords_list.push_back(element);
        }
        keywords = keywords_list;


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *placement_groupKey = "placement_group";

    if(object.has_key(placement_groupKey))
    {
        bourne::json value = object[placement_groupKey];




        PlacementGroupType* obj = &placement_group;
		obj->fromJson(value.dump());

    }

    const char *targeting_attributesKey = "targeting_attributes";

    if(object.has_key(targeting_attributesKey))
    {
        bourne::json value = object[targeting_attributesKey];




        TargetingSpec* obj = &targeting_attributes;
		obj->fromJson(value.dump());

    }

    const char *tracking_urlsKey = "tracking_urls";

    if(object.has_key(tracking_urlsKey))
    {
        bourne::json value = object[tracking_urlsKey];




        TrackingUrls* obj = &tracking_urls;
		obj->fromJson(value.dump());

    }


}

bourne::json
TargetingTemplateCreate::toJson()
{
    bourne::json object = bourne::json::object();





    object["auto_targeting_enabled"] = isAutoTargetingEnabled();





    std::list<TargetingTemplateKeyword> keywords_list = getKeywords();
    bourne::json keywords_arr = bourne::json::array();

    for(auto& var : keywords_list)
    {
        TargetingTemplateKeyword obj = var;
        keywords_arr.append(obj.toJson());
    }
    object["keywords"] = keywords_arr;







    object["name"] = getName();







	object["placement_group"] = getPlacementGroup().toJson();






	object["targeting_attributes"] = getTargetingAttributes().toJson();






	object["tracking_urls"] = getTrackingUrls().toJson();


    return object;

}

bool
TargetingTemplateCreate::isAutoTargetingEnabled()
{
	return auto_targeting_enabled;
}

void
TargetingTemplateCreate::setAutoTargetingEnabled(bool  auto_targeting_enabled)
{
	this->auto_targeting_enabled = auto_targeting_enabled;
}

std::list<TargetingTemplateKeyword>
TargetingTemplateCreate::getKeywords()
{
	return keywords;
}

void
TargetingTemplateCreate::setKeywords(std::list <TargetingTemplateKeyword> keywords)
{
	this->keywords = keywords;
}

std::string
TargetingTemplateCreate::getName()
{
	return name;
}

void
TargetingTemplateCreate::setName(std::string  name)
{
	this->name = name;
}

PlacementGroupType
TargetingTemplateCreate::getPlacementGroup()
{
	return placement_group;
}

void
TargetingTemplateCreate::setPlacementGroup(PlacementGroupType  placement_group)
{
	this->placement_group = placement_group;
}

TargetingSpec
TargetingTemplateCreate::getTargetingAttributes()
{
	return targeting_attributes;
}

void
TargetingTemplateCreate::setTargetingAttributes(TargetingSpec  targeting_attributes)
{
	this->targeting_attributes = targeting_attributes;
}

TrackingUrls
TargetingTemplateCreate::getTrackingUrls()
{
	return tracking_urls;
}

void
TargetingTemplateCreate::setTrackingUrls(TrackingUrls  tracking_urls)
{
	this->tracking_urls = tracking_urls;
}



