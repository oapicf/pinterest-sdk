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



#include "CppRestOpenAPIClient/model/AdCreateRequest.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



AdCreateRequest::AdCreateRequest()
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
    m_Pin_id = utility::conversions::to_string_t("");
    m_Pin_idIsSet = false;
}

AdCreateRequest::~AdCreateRequest()
{
}

void AdCreateRequest::validate()
{
    // TODO: implement validation
}

web::json::value AdCreateRequest::toJson() const
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
    if(m_Pin_idIsSet)
    {
        val[utility::conversions::to_string_t(U("pin_id"))] = ModelBase::toJson(m_Pin_id);
    }

    return val;
}

bool AdCreateRequest::fromJson(const web::json::value& val)
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
    if(val.has_field(utility::conversions::to_string_t(U("pin_id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("pin_id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setPinId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setPinId);
            setPinId(refVal_setPinId);
        }
    }
    return ok;
}

void AdCreateRequest::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    if(m_Pin_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("pin_id")), m_Pin_id));
    }
}

bool AdCreateRequest::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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
    if(multipart->hasContent(utility::conversions::to_string_t(U("pin_id"))))
    {
        utility::string_t refVal_setPinId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("pin_id"))), refVal_setPinId );
        setPinId(refVal_setPinId);
    }
    return ok;
}

utility::string_t AdCreateRequest::getAdGroupId() const
{
    return m_Ad_group_id;
}

void AdCreateRequest::setAdGroupId(const utility::string_t& value)
{
    m_Ad_group_id = value;
    m_Ad_group_idIsSet = true;
}

bool AdCreateRequest::adGroupIdIsSet() const
{
    return m_Ad_group_idIsSet;
}

void AdCreateRequest::unsetAd_group_id()
{
    m_Ad_group_idIsSet = false;
}
utility::string_t AdCreateRequest::getAndroidDeepLink() const
{
    return m_Android_deep_link;
}

void AdCreateRequest::setAndroidDeepLink(const utility::string_t& value)
{
    m_Android_deep_link = value;
    m_Android_deep_linkIsSet = true;
}

bool AdCreateRequest::androidDeepLinkIsSet() const
{
    return m_Android_deep_linkIsSet;
}

void AdCreateRequest::unsetAndroid_deep_link()
{
    m_Android_deep_linkIsSet = false;
}
std::vector<utility::string_t>& AdCreateRequest::getCarouselAndroidDeepLinks()
{
    return m_Carousel_android_deep_links;
}

void AdCreateRequest::setCarouselAndroidDeepLinks(const std::vector<utility::string_t>& value)
{
    m_Carousel_android_deep_links = value;
    m_Carousel_android_deep_linksIsSet = true;
}

bool AdCreateRequest::carouselAndroidDeepLinksIsSet() const
{
    return m_Carousel_android_deep_linksIsSet;
}

void AdCreateRequest::unsetCarousel_android_deep_links()
{
    m_Carousel_android_deep_linksIsSet = false;
}
std::vector<utility::string_t>& AdCreateRequest::getCarouselDestinationUrls()
{
    return m_Carousel_destination_urls;
}

void AdCreateRequest::setCarouselDestinationUrls(const std::vector<utility::string_t>& value)
{
    m_Carousel_destination_urls = value;
    m_Carousel_destination_urlsIsSet = true;
}

bool AdCreateRequest::carouselDestinationUrlsIsSet() const
{
    return m_Carousel_destination_urlsIsSet;
}

void AdCreateRequest::unsetCarousel_destination_urls()
{
    m_Carousel_destination_urlsIsSet = false;
}
std::vector<utility::string_t>& AdCreateRequest::getCarouselIosDeepLinks()
{
    return m_Carousel_ios_deep_links;
}

void AdCreateRequest::setCarouselIosDeepLinks(const std::vector<utility::string_t>& value)
{
    m_Carousel_ios_deep_links = value;
    m_Carousel_ios_deep_linksIsSet = true;
}

