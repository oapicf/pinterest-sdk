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


#include "MediaUpload_allOf_upload_parameters.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

MediaUpload_allOf_upload_parameters::MediaUpload_allOf_upload_parameters()
{
    m_X_amz_date = "";
    m_X_amz_dateIsSet = false;
    m_X_amz_signature = "";
    m_X_amz_signatureIsSet = false;
    m_X_amz_security_token = "";
    m_X_amz_security_tokenIsSet = false;
    m_X_amz_algorithm = "";
    m_X_amz_algorithmIsSet = false;
    m_Key = "";
    m_KeyIsSet = false;
    m_Policy = "";
    m_PolicyIsSet = false;
    m_X_amz_credential = "";
    m_X_amz_credentialIsSet = false;
    m_Content_Type = "";
    m_Content_TypeIsSet = false;
    
}

void MediaUpload_allOf_upload_parameters::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool MediaUpload_allOf_upload_parameters::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool MediaUpload_allOf_upload_parameters::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "MediaUpload_allOf_upload_parameters" : pathPrefix;

                                    
    return success;
}

bool MediaUpload_allOf_upload_parameters::operator==(const MediaUpload_allOf_upload_parameters& rhs) const
{
    return
    
    
    
    ((!xAmzDateIsSet() && !rhs.xAmzDateIsSet()) || (xAmzDateIsSet() && rhs.xAmzDateIsSet() && getXAmzDate() == rhs.getXAmzDate())) &&
    
    
    ((!xAmzSignatureIsSet() && !rhs.xAmzSignatureIsSet()) || (xAmzSignatureIsSet() && rhs.xAmzSignatureIsSet() && getXAmzSignature() == rhs.getXAmzSignature())) &&
    
    
    ((!xAmzSecurityTokenIsSet() && !rhs.xAmzSecurityTokenIsSet()) || (xAmzSecurityTokenIsSet() && rhs.xAmzSecurityTokenIsSet() && getXAmzSecurityToken() == rhs.getXAmzSecurityToken())) &&
    
    
    ((!xAmzAlgorithmIsSet() && !rhs.xAmzAlgorithmIsSet()) || (xAmzAlgorithmIsSet() && rhs.xAmzAlgorithmIsSet() && getXAmzAlgorithm() == rhs.getXAmzAlgorithm())) &&
    
    
    ((!keyIsSet() && !rhs.keyIsSet()) || (keyIsSet() && rhs.keyIsSet() && getKey() == rhs.getKey())) &&
    
    
    ((!policyIsSet() && !rhs.policyIsSet()) || (policyIsSet() && rhs.policyIsSet() && getPolicy() == rhs.getPolicy())) &&
    
    
    ((!xAmzCredentialIsSet() && !rhs.xAmzCredentialIsSet()) || (xAmzCredentialIsSet() && rhs.xAmzCredentialIsSet() && getXAmzCredential() == rhs.getXAmzCredential())) &&
    
    
    ((!contentTypeIsSet() && !rhs.contentTypeIsSet()) || (contentTypeIsSet() && rhs.contentTypeIsSet() && getContentType() == rhs.getContentType()))
    
    ;
}

bool MediaUpload_allOf_upload_parameters::operator!=(const MediaUpload_allOf_upload_parameters& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const MediaUpload_allOf_upload_parameters& o)
{
    j = nlohmann::json::object();
    if(o.xAmzDateIsSet())
        j["x-amz-date"] = o.m_X_amz_date;
    if(o.xAmzSignatureIsSet())
        j["x-amz-signature"] = o.m_X_amz_signature;
    if(o.xAmzSecurityTokenIsSet())
        j["x-amz-security-token"] = o.m_X_amz_security_token;
    if(o.xAmzAlgorithmIsSet())
        j["x-amz-algorithm"] = o.m_X_amz_algorithm;
    if(o.keyIsSet())
        j["key"] = o.m_Key;
    if(o.policyIsSet())
        j["policy"] = o.m_Policy;
    if(o.xAmzCredentialIsSet())
        j["x-amz-credential"] = o.m_X_amz_credential;
    if(o.contentTypeIsSet())
        j["Content-Type"] = o.m_Content_Type;
    
}

void from_json(const nlohmann::json& j, MediaUpload_allOf_upload_parameters& o)
{
    if(j.find("x-amz-date") != j.end())
    {
        j.at("x-amz-date").get_to(o.m_X_amz_date);
        o.m_X_amz_dateIsSet = true;
    } 
    if(j.find("x-amz-signature") != j.end())
    {
        j.at("x-amz-signature").get_to(o.m_X_amz_signature);
        o.m_X_amz_signatureIsSet = true;
    } 
    if(j.find("x-amz-security-token") != j.end())
    {
        j.at("x-amz-security-token").get_to(o.m_X_amz_security_token);
        o.m_X_amz_security_tokenIsSet = true;
    } 
    if(j.find("x-amz-algorithm") != j.end())
    {
        j.at("x-amz-algorithm").get_to(o.m_X_amz_algorithm);
        o.m_X_amz_algorithmIsSet = true;
    } 
    if(j.find("key") != j.end())
    {
        j.at("key").get_to(o.m_Key);
        o.m_KeyIsSet = true;
    } 
    if(j.find("policy") != j.end())
    {
        j.at("policy").get_to(o.m_Policy);
        o.m_PolicyIsSet = true;
    } 
    if(j.find("x-amz-credential") != j.end())
    {
        j.at("x-amz-credential").get_to(o.m_X_amz_credential);
        o.m_X_amz_credentialIsSet = true;
    } 
    if(j.find("Content-Type") != j.end())
    {
        j.at("Content-Type").get_to(o.m_Content_Type);
        o.m_Content_TypeIsSet = true;
    } 
    
}

