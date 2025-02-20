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


#include "InviteExceptionResponse.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

InviteExceptionResponse::InviteExceptionResponse()
{
    m_Invite_or_request_id = "";
    m_Invite_or_request_idIsSet = false;
    m_Code = 0;
    m_CodeIsSet = false;
    m_Message = "";
    m_MessageIsSet = false;
    m_Users_or_partner_idsIsSet = false;
    
}

void InviteExceptionResponse::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool InviteExceptionResponse::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool InviteExceptionResponse::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "InviteExceptionResponse" : pathPrefix;

         
    if (inviteOrRequestIdIsSet())
    {
        const std::string& value = m_Invite_or_request_id;
        const std::string currentValuePath = _pathPrefix + ".inviteOrRequestId";
                
        

    }
                 
    if (usersOrPartnerIdsIsSet())
    {
        const std::vector<std::string>& value = m_Users_or_partner_ids;
        const std::string currentValuePath = _pathPrefix + ".usersOrPartnerIds";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const std::string& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        
 
                i++;
            }
        }

    }
    
    return success;
}

bool InviteExceptionResponse::operator==(const InviteExceptionResponse& rhs) const
{
    return
    
    
    
    ((!inviteOrRequestIdIsSet() && !rhs.inviteOrRequestIdIsSet()) || (inviteOrRequestIdIsSet() && rhs.inviteOrRequestIdIsSet() && getInviteOrRequestId() == rhs.getInviteOrRequestId())) &&
    
    
    ((!codeIsSet() && !rhs.codeIsSet()) || (codeIsSet() && rhs.codeIsSet() && getCode() == rhs.getCode())) &&
    
    
    ((!messageIsSet() && !rhs.messageIsSet()) || (messageIsSet() && rhs.messageIsSet() && getMessage() == rhs.getMessage())) &&
    
    
    ((!usersOrPartnerIdsIsSet() && !rhs.usersOrPartnerIdsIsSet()) || (usersOrPartnerIdsIsSet() && rhs.usersOrPartnerIdsIsSet() && getUsersOrPartnerIds() == rhs.getUsersOrPartnerIds()))
    
    ;
}

bool InviteExceptionResponse::operator!=(const InviteExceptionResponse& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const InviteExceptionResponse& o)
{
    j = nlohmann::json::object();
    if(o.inviteOrRequestIdIsSet())
        j["invite_or_request_id"] = o.m_Invite_or_request_id;
    if(o.codeIsSet())
        j["code"] = o.m_Code;
    if(o.messageIsSet())
        j["message"] = o.m_Message;
    if(o.usersOrPartnerIdsIsSet() || !o.m_Users_or_partner_ids.empty())
        j["users_or_partner_ids"] = o.m_Users_or_partner_ids;
    
}

void from_json(const nlohmann::json& j, InviteExceptionResponse& o)
{
    if(j.find("invite_or_request_id") != j.end())
    {
        j.at("invite_or_request_id").get_to(o.m_Invite_or_request_id);
        o.m_Invite_or_request_idIsSet = true;
    } 
    if(j.find("code") != j.end())
    {
        j.at("code").get_to(o.m_Code);
        o.m_CodeIsSet = true;
    } 
    if(j.find("message") != j.end())
    {
        j.at("message").get_to(o.m_Message);
        o.m_MessageIsSet = true;
    } 
    if(j.find("users_or_partner_ids") != j.end())
    {
        j.at("users_or_partner_ids").get_to(o.m_Users_or_partner_ids);
        o.m_Users_or_partner_idsIsSet = true;
    } 
    
}

std::string InviteExceptionResponse::getInviteOrRequestId() const
{
    return m_Invite_or_request_id;
}
void InviteExceptionResponse::setInviteOrRequestId(std::string const& value)
{
    m_Invite_or_request_id = value;
    m_Invite_or_request_idIsSet = true;
}
bool InviteExceptionResponse::inviteOrRequestIdIsSet() const
{
    return m_Invite_or_request_idIsSet;
}
void InviteExceptionResponse::unsetInvite_or_request_id()
{
    m_Invite_or_request_idIsSet = false;
}
int32_t InviteExceptionResponse::getCode() const
{
    return m_Code;
}
void InviteExceptionResponse::setCode(int32_t const value)
{
    m_Code = value;
    m_CodeIsSet = true;
}
bool InviteExceptionResponse::codeIsSet() const
{
    return m_CodeIsSet;
}
void InviteExceptionResponse::unsetCode()
{
    m_CodeIsSet = false;
}
std::string InviteExceptionResponse::getMessage() const
{
    return m_Message;
}
void InviteExceptionResponse::setMessage(std::string const& value)
{
    m_Message = value;
    m_MessageIsSet = true;
}
bool InviteExceptionResponse::messageIsSet() const
{
    return m_MessageIsSet;
}
void InviteExceptionResponse::unsetMessage()
{
    m_MessageIsSet = false;
}
std::vector<std::string> InviteExceptionResponse::getUsersOrPartnerIds() const
{
    return m_Users_or_partner_ids;
}
void InviteExceptionResponse::setUsersOrPartnerIds(std::vector<std::string> const& value)
{
    m_Users_or_partner_ids = value;
    m_Users_or_partner_idsIsSet = true;
}
bool InviteExceptionResponse::usersOrPartnerIdsIsSet() const
{
    return m_Users_or_partner_idsIsSet;
}
void InviteExceptionResponse::unsetUsers_or_partner_ids()
{
    m_Users_or_partner_idsIsSet = false;
}


} // namespace org::openapitools::server::model

