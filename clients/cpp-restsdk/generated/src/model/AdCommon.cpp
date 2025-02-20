/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.9.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "CppRestOpenAPIClient/model/AdCommon.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



AdCommon::AdCommon()
{
    m_Ad_group_id = utility::conversions::to_string_t("");
    m_Ad_group_idIsSet = false;
    m_Android_deep_link = utility::conversions::to_string_t("");
    m_Android_deep_linkIsSet = false;
    m_Carousel_android_deep_linksIsSet = false;
    m_Carousel_destination_urlsIsSet = false;
    m_Carousel_ios_deep_linksIsSet = false;
    m_Click_tracking_url = utility::conversions::to_string_t("");
    m_Click_tracking_urlIsSet = false;
    m_Creative_typeIsSet = false;
    m_Destination_url = utility::conversions::to_string_t("");
    m_Destination_urlIsSet = false;
    m_Ios_deep_link = utility::conversions::to_string_t("");
    m_Ios_deep_linkIsSet = false;
    m_Is_pin_deleted = false;
    m_Is_pin_deletedIsSet = false;
    m_Is_removable = false;
    m_Is_removableIsSet = false;
    m_Name = utility::conversions::to_string_t("");
    m_NameIsSet = false;
    m_StatusIsSet = false;
    m_Tracking_urlsIsSet = false;
    m_View_tracking_url = utility::conversions::to_string_t("");
    m_View_tracking_urlIsSet = false;
    m_Lead_form_id = utility::conversions::to_string_t("");
    m_Lead_form_idIsSet = false;
    m_Grid_click_typeIsSet = false;
    m_Customizable_cta_type = utility::conversions::to_string_t("");
    m_Customizable_cta_typeIsSet = false;
    m_Quiz_pin_dataIsSet = false;
}

AdCommon::~AdCommon()
{
}

void AdCommon::validate()
{
    // TODO: implement validation
}

web::json::value AdCommon::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_Ad_group_idIsSet)
    {
        val[utility::conversions::to_string_t(U("ad_group_id"))] = ModelBase::toJson(m_Ad_group_id);
    }
    if(m_Android_deep_linkIsSet)
    {
        val[utility::conversions::to_string_t(U("android_deep_link"))] = ModelBase::toJson(m_Android_deep_link);
    }
    if(m_Carousel_android_deep_linksIsSet)
    {
        val[utility::conversions::to_string_t(U("carousel_android_deep_links"))] = ModelBase::toJson(m_Carousel_android_deep_links);
    }
    if(m_Carousel_destination_urlsIsSet)
    {
        val[utility::conversions::to_string_t(U("carousel_destination_urls"))] = ModelBase::toJson(m_Carousel_destination_urls);
    }
    if(m_Carousel_ios_deep_linksIsSet)
    {
        val[utility::conversions::to_string_t(U("carousel_ios_deep_links"))] = ModelBase::toJson(m_Carousel_ios_deep_links);
    }
    if(m_Click_tracking_urlIsSet)
    {
        val[utility::conversions::to_string_t(U("click_tracking_url"))] = ModelBase::toJson(m_Click_tracking_url);
    }
    if(m_Creative_typeIsSet)
    {
        val[utility::conversions::to_string_t(U("creative_type"))] = ModelBase::toJson(m_Creative_type);
    }
    if(m_Destination_urlIsSet)
    {
        val[utility::conversions::to_string_t(U("destination_url"))] = ModelBase::toJson(m_Destination_url);
    }
    if(m_Ios_deep_linkIsSet)
    {
        val[utility::conversions::to_string_t(U("ios_deep_link"))] = ModelBase::toJson(m_Ios_deep_link);
    }
    if(m_Is_pin_deletedIsSet)
    {
        val[utility::conversions::to_string_t(U("is_pin_deleted"))] = ModelBase::toJson(m_Is_pin_deleted);
    }
    if(m_Is_removableIsSet)
    {
        val[utility::conversions::to_string_t(U("is_removable"))] = ModelBase::toJson(m_Is_removable);
    }
    if(m_NameIsSet)
    {
        val[utility::conversions::to_string_t(U("name"))] = ModelBase::toJson(m_Name);
    }
    if(m_StatusIsSet)
    {
        val[utility::conversions::to_string_t(U("status"))] = ModelBase::toJson(m_Status);
    }
    if(m_Tracking_urlsIsSet)
    {
        val[utility::conversions::to_string_t(U("tracking_urls"))] = ModelBase::toJson(m_Tracking_urls);
    }
    if(m_View_tracking_urlIsSet)
    {
        val[utility::conversions::to_string_t(U("view_tracking_url"))] = ModelBase::toJson(m_View_tracking_url);
    }
    if(m_Lead_form_idIsSet)
    {
        val[utility::conversions::to_string_t(U("lead_form_id"))] = ModelBase::toJson(m_Lead_form_id);
    }
    if(m_Grid_click_typeIsSet)
    {
        val[utility::conversions::to_string_t(U("grid_click_type"))] = ModelBase::toJson(m_Grid_click_type);
    }
    if(m_Customizable_cta_typeIsSet)
    {
        val[utility::conversions::to_string_t(U("customizable_cta_type"))] = ModelBase::toJson(m_Customizable_cta_type);
    }
    if(m_Quiz_pin_dataIsSet)
    {
        val[utility::conversions::to_string_t(U("quiz_pin_data"))] = ModelBase::toJson(m_Quiz_pin_data);
    }

    return val;
}

