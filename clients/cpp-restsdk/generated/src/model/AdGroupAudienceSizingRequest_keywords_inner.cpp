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



#include "CppRestOpenAPIClient/model/AdGroupAudienceSizingRequest_keywords_inner.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



AdGroupAudienceSizingRequest_keywords_inner::AdGroupAudienceSizingRequest_keywords_inner()
{
    m_Match_typeIsSet = false;
    m_Value = utility::conversions::to_string_t("");
    m_ValueIsSet = false;
}

AdGroupAudienceSizingRequest_keywords_inner::~AdGroupAudienceSizingRequest_keywords_inner()
{
}

void AdGroupAudienceSizingRequest_keywords_inner::validate()
{
    // TODO: implement validation
}

web::json::value AdGroupAudienceSizingRequest_keywords_inner::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_Match_typeIsSet)
    {
        val[utility::conversions::to_string_t(U("match_type"))] = ModelBase::toJson(m_Match_type);
    }
    if(m_ValueIsSet)
    {
        val[utility::conversions::to_string_t(U("value"))] = ModelBase::toJson(m_Value);
    }

    return val;
}

bool AdGroupAudienceSizingRequest_keywords_inner::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("match_type"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("match_type")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<MatchTypeResponse> refVal_setMatchType;
            ok &= ModelBase::fromJson(fieldValue, refVal_setMatchType);
            setMatchType(refVal_setMatchType);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("value"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("value")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setValue;
            ok &= ModelBase::fromJson(fieldValue, refVal_setValue);
            setValue(refVal_setValue);
        }
    }
    return ok;
}

void AdGroupAudienceSizingRequest_keywords_inner::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_Match_typeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("match_type")), m_Match_type));
    }
    if(m_ValueIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("value")), m_Value));
    }
}

bool AdGroupAudienceSizingRequest_keywords_inner::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("match_type"))))
    {
        std::shared_ptr<MatchTypeResponse> refVal_setMatchType;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("match_type"))), refVal_setMatchType );
        setMatchType(refVal_setMatchType);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("value"))))
    {
        utility::string_t refVal_setValue;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("value"))), refVal_setValue );
        setValue(refVal_setValue);
    }
    return ok;
}

std::shared_ptr<MatchTypeResponse> AdGroupAudienceSizingRequest_keywords_inner::getMatchType() const
{
    return m_Match_type;
}

void AdGroupAudienceSizingRequest_keywords_inner::setMatchType(const std::shared_ptr<MatchTypeResponse>& value)
{
    m_Match_type = value;
    m_Match_typeIsSet = true;
}

bool AdGroupAudienceSizingRequest_keywords_inner::matchTypeIsSet() const
{
    return m_Match_typeIsSet;
}

void AdGroupAudienceSizingRequest_keywords_inner::unsetMatch_type()
{
    m_Match_typeIsSet = false;
}
utility::string_t AdGroupAudienceSizingRequest_keywords_inner::getValue() const
{
    return m_Value;
}

void AdGroupAudienceSizingRequest_keywords_inner::setValue(const utility::string_t& value)
{
    m_Value = value;
    m_ValueIsSet = true;
}

bool AdGroupAudienceSizingRequest_keywords_inner::valueIsSet() const
{
    return m_ValueIsSet;
}

void AdGroupAudienceSizingRequest_keywords_inner::unsetValue()
{
    m_ValueIsSet = false;
}
}
}
}
}


