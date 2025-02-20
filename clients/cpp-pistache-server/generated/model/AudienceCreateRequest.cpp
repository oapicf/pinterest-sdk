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


#include "AudienceCreateRequest.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

AudienceCreateRequest::AudienceCreateRequest()
{
    m_Ad_account_id = "";
    m_Ad_account_idIsSet = false;
    m_Name = "";
    m_Description = "";
    m_DescriptionIsSet = false;
    
}

void AudienceCreateRequest::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool AudienceCreateRequest::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool AudienceCreateRequest::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "AudienceCreateRequest" : pathPrefix;

         
    if (adAccountIdIsSet())
    {
        const std::string& value = m_Ad_account_id;
        const std::string currentValuePath = _pathPrefix + ".adAccountId";
                
        

    }
            
    if (!m_Rule.validate(msg, _pathPrefix + ".rule")) {
        msg << _pathPrefix << ": Rule is invalid;";
        success = false;
    }        
    if (!m_Audience_type.validate(msg, _pathPrefix + ".audienceType")) {
        msg << _pathPrefix << ": Audience_type is invalid;";
        success = false;
    }
    return success;
}

bool AudienceCreateRequest::operator==(const AudienceCreateRequest& rhs) const
{
    return
    
    
    
    ((!adAccountIdIsSet() && !rhs.adAccountIdIsSet()) || (adAccountIdIsSet() && rhs.adAccountIdIsSet() && getAdAccountId() == rhs.getAdAccountId())) &&
    
    (getName() == rhs.getName())
     &&
    
    (getRule() == rhs.getRule())
     &&
    
    
    ((!descriptionIsSet() && !rhs.descriptionIsSet()) || (descriptionIsSet() && rhs.descriptionIsSet() && getDescription() == rhs.getDescription())) &&
    
    (getAudienceType() == rhs.getAudienceType())
    
    
    ;
}

bool AudienceCreateRequest::operator!=(const AudienceCreateRequest& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const AudienceCreateRequest& o)
{
    j = nlohmann::json::object();
    if(o.adAccountIdIsSet())
        j["ad_account_id"] = o.m_Ad_account_id;
    j["name"] = o.m_Name;
    j["rule"] = o.m_Rule;
    if(o.descriptionIsSet())
        j["description"] = o.m_Description;
    j["audience_type"] = o.m_Audience_type;
    
}

void from_json(const nlohmann::json& j, AudienceCreateRequest& o)
{
    if(j.find("ad_account_id") != j.end())
    {
        j.at("ad_account_id").get_to(o.m_Ad_account_id);
        o.m_Ad_account_idIsSet = true;
    } 
    j.at("name").get_to(o.m_Name);
    j.at("rule").get_to(o.m_Rule);
    if(j.find("description") != j.end())
    {
        j.at("description").get_to(o.m_Description);
        o.m_DescriptionIsSet = true;
    } 
    j.at("audience_type").get_to(o.m_Audience_type);
    
}

std::string AudienceCreateRequest::getAdAccountId() const
{
    return m_Ad_account_id;
}
void AudienceCreateRequest::setAdAccountId(std::string const& value)
{
    m_Ad_account_id = value;
    m_Ad_account_idIsSet = true;
}
bool AudienceCreateRequest::adAccountIdIsSet() const
{
    return m_Ad_account_idIsSet;
}
void AudienceCreateRequest::unsetAd_account_id()
{
    m_Ad_account_idIsSet = false;
}
std::string AudienceCreateRequest::getName() const
{
    return m_Name;
}
void AudienceCreateRequest::setName(std::string const& value)
{
    m_Name = value;
}
org::openapitools::server::model::AudienceRule AudienceCreateRequest::getRule() const
{
    return m_Rule;
}
void AudienceCreateRequest::setRule(org::openapitools::server::model::AudienceRule const& value)
{
    m_Rule = value;
}
std::string AudienceCreateRequest::getDescription() const
{
    return m_Description;
}
void AudienceCreateRequest::setDescription(std::string const& value)
{
    m_Description = value;
    m_DescriptionIsSet = true;
}
bool AudienceCreateRequest::descriptionIsSet() const
{
    return m_DescriptionIsSet;
}
void AudienceCreateRequest::unsetDescription()
{
    m_DescriptionIsSet = false;
}
org::openapitools::server::model::AudienceCreateRequest_1_audience_type AudienceCreateRequest::getAudienceType() const
{
    return m_Audience_type;
}
void AudienceCreateRequest::setAudienceType(org::openapitools::server::model::AudienceCreateRequest_1_audience_type const& value)
{
    m_Audience_type = value;
}


} // namespace org::openapitools::server::model

