

#include "AdCommon.h"

using namespace Tiny;

AdCommon::AdCommon()
{
	ad_group_id = std::string();
	android_deep_link = std::string();
	carousel_android_deep_links = std::list<std::string>();
	carousel_destination_urls = std::list<std::string>();
	carousel_ios_deep_links = std::list<std::string>();
	click_tracking_url = std::string();
	creative_type = CreativeType();
	customizable_cta_type = CustomizableCTAType();
	destination_url = std::string();
	disclosure_type = DisclosureType();
	disclosure_url = std::string();
	grid_click_type = GridClickType();
	ios_deep_link = std::string();
	is_pin_deleted = bool(false);
	is_removable = bool(false);
	lead_form_id = std::string();
	name = std::string();
	quiz_pin_data = null;
	status = EntityStatus();
	tracking_urls = null;
	view_tracking_url = std::string();
}

AdCommon::AdCommon(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdCommon::~AdCommon()
{

}

void
AdCommon::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *ad_group_idKey = "ad_group_id";

    if(object.has_key(ad_group_idKey))
    {
        bourne::json value = object[ad_group_idKey];



        jsonToValue(&ad_group_id, value, "std::string");


    }

    const char *android_deep_linkKey = "android_deep_link";

    if(object.has_key(android_deep_linkKey))
    {
        bourne::json value = object[android_deep_linkKey];



        jsonToValue(&android_deep_link, value, "std::string");


    }

    const char *carousel_android_deep_linksKey = "carousel_android_deep_links";

    if(object.has_key(carousel_android_deep_linksKey))
    {
        bourne::json value = object[carousel_android_deep_linksKey];


        std::list<std::string> carousel_android_deep_links_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            carousel_android_deep_links_list.push_back(element);
        }
        carousel_android_deep_links = carousel_android_deep_links_list;


    }

    const char *carousel_destination_urlsKey = "carousel_destination_urls";

    if(object.has_key(carousel_destination_urlsKey))
    {
        bourne::json value = object[carousel_destination_urlsKey];


        std::list<std::string> carousel_destination_urls_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            carousel_destination_urls_list.push_back(element);
        }
        carousel_destination_urls = carousel_destination_urls_list;


    }

    const char *carousel_ios_deep_linksKey = "carousel_ios_deep_links";

    if(object.has_key(carousel_ios_deep_linksKey))
    {
        bourne::json value = object[carousel_ios_deep_linksKey];


        std::list<std::string> carousel_ios_deep_links_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            carousel_ios_deep_links_list.push_back(element);
        }
        carousel_ios_deep_links = carousel_ios_deep_links_list;


    }

    const char *click_tracking_urlKey = "click_tracking_url";

    if(object.has_key(click_tracking_urlKey))
    {
        bourne::json value = object[click_tracking_urlKey];



        jsonToValue(&click_tracking_url, value, "std::string");


    }

    const char *creative_typeKey = "creative_type";

    if(object.has_key(creative_typeKey))
    {
        bourne::json value = object[creative_typeKey];




        CreativeType* obj = &creative_type;
		obj->fromJson(value.dump());

    }

    const char *customizable_cta_typeKey = "customizable_cta_type";

    if(object.has_key(customizable_cta_typeKey))
    {
        bourne::json value = object[customizable_cta_typeKey];




        CustomizableCTAType* obj = &customizable_cta_type;
		obj->fromJson(value.dump());

    }

    const char *destination_urlKey = "destination_url";

    if(object.has_key(destination_urlKey))
    {
        bourne::json value = object[destination_urlKey];



        jsonToValue(&destination_url, value, "std::string");


    }

    const char *disclosure_typeKey = "disclosure_type";

    if(object.has_key(disclosure_typeKey))
    {
        bourne::json value = object[disclosure_typeKey];




        DisclosureType* obj = &disclosure_type;
		obj->fromJson(value.dump());

    }

    const char *disclosure_urlKey = "disclosure_url";

    if(object.has_key(disclosure_urlKey))
    {
        bourne::json value = object[disclosure_urlKey];



        jsonToValue(&disclosure_url, value, "std::string");


    }

    const char *grid_click_typeKey = "grid_click_type";

    if(object.has_key(grid_click_typeKey))
    {
        bourne::json value = object[grid_click_typeKey];




        GridClickType* obj = &grid_click_type;
		obj->fromJson(value.dump());

    }

    const char *ios_deep_linkKey = "ios_deep_link";

    if(object.has_key(ios_deep_linkKey))
    {
        bourne::json value = object[ios_deep_linkKey];



        jsonToValue(&ios_deep_link, value, "std::string");


    }

    const char *is_pin_deletedKey = "is_pin_deleted";

    if(object.has_key(is_pin_deletedKey))
    {
        bourne::json value = object[is_pin_deletedKey];



        jsonToValue(&is_pin_deleted, value, "bool");


    }

    const char *is_removableKey = "is_removable";

    if(object.has_key(is_removableKey))
    {
        bourne::json value = object[is_removableKey];



        jsonToValue(&is_removable, value, "bool");


    }

    const char *lead_form_idKey = "lead_form_id";

    if(object.has_key(lead_form_idKey))
    {
        bourne::json value = object[lead_form_idKey];



        jsonToValue(&lead_form_id, value, "std::string");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *quiz_pin_dataKey = "quiz_pin_data";

    if(object.has_key(quiz_pin_dataKey))
    {
        bourne::json value = object[quiz_pin_dataKey];




        QuizPinData* obj = &quiz_pin_data;
		obj->fromJson(value.dump());

    }

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];




        EntityStatus* obj = &status;
		obj->fromJson(value.dump());

    }

    const char *tracking_urlsKey = "tracking_urls";

    if(object.has_key(tracking_urlsKey))
    {
        bourne::json value = object[tracking_urlsKey];




        TrackingUrls* obj = &tracking_urls;
		obj->fromJson(value.dump());

    }

    const char *view_tracking_urlKey = "view_tracking_url";

    if(object.has_key(view_tracking_urlKey))
    {
        bourne::json value = object[view_tracking_urlKey];



        jsonToValue(&view_tracking_url, value, "std::string");


    }


}

