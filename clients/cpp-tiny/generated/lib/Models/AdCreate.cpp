

#include "AdCreate.h"

using namespace Tiny;

AdCreate::AdCreate()
{
	ad_group_id = std::string();
	android_deep_link = std::string();
	carousel_android_deep_links = std::list<std::string>();
	carousel_destination_urls = std::list<std::string>();
	carousel_ios_deep_links = std::list<std::string>();
	click_tracking_url = std::string();
	collection_items_destination_url_template = std::string();
	collections_header_type = null;
	creative_type = CreativeType();
	customizable_cta_type = CustomizableCTAType();
	destination_url = std::string();
	disclosure_type = DisclosureType();
	disclosure_url = std::string();
	grid_click_type = GridClickType();
	ios_deep_link = std::string();
	is_carting = bool(false);
	is_collage_accepted_terms = bool(false);
	is_collage_single_destination = bool(false);
	is_pin_deleted = bool(false);
	is_removable = bool(false);
	lead_form_id = std::string();
	name = std::string();
	pin_id = std::string();
	quiz_pin_data = null;
	status = EntityStatus();
	tracking_urls = TrackingUrls();
	view_tracking_url = std::string();
}

AdCreate::AdCreate(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdCreate::~AdCreate()
{

}

void
AdCreate::fromJson(std::string jsonObj)
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

    const char *collection_items_destination_url_templateKey = "collection_items_destination_url_template";

    if(object.has_key(collection_items_destination_url_templateKey))
    {
        bourne::json value = object[collection_items_destination_url_templateKey];



        jsonToValue(&collection_items_destination_url_template, value, "std::string");


    }

    const char *collections_header_typeKey = "collections_header_type";

    if(object.has_key(collections_header_typeKey))
    {
        bourne::json value = object[collections_header_typeKey];




        AdCollectionsHeaderType* obj = &collections_header_type;
		obj->fromJson(value.dump());

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

    const char *is_collage_accepted_termsKey = "is_collage_accepted_terms";

    if(object.has_key(is_collage_accepted_termsKey))
    {
        bourne::json value = object[is_collage_accepted_termsKey];



        jsonToValue(&is_collage_accepted_terms, value, "bool");


    }

    const char *is_collage_single_destinationKey = "is_collage_single_destination";

    if(object.has_key(is_collage_single_destinationKey))
    {
        bourne::json value = object[is_collage_single_destinationKey];



        jsonToValue(&is_collage_single_destination, value, "bool");


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

    const char *pin_idKey = "pin_id";

    if(object.has_key(pin_idKey))
    {
        bourne::json value = object[pin_idKey];



        jsonToValue(&pin_id, value, "std::string");


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
AdCreate::toJson()
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






    object["collection_items_destination_url_template"] = getCollectionItemsDestinationUrlTemplate();







	object["collections_header_type"] = getCollectionsHeaderType().toJson();






	object["creative_type"] = getCreativeType().toJson();






	object["customizable_cta_type"] = getCustomizableCtaType().toJson();





    object["destination_url"] = getDestinationUrl();







	object["disclosure_type"] = getDisclosureType().toJson();





    object["disclosure_url"] = getDisclosureUrl();







	object["grid_click_type"] = getGridClickType().toJson();





    object["ios_deep_link"] = getIosDeepLink();






    object["is_carting"] = isIsCarting();






    object["is_collage_accepted_terms"] = isIsCollageAcceptedTerms();






    object["is_collage_single_destination"] = isIsCollageSingleDestination();






    object["is_pin_deleted"] = isIsPinDeleted();






    object["is_removable"] = isIsRemovable();






    object["lead_form_id"] = getLeadFormId();






    object["name"] = getName();






    object["pin_id"] = getPinId();







	object["quiz_pin_data"] = getQuizPinData().toJson();






	object["status"] = getStatus().toJson();






	object["tracking_urls"] = getTrackingUrls().toJson();





    object["view_tracking_url"] = getViewTrackingUrl();



    return object;

}

std::string
AdCreate::getAdGroupId()
{
	return ad_group_id;
}

void
AdCreate::setAdGroupId(std::string ad_group_id)
{
	this->ad_group_id = ad_group_id;
}

std::string
AdCreate::getAndroidDeepLink()
{
	return android_deep_link;
}

void
AdCreate::setAndroidDeepLink(std::string android_deep_link)
{
	this->android_deep_link = android_deep_link;
}

std::list<std::string>
AdCreate::getCarouselAndroidDeepLinks()
{
	return carousel_android_deep_links;
}

void
AdCreate::setCarouselAndroidDeepLinks(std::list<std::string> carousel_android_deep_links)
{
	this->carousel_android_deep_links = carousel_android_deep_links;
}

std::list<std::string>
AdCreate::getCarouselDestinationUrls()
{
	return carousel_destination_urls;
}

void
AdCreate::setCarouselDestinationUrls(std::list<std::string> carousel_destination_urls)
{
	this->carousel_destination_urls = carousel_destination_urls;
}

std::list<std::string>
AdCreate::getCarouselIosDeepLinks()
{
	return carousel_ios_deep_links;
}

void
AdCreate::setCarouselIosDeepLinks(std::list<std::string> carousel_ios_deep_links)
{
	this->carousel_ios_deep_links = carousel_ios_deep_links;
}

std::string
AdCreate::getClickTrackingUrl()
{
	return click_tracking_url;
}

void
AdCreate::setClickTrackingUrl(std::string click_tracking_url)
{
	this->click_tracking_url = click_tracking_url;
}

std::string
AdCreate::getCollectionItemsDestinationUrlTemplate()
{
	return collection_items_destination_url_template;
}

void
AdCreate::setCollectionItemsDestinationUrlTemplate(std::string collection_items_destination_url_template)
{
	this->collection_items_destination_url_template = collection_items_destination_url_template;
}

AdCollectionsHeaderType
AdCreate::getCollectionsHeaderType()
{
	return collections_header_type;
}

void
AdCreate::setCollectionsHeaderType(AdCollectionsHeaderType collections_header_type)
{
	this->collections_header_type = collections_header_type;
}

CreativeType
AdCreate::getCreativeType()
{
	return creative_type;
}

void
AdCreate::setCreativeType(CreativeType creative_type)
{
	this->creative_type = creative_type;
}

CustomizableCTAType
AdCreate::getCustomizableCtaType()
{
	return customizable_cta_type;
}

void
AdCreate::setCustomizableCtaType(CustomizableCTAType customizable_cta_type)
{
	this->customizable_cta_type = customizable_cta_type;
}

std::string
AdCreate::getDestinationUrl()
{
	return destination_url;
}

void
AdCreate::setDestinationUrl(std::string destination_url)
{
	this->destination_url = destination_url;
}

DisclosureType
AdCreate::getDisclosureType()
{
	return disclosure_type;
}

void
AdCreate::setDisclosureType(DisclosureType disclosure_type)
{
	this->disclosure_type = disclosure_type;
}

std::string
AdCreate::getDisclosureUrl()
{
	return disclosure_url;
}

void
AdCreate::setDisclosureUrl(std::string disclosure_url)
{
	this->disclosure_url = disclosure_url;
}

GridClickType
AdCreate::getGridClickType()
{
	return grid_click_type;
}

void
AdCreate::setGridClickType(GridClickType grid_click_type)
{
	this->grid_click_type = grid_click_type;
}

std::string
AdCreate::getIosDeepLink()
{
	return ios_deep_link;
}

void
AdCreate::setIosDeepLink(std::string ios_deep_link)
{
	this->ios_deep_link = ios_deep_link;
}

bool
AdCreate::isIsCarting()
{
	return is_carting;
}

void
AdCreate::setIsCarting(bool is_carting)
{
	this->is_carting = is_carting;
}

bool
AdCreate::isIsCollageAcceptedTerms()
{
	return is_collage_accepted_terms;
}

void
AdCreate::setIsCollageAcceptedTerms(bool is_collage_accepted_terms)
{
	this->is_collage_accepted_terms = is_collage_accepted_terms;
}

bool
AdCreate::isIsCollageSingleDestination()
{
	return is_collage_single_destination;
}

void
AdCreate::setIsCollageSingleDestination(bool is_collage_single_destination)
{
	this->is_collage_single_destination = is_collage_single_destination;
}

bool
AdCreate::isIsPinDeleted()
{
	return is_pin_deleted;
}

void
AdCreate::setIsPinDeleted(bool is_pin_deleted)
{
	this->is_pin_deleted = is_pin_deleted;
}

bool
AdCreate::isIsRemovable()
{
	return is_removable;
}

void
AdCreate::setIsRemovable(bool is_removable)
{
	this->is_removable = is_removable;
}

std::string
AdCreate::getLeadFormId()
{
	return lead_form_id;
}

void
AdCreate::setLeadFormId(std::string lead_form_id)
{
	this->lead_form_id = lead_form_id;
}

std::string
AdCreate::getName()
{
	return name;
}

void
AdCreate::setName(std::string name)
{
	this->name = name;
}

std::string
AdCreate::getPinId()
{
	return pin_id;
}

void
AdCreate::setPinId(std::string pin_id)
{
	this->pin_id = pin_id;
}

QuizPinData
AdCreate::getQuizPinData()
{
	return quiz_pin_data;
}

void
AdCreate::setQuizPinData(QuizPinData quiz_pin_data)
{
	this->quiz_pin_data = quiz_pin_data;
}

EntityStatus
AdCreate::getStatus()
{
	return status;
}

void
AdCreate::setStatus(EntityStatus status)
{
	this->status = status;
}

TrackingUrls
AdCreate::getTrackingUrls()
{
	return tracking_urls;
}

void
AdCreate::setTrackingUrls(TrackingUrls tracking_urls)
{
	this->tracking_urls = tracking_urls;
}

std::string
AdCreate::getViewTrackingUrl()
{
	return view_tracking_url;
}

void
AdCreate::setViewTrackingUrl(std::string view_tracking_url)
{
	this->view_tracking_url = view_tracking_url;
}