bool AdCreateRequest::carouselIosDeepLinksIsSet() const
{
    return m_Carousel_ios_deep_linksIsSet;
}

void AdCreateRequest::unsetCarousel_ios_deep_links()
{
    m_Carousel_ios_deep_linksIsSet = false;
}
utility::string_t AdCreateRequest::getClickTrackingUrl() const
{
    return m_Click_tracking_url;
}

void AdCreateRequest::setClickTrackingUrl(const utility::string_t& value)
{
    m_Click_tracking_url = value;
    m_Click_tracking_urlIsSet = true;
}

bool AdCreateRequest::clickTrackingUrlIsSet() const
{
    return m_Click_tracking_urlIsSet;
}

void AdCreateRequest::unsetClick_tracking_url()
{
    m_Click_tracking_urlIsSet = false;
}
std::shared_ptr<CreativeType> AdCreateRequest::getCreativeType() const
{
    return m_Creative_type;
}

void AdCreateRequest::setCreativeType(const std::shared_ptr<CreativeType>& value)
{
    m_Creative_type = value;
    m_Creative_typeIsSet = true;
}

bool AdCreateRequest::creativeTypeIsSet() const
{
    return m_Creative_typeIsSet;
}

void AdCreateRequest::unsetCreative_type()
{
    m_Creative_typeIsSet = false;
}
utility::string_t AdCreateRequest::getDestinationUrl() const
{
    return m_Destination_url;
}

void AdCreateRequest::setDestinationUrl(const utility::string_t& value)
{
    m_Destination_url = value;
    m_Destination_urlIsSet = true;
}

bool AdCreateRequest::destinationUrlIsSet() const
{
    return m_Destination_urlIsSet;
}

void AdCreateRequest::unsetDestination_url()
{
    m_Destination_urlIsSet = false;
}
utility::string_t AdCreateRequest::getIosDeepLink() const
{
    return m_Ios_deep_link;
}

void AdCreateRequest::setIosDeepLink(const utility::string_t& value)
{
    m_Ios_deep_link = value;
    m_Ios_deep_linkIsSet = true;
}

bool AdCreateRequest::iosDeepLinkIsSet() const
{
    return m_Ios_deep_linkIsSet;
}

void AdCreateRequest::unsetIos_deep_link()
{
    m_Ios_deep_linkIsSet = false;
}
bool AdCreateRequest::isIsPinDeleted() const
{
    return m_Is_pin_deleted;
}

void AdCreateRequest::setIsPinDeleted(bool value)
{
    m_Is_pin_deleted = value;
    m_Is_pin_deletedIsSet = true;
}

bool AdCreateRequest::isPinDeletedIsSet() const
{
    return m_Is_pin_deletedIsSet;
}

void AdCreateRequest::unsetIs_pin_deleted()
{
    m_Is_pin_deletedIsSet = false;
}
bool AdCreateRequest::isIsRemovable() const
{
    return m_Is_removable;
}

void AdCreateRequest::setIsRemovable(bool value)
{
    m_Is_removable = value;
    m_Is_removableIsSet = true;
}

bool AdCreateRequest::isRemovableIsSet() const
{
    return m_Is_removableIsSet;
}

void AdCreateRequest::unsetIs_removable()
{
    m_Is_removableIsSet = false;
}
utility::string_t AdCreateRequest::getName() const
{
    return m_Name;
}

void AdCreateRequest::setName(const utility::string_t& value)
{
    m_Name = value;
    m_NameIsSet = true;
}

bool AdCreateRequest::nameIsSet() const
{
    return m_NameIsSet;
}

void AdCreateRequest::unsetName()
{
    m_NameIsSet = false;
}
std::shared_ptr<EntityStatus> AdCreateRequest::getStatus() const
{
    return m_Status;
}

void AdCreateRequest::setStatus(const std::shared_ptr<EntityStatus>& value)
{
    m_Status = value;
    m_StatusIsSet = true;
}