bool AdCommon::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("ad_group_id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("ad_group_id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setAdGroupId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setAdGroupId);
            setAdGroupId(refVal_setAdGroupId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("android_deep_link"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("android_deep_link")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setAndroidDeepLink;
            ok &= ModelBase::fromJson(fieldValue, refVal_setAndroidDeepLink);
            setAndroidDeepLink(refVal_setAndroidDeepLink);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("carousel_android_deep_links"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("carousel_android_deep_links")));
        if(!fieldValue.is_null())
        {
            std::vector<utility::string_t> refVal_setCarouselAndroidDeepLinks;
            ok &= ModelBase::fromJson(fieldValue, refVal_setCarouselAndroidDeepLinks);
            setCarouselAndroidDeepLinks(refVal_setCarouselAndroidDeepLinks);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("carousel_destination_urls"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("carousel_destination_urls")));
        if(!fieldValue.is_null())
        {
            std::vector<utility::string_t> refVal_setCarouselDestinationUrls;
            ok &= ModelBase::fromJson(fieldValue, refVal_setCarouselDestinationUrls);
            setCarouselDestinationUrls(refVal_setCarouselDestinationUrls);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("carousel_ios_deep_links"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("carousel_ios_deep_links")));
        if(!fieldValue.is_null())
        {
            std::vector<utility::string_t> refVal_setCarouselIosDeepLinks;
            ok &= ModelBase::fromJson(fieldValue, refVal_setCarouselIosDeepLinks);
            setCarouselIosDeepLinks(refVal_setCarouselIosDeepLinks);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("click_tracking_url"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("click_tracking_url")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setClickTrackingUrl;
            ok &= ModelBase::fromJson(fieldValue, refVal_setClickTrackingUrl);
            setClickTrackingUrl(refVal_setClickTrackingUrl);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("creative_type"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("creative_type")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<CreativeType> refVal_setCreativeType;
            ok &= ModelBase::fromJson(fieldValue, refVal_setCreativeType);
            setCreativeType(refVal_setCreativeType);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("destination_url"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("destination_url")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setDestinationUrl;
            ok &= ModelBase::fromJson(fieldValue, refVal_setDestinationUrl);
            setDestinationUrl(refVal_setDestinationUrl);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("ios_deep_link"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("ios_deep_link")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setIosDeepLink;
            ok &= ModelBase::fromJson(fieldValue, refVal_setIosDeepLink);
            setIosDeepLink(refVal_setIosDeepLink);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("is_pin_deleted"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("is_pin_deleted")));
        if(!fieldValue.is_null())
        {
            bool refVal_setIsPinDeleted;
            ok &= ModelBase::fromJson(fieldValue, refVal_setIsPinDeleted);
            setIsPinDeleted(refVal_setIsPinDeleted);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("is_removable"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("is_removable")));
        if(!fieldValue.is_null())
        {
            bool refVal_setIsRemovable;
            ok &= ModelBase::fromJson(fieldValue, refVal_setIsRemovable);
            setIsRemovable(refVal_setIsRemovable);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("name"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("name")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setName;
            ok &= ModelBase::fromJson(fieldValue, refVal_setName);
            setName(refVal_setName);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("status"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("status")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<EntityStatus> refVal_setStatus;
            ok &= ModelBase::fromJson(fieldValue, refVal_setStatus);
            setStatus(refVal_setStatus);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("tracking_urls"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("tracking_urls")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<TrackingUrls> refVal_setTrackingUrls;
            ok &= ModelBase::fromJson(fieldValue, refVal_setTrackingUrls);
            setTrackingUrls(refVal_setTrackingUrls);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("view_tracking_url"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("view_tracking_url")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setViewTrackingUrl;
            ok &= ModelBase::fromJson(fieldValue, refVal_setViewTrackingUrl);
            setViewTrackingUrl(refVal_setViewTrackingUrl);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("lead_form_id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("lead_form_id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setLeadFormId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setLeadFormId);
            setLeadFormId(refVal_setLeadFormId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("grid_click_type"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("grid_click_type")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<GridClickType> refVal_setGridClickType;
            ok &= ModelBase::fromJson(fieldValue, refVal_setGridClickType);
            setGridClickType(refVal_setGridClickType);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("customizable_cta_type"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("customizable_cta_type")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setCustomizableCtaType;
            ok &= ModelBase::fromJson(fieldValue, refVal_setCustomizableCtaType);
            setCustomizableCtaType(refVal_setCustomizableCtaType);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("quiz_pin_data"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("quiz_pin_data")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<QuizPinData> refVal_setQuizPinData;
            ok &= ModelBase::fromJson(fieldValue, refVal_setQuizPinData);
            setQuizPinData(refVal_setQuizPinData);
        }
    }
    return ok;
}

void AdCommon::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_Ad_group_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("ad_group_id")), m_Ad_group_id));
    }
    if(m_Android_deep_linkIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("android_deep_link")), m_Android_deep_link));
    }
    if(m_Carousel_android_deep_linksIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("carousel_android_deep_links")), m_Carousel_android_deep_links));
    }
    if(m_Carousel_destination_urlsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("carousel_destination_urls")), m_Carousel_destination_urls));
    }
    if(m_Carousel_ios_deep_linksIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("carousel_ios_deep_links")), m_Carousel_ios_deep_links));
    }
    if(m_Click_tracking_urlIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("click_tracking_url")), m_Click_tracking_url));
    }
    if(m_Creative_typeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("creative_type")), m_Creative_type));
    }
    if(m_Destination_urlIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("destination_url")), m_Destination_url));
    }
    if(m_Ios_deep_linkIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("ios_deep_link")), m_Ios_deep_link));
    }
    if(m_Is_pin_deletedIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("is_pin_deleted")), m_Is_pin_deleted));
    }
    if(m_Is_removableIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("is_removable")), m_Is_removable));
    }
    if(m_NameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("name")), m_Name));
    }
    if(m_StatusIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("status")), m_Status));
    }
    if(m_Tracking_urlsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("tracking_urls")), m_Tracking_urls));
    }
    if(m_View_tracking_urlIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("view_tracking_url")), m_View_tracking_url));
    }
    if(m_Lead_form_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("lead_form_id")), m_Lead_form_id));
    }
    if(m_Grid_click_typeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("grid_click_type")), m_Grid_click_type));
    }
    if(m_Customizable_cta_typeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("customizable_cta_type")), m_Customizable_cta_type));
    }
    if(m_Quiz_pin_dataIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("quiz_pin_data")), m_Quiz_pin_data));
    }
}

