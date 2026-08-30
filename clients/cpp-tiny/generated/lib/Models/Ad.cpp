

#include "Ad.h"

using namespace Tiny;

Ad::Ad()
{
	ad_account_id = std::string();
	ad_group_id = std::string();
	android_deep_link = std::string();
	campaign_id = std::string();
	carousel_android_deep_links = std::list<std::string>();
	carousel_destination_urls = std::list<std::string>();
	carousel_ios_deep_links = std::list<std::string>();
	carting_platform_type = null;
	carting_products = std::list<CartingProduct>();
	click_tracking_url = std::string();
	collection_items_destination_url_template = std::string();
	collections_header_type = null;
	created_time = int(0);
	creative_type = CreativeType();
	customizable_cta_type = CustomizableCTAType();
	destination_url = std::string();
	disclosure_type = DisclosureType();
	disclosure_url = std::string();
	grid_click_type = GridClickType();
	id = std::string();
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
	rejected_reasons = std::list<AdDisapprovalReasons>();
	rejection_labels = std::list<std::string>();
	review_status = null;
	status = EntityStatus();
	summary_status = null;
	tracking_urls = TrackingUrls();
	type = std::string();
	updated_time = int(0);
	view_tracking_url = std::string();
}

Ad::Ad(std::string jsonString)
{
	this->fromJson(jsonString);
}

Ad::~Ad()
{

}

void
Ad::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *ad_account_idKey = "ad_account_id";

    if(object.has_key(ad_account_idKey))
    {
        bourne::json value = object[ad_account_idKey];



        jsonToValue(&ad_account_id, value, "std::string");


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

    const char *campaign_idKey = "campaign_id";

    if(object.has_key(campaign_idKey))
    {
        bourne::json value = object[campaign_idKey];



        jsonToValue(&campaign_id, value, "std::string");


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

    const char *carting_platform_typeKey = "carting_platform_type";

    if(object.has_key(carting_platform_typeKey))
    {
        bourne::json value = object[carting_platform_typeKey];



        jsonToValue(&carting_platform_type, value, "int");


    }

    const char *carting_productsKey = "carting_products";

    if(object.has_key(carting_productsKey))
    {
        bourne::json value = object[carting_productsKey];


        std::list<CartingProduct> carting_products_list;
        CartingProduct element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            carting_products_list.push_back(element);
        }
        carting_products = carting_products_list;


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

    const char *created_timeKey = "created_time";

    if(object.has_key(created_timeKey))
    {
        bourne::json value = object[created_timeKey];



        jsonToValue(&created_time, value, "int");


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

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


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

    const char *rejected_reasonsKey = "rejected_reasons";

    if(object.has_key(rejected_reasonsKey))
    {
        bourne::json value = object[rejected_reasonsKey];


        std::list<AdDisapprovalReasons> rejected_reasons_list;
        AdDisapprovalReasons element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            rejected_reasons_list.push_back(element);
        }
        rejected_reasons = rejected_reasons_list;


    }

    const char *rejection_labelsKey = "rejection_labels";

    if(object.has_key(rejection_labelsKey))
    {
        bourne::json value = object[rejection_labelsKey];


        std::list<std::string> rejection_labels_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            rejection_labels_list.push_back(element);
        }
        rejection_labels = rejection_labels_list;


    }

    const char *review_statusKey = "review_status";

    if(object.has_key(review_statusKey))
    {
        bourne::json value = object[review_statusKey];




        AdReviewStatus* obj = &review_status;
		obj->fromJson(value.dump());

    }

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];




        EntityStatus* obj = &status;
		obj->fromJson(value.dump());

    }

    const char *summary_statusKey = "summary_status";

    if(object.has_key(summary_statusKey))
    {
        bourne::json value = object[summary_statusKey];




        PinPromotionSummaryStatus* obj = &summary_status;
		obj->fromJson(value.dump());

    }

    const char *tracking_urlsKey = "tracking_urls";

    if(object.has_key(tracking_urlsKey))
    {
        bourne::json value = object[tracking_urlsKey];




        TrackingUrls* obj = &tracking_urls;
		obj->fromJson(value.dump());

    }

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];



        jsonToValue(&type, value, "std::string");


    }

    const char *updated_timeKey = "updated_time";

    if(object.has_key(updated_timeKey))
    {
        bourne::json value = object[updated_timeKey];



        jsonToValue(&updated_time, value, "int");


    }

    const char *view_tracking_urlKey = "view_tracking_url";

    if(object.has_key(view_tracking_urlKey))
    {
        bourne::json value = object[view_tracking_urlKey];



        jsonToValue(&view_tracking_url, value, "std::string");


    }


}