std::string MediaUpload_allOf_upload_parameters::getXAmzDate() const
{
    return m_X_amz_date;
}
void MediaUpload_allOf_upload_parameters::setXAmzDate(std::string const& value)
{
    m_X_amz_date = value;
    m_X_amz_dateIsSet = true;
}
bool MediaUpload_allOf_upload_parameters::xAmzDateIsSet() const
{
    return m_X_amz_dateIsSet;
}
void MediaUpload_allOf_upload_parameters::unsetX_amz_date()
{
    m_X_amz_dateIsSet = false;
}
std::string MediaUpload_allOf_upload_parameters::getXAmzSignature() const
{
    return m_X_amz_signature;
}
void MediaUpload_allOf_upload_parameters::setXAmzSignature(std::string const& value)
{
    m_X_amz_signature = value;
    m_X_amz_signatureIsSet = true;
}
bool MediaUpload_allOf_upload_parameters::xAmzSignatureIsSet() const
{
    return m_X_amz_signatureIsSet;
}
void MediaUpload_allOf_upload_parameters::unsetX_amz_signature()
{
    m_X_amz_signatureIsSet = false;
}
std::string MediaUpload_allOf_upload_parameters::getXAmzSecurityToken() const
{
    return m_X_amz_security_token;
}
void MediaUpload_allOf_upload_parameters::setXAmzSecurityToken(std::string const& value)
{
    m_X_amz_security_token = value;
    m_X_amz_security_tokenIsSet = true;
}
bool MediaUpload_allOf_upload_parameters::xAmzSecurityTokenIsSet() const
{
    return m_X_amz_security_tokenIsSet;
}
void MediaUpload_allOf_upload_parameters::unsetX_amz_security_token()
{
    m_X_amz_security_tokenIsSet = false;
}
std::string MediaUpload_allOf_upload_parameters::getXAmzAlgorithm() const
{
    return m_X_amz_algorithm;
}
void MediaUpload_allOf_upload_parameters::setXAmzAlgorithm(std::string const& value)
{
    m_X_amz_algorithm = value;
    m_X_amz_algorithmIsSet = true;
}
bool MediaUpload_allOf_upload_parameters::xAmzAlgorithmIsSet() const
{
    return m_X_amz_algorithmIsSet;
}
void MediaUpload_allOf_upload_parameters::unsetX_amz_algorithm()
{
    m_X_amz_algorithmIsSet = false;
}
std::string MediaUpload_allOf_upload_parameters::getKey() const
{
    return m_Key;
}
void MediaUpload_allOf_upload_parameters::setKey(std::string const& value)
{
    m_Key = value;
    m_KeyIsSet = true;
}
bool MediaUpload_allOf_upload_parameters::keyIsSet() const
{
    return m_KeyIsSet;
}
void MediaUpload_allOf_upload_parameters::unsetKey()
{
    m_KeyIsSet = false;
}
std::string MediaUpload_allOf_upload_parameters::getPolicy() const
{
    return m_Policy;
}
void MediaUpload_allOf_upload_parameters::setPolicy(std::string const& value)
{
    m_Policy = value;
    m_PolicyIsSet = true;
}
bool MediaUpload_allOf_upload_parameters::policyIsSet() const
{
    return m_PolicyIsSet;
}
void MediaUpload_allOf_upload_parameters::unsetPolicy()
{
    m_PolicyIsSet = false;
}
std::string MediaUpload_allOf_upload_parameters::getXAmzCredential() const
{
    return m_X_amz_credential;
}
void MediaUpload_allOf_upload_parameters::setXAmzCredential(std::string const& value)
{
    m_X_amz_credential = value;
    m_X_amz_credentialIsSet = true;
}
bool MediaUpload_allOf_upload_parameters::xAmzCredentialIsSet() const
{
    return m_X_amz_credentialIsSet;
}
void MediaUpload_allOf_upload_parameters::unsetX_amz_credential()
{
    m_X_amz_credentialIsSet = false;
}
std::string MediaUpload_allOf_upload_parameters::getContentType() const
{
    return m_Content_Type;
}
void MediaUpload_allOf_upload_parameters::setContentType(std::string const& value)
{
    m_Content_Type = value;
    m_Content_TypeIsSet = true;
}
bool MediaUpload_allOf_upload_parameters::contentTypeIsSet() const
{
    return m_Content_TypeIsSet;
}
void MediaUpload_allOf_upload_parameters::unsetContent_Type()
{
    m_Content_TypeIsSet = false;
}


} // namespace org::openapitools::server::model