bourne::json
AdCommon::toJson()
{
    bourne::json object = bourne::json::object();





    object["ad_group_id"] = getAdGroupId();






    object["android_deep_link"] = getAndroidDeepLink();





    std::list<std::string> carousel_android_deep_links_list = getCarouselAndroidDeepLinks();
    bourne::json carousel_android_deep_links_arr = bourne::json::array();

    for(auto& var : carousel_android_deep_links_list)
    {
        carousel_android_deep_links_arr.append(var);
    }
    object["carousel_android_deep_links"] = carousel_android_deep_links_arr;








    std::list<std::string> carousel_destination_urls_list = getCarouselDestinationUrls();
    bourne::json carousel_destination_urls_arr = bourne::json::array();

    for(auto& var : carousel_destination_urls_list)
    {
        carousel_destination_urls_arr.append(var);
    }
    object["carousel_destination_urls"] = carousel_destination_urls_arr;








    std::list<std::string> carousel_ios_deep_links_list = getCarouselIosDeepLinks();
    bourne::json carousel_ios_deep_links_arr = bourne::json::array();

    for(auto& var : carousel_ios_deep_links_list)
    {
        carousel_ios_deep_links_arr.append(var);
    }
    object["carousel_ios_deep_links"] = carousel_ios_deep_links_arr;









    object["click_tracking_url"] = getClickTrackingUrl();







	object["creative_type"] = getCreativeType().toJson();






	object["customizable_cta_type"] = getCustomizableCtaType().toJson();





    object["destination_url"] = getDestinationUrl();







	object["disclosure_type"] = getDisclosureType().toJson();





    object["disclosure_url"] = getDisclosureUrl();







	object["grid_click_type"] = getGridClickType().toJson();





    object["ios_deep_link"] = getIosDeepLink();






    object["is_pin_deleted"] = isIsPinDeleted();






    object["is_removable"] = isIsRemovable();






    object["lead_form_id"] = getLeadFormId();






    object["name"] = getName();







	object["quiz_pin_data"] = getQuizPinData().toJson();






	object["status"] = getStatus().toJson();






	object["tracking_urls"] = getTrackingUrls().toJson();





    object["view_tracking_url"] = getViewTrackingUrl();



    return object;

}

std::string
AdCommon::getAdGroupId()
{
	return ad_group_id;
}

void
AdCommon::setAdGroupId(std::string  ad_group_id)
{
	this->ad_group_id = ad_group_id;
}

std::string
AdCommon::getAndroidDeepLink()
{
	return android_deep_link;
}