bourne::json
Ad::toJson()
{
    bourne::json object = bourne::json::object();





    object["ad_account_id"] = getAdAccountId();






    object["ad_group_id"] = getAdGroupId();






    object["android_deep_link"] = getAndroidDeepLink();






    object["campaign_id"] = getCampaignId();





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









    object["carting_platform_type"] = getCartingPlatformType();





    std::list<CartingProduct> carting_products_list = getCartingProducts();
    bourne::json carting_products_arr = bourne::json::array();

    for(auto& var : carting_products_list)
    {
        CartingProduct obj = var;
        carting_products_arr.append(obj.toJson());
    }
    object["carting_products"] = carting_products_arr;







    object["click_tracking_url"] = getClickTrackingUrl();






    object["collection_items_destination_url_template"] = getCollectionItemsDestinationUrlTemplate();







	object["collections_header_type"] = getCollectionsHeaderType().toJson();





    object["created_time"] = getCreatedTime();







	object["creative_type"] = getCreativeType().toJson();






	object["customizable_cta_type"] = getCustomizableCtaType().toJson();





    object["destination_url"] = getDestinationUrl();







	object["disclosure_type"] = getDisclosureType().toJson();





    object["disclosure_url"] = getDisclosureUrl();







	object["grid_click_type"] = getGridClickType().toJson();





    object["id"] = getId();






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




    std::list<AdDisapprovalReasons> rejected_reasons_list = getRejectedReasons();
    bourne::json rejected_reasons_arr = bourne::json::array();

    for(auto& var : rejected_reasons_list)
    {
        AdDisapprovalReasons obj = var;
        rejected_reasons_arr.append(obj.toJson());
    }
    object["rejected_reasons"] = rejected_reasons_arr;






    std::list<std::string> rejection_labels_list = getRejectionLabels();
    bourne::json rejection_labels_arr = bourne::json::array();

    for(auto& var : rejection_labels_list)
    {
        rejection_labels_arr.append(var);
    }
    object["rejection_labels"] = rejection_labels_arr;










	object["review_status"] = getReviewStatus().toJson();






	object["status"] = getStatus().toJson();






	object["summary_status"] = getSummaryStatus().toJson();






	object["tracking_urls"] = getTrackingUrls().toJson();





    object["type"] = getType();






    object["updated_time"] = getUpdatedTime();






    object["view_tracking_url"] = getViewTrackingUrl();



    return object;

}

std::string
Ad::getAdAccountId()
{
	return ad_account_id;
}

void
Ad::setAdAccountId(std::string ad_account_id)
{
	this->ad_account_id = ad_account_id;
}

std::string
Ad::getAdGroupId()
{
	return ad_group_id;
}

void
Ad::setAdGroupId(std::string ad_group_id)
{
	this->ad_group_id = ad_group_id;
}

std::string
Ad::getAndroidDeepLink()
{
	return android_deep_link;
}

void
Ad::setAndroidDeepLink(std::string android_deep_link)
{
	this->android_deep_link = android_deep_link;
}

std::string
Ad::getCampaignId()
{
	return campaign_id;
}

void
Ad::setCampaignId(std::string campaign_id)
{
	this->campaign_id = campaign_id;
}

std::list<std::string>
Ad::getCarouselAndroidDeepLinks()
{
	return carousel_android_deep_links;
}

void
Ad::setCarouselAndroidDeepLinks(std::list<std::string> carousel_android_deep_links)
{
	this->carousel_android_deep_links = carousel_android_deep_links;
}

std::list<std::string>
Ad::getCarouselDestinationUrls()
{
	return carousel_destination_urls;
}

void
Ad::setCarouselDestinationUrls(std::list<std::string> carousel_destination_urls)
{
	this->carousel_destination_urls = carousel_destination_urls;
}

std::list<std::string>
Ad::getCarouselIosDeepLinks()
{
	return carousel_ios_deep_links;
}

void
Ad::setCarouselIosDeepLinks(std::list<std::string> carousel_ios_deep_links)
{
	this->carousel_ios_deep_links = carousel_ios_deep_links;
}

int
Ad::getCartingPlatformType()
{
	return carting_platform_type;
}

void
Ad::setCartingPlatformType(int carting_platform_type)
{
	this->carting_platform_type = carting_platform_type;
}

std::list<CartingProduct>
Ad::getCartingProducts()
{
	return carting_products;
}

void
Ad::setCartingProducts(std::list<CartingProduct> carting_products)
{
	this->carting_products = carting_products;
}

std::string
Ad::getClickTrackingUrl()
{
	return click_tracking_url;
}

void
Ad::setClickTrackingUrl(std::string click_tracking_url)
{
	this->click_tracking_url = click_tracking_url;
}

std::string
Ad::getCollectionItemsDestinationUrlTemplate()
{
	return collection_items_destination_url_template;
}

void
Ad::setCollectionItemsDestinationUrlTemplate(std::string collection_items_destination_url_template)
{
	this->collection_items_destination_url_template = collection_items_destination_url_template;
}

AdCollectionsHeaderType
Ad::getCollectionsHeaderType()
{
	return collections_header_type;
}

void
Ad::setCollectionsHeaderType(AdCollectionsHeaderType collections_header_type)
{
	this->collections_header_type = collections_header_type;
}

int
Ad::getCreatedTime()
{
	return created_time;
}

void
Ad::setCreatedTime(int created_time)
{
	this->created_time = created_time;
}

CreativeType
Ad::getCreativeType()
{
	return creative_type;
}

