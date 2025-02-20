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


#include "IntegrationRecord.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

IntegrationRecord::IntegrationRecord()
{
    m_Id = "";
    m_IdIsSet = false;
    m_External_business_id = "";
    m_External_business_idIsSet = false;
    m_Connected_merchant_id = "";
    m_Connected_merchant_idIsSet = false;
    m_Connected_user_id = "";
    m_Connected_user_idIsSet = false;
    m_Connected_advertiser_id = "";
    m_Connected_advertiser_idIsSet = false;
    m_Connected_lba_id = "";
    m_Connected_lba_idIsSet = false;
    m_Connected_tag_id = "";
    m_Connected_tag_idIsSet = false;
    m_Partner_access_token = "";
    m_Partner_access_tokenIsSet = false;
    m_Partner_refresh_token = "";
    m_Partner_refresh_tokenIsSet = false;
    m_Partner_primary_email = "";
    m_Partner_primary_emailIsSet = false;
    m_Partner_access_token_expiry = 0;
    m_Partner_access_token_expiryIsSet = false;
    m_Partner_refresh_token_expiry = 0;
    m_Partner_refresh_token_expiryIsSet = false;
    m_Scopes = "";
    m_ScopesIsSet = false;
    m_Partner_metadata = "";
    m_Partner_metadataIsSet = false;
    m_Additional_id_1 = "";
    m_Additional_id_1IsSet = false;
    m_Created_time = 0;
    m_Created_timeIsSet = false;
    m_Updated_time = 0;
    m_Updated_timeIsSet = false;
    
}

void IntegrationRecord::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool IntegrationRecord::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool IntegrationRecord::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "IntegrationRecord" : pathPrefix;

         
    if (idIsSet())
    {
        const std::string& value = m_Id;
        const std::string currentValuePath = _pathPrefix + ".id";
                
        

    }
                                                                    
    return success;
}

