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


#include "PinMediaSourceImageBase64.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

PinMediaSourceImageBase64::PinMediaSourceImageBase64()
{
    m_Source_type = "";
    m_Content_type = "";
    m_Data = "";
    m_Is_standard = true;
    m_Is_standardIsSet = false;
    
}

void PinMediaSourceImageBase64::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool PinMediaSourceImageBase64::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool PinMediaSourceImageBase64::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "PinMediaSourceImageBase64" : pathPrefix;

                 
    
    /* Data */ {
        const std::string& value = m_Data;
        const std::string currentValuePath = _pathPrefix + ".data";
                
        

    }
        
    return success;
}

bool PinMediaSourceImageBase64::operator==(const PinMediaSourceImageBase64& rhs) const
{
    return
    
    
    (getSourceType() == rhs.getSourceType())
     &&
    
    (getContentType() == rhs.getContentType())
     &&
    
    (getData() == rhs.getData())
     &&
    
    
    ((!isStandardIsSet() && !rhs.isStandardIsSet()) || (isStandardIsSet() && rhs.isStandardIsSet() && isIsStandard() == rhs.isIsStandard()))
    
    ;
}

bool PinMediaSourceImageBase64::operator!=(const PinMediaSourceImageBase64& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const PinMediaSourceImageBase64& o)
{
    j = nlohmann::json::object();
    j["source_type"] = o.m_Source_type;
    j["content_type"] = o.m_Content_type;
    j["data"] = o.m_Data;
    if(o.isStandardIsSet())
        j["is_standard"] = o.m_Is_standard;
    
}

void from_json(const nlohmann::json& j, PinMediaSourceImageBase64& o)
{
    j.at("source_type").get_to(o.m_Source_type);
    j.at("content_type").get_to(o.m_Content_type);
    j.at("data").get_to(o.m_Data);
    if(j.find("is_standard") != j.end())
    {
        j.at("is_standard").get_to(o.m_Is_standard);
        o.m_Is_standardIsSet = true;
    } 
    
}

std::string PinMediaSourceImageBase64::getSourceType() const
{
    return m_Source_type;
}
void PinMediaSourceImageBase64::setSourceType(std::string const& value)
{
    m_Source_type = value;
}
std::string PinMediaSourceImageBase64::getContentType() const
{
    return m_Content_type;
}
void PinMediaSourceImageBase64::setContentType(std::string const& value)
{
    m_Content_type = value;
}
std::string PinMediaSourceImageBase64::getData() const
{
    return m_Data;
}
void PinMediaSourceImageBase64::setData(std::string const& value)
{
    m_Data = value;
}
bool PinMediaSourceImageBase64::isIsStandard() const
{
    return m_Is_standard;
}
void PinMediaSourceImageBase64::setIsStandard(bool const value)
{
    m_Is_standard = value;
    m_Is_standardIsSet = true;
}
bool PinMediaSourceImageBase64::isStandardIsSet() const
{
    return m_Is_standardIsSet;
}
void PinMediaSourceImageBase64::unsetIs_standard()
{
    m_Is_standardIsSet = false;
}


} // namespace org::openapitools::server::model

