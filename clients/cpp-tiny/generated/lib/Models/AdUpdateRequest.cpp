

#include "AdUpdateRequest.h"

using namespace Tiny;

AdUpdateRequest::AdUpdateRequest()
{
	id = std::string();
	pin_id = std::string();
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
	is_carting = bool(false);
	is_pin_deleted = bool(false);
	is_removable = bool(false);
	lead_form_id = std::string();
	name = std::string();
	quiz_pin_data = null;
	status = EntityStatus();
	tracking_urls = null;
	view_tracking_url = std::string();
}

AdUpdateRequest::AdUpdateRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdUpdateRequest::~AdUpdateRequest()
{

}

void
AdUpdateRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *pin_idKey = "pin_id";

    if(object.has_key(pin_idKey))
    {
        bourne::json value = object[pin_idKey];



        jsonToValue(&pin_id, value, "std::string");


    }

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

    const char *is_cartingKey = "is_carting";

    if(object.has_key(is_cartingKey))
    {
        bourne::json value = object[is_cartingKey];



        jsonToValue(&is_carting, value, "bool");


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




        Object* obj = &quiz_pin_data;
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




        Object* obj = &tracking_urls;
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
AdUpdateRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["pin_id"] = getPinId();






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






    object["is_carting"] = isIsCarting();






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
AdUpdateRequest::getId()
{
	return id;
}

void
AdUpdateRequest::setId(std::string id)
{
	this->id = id;
}

std::string
AdUpdateRequest::getPinId()
{
	return pin_id;
}

void
AdUpdateRequest::setPinId(std::string pin_id)
{
	this->pin_id = pin_id;
}

std::string
AdUpdateRequest::getAdGroupId()
{
	return ad_group_id;
}

void
AdUpdateRequest::setAdGroupId(std::string ad_group_id)
{
	this->ad_group_id = ad_group_id;
}

std::string
AdUpdateRequest::getAndroidDeepLink()
{
	return android_deep_link;
}

void
AdUpdateRequest::setAndroidDeepLink(std::string android_deep_link)
{
	this->android_deep_link = android_deep_link;
}

std::list<std::string>
AdUpdateRequest::getCarouselAndroidDeepLinks()
{
	return carousel_android_deep_links;
}

void
AdUpdateRequest::setCarouselAndroidDeepLinks(std::list<std::string> carousel_android_deep_links)
{
	this->carousel_android_deep_links = carousel_android_deep_links;
}

std::list<std::string>
AdUpdateRequest::getCarouselDestinationUrls()
{
	return carousel_destination_urls;
}

void
AdUpdateRequest::setCarouselDestinationUrls(std::list<std::string> carousel_destination_urls)
{
	this->carousel_destination_urls = carousel_destination_urls;
}

std::list<std::string>
AdUpdateRequest::getCarouselIosDeepLinks()
{
	return carousel_ios_deep_links;
}

void
AdUpdateRequest::setCarouselIosDeepLinks(std::list<std::string> carousel_ios_deep_links)
{
	this->carousel_ios_deep_links = carousel_ios_deep_links;
}

std::string
AdUpdateRequest::getClickTrackingUrl()
{
	return click_tracking_url;
}

void
AdUpdateRequest::setClickTrackingUrl(std::string click_tracking_url)
{
	this->click_tracking_url = click_tracking_url;
}

CreativeType
AdUpdateRequest::getCreativeType()
{
	return creative_type;
}

void
AdUpdateRequest::setCreativeType(CreativeType creative_type)
{
	this->creative_type = creative_type;
}

CustomizableCTAType
AdUpdateRequest::getCustomizableCtaType()
{
	return customizable_cta_type;
}

void
AdUpdateRequest::setCustomizableCtaType(CustomizableCTAType customizable_cta_type)
{
	this->customizable_cta_type = customizable_cta_type;
}

std::string
AdUpdateRequest::getDestinationUrl()
{
	return destination_url;
}

void
AdUpdateRequest::setDestinationUrl(std::string destination_url)
{
	this->destination_url = destination_url;
}

DisclosureType
AdUpdateRequest::getDisclosureType()
{
	return disclosure_type;
}

void
AdUpdateRequest::setDisclosureType(DisclosureType disclosure_type)
{
	this->disclosure_type = disclosure_type;
}

std::string
AdUpdateRequest::getDisclosureUrl()
{
	return disclosure_url;
}

void
AdUpdateRequest::setDisclosureUrl(std::string disclosure_url)
{
	this->disclosure_url = disclosure_url;
}

GridClickType
AdUpdateRequest::getGridClickType()
{
	return grid_click_type;
}

void
AdUpdateRequest::setGridClickType(GridClickType grid_click_type)
{
	this->grid_click_type = grid_click_type;
}

std::string
AdUpdateRequest::getIosDeepLink()
{
	return ios_deep_link;
}

void
AdUpdateRequest::setIosDeepLink(std::string ios_deep_link)
{
	this->ios_deep_link = ios_deep_link;
}

bool
AdUpdateRequest::isIsCarting()
{
	return is_carting;
}

void
AdUpdateRequest::setIsCarting(bool is_carting)
{
	this->is_carting = is_carting;
}

bool
AdUpdateRequest::isIsPinDeleted()
{
	return is_pin_deleted;
}

void
AdUpdateRequest::setIsPinDeleted(bool is_pin_deleted)
{
	this->is_pin_deleted = is_pin_deleted;
}

bool
AdUpdateRequest::isIsRemovable()
{
	return is_removable;
}

void
AdUpdateRequest::setIsRemovable(bool is_removable)
{
	this->is_removable = is_removable;
}

std::string
AdUpdateRequest::getLeadFormId()
{
	return lead_form_id;
}

void
AdUpdateRequest::setLeadFormId(std::string lead_form_id)
{
	this->lead_form_id = lead_form_id;
}

std::string
AdUpdateRequest::getName()
{
	return name;
}

void
AdUpdateRequest::setName(std::string name)
{
	this->name = name;
}

Object
AdUpdateRequest::getQuizPinData()
{
	return quiz_pin_data;
}

void
AdUpdateRequest::setQuizPinData(Object quiz_pin_data)
{
	this->quiz_pin_data = quiz_pin_data;
}

EntityStatus
AdUpdateRequest::getStatus()
{
	return status;
}

void
AdUpdateRequest::setStatus(EntityStatus status)
{
	this->status = status;
}

Object
AdUpdateRequest::getTrackingUrls()
{
	return tracking_urls;
}

void
AdUpdateRequest::setTrackingUrls(Object tracking_urls)
{
	this->tracking_urls = tracking_urls;
}

std::string
AdUpdateRequest::getViewTrackingUrl()
{
	return view_tracking_url;
}

void
AdUpdateRequest::setViewTrackingUrl(std::string view_tracking_url)
{
	this->view_tracking_url = view_tracking_url;
}



