/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.12.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/


#include "SSIOInsertionOrderStatusResponse.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

SSIOInsertionOrderStatusResponse::SSIOInsertionOrderStatusResponse()
{
    m_Pin_order_id = "";
    m_Pin_order_idIsSet = false;
    m_Status = "";
    m_StatusIsSet = false;
    m_Creation_time = "";
    m_Creation_timeIsSet = false;
    
}

void SSIOInsertionOrderStatusResponse::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool SSIOInsertionOrderStatusResponse::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool SSIOInsertionOrderStatusResponse::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "SSIOInsertionOrderStatusResponse" : pathPrefix;

                
    return success;
}

bool SSIOInsertionOrderStatusResponse::operator==(const SSIOInsertionOrderStatusResponse& rhs) const
{
    return
    
    
    
    ((!pinOrderIdIsSet() && !rhs.pinOrderIdIsSet()) || (pinOrderIdIsSet() && rhs.pinOrderIdIsSet() && getPinOrderId() == rhs.getPinOrderId())) &&
    
    
    ((!statusIsSet() && !rhs.statusIsSet()) || (statusIsSet() && rhs.statusIsSet() && getStatus() == rhs.getStatus())) &&
    
    
    ((!creationTimeIsSet() && !rhs.creationTimeIsSet()) || (creationTimeIsSet() && rhs.creationTimeIsSet() && getCreationTime() == rhs.getCreationTime()))
    
    ;
}

bool SSIOInsertionOrderStatusResponse::operator!=(const SSIOInsertionOrderStatusResponse& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const SSIOInsertionOrderStatusResponse& o)
{
    j = nlohmann::json::object();
    if(o.pinOrderIdIsSet())
        j["pin_order_id"] = o.m_Pin_order_id;
    if(o.statusIsSet())
        j["status"] = o.m_Status;
    if(o.creationTimeIsSet())
        j["creation_time"] = o.m_Creation_time;
    
}

void from_json(const nlohmann::json& j, SSIOInsertionOrderStatusResponse& o)
{
    if(j.find("pin_order_id") != j.end())
    {
        j.at("pin_order_id").get_to(o.m_Pin_order_id);
        o.m_Pin_order_idIsSet = true;
    } 
    if(j.find("status") != j.end())
    {
        j.at("status").get_to(o.m_Status);
        o.m_StatusIsSet = true;
    } 
    if(j.find("creation_time") != j.end())
    {
        j.at("creation_time").get_to(o.m_Creation_time);
        o.m_Creation_timeIsSet = true;
    } 
    
}

std::string SSIOInsertionOrderStatusResponse::getPinOrderId() const
{
    return m_Pin_order_id;
}
void SSIOInsertionOrderStatusResponse::setPinOrderId(std::string const& value)
{
    m_Pin_order_id = value;
    m_Pin_order_idIsSet = true;
}
bool SSIOInsertionOrderStatusResponse::pinOrderIdIsSet() const
{
    return m_Pin_order_idIsSet;
}
void SSIOInsertionOrderStatusResponse::unsetPin_order_id()
{
    m_Pin_order_idIsSet = false;
}
std::string SSIOInsertionOrderStatusResponse::getStatus() const
{
    return m_Status;
}
void SSIOInsertionOrderStatusResponse::setStatus(std::string const& value)
{
    m_Status = value;
    m_StatusIsSet = true;
}
bool SSIOInsertionOrderStatusResponse::statusIsSet() const
{
    return m_StatusIsSet;
}
void SSIOInsertionOrderStatusResponse::unsetStatus()
{
    m_StatusIsSet = false;
}
std::string SSIOInsertionOrderStatusResponse::getCreationTime() const
{
    return m_Creation_time;
}
void SSIOInsertionOrderStatusResponse::setCreationTime(std::string const& value)
{
    m_Creation_time = value;
    m_Creation_timeIsSet = true;
}
bool SSIOInsertionOrderStatusResponse::creationTimeIsSet() const
{
    return m_Creation_timeIsSet;
}
void SSIOInsertionOrderStatusResponse::unsetCreation_time()
{
    m_Creation_timeIsSet = false;
}


} // namespace org::openapitools::server::model