void
AdCommon::setAndroidDeepLink(std::string  android_deep_link)
{
	this->android_deep_link = android_deep_link;
}

std::list<std::string>
AdCommon::getCarouselAndroidDeepLinks()
{
	return carousel_android_deep_links;
}

void
AdCommon::setCarouselAndroidDeepLinks(std::list <std::string> carousel_android_deep_links)
{
	this->carousel_android_deep_links = carousel_android_deep_links;
}

std::list<std::string>
AdCommon::getCarouselDestinationUrls()
{
	return carousel_destination_urls;
}

void
AdCommon::setCarouselDestinationUrls(std::list <std::string> carousel_destination_urls)
{
	this->carousel_destination_urls = carousel_destination_urls;
}

std::list<std::string>
AdCommon::getCarouselIosDeepLinks()
{
	return carousel_ios_deep_links;
}

void
AdCommon::setCarouselIosDeepLinks(std::list <std::string> carousel_ios_deep_links)
{
	this->carousel_ios_deep_links = carousel_ios_deep_links;
}

std::string
AdCommon::getClickTrackingUrl()
{
	return click_tracking_url;
}

void
AdCommon::setClickTrackingUrl(std::string  click_tracking_url)
{
	this->click_tracking_url = click_tracking_url;
}

CreativeType
AdCommon::getCreativeType()
{
	return creative_type;
}

void
AdCommon::setCreativeType(CreativeType  creative_type)
{
	this->creative_type = creative_type;
}

CustomizableCTAType
AdCommon::getCustomizableCtaType()
{
	return customizable_cta_type;
}

void
AdCommon::setCustomizableCtaType(CustomizableCTAType  customizable_cta_type)
{
	this->customizable_cta_type = customizable_cta_type;
}

std::string
AdCommon::getDestinationUrl()
{
	return destination_url;
}

void
AdCommon::setDestinationUrl(std::string  destination_url)
{
	this->destination_url = destination_url;
}

DisclosureType
AdCommon::getDisclosureType()
{
	return disclosure_type;
}

void
AdCommon::setDisclosureType(DisclosureType  disclosure_type)
{
	this->disclosure_type = disclosure_type;
}

std::string
AdCommon::getDisclosureUrl()
{
	return disclosure_url;
}

void
AdCommon::setDisclosureUrl(std::string  disclosure_url)
{
	this->disclosure_url = disclosure_url;
}

GridClickType
AdCommon::getGridClickType()
{
	return grid_click_type;
}

void
AdCommon::setGridClickType(GridClickType  grid_click_type)
{
	this->grid_click_type = grid_click_type;
}

std::string
AdCommon::getIosDeepLink()
{
	return ios_deep_link;
}

void
AdCommon::setIosDeepLink(std::string  ios_deep_link)
{
	this->ios_deep_link = ios_deep_link;
}

bool
AdCommon::isIsPinDeleted()
{
	return is_pin_deleted;
}

void
AdCommon::setIsPinDeleted(bool  is_pin_deleted)
{
	this->is_pin_deleted = is_pin_deleted;
}

bool
AdCommon::isIsRemovable()
{
	return is_removable;
}

void
AdCommon::setIsRemovable(bool  is_removable)
{
	this->is_removable = is_removable;
}

std::string
AdCommon::getLeadFormId()
{
	return lead_form_id;
}

void
AdCommon::setLeadFormId(std::string  lead_form_id)
{
	this->lead_form_id = lead_form_id;
}

std::string
AdCommon::getName()
{
	return name;
}

void
AdCommon::setName(std::string  name)
{
	this->name = name;
}

QuizPinData
AdCommon::getQuizPinData()
{
	return quiz_pin_data;
}

void
AdCommon::setQuizPinData(QuizPinData  quiz_pin_data)
{
	this->quiz_pin_data = quiz_pin_data;
}

EntityStatus
AdCommon::getStatus()
{
	return status;
}

void
AdCommon::setStatus(EntityStatus  status)
{
	this->status = status;
}

TrackingUrls
AdCommon::getTrackingUrls()
{
	return tracking_urls;
}

void
AdCommon::setTrackingUrls(TrackingUrls  tracking_urls)
{
	this->tracking_urls = tracking_urls;
}

std::string
AdCommon::getViewTrackingUrl()
{
	return view_tracking_url;
}

void
AdCommon::setViewTrackingUrl(std::string  view_tracking_url)
{
	this->view_tracking_url = view_tracking_url;
}



