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



#include "CppRestOpenAPIClient/model/CampaignsAnalyticsResponse_inner.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



CampaignsAnalyticsResponse_inner::CampaignsAnalyticsResponse_inner()
{
    m_CAMPAIGN_ID = utility::conversions::to_string_t("");
    m_CAMPAIGN_IDIsSet = false;
    m_DATEIsSet = false;
}

CampaignsAnalyticsResponse_inner::~CampaignsAnalyticsResponse_inner()
{
}

void CampaignsAnalyticsResponse_inner::validate()
{
    // TODO: implement validation
}

web::json::value CampaignsAnalyticsResponse_inner::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_CAMPAIGN_IDIsSet)
    {
        val[utility::conversions::to_string_t(U("CAMPAIGN_ID"))] = ModelBase::toJson(m_CAMPAIGN_ID);
    }
    if(m_DATEIsSet)
    {
        val[utility::conversions::to_string_t(U("DATE"))] = ModelBase::toJson(m_DATE);
    }

    return val;
}

bool CampaignsAnalyticsResponse_inner::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("CAMPAIGN_ID"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("CAMPAIGN_ID")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setCAMPAIGNID;
            ok &= ModelBase::fromJson(fieldValue, refVal_setCAMPAIGNID);
            setCAMPAIGNID(refVal_setCAMPAIGNID);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("DATE"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("DATE")));
        if(!fieldValue.is_null())
        {
            utility::datetime refVal_setDATE;
            ok &= ModelBase::fromJson(fieldValue, refVal_setDATE);
            setDATE(refVal_setDATE);
        }
    }
    return ok;
}

void CampaignsAnalyticsResponse_inner::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_CAMPAIGN_IDIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("CAMPAIGN_ID")), m_CAMPAIGN_ID));
    }
    if(m_DATEIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("DATE")), m_DATE));
    }
}

bool CampaignsAnalyticsResponse_inner::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("CAMPAIGN_ID"))))
    {
        utility::string_t refVal_setCAMPAIGNID;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("CAMPAIGN_ID"))), refVal_setCAMPAIGNID );
        setCAMPAIGNID(refVal_setCAMPAIGNID);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("DATE"))))
    {
        utility::datetime refVal_setDATE;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("DATE"))), refVal_setDATE );
        setDATE(refVal_setDATE);
    }
    return ok;
}

utility::string_t CampaignsAnalyticsResponse_inner::getCAMPAIGNID() const
{
    return m_CAMPAIGN_ID;
}

void CampaignsAnalyticsResponse_inner::setCAMPAIGNID(const utility::string_t& value)
{
    m_CAMPAIGN_ID = value;
    m_CAMPAIGN_IDIsSet = true;
}

bool CampaignsAnalyticsResponse_inner::cAMPAIGNIDIsSet() const
{
    return m_CAMPAIGN_IDIsSet;
}

void CampaignsAnalyticsResponse_inner::unsetCAMPAIGN_ID()
{
    m_CAMPAIGN_IDIsSet = false;
}
utility::datetime CampaignsAnalyticsResponse_inner::getDATE() const
{
    return m_DATE;
}

void CampaignsAnalyticsResponse_inner::setDATE(const utility::datetime& value)
{
    m_DATE = value;
    m_DATEIsSet = true;
}

bool CampaignsAnalyticsResponse_inner::dATEIsSet() const
{
    return m_DATEIsSet;
}

void CampaignsAnalyticsResponse_inner::unsetDATE()
{
    m_DATEIsSet = false;
}
}
}
}
}


