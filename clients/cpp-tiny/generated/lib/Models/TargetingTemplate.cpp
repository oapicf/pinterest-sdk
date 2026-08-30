

#include "TargetingTemplate.h"

using namespace Tiny;

TargetingTemplate::TargetingTemplate()
{
	ad_account_id = std::string();
	auto_targeting_enabled = bool(false);
	created_time = int(0);
	id = std::string();
	keywords = std::list<TargetingTemplateKeyword>();
	name = std::string();
	placement_group = PlacementGroupType();
	sizing = null;
	status = null;
	targeting_attributes = null;
	tracking_urls = TrackingUrls();
	updated_time = int(0);
	valid = bool(false);
}

TargetingTemplate::TargetingTemplate(std::string jsonString)
{
	this->fromJson(jsonString);
}

TargetingTemplate::~TargetingTemplate()
{

}

void
TargetingTemplate::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *ad_account_idKey = "ad_account_id";

    if(object.has_key(ad_account_idKey))
    {
        bourne::json value = object[ad_account_idKey];



        jsonToValue(&ad_account_id, value, "std::string");


    }

    const char *auto_targeting_enabledKey = "auto_targeting_enabled";

    if(object.has_key(auto_targeting_enabledKey))
    {
        bourne::json value = object[auto_targeting_enabledKey];



        jsonToValue(&auto_targeting_enabled, value, "bool");


    }

    const char *created_timeKey = "created_time";

    if(object.has_key(created_timeKey))
    {
        bourne::json value = object[created_timeKey];



        jsonToValue(&created_time, value, "int");


    }

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


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

    const char *sizingKey = "sizing";

    if(object.has_key(sizingKey))
    {
        bourne::json value = object[sizingKey];




        TargetingTemplateAudienceSizing* obj = &sizing;
		obj->fromJson(value.dump());

    }

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];




        TargetingTemplateStatus* obj = &status;
		obj->fromJson(value.dump());

    }

    const char *targeting_attributesKey = "targeting_attributes";

    if(object.has_key(targeting_attributesKey))
    {
        bourne::json value = object[targeting_attributesKey];




        TargetingSpecOptimal* obj = &targeting_attributes;
		obj->fromJson(value.dump());

    }

    const char *tracking_urlsKey = "tracking_urls";

    if(object.has_key(tracking_urlsKey))
    {
        bourne::json value = object[tracking_urlsKey];




        TrackingUrls* obj = &tracking_urls;
		obj->fromJson(value.dump());

    }

    const char *updated_timeKey = "updated_time";

    if(object.has_key(updated_timeKey))
    {
        bourne::json value = object[updated_timeKey];



        jsonToValue(&updated_time, value, "int");


    }

    const char *validKey = "valid";

    if(object.has_key(validKey))
    {
        bourne::json value = object[validKey];



        jsonToValue(&valid, value, "bool");


    }


}

bourne::json
TargetingTemplate::toJson()
{
    bourne::json object = bourne::json::object();





    object["ad_account_id"] = getAdAccountId();






    object["auto_targeting_enabled"] = isAutoTargetingEnabled();






    object["created_time"] = getCreatedTime();






    object["id"] = getId();





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






	object["sizing"] = getSizing().toJson();






	object["status"] = getStatus().toJson();






	object["targeting_attributes"] = getTargetingAttributes().toJson();






	object["tracking_urls"] = getTrackingUrls().toJson();





    object["updated_time"] = getUpdatedTime();






    object["valid"] = isValid();



    return object;

}

std::string
TargetingTemplate::getAdAccountId()
{
	return ad_account_id;
}

void
TargetingTemplate::setAdAccountId(std::string ad_account_id)
{
	this->ad_account_id = ad_account_id;
}

bool
TargetingTemplate::isAutoTargetingEnabled()
{
	return auto_targeting_enabled;
}

void
TargetingTemplate::setAutoTargetingEnabled(bool auto_targeting_enabled)
{
	this->auto_targeting_enabled = auto_targeting_enabled;
}

int
TargetingTemplate::getCreatedTime()
{
	return created_time;
}

void
TargetingTemplate::setCreatedTime(int created_time)
{
	this->created_time = created_time;
}

std::string
TargetingTemplate::getId()
{
	return id;
}

void
TargetingTemplate::setId(std::string id)
{
	this->id = id;
}

std::list<TargetingTemplateKeyword>
TargetingTemplate::getKeywords()
{
	return keywords;
}

void
TargetingTemplate::setKeywords(std::list<TargetingTemplateKeyword> keywords)
{
	this->keywords = keywords;
}

std::string
TargetingTemplate::getName()
{
	return name;
}

void
TargetingTemplate::setName(std::string name)
{
	this->name = name;
}

PlacementGroupType
TargetingTemplate::getPlacementGroup()
{
	return placement_group;
}

void
TargetingTemplate::setPlacementGroup(PlacementGroupType placement_group)
{
	this->placement_group = placement_group;
}

TargetingTemplateAudienceSizing
TargetingTemplate::getSizing()
{
	return sizing;
}

void
TargetingTemplate::setSizing(TargetingTemplateAudienceSizing sizing)
{
	this->sizing = sizing;
}

TargetingTemplateStatus
TargetingTemplate::getStatus()
{
	return status;
}

void
TargetingTemplate::setStatus(TargetingTemplateStatus status)
{
	this->status = status;
}

TargetingSpecOptimal
TargetingTemplate::getTargetingAttributes()
{
	return targeting_attributes;
}

void
TargetingTemplate::setTargetingAttributes(TargetingSpecOptimal targeting_attributes)
{
	this->targeting_attributes = targeting_attributes;
}

TrackingUrls
TargetingTemplate::getTrackingUrls()
{
	return tracking_urls;
}

void
TargetingTemplate::setTrackingUrls(TrackingUrls tracking_urls)
{
	this->tracking_urls = tracking_urls;
}

int
TargetingTemplate::getUpdatedTime()
{
	return updated_time;
}

void
TargetingTemplate::setUpdatedTime(int updated_time)
{
	this->updated_time = updated_time;
}

bool
TargetingTemplate::isValid()
{
	return valid;
}

void
TargetingTemplate::setValid(bool valid)
{
	this->valid = valid;
}



