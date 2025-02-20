/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.14.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/


#include "AdAccountCreateSubscriptionRequest.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

AdAccountCreateSubscriptionRequest::AdAccountCreateSubscriptionRequest()
{
    m_Webhook_url = "";
    m_Lead_form_id = "";
    m_Lead_form_idIsSet = false;
    m_Partner_access_token = "";
    m_Partner_access_tokenIsSet = false;
    m_Partner_refresh_token = "";
    m_Partner_refresh_tokenIsSet = false;
    m_Partner_metadataIsSet = false;
    
}

void AdAccountCreateSubscriptionRequest::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool AdAccountCreateSubscriptionRequest::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool AdAccountCreateSubscriptionRequest::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "AdAccountCreateSubscriptionRequest" : pathPrefix;

             
    if (leadFormIdIsSet())
    {
        const std::string& value = m_Lead_form_id;
        const std::string currentValuePath = _pathPrefix + ".leadFormId";
                
        

    }
                
    return success;
}

bool AdAccountCreateSubscriptionRequest::operator==(const AdAccountCreateSubscriptionRequest& rhs) const
{
    return
    
    
    (getWebhookUrl() == rhs.getWebhookUrl())
     &&
    
    
    ((!leadFormIdIsSet() && !rhs.leadFormIdIsSet()) || (leadFormIdIsSet() && rhs.leadFormIdIsSet() && getLeadFormId() == rhs.getLeadFormId())) &&
    
    
    ((!partnerAccessTokenIsSet() && !rhs.partnerAccessTokenIsSet()) || (partnerAccessTokenIsSet() && rhs.partnerAccessTokenIsSet() && getPartnerAccessToken() == rhs.getPartnerAccessToken())) &&
    
    
    ((!partnerRefreshTokenIsSet() && !rhs.partnerRefreshTokenIsSet()) || (partnerRefreshTokenIsSet() && rhs.partnerRefreshTokenIsSet() && getPartnerRefreshToken() == rhs.getPartnerRefreshToken())) &&
    
    
    ((!partnerMetadataIsSet() && !rhs.partnerMetadataIsSet()) || (partnerMetadataIsSet() && rhs.partnerMetadataIsSet() && getPartnerMetadata() == rhs.getPartnerMetadata()))
    
    ;
}

bool AdAccountCreateSubscriptionRequest::operator!=(const AdAccountCreateSubscriptionRequest& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const AdAccountCreateSubscriptionRequest& o)
{
    j = nlohmann::json::object();
    j["webhook_url"] = o.m_Webhook_url;
    if(o.leadFormIdIsSet())
        j["lead_form_id"] = o.m_Lead_form_id;
    if(o.partnerAccessTokenIsSet())
        j["partner_access_token"] = o.m_Partner_access_token;
    if(o.partnerRefreshTokenIsSet())
        j["partner_refresh_token"] = o.m_Partner_refresh_token;
    if(o.partnerMetadataIsSet())
        j["partner_metadata"] = o.m_Partner_metadata;
    
}

void from_json(const nlohmann::json& j, AdAccountCreateSubscriptionRequest& o)
{
    j.at("webhook_url").get_to(o.m_Webhook_url);
    if(j.find("lead_form_id") != j.end())
    {
        j.at("lead_form_id").get_to(o.m_Lead_form_id);
        o.m_Lead_form_idIsSet = true;
    } 
    if(j.find("partner_access_token") != j.end())
    {
        j.at("partner_access_token").get_to(o.m_Partner_access_token);
        o.m_Partner_access_tokenIsSet = true;
    } 
    if(j.find("partner_refresh_token") != j.end())
    {
        j.at("partner_refresh_token").get_to(o.m_Partner_refresh_token);
        o.m_Partner_refresh_tokenIsSet = true;
    } 
    if(j.find("partner_metadata") != j.end())
    {
        j.at("partner_metadata").get_to(o.m_Partner_metadata);
        o.m_Partner_metadataIsSet = true;
    } 
    
}

std::string AdAccountCreateSubscriptionRequest::getWebhookUrl() const
{
    return m_Webhook_url;
}
void AdAccountCreateSubscriptionRequest::setWebhookUrl(std::string const& value)
{
    m_Webhook_url = value;
}
std::string AdAccountCreateSubscriptionRequest::getLeadFormId() const
{
    return m_Lead_form_id;
}
void AdAccountCreateSubscriptionRequest::setLeadFormId(std::string const& value)
{
    m_Lead_form_id = value;
    m_Lead_form_idIsSet = true;
}
bool AdAccountCreateSubscriptionRequest::leadFormIdIsSet() const
{
    return m_Lead_form_idIsSet;
}
void AdAccountCreateSubscriptionRequest::unsetLead_form_id()
{
    m_Lead_form_idIsSet = false;
}
std::string AdAccountCreateSubscriptionRequest::getPartnerAccessToken() const
{
    return m_Partner_access_token;
}
void AdAccountCreateSubscriptionRequest::setPartnerAccessToken(std::string const& value)
{
    m_Partner_access_token = value;
    m_Partner_access_tokenIsSet = true;
}
bool AdAccountCreateSubscriptionRequest::partnerAccessTokenIsSet() const
{
    return m_Partner_access_tokenIsSet;
}
void AdAccountCreateSubscriptionRequest::unsetPartner_access_token()
{
    m_Partner_access_tokenIsSet = false;
}
std::string AdAccountCreateSubscriptionRequest::getPartnerRefreshToken() const
{
    return m_Partner_refresh_token;
}
void AdAccountCreateSubscriptionRequest::setPartnerRefreshToken(std::string const& value)
{
    m_Partner_refresh_token = value;
    m_Partner_refresh_tokenIsSet = true;
}
bool AdAccountCreateSubscriptionRequest::partnerRefreshTokenIsSet() const
{
    return m_Partner_refresh_tokenIsSet;
}
void AdAccountCreateSubscriptionRequest::unsetPartner_refresh_token()
{
    m_Partner_refresh_tokenIsSet = false;
}
org::openapitools::server::model::AdAccountCreateSubscriptionRequest_partner_metadata AdAccountCreateSubscriptionRequest::getPartnerMetadata() const
{
    return m_Partner_metadata;
}
void AdAccountCreateSubscriptionRequest::setPartnerMetadata(org::openapitools::server::model::AdAccountCreateSubscriptionRequest_partner_metadata const& value)
{
    m_Partner_metadata = value;
    m_Partner_metadataIsSet = true;
}
bool AdAccountCreateSubscriptionRequest::partnerMetadataIsSet() const
{
    return m_Partner_metadataIsSet;
}
void AdAccountCreateSubscriptionRequest::unsetPartner_metadata()
{
    m_Partner_metadataIsSet = false;
}


} // namespace org::openapitools::server::model