void
Ad::setCreativeType(CreativeType creative_type)
{
	this->creative_type = creative_type;
}

CustomizableCTAType
Ad::getCustomizableCtaType()
{
	return customizable_cta_type;
}

void
Ad::setCustomizableCtaType(CustomizableCTAType customizable_cta_type)
{
	this->customizable_cta_type = customizable_cta_type;
}

std::string
Ad::getDestinationUrl()
{
	return destination_url;
}

void
Ad::setDestinationUrl(std::string destination_url)
{
	this->destination_url = destination_url;
}

DisclosureType
Ad::getDisclosureType()
{
	return disclosure_type;
}

void
Ad::setDisclosureType(DisclosureType disclosure_type)
{
	this->disclosure_type = disclosure_type;
}

std::string
Ad::getDisclosureUrl()
{
	return disclosure_url;
}

void
Ad::setDisclosureUrl(std::string disclosure_url)
{
	this->disclosure_url = disclosure_url;
}

GridClickType
Ad::getGridClickType()
{
	return grid_click_type;
}

void
Ad::setGridClickType(GridClickType grid_click_type)
{
	this->grid_click_type = grid_click_type;
}

std::string
Ad::getId()
{
	return id;
}

void
Ad::setId(std::string id)
{
	this->id = id;
}

std::string
Ad::getIosDeepLink()
{
	return ios_deep_link;
}

void
Ad::setIosDeepLink(std::string ios_deep_link)
{
	this->ios_deep_link = ios_deep_link;
}

bool
Ad::isIsCarting()
{
	return is_carting;
}

void
Ad::setIsCarting(bool is_carting)
{
	this->is_carting = is_carting;
}

bool
Ad::isIsCollageAcceptedTerms()
{
	return is_collage_accepted_terms;
}

void
Ad::setIsCollageAcceptedTerms(bool is_collage_accepted_terms)
{
	this->is_collage_accepted_terms = is_collage_accepted_terms;
}

bool
Ad::isIsCollageSingleDestination()
{
	return is_collage_single_destination;
}

void
Ad::setIsCollageSingleDestination(bool is_collage_single_destination)
{
	this->is_collage_single_destination = is_collage_single_destination;
}

bool
Ad::isIsPinDeleted()
{
	return is_pin_deleted;
}

void
Ad::setIsPinDeleted(bool is_pin_deleted)
{
	this->is_pin_deleted = is_pin_deleted;
}

bool
Ad::isIsRemovable()
{
	return is_removable;
}

void
Ad::setIsRemovable(bool is_removable)
{
	this->is_removable = is_removable;
}

std::string
Ad::getLeadFormId()
{
	return lead_form_id;
}

void
Ad::setLeadFormId(std::string lead_form_id)
{
	this->lead_form_id = lead_form_id;
}

std::string
Ad::getName()
{
	return name;
}

void
Ad::setName(std::string name)
{
	this->name = name;
}

std::string
Ad::getPinId()
{
	return pin_id;
}

void
Ad::setPinId(std::string pin_id)
{
	this->pin_id = pin_id;
}

QuizPinData
Ad::getQuizPinData()
{
	return quiz_pin_data;
}

void
Ad::setQuizPinData(QuizPinData quiz_pin_data)
{
	this->quiz_pin_data = quiz_pin_data;
}

std::list<AdDisapprovalReasons>
Ad::getRejectedReasons()
{
	return rejected_reasons;
}

void
Ad::setRejectedReasons(std::list<AdDisapprovalReasons> rejected_reasons)
{
	this->rejected_reasons = rejected_reasons;
}

std::list<std::string>
Ad::getRejectionLabels()
{
	return rejection_labels;
}

void
Ad::setRejectionLabels(std::list<std::string> rejection_labels)
{
	this->rejection_labels = rejection_labels;
}

AdReviewStatus
Ad::getReviewStatus()
{
	return review_status;
}

void
Ad::setReviewStatus(AdReviewStatus review_status)
{
	this->review_status = review_status;
}

EntityStatus
Ad::getStatus()
{
	return status;
}

void
Ad::setStatus(EntityStatus status)
{
	this->status = status;
}

PinPromotionSummaryStatus
Ad::getSummaryStatus()
{
	return summary_status;
}

void
Ad::setSummaryStatus(PinPromotionSummaryStatus summary_status)
{
	this->summary_status = summary_status;
}

TrackingUrls
Ad::getTrackingUrls()
{
	return tracking_urls;
}

void
Ad::setTrackingUrls(TrackingUrls tracking_urls)
{
	this->tracking_urls = tracking_urls;
}

std::string
Ad::getType()
{
	return type;
}

void
Ad::setType(std::string type)
{
	this->type = type;
}

int
Ad::getUpdatedTime()
{
	return updated_time;
}

void
Ad::setUpdatedTime(int updated_time)
{
	this->updated_time = updated_time;
}

std::string
Ad::getViewTrackingUrl()
{
	return view_tracking_url;
}

void
Ad::setViewTrackingUrl(std::string view_tracking_url)
{
	this->view_tracking_url = view_tracking_url;
}



