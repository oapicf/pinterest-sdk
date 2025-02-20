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



#include "CppRestOpenAPIClient/model/QuizPinResult.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



QuizPinResult::QuizPinResult()
{
    m_Organic_pin_id = utility::conversions::to_string_t("");
    m_Organic_pin_idIsSet = false;
    m_Android_deep_link = utility::conversions::to_string_t("");
    m_Android_deep_linkIsSet = false;
    m_Ios_deep_link = utility::conversions::to_string_t("");
    m_Ios_deep_linkIsSet = false;
    m_Destination_url = utility::conversions::to_string_t("");
    m_Destination_urlIsSet = false;
    m_Result_id = 0.0;
    m_Result_idIsSet = false;
}

QuizPinResult::~QuizPinResult()
{
}

void QuizPinResult::validate()
{
    // TODO: implement validation
}

web::json::value QuizPinResult::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_Organic_pin_idIsSet)
    {
        val[utility::conversions::to_string_t(U("organic_pin_id"))] = ModelBase::toJson(m_Organic_pin_id);
    }
    if(m_Android_deep_linkIsSet)
    {
        val[utility::conversions::to_string_t(U("android_deep_link"))] = ModelBase::toJson(m_Android_deep_link);
    }
    if(m_Ios_deep_linkIsSet)
    {
        val[utility::conversions::to_string_t(U("ios_deep_link"))] = ModelBase::toJson(m_Ios_deep_link);
    }
    if(m_Destination_urlIsSet)
    {
        val[utility::conversions::to_string_t(U("destination_url"))] = ModelBase::toJson(m_Destination_url);
    }
    if(m_Result_idIsSet)
    {
        val[utility::conversions::to_string_t(U("result_id"))] = ModelBase::toJson(m_Result_id);
    }

    return val;
}

bool QuizPinResult::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("organic_pin_id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("organic_pin_id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setOrganicPinId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setOrganicPinId);
            setOrganicPinId(refVal_setOrganicPinId);
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
    if(val.has_field(utility::conversions::to_string_t(U("result_id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("result_id")));
        if(!fieldValue.is_null())
        {
            double refVal_setResultId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setResultId);
            setResultId(refVal_setResultId);
        }
    }
    return ok;
}

void QuizPinResult::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_Organic_pin_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("organic_pin_id")), m_Organic_pin_id));
    }
    if(m_Android_deep_linkIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("android_deep_link")), m_Android_deep_link));
    }
    if(m_Ios_deep_linkIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("ios_deep_link")), m_Ios_deep_link));
    }
    if(m_Destination_urlIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("destination_url")), m_Destination_url));
    }
    if(m_Result_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("result_id")), m_Result_id));
    }
}

bool QuizPinResult::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("organic_pin_id"))))
    {
        utility::string_t refVal_setOrganicPinId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("organic_pin_id"))), refVal_setOrganicPinId );
        setOrganicPinId(refVal_setOrganicPinId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("android_deep_link"))))
    {
        utility::string_t refVal_setAndroidDeepLink;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("android_deep_link"))), refVal_setAndroidDeepLink );
        setAndroidDeepLink(refVal_setAndroidDeepLink);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("ios_deep_link"))))
    {
        utility::string_t refVal_setIosDeepLink;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("ios_deep_link"))), refVal_setIosDeepLink );
        setIosDeepLink(refVal_setIosDeepLink);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("destination_url"))))
    {
        utility::string_t refVal_setDestinationUrl;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("destination_url"))), refVal_setDestinationUrl );
        setDestinationUrl(refVal_setDestinationUrl);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("result_id"))))
    {
        double refVal_setResultId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("result_id"))), refVal_setResultId );
        setResultId(refVal_setResultId);
    }
    return ok;
}

utility::string_t QuizPinResult::getOrganicPinId() const
{
    return m_Organic_pin_id;
}

void QuizPinResult::setOrganicPinId(const utility::string_t& value)
{
    m_Organic_pin_id = value;
    m_Organic_pin_idIsSet = true;
}

bool QuizPinResult::organicPinIdIsSet() const
{
    return m_Organic_pin_idIsSet;
}

void QuizPinResult::unsetOrganic_pin_id()
{
    m_Organic_pin_idIsSet = false;
}
utility::string_t QuizPinResult::getAndroidDeepLink() const
{
    return m_Android_deep_link;
}

void QuizPinResult::setAndroidDeepLink(const utility::string_t& value)
{
    m_Android_deep_link = value;
    m_Android_deep_linkIsSet = true;
}

bool QuizPinResult::androidDeepLinkIsSet() const
{
    return m_Android_deep_linkIsSet;
}

void QuizPinResult::unsetAndroid_deep_link()
{
    m_Android_deep_linkIsSet = false;
}
utility::string_t QuizPinResult::getIosDeepLink() const
{
    return m_Ios_deep_link;
}

void QuizPinResult::setIosDeepLink(const utility::string_t& value)
{
    m_Ios_deep_link = value;
    m_Ios_deep_linkIsSet = true;
}

bool QuizPinResult::iosDeepLinkIsSet() const
{
    return m_Ios_deep_linkIsSet;
}

void QuizPinResult::unsetIos_deep_link()
{
    m_Ios_deep_linkIsSet = false;
}
utility::string_t QuizPinResult::getDestinationUrl() const
{
    return m_Destination_url;
}

void QuizPinResult::setDestinationUrl(const utility::string_t& value)
{
    m_Destination_url = value;
    m_Destination_urlIsSet = true;
}

bool QuizPinResult::destinationUrlIsSet() const
{
    return m_Destination_urlIsSet;
}

void QuizPinResult::unsetDestination_url()
{
    m_Destination_urlIsSet = false;
}
double QuizPinResult::getResultId() const
{
    return m_Result_id;
}

void QuizPinResult::setResultId(double value)
{
    m_Result_id = value;
    m_Result_idIsSet = true;
}

bool QuizPinResult::resultIdIsSet() const
{
    return m_Result_idIsSet;
}

void QuizPinResult::unsetResult_id()
{
    m_Result_idIsSet = false;
}
}
}
}
}