bool AdCommon::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("ad_group_id"))))
    {
        utility::string_t refVal_setAdGroupId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("ad_group_id"))), refVal_setAdGroupId );
        setAdGroupId(refVal_setAdGroupId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("android_deep_link"))))
    {
        utility::string_t refVal_setAndroidDeepLink;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("android_deep_link"))), refVal_setAndroidDeepLink );
        setAndroidDeepLink(refVal_setAndroidDeepLink);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("carousel_android_deep_links"))))
    {
        std::vector<utility::string_t> refVal_setCarouselAndroidDeepLinks;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("carousel_android_deep_links"))), refVal_setCarouselAndroidDeepLinks );
        setCarouselAndroidDeepLinks(refVal_setCarouselAndroidDeepLinks);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("carousel_destination_urls"))))
    {
        std::vector<utility::string_t> refVal_setCarouselDestinationUrls;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("carousel_destination_urls"))), refVal_setCarouselDestinationUrls );
        setCarouselDestinationUrls(refVal_setCarouselDestinationUrls);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("carousel_ios_deep_links"))))
    {
        std::vector<utility::string_t> refVal_setCarouselIosDeepLinks;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("carousel_ios_deep_links"))), refVal_setCarouselIosDeepLinks );
        setCarouselIosDeepLinks(refVal_setCarouselIosDeepLinks);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("click_tracking_url"))))
    {
        utility::string_t refVal_setClickTrackingUrl;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("click_tracking_url"))), refVal_setClickTrackingUrl );
        setClickTrackingUrl(refVal_setClickTrackingUrl);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("creative_type"))))
    {
        std::shared_ptr<CreativeType> refVal_setCreativeType;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("creative_type"))), refVal_setCreativeType );
        setCreativeType(refVal_setCreativeType);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("destination_url"))))
    {
        utility::string_t refVal_setDestinationUrl;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("destination_url"))), refVal_setDestinationUrl );
        setDestinationUrl(refVal_setDestinationUrl);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("ios_deep_link"))))
    {
        utility::string_t refVal_setIosDeepLink;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("ios_deep_link"))), refVal_setIosDeepLink );
        setIosDeepLink(refVal_setIosDeepLink);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("is_pin_deleted"))))
    {
        bool refVal_setIsPinDeleted;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("is_pin_deleted"))), refVal_setIsPinDeleted );
        setIsPinDeleted(refVal_setIsPinDeleted);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("is_removable"))))
    {
        bool refVal_setIsRemovable;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("is_removable"))), refVal_setIsRemovable );
        setIsRemovable(refVal_setIsRemovable);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("name"))))
    {
        utility::string_t refVal_setName;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("name"))), refVal_setName );
        setName(refVal_setName);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("status"))))
    {
        std::shared_ptr<EntityStatus> refVal_setStatus;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("status"))), refVal_setStatus );
        setStatus(refVal_setStatus);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("tracking_urls"))))
    {
        std::shared_ptr<TrackingUrls> refVal_setTrackingUrls;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("tracking_urls"))), refVal_setTrackingUrls );
        setTrackingUrls(refVal_setTrackingUrls);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("view_tracking_url"))))
    {
        utility::string_t refVal_setViewTrackingUrl;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("view_tracking_url"))), refVal_setViewTrackingUrl );
        setViewTrackingUrl(refVal_setViewTrackingUrl);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("lead_form_id"))))
    {
        utility::string_t refVal_setLeadFormId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("lead_form_id"))), refVal_setLeadFormId );
        setLeadFormId(refVal_setLeadFormId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("grid_click_type"))))
    {
        std::shared_ptr<GridClickType> refVal_setGridClickType;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("grid_click_type"))), refVal_setGridClickType );
        setGridClickType(refVal_setGridClickType);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("customizable_cta_type"))))
    {
        utility::string_t refVal_setCustomizableCtaType;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("customizable_cta_type"))), refVal_setCustomizableCtaType );
        setCustomizableCtaType(refVal_setCustomizableCtaType);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("quiz_pin_data"))))
    {
        std::shared_ptr<QuizPinData> refVal_setQuizPinData;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("quiz_pin_data"))), refVal_setQuizPinData );
        setQuizPinData(refVal_setQuizPinData);
    }
    return ok;
}