bool IntegrationRecord::operator==(const IntegrationRecord& rhs) const
{
    return
    
    
    
    ((!idIsSet() && !rhs.idIsSet()) || (idIsSet() && rhs.idIsSet() && getId() == rhs.getId())) &&
    
    
    ((!externalBusinessIdIsSet() && !rhs.externalBusinessIdIsSet()) || (externalBusinessIdIsSet() && rhs.externalBusinessIdIsSet() && getExternalBusinessId() == rhs.getExternalBusinessId())) &&
    
    
    ((!connectedMerchantIdIsSet() && !rhs.connectedMerchantIdIsSet()) || (connectedMerchantIdIsSet() && rhs.connectedMerchantIdIsSet() && getConnectedMerchantId() == rhs.getConnectedMerchantId())) &&
    
    
    ((!connectedUserIdIsSet() && !rhs.connectedUserIdIsSet()) || (connectedUserIdIsSet() && rhs.connectedUserIdIsSet() && getConnectedUserId() == rhs.getConnectedUserId())) &&
    
    
    ((!connectedAdvertiserIdIsSet() && !rhs.connectedAdvertiserIdIsSet()) || (connectedAdvertiserIdIsSet() && rhs.connectedAdvertiserIdIsSet() && getConnectedAdvertiserId() == rhs.getConnectedAdvertiserId())) &&
    
    
    ((!connectedLbaIdIsSet() && !rhs.connectedLbaIdIsSet()) || (connectedLbaIdIsSet() && rhs.connectedLbaIdIsSet() && getConnectedLbaId() == rhs.getConnectedLbaId())) &&
    
    
    ((!connectedTagIdIsSet() && !rhs.connectedTagIdIsSet()) || (connectedTagIdIsSet() && rhs.connectedTagIdIsSet() && getConnectedTagId() == rhs.getConnectedTagId())) &&
    
    
    ((!partnerAccessTokenIsSet() && !rhs.partnerAccessTokenIsSet()) || (partnerAccessTokenIsSet() && rhs.partnerAccessTokenIsSet() && getPartnerAccessToken() == rhs.getPartnerAccessToken())) &&
    
    
    ((!partnerRefreshTokenIsSet() && !rhs.partnerRefreshTokenIsSet()) || (partnerRefreshTokenIsSet() && rhs.partnerRefreshTokenIsSet() && getPartnerRefreshToken() == rhs.getPartnerRefreshToken())) &&
    
    
    ((!partnerPrimaryEmailIsSet() && !rhs.partnerPrimaryEmailIsSet()) || (partnerPrimaryEmailIsSet() && rhs.partnerPrimaryEmailIsSet() && getPartnerPrimaryEmail() == rhs.getPartnerPrimaryEmail())) &&
    
    
    ((!partnerAccessTokenExpiryIsSet() && !rhs.partnerAccessTokenExpiryIsSet()) || (partnerAccessTokenExpiryIsSet() && rhs.partnerAccessTokenExpiryIsSet() && getPartnerAccessTokenExpiry() == rhs.getPartnerAccessTokenExpiry())) &&
    
    
    ((!partnerRefreshTokenExpiryIsSet() && !rhs.partnerRefreshTokenExpiryIsSet()) || (partnerRefreshTokenExpiryIsSet() && rhs.partnerRefreshTokenExpiryIsSet() && getPartnerRefreshTokenExpiry() == rhs.getPartnerRefreshTokenExpiry())) &&
    
    
    ((!scopesIsSet() && !rhs.scopesIsSet()) || (scopesIsSet() && rhs.scopesIsSet() && getScopes() == rhs.getScopes())) &&
    
    
    ((!partnerMetadataIsSet() && !rhs.partnerMetadataIsSet()) || (partnerMetadataIsSet() && rhs.partnerMetadataIsSet() && getPartnerMetadata() == rhs.getPartnerMetadata())) &&
    
    
    ((!additionalId1IsSet() && !rhs.additionalId1IsSet()) || (additionalId1IsSet() && rhs.additionalId1IsSet() && getAdditionalId1() == rhs.getAdditionalId1())) &&
    
    
    ((!createdTimeIsSet() && !rhs.createdTimeIsSet()) || (createdTimeIsSet() && rhs.createdTimeIsSet() && getCreatedTime() == rhs.getCreatedTime())) &&
    
    
    ((!updatedTimeIsSet() && !rhs.updatedTimeIsSet()) || (updatedTimeIsSet() && rhs.updatedTimeIsSet() && getUpdatedTime() == rhs.getUpdatedTime()))
    
    ;
}

bool IntegrationRecord::operator!=(const IntegrationRecord& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const IntegrationRecord& o)
{
    j = nlohmann::json::object();
    if(o.idIsSet())
        j["id"] = o.m_Id;
    if(o.externalBusinessIdIsSet())
        j["external_business_id"] = o.m_External_business_id;
    if(o.connectedMerchantIdIsSet())
        j["connected_merchant_id"] = o.m_Connected_merchant_id;
    if(o.connectedUserIdIsSet())
        j["connected_user_id"] = o.m_Connected_user_id;
    if(o.connectedAdvertiserIdIsSet())
        j["connected_advertiser_id"] = o.m_Connected_advertiser_id;
    if(o.connectedLbaIdIsSet())
        j["connected_lba_id"] = o.m_Connected_lba_id;
    if(o.connectedTagIdIsSet())
        j["connected_tag_id"] = o.m_Connected_tag_id;
    if(o.partnerAccessTokenIsSet())
        j["partner_access_token"] = o.m_Partner_access_token;
    if(o.partnerRefreshTokenIsSet())
        j["partner_refresh_token"] = o.m_Partner_refresh_token;
    if(o.partnerPrimaryEmailIsSet())
        j["partner_primary_email"] = o.m_Partner_primary_email;
    if(o.partnerAccessTokenExpiryIsSet())
        j["partner_access_token_expiry"] = o.m_Partner_access_token_expiry;
    if(o.partnerRefreshTokenExpiryIsSet())
        j["partner_refresh_token_expiry"] = o.m_Partner_refresh_token_expiry;
    if(o.scopesIsSet())
        j["scopes"] = o.m_Scopes;
    if(o.partnerMetadataIsSet())
        j["partner_metadata"] = o.m_Partner_metadata;
    if(o.additionalId1IsSet())
        j["additional_id_1"] = o.m_Additional_id_1;
    if(o.createdTimeIsSet())
        j["created_time"] = o.m_Created_time;
    if(o.updatedTimeIsSet())
        j["updated_time"] = o.m_Updated_time;
    
}

