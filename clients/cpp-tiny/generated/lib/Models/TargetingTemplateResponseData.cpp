

#include "TargetingTemplateResponseData.h"

using namespace Tiny;

TargetingTemplateResponseData::TargetingTemplateResponseData()
{
	auto_targeting_enabled = bool(false);
	keywords = std::list<TargetingTemplateKeyword>();
	name = std::string();
	placement_group = PlacementGroupType();
	targeting_attributes = TargetingSpec();
	tracking_urls = TrackingUrls();
	ad_account_id = std::string();
	created_time = int(0);
	id = std::string();
	sizing = TargetingTemplateAudienceSizing();
	status = std::string();
	updated_time = int(0);
}

TargetingTemplateResponseData::TargetingTemplateResponseData(std::string jsonString)
{
	this->fromJson(jsonString);
}

TargetingTemplateResponseData::~TargetingTemplateResponseData()
{

}

void
TargetingTemplateResponseData::fromJson(std::string jsonObj)
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

    const char *ad_account_idKey = "ad_account_id";

    if(object.has_key(ad_account_idKey))
    {
        bourne::json value = object[ad_account_idKey];



        jsonToValue(&ad_account_id, value, "std::string");


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



        jsonToValue(&status, value, "std::string");


    }

    const char *updated_timeKey = "updated_time";

    if(object.has_key(updated_timeKey))
    {
        bourne::json value = object[updated_timeKey];



        jsonToValue(&updated_time, value, "int");


    }


}

bourne::json
TargetingTemplateResponseData::toJson()
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





    object["ad_account_id"] = getAdAccountId();






    object["created_time"] = getCreatedTime();






    object["id"] = getId();







	object["sizing"] = getSizing().toJson();





    object["status"] = getStatus();






    object["updated_time"] = getUpdatedTime();



    return object;

}

bool
TargetingTemplateResponseData::isAutoTargetingEnabled()
{
	return auto_targeting_enabled;
}

void
TargetingTemplateResponseData::setAutoTargetingEnabled(bool  auto_targeting_enabled)
{
	this->auto_targeting_enabled = auto_targeting_enabled;
}

std::list<TargetingTemplateKeyword>
TargetingTemplateResponseData::getKeywords()
{
	return keywords;
}

void
TargetingTemplateResponseData::setKeywords(std::list <TargetingTemplateKeyword> keywords)
{
	this->keywords = keywords;
}

std::string
TargetingTemplateResponseData::getName()
{
	return name;
}

void
TargetingTemplateResponseData::setName(std::string  name)
{
	this->name = name;
}

PlacementGroupType
TargetingTemplateResponseData::getPlacementGroup()
{
	return placement_group;
}

void
TargetingTemplateResponseData::setPlacementGroup(PlacementGroupType  placement_group)
{
	this->placement_group = placement_group;
}

TargetingSpec
TargetingTemplateResponseData::getTargetingAttributes()
{
	return targeting_attributes;
}

void
TargetingTemplateResponseData::setTargetingAttributes(TargetingSpec  targeting_attributes)
{
	this->targeting_attributes = targeting_attributes;
}

TrackingUrls
TargetingTemplateResponseData::getTrackingUrls()
{
	return tracking_urls;
}

void
TargetingTemplateResponseData::setTrackingUrls(TrackingUrls  tracking_urls)
{
	this->tracking_urls = tracking_urls;
}

std::string
TargetingTemplateResponseData::getAdAccountId()
{
	return ad_account_id;
}

void
TargetingTemplateResponseData::setAdAccountId(std::string  ad_account_id)
{
	this->ad_account_id = ad_account_id;
}

int
TargetingTemplateResponseData::getCreatedTime()
{
	return created_time;
}

void
TargetingTemplateResponseData::setCreatedTime(int  created_time)
{
	this->created_time = created_time;
}

std::string
TargetingTemplateResponseData::getId()
{
	return id;
}

void
TargetingTemplateResponseData::setId(std::string  id)
{
	this->id = id;
}

TargetingTemplateAudienceSizing
TargetingTemplateResponseData::getSizing()
{
	return sizing;
}

void
TargetingTemplateResponseData::setSizing(TargetingTemplateAudienceSizing  sizing)
{
	this->sizing = sizing;
}

std::string
TargetingTemplateResponseData::getStatus()
{
	return status;
}

void
TargetingTemplateResponseData::setStatus(std::string  status)
{
	this->status = status;
}

int
TargetingTemplateResponseData::getUpdatedTime()
{
	return updated_time;
}

void
TargetingTemplateResponseData::setUpdatedTime(int  updated_time)
{
	this->updated_time = updated_time;
}