utility::string_t AdCommon::getAdGroupId() const
{
    return m_Ad_group_id;
}

void AdCommon::setAdGroupId(const utility::string_t& value)
{
    m_Ad_group_id = value;
    m_Ad_group_idIsSet = true;
}

bool AdCommon::adGroupIdIsSet() const
{
    return m_Ad_group_idIsSet;
}

void AdCommon::unsetAd_group_id()
{
    m_Ad_group_idIsSet = false;
}
utility::string_t AdCommon::getAndroidDeepLink() const
{
    return m_Android_deep_link;
}

void AdCommon::setAndroidDeepLink(const utility::string_t& value)
{
    m_Android_deep_link = value;
    m_Android_deep_linkIsSet = true;
}

bool AdCommon::androidDeepLinkIsSet() const
{
    return m_Android_deep_linkIsSet;
}

void AdCommon::unsetAndroid_deep_link()
{
    m_Android_deep_linkIsSet = false;
}
std::vector<utility::string_t>& AdCommon::getCarouselAndroidDeepLinks()
{
    return m_Carousel_android_deep_links;
}

void AdCommon::setCarouselAndroidDeepLinks(const std::vector<utility::string_t>& value)
{
    m_Carousel_android_deep_links = value;
    m_Carousel_android_deep_linksIsSet = true;
}