void from_json(const nlohmann::json& j, IntegrationRecord& o)
{
    if(j.find("id") != j.end())
    {
        j.at("id").get_to(o.m_Id);
        o.m_IdIsSet = true;
    } 
    if(j.find("external_business_id") != j.end())
    {
        j.at("external_business_id").get_to(o.m_External_business_id);
        o.m_External_business_idIsSet = true;
    } 
    if(j.find("connected_merchant_id") != j.end())
    {
        j.at("connected_merchant_id").get_to(o.m_Connected_merchant_id);
        o.m_Connected_merchant_idIsSet = true;
    } 
    if(j.find("connected_user_id") != j.end())
    {
        j.at("connected_user_id").get_to(o.m_Connected_user_id);
        o.m_Connected_user_idIsSet = true;
    } 
    if(j.find("connected_advertiser_id") != j.end())
    {
        j.at("connected_advertiser_id").get_to(o.m_Connected_advertiser_id);
        o.m_Connected_advertiser_idIsSet = true;
    } 
    if(j.find("connected_lba_id") != j.end())
    {
        j.at("connected_lba_id").get_to(o.m_Connected_lba_id);
        o.m_Connected_lba_idIsSet = true;
    } 
    if(j.find("connected_tag_id") != j.end())
    {
        j.at("connected_tag_id").get_to(o.m_Connected_tag_id);
        o.m_Connected_tag_idIsSet = true;
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
    if(j.find("partner_primary_email") != j.end())
    {
        j.at("partner_primary_email").get_to(o.m_Partner_primary_email);
        o.m_Partner_primary_emailIsSet = true;
    } 
    if(j.find("partner_access_token_expiry") != j.end())
    {
        j.at("partner_access_token_expiry").get_to(o.m_Partner_access_token_expiry);
        o.m_Partner_access_token_expiryIsSet = true;
    } 
    if(j.find("partner_refresh_token_expiry") != j.end())
    {
        j.at("partner_refresh_token_expiry").get_to(o.m_Partner_refresh_token_expiry);
        o.m_Partner_refresh_token_expiryIsSet = true;
    } 
    if(j.find("scopes") != j.end())
    {
        j.at("scopes").get_to(o.m_Scopes);
        o.m_ScopesIsSet = true;
    } 
    if(j.find("partner_metadata") != j.end())
    {
        j.at("partner_metadata").get_to(o.m_Partner_metadata);
        o.m_Partner_metadataIsSet = true;
    } 
    if(j.find("additional_id_1") != j.end())
    {
        j.at("additional_id_1").get_to(o.m_Additional_id_1);
        o.m_Additional_id_1IsSet = true;
    } 
    if(j.find("created_time") != j.end())
    {
        j.at("created_time").get_to(o.m_Created_time);
        o.m_Created_timeIsSet = true;
    } 
    if(j.find("updated_time") != j.end())
    {
        j.at("updated_time").get_to(o.m_Updated_time);
        o.m_Updated_timeIsSet = true;
    } 
    
}

std::string IntegrationRecord::getId() const
{
    return m_Id;
}
void IntegrationRecord::setId(std::string const& value)
{
    m_Id = value;
    m_IdIsSet = true;
}
bool IntegrationRecord::idIsSet() const
{
    return m_IdIsSet;
}
void IntegrationRecord::unsetId()
{
    m_IdIsSet = false;
}
std::string IntegrationRecord::getExternalBusinessId() const
{
    return m_External_business_id;
}
void IntegrationRecord::setExternalBusinessId(std::string const& value)
{
    m_External_business_id = value;
    m_External_business_idIsSet = true;
}
bool IntegrationRecord::externalBusinessIdIsSet() const
{
    return m_External_business_idIsSet;
}
void IntegrationRecord::unsetExternal_business_id()
{
    m_External_business_idIsSet = false;
}
std::string IntegrationRecord::getConnectedMerchantId() const
{
    return m_Connected_merchant_id;
}
void IntegrationRecord::setConnectedMerchantId(std::string const& value)
{
    m_Connected_merchant_id = value;
    m_Connected_merchant_idIsSet = true;
}
bool IntegrationRecord::connectedMerchantIdIsSet() const
{
    return m_Connected_merchant_idIsSet;
}
void IntegrationRecord::unsetConnected_merchant_id()
{
    m_Connected_merchant_idIsSet = false;
}
std::string IntegrationRecord::getConnectedUserId() const
{
    return m_Connected_user_id;
}
void IntegrationRecord::setConnectedUserId(std::string const& value)
{
    m_Connected_user_id = value;
    m_Connected_user_idIsSet = true;
}
bool IntegrationRecord::connectedUserIdIsSet() const
{
    return m_Connected_user_idIsSet;
}
void IntegrationRecord::unsetConnected_user_id()
{
    m_Connected_user_idIsSet = false;
}
std::string IntegrationRecord::getConnectedAdvertiserId() const
{
    return m_Connected_advertiser_id;
}
void IntegrationRecord::setConnectedAdvertiserId(std::string const& value)
{
    m_Connected_advertiser_id = value;
    m_Connected_advertiser_idIsSet = true;
}
bool IntegrationRecord::connectedAdvertiserIdIsSet() const
{
    return m_Connected_advertiser_idIsSet;
}
void IntegrationRecord::unsetConnected_advertiser_id()
{
    m_Connected_advertiser_idIsSet = false;
}
std::string IntegrationRecord::getConnectedLbaId() const
{
    return m_Connected_lba_id;
}
void IntegrationRecord::setConnectedLbaId(std::string const& value)
{
    m_Connected_lba_id = value;
    m_Connected_lba_idIsSet = true;
}
bool IntegrationRecord::connectedLbaIdIsSet() const
{
    return m_Connected_lba_idIsSet;
}
void IntegrationRecord::unsetConnected_lba_id()
{
    m_Connected_lba_idIsSet = false;
}
std::string IntegrationRecord::getConnectedTagId() const
{
    return m_Connected_tag_id;
}
void IntegrationRecord::setConnectedTagId(std::string const& value)
{
    m_Connected_tag_id = value;
    m_Connected_tag_idIsSet = true;
}
bool IntegrationRecord::connectedTagIdIsSet() const
{
    return m_Connected_tag_idIsSet;
}
void IntegrationRecord::unsetConnected_tag_id()
{
    m_Connected_tag_idIsSet = false;
}
std::string IntegrationRecord::getPartnerAccessToken() const
{
    return m_Partner_access_token;
}
void IntegrationRecord::setPartnerAccessToken(std::string const& value)
{
    m_Partner_access_token = value;
    m_Partner_access_tokenIsSet = true;
}
bool IntegrationRecord::partnerAccessTokenIsSet() const
{
    return m_Partner_access_tokenIsSet;
}
void IntegrationRecord::unsetPartner_access_token()
{
    m_Partner_access_tokenIsSet = false;
}
std::string IntegrationRecord::getPartnerRefreshToken() const
{
    return m_Partner_refresh_token;
}
void IntegrationRecord::setPartnerRefreshToken(std::string const& value)
{
    m_Partner_refresh_token = value;
    m_Partner_refresh_tokenIsSet = true;
}
bool IntegrationRecord::partnerRefreshTokenIsSet() const
{
    return m_Partner_refresh_tokenIsSet;
}
void IntegrationRecord::unsetPartner_refresh_token()
{
    m_Partner_refresh_tokenIsSet = false;
}
std::string IntegrationRecord::getPartnerPrimaryEmail() const
{
    return m_Partner_primary_email;
}
void IntegrationRecord::setPartnerPrimaryEmail(std::string const& value)
{
    m_Partner_primary_email = value;
    m_Partner_primary_emailIsSet = true;
}
bool IntegrationRecord::partnerPrimaryEmailIsSet() const
{
    return m_Partner_primary_emailIsSet;
}
void IntegrationRecord::unsetPartner_primary_email()
{
    m_Partner_primary_emailIsSet = false;
}
int32_t IntegrationRecord::getPartnerAccessTokenExpiry() const
{
    return m_Partner_access_token_expiry;
}
void IntegrationRecord::setPartnerAccessTokenExpiry(int32_t const value)
{
    m_Partner_access_token_expiry = value;
    m_Partner_access_token_expiryIsSet = true;
}
bool IntegrationRecord::partnerAccessTokenExpiryIsSet() const
{
    return m_Partner_access_token_expiryIsSet;
}
void IntegrationRecord::unsetPartner_access_token_expiry()
{
    m_Partner_access_token_expiryIsSet = false;
}
int32_t IntegrationRecord::getPartnerRefreshTokenExpiry() const
{
    return m_Partner_refresh_token_expiry;
}
void IntegrationRecord::setPartnerRefreshTokenExpiry(int32_t const value)
{
    m_Partner_refresh_token_expiry = value;
    m_Partner_refresh_token_expiryIsSet = true;
}
bool IntegrationRecord::partnerRefreshTokenExpiryIsSet() const
{
    return m_Partner_refresh_token_expiryIsSet;
}
void IntegrationRecord::unsetPartner_refresh_token_expiry()
{
    m_Partner_refresh_token_expiryIsSet = false;
}
std::string IntegrationRecord::getScopes() const
{
    return m_Scopes;
}
void IntegrationRecord::setScopes(std::string const& value)
{
    m_Scopes = value;
    m_ScopesIsSet = true;
}
bool IntegrationRecord::scopesIsSet() const
{
    return m_ScopesIsSet;
}
void IntegrationRecord::unsetScopes()
{
    m_ScopesIsSet = false;
}
std::string IntegrationRecord::getPartnerMetadata() const
{
    return m_Partner_metadata;
}
void IntegrationRecord::setPartnerMetadata(std::string const& value)
{
    m_Partner_metadata = value;
    m_Partner_metadataIsSet = true;
}
bool IntegrationRecord::partnerMetadataIsSet() const
{
    return m_Partner_metadataIsSet;
}
void IntegrationRecord::unsetPartner_metadata()
{
    m_Partner_metadataIsSet = false;
}
std::string IntegrationRecord::getAdditionalId1() const
{
    return m_Additional_id_1;
}
void IntegrationRecord::setAdditionalId1(std::string const& value)
{
    m_Additional_id_1 = value;
    m_Additional_id_1IsSet = true;
}
bool IntegrationRecord::additionalId1IsSet() const
{
    return m_Additional_id_1IsSet;
}
void IntegrationRecord::unsetAdditional_id_1()
{
    m_Additional_id_1IsSet = false;
}
int32_t IntegrationRecord::getCreatedTime() const
{
    return m_Created_time;
}
void IntegrationRecord::setCreatedTime(int32_t const value)
{
    m_Created_time = value;
    m_Created_timeIsSet = true;
}
bool IntegrationRecord::createdTimeIsSet() const
{
    return m_Created_timeIsSet;
}
void IntegrationRecord::unsetCreated_time()
{
    m_Created_timeIsSet = false;
}
int32_t IntegrationRecord::getUpdatedTime() const
{
    return m_Updated_time;
}
void IntegrationRecord::setUpdatedTime(int32_t const value)
{
    m_Updated_time = value;
    m_Updated_timeIsSet = true;
}
bool IntegrationRecord::updatedTimeIsSet() const
{
    return m_Updated_timeIsSet;
}
void IntegrationRecord::unsetUpdated_time()
{
    m_Updated_timeIsSet = false;
}


} // namespace org::openapitools::server::model