bool AdCreateRequest::statusIsSet() const
{
    return m_StatusIsSet;
}

void AdCreateRequest::unsetStatus()
{
    m_StatusIsSet = false;
}
std::shared_ptr<TrackingUrls> AdCreateRequest::getTrackingUrls() const
{
    return m_Tracking_urls;
}

void AdCreateRequest::setTrackingUrls(const std::shared_ptr<TrackingUrls>& value)
{
    m_Tracking_urls = value;
    m_Tracking_urlsIsSet = true;
}

bool AdCreateRequest::trackingUrlsIsSet() const
{
    return m_Tracking_urlsIsSet;
}

void AdCreateRequest::unsetTracking_urls()
{
    m_Tracking_urlsIsSet = false;
}
utility::string_t AdCreateRequest::getViewTrackingUrl() const
{
    return m_View_tracking_url;
}

void AdCreateRequest::setViewTrackingUrl(const utility::string_t& value)
{
    m_View_tracking_url = value;
    m_View_tracking_urlIsSet = true;
}

bool AdCreateRequest::viewTrackingUrlIsSet() const
{
    return m_View_tracking_urlIsSet;
}

void AdCreateRequest::unsetView_tracking_url()
{
    m_View_tracking_urlIsSet = false;
}
utility::string_t AdCreateRequest::getLeadFormId() const
{
    return m_Lead_form_id;
}

void AdCreateRequest::setLeadFormId(const utility::string_t& value)
{
    m_Lead_form_id = value;
    m_Lead_form_idIsSet = true;
}

bool AdCreateRequest::leadFormIdIsSet() const
{
    return m_Lead_form_idIsSet;
}

void AdCreateRequest::unsetLead_form_id()
{
    m_Lead_form_idIsSet = false;
}
std::shared_ptr<GridClickType> AdCreateRequest::getGridClickType() const
{
    return m_Grid_click_type;
}

void AdCreateRequest::setGridClickType(const std::shared_ptr<GridClickType>& value)
{
    m_Grid_click_type = value;
    m_Grid_click_typeIsSet = true;
}

bool AdCreateRequest::gridClickTypeIsSet() const
{
    return m_Grid_click_typeIsSet;
}

void AdCreateRequest::unsetGrid_click_type()
{
    m_Grid_click_typeIsSet = false;
}
utility::string_t AdCreateRequest::getCustomizableCtaType() const
{
    return m_Customizable_cta_type;
}

void AdCreateRequest::setCustomizableCtaType(const utility::string_t& value)
{
    m_Customizable_cta_type = value;
    m_Customizable_cta_typeIsSet = true;
}

bool AdCreateRequest::customizableCtaTypeIsSet() const
{
    return m_Customizable_cta_typeIsSet;
}

void AdCreateRequest::unsetCustomizable_cta_type()
{
    m_Customizable_cta_typeIsSet = false;
}
std::shared_ptr<QuizPinData> AdCreateRequest::getQuizPinData() const
{
    return m_Quiz_pin_data;
}

void AdCreateRequest::setQuizPinData(const std::shared_ptr<QuizPinData>& value)
{
    m_Quiz_pin_data = value;
    m_Quiz_pin_dataIsSet = true;
}

bool AdCreateRequest::quizPinDataIsSet() const
{
    return m_Quiz_pin_dataIsSet;
}

void AdCreateRequest::unsetQuiz_pin_data()
{
    m_Quiz_pin_dataIsSet = false;
}
utility::string_t AdCreateRequest::getPinId() const
{
    return m_Pin_id;
}

void AdCreateRequest::setPinId(const utility::string_t& value)
{
    m_Pin_id = value;
    m_Pin_idIsSet = true;
}

bool AdCreateRequest::pinIdIsSet() const
{
    return m_Pin_idIsSet;
}

void AdCreateRequest::unsetPin_id()
{
    m_Pin_idIsSet = false;
}
}
}
}
}