bool AdCommon::carouselAndroidDeepLinksIsSet() const
{
    return m_Carousel_android_deep_linksIsSet;
}

void AdCommon::unsetCarousel_android_deep_links()
{
    m_Carousel_android_deep_linksIsSet = false;
}
std::vector<utility::string_t>& AdCommon::getCarouselDestinationUrls()
{
    return m_Carousel_destination_urls;
}

void AdCommon::setCarouselDestinationUrls(const std::vector<utility::string_t>& value)
{
    m_Carousel_destination_urls = value;
    m_Carousel_destination_urlsIsSet = true;
}

bool AdCommon::carouselDestinationUrlsIsSet() const
{
    return m_Carousel_destination_urlsIsSet;
}

void AdCommon::unsetCarousel_destination_urls()
{
    m_Carousel_destination_urlsIsSet = false;
}
std::vector<utility::string_t>& AdCommon::getCarouselIosDeepLinks()
{
    return m_Carousel_ios_deep_links;
}

void AdCommon::setCarouselIosDeepLinks(const std::vector<utility::string_t>& value)
{
    m_Carousel_ios_deep_links = value;
    m_Carousel_ios_deep_linksIsSet = true;
}

bool AdCommon::carouselIosDeepLinksIsSet() const
{
    return m_Carousel_ios_deep_linksIsSet;
}

void AdCommon::unsetCarousel_ios_deep_links()
{
    m_Carousel_ios_deep_linksIsSet = false;
}
utility::string_t AdCommon::getClickTrackingUrl() const
{
    return m_Click_tracking_url;
}

void AdCommon::setClickTrackingUrl(const utility::string_t& value)
{
    m_Click_tracking_url = value;
    m_Click_tracking_urlIsSet = true;
}

bool AdCommon::clickTrackingUrlIsSet() const
{
    return m_Click_tracking_urlIsSet;
}

void AdCommon::unsetClick_tracking_url()
{
    m_Click_tracking_urlIsSet = false;
}
std::shared_ptr<CreativeType> AdCommon::getCreativeType() const
{
    return m_Creative_type;
}

void AdCommon::setCreativeType(const std::shared_ptr<CreativeType>& value)
{
    m_Creative_type = value;
    m_Creative_typeIsSet = true;
}

bool AdCommon::creativeTypeIsSet() const
{
    return m_Creative_typeIsSet;
}

void AdCommon::unsetCreative_type()
{
    m_Creative_typeIsSet = false;
}
utility::string_t AdCommon::getDestinationUrl() const
{
    return m_Destination_url;
}

void AdCommon::setDestinationUrl(const utility::string_t& value)
{
    m_Destination_url = value;
    m_Destination_urlIsSet = true;
}

bool AdCommon::destinationUrlIsSet() const
{
    return m_Destination_urlIsSet;
}

void AdCommon::unsetDestination_url()
{
    m_Destination_urlIsSet = false;
}
utility::string_t AdCommon::getIosDeepLink() const
{
    return m_Ios_deep_link;
}

void AdCommon::setIosDeepLink(const utility::string_t& value)
{
    m_Ios_deep_link = value;
    m_Ios_deep_linkIsSet = true;
}

bool AdCommon::iosDeepLinkIsSet() const
{
    return m_Ios_deep_linkIsSet;
}

void AdCommon::unsetIos_deep_link()
{
    m_Ios_deep_linkIsSet = false;
}
bool AdCommon::isIsPinDeleted() const
{
    return m_Is_pin_deleted;
}

void AdCommon::setIsPinDeleted(bool value)
{
    m_Is_pin_deleted = value;
    m_Is_pin_deletedIsSet = true;
}

bool AdCommon::isPinDeletedIsSet() const
{
    return m_Is_pin_deletedIsSet;
}

void AdCommon::unsetIs_pin_deleted()
{
    m_Is_pin_deletedIsSet = false;
}
bool AdCommon::isIsRemovable() const
{
    return m_Is_removable;
}

void AdCommon::setIsRemovable(bool value)
{
    m_Is_removable = value;
    m_Is_removableIsSet = true;
}

bool AdCommon::isRemovableIsSet() const
{
    return m_Is_removableIsSet;
}

void AdCommon::unsetIs_removable()
{
    m_Is_removableIsSet = false;
}
utility::string_t AdCommon::getName() const
{
    return m_Name;
}

void AdCommon::setName(const utility::string_t& value)
{
    m_Name = value;
    m_NameIsSet = true;
}

bool AdCommon::nameIsSet() const
{
    return m_NameIsSet;
}

void AdCommon::unsetName()
{
    m_NameIsSet = false;
}
std::shared_ptr<EntityStatus> AdCommon::getStatus() const
{
    return m_Status;
}

void AdCommon::setStatus(const std::shared_ptr<EntityStatus>& value)
{
    m_Status = value;
    m_StatusIsSet = true;
}

bool AdCommon::statusIsSet() const
{
    return m_StatusIsSet;
}

void AdCommon::unsetStatus()
{
    m_StatusIsSet = false;
}
std::shared_ptr<TrackingUrls> AdCommon::getTrackingUrls() const
{
    return m_Tracking_urls;
}

void AdCommon::setTrackingUrls(const std::shared_ptr<TrackingUrls>& value)
{
    m_Tracking_urls = value;
    m_Tracking_urlsIsSet = true;
}

bool AdCommon::trackingUrlsIsSet() const
{
    return m_Tracking_urlsIsSet;
}

void AdCommon::unsetTracking_urls()
{
    m_Tracking_urlsIsSet = false;
}
utility::string_t AdCommon::getViewTrackingUrl() const
{
    return m_View_tracking_url;
}

void AdCommon::setViewTrackingUrl(const utility::string_t& value)
{
    m_View_tracking_url = value;
    m_View_tracking_urlIsSet = true;
}

bool AdCommon::viewTrackingUrlIsSet() const
{
    return m_View_tracking_urlIsSet;
}

void AdCommon::unsetView_tracking_url()
{
    m_View_tracking_urlIsSet = false;
}
utility::string_t AdCommon::getLeadFormId() const
{
    return m_Lead_form_id;
}

void AdCommon::setLeadFormId(const utility::string_t& value)
{
    m_Lead_form_id = value;
    m_Lead_form_idIsSet = true;
}

bool AdCommon::leadFormIdIsSet() const
{
    return m_Lead_form_idIsSet;
}

void AdCommon::unsetLead_form_id()
{
    m_Lead_form_idIsSet = false;
}
std::shared_ptr<GridClickType> AdCommon::getGridClickType() const
{
    return m_Grid_click_type;
}

void AdCommon::setGridClickType(const std::shared_ptr<GridClickType>& value)
{
    m_Grid_click_type = value;
    m_Grid_click_typeIsSet = true;
}

bool AdCommon::gridClickTypeIsSet() const
{
    return m_Grid_click_typeIsSet;
}

void AdCommon::unsetGrid_click_type()
{
    m_Grid_click_typeIsSet = false;
}
utility::string_t AdCommon::getCustomizableCtaType() const
{
    return m_Customizable_cta_type;
}

void AdCommon::setCustomizableCtaType(const utility::string_t& value)
{
    m_Customizable_cta_type = value;
    m_Customizable_cta_typeIsSet = true;
}

bool AdCommon::customizableCtaTypeIsSet() const
{
    return m_Customizable_cta_typeIsSet;
}

void AdCommon::unsetCustomizable_cta_type()
{
    m_Customizable_cta_typeIsSet = false;
}
std::shared_ptr<QuizPinData> AdCommon::getQuizPinData() const
{
    return m_Quiz_pin_data;
}

void AdCommon::setQuizPinData(const std::shared_ptr<QuizPinData>& value)
{
    m_Quiz_pin_data = value;
    m_Quiz_pin_dataIsSet = true;
}

bool AdCommon::quizPinDataIsSet() const
{
    return m_Quiz_pin_dataIsSet;
}

void AdCommon::unsetQuiz_pin_data()
{
    m_Quiz_pin_dataIsSet = false;
}
}
}
}
}


