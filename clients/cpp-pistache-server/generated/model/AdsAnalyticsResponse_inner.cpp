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


#include "AdsAnalyticsResponse_inner.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

AdsAnalyticsResponse_inner::AdsAnalyticsResponse_inner()
{
    m_AD_ID = "";
    m_DATEIsSet = false;
    
}

void AdsAnalyticsResponse_inner::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool AdsAnalyticsResponse_inner::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool AdsAnalyticsResponse_inner::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "AdsAnalyticsResponse_inner" : pathPrefix;

         
    
    /* AD_ID */ {
        const std::string& value = m_AD_ID;
        const std::string currentValuePath = _pathPrefix + ".aDID";
                
        

    }
        
    return success;
}

bool AdsAnalyticsResponse_inner::operator==(const AdsAnalyticsResponse_inner& rhs) const
{
    return
    
    
    (getADID() == rhs.getADID())
     &&
    
    
    ((!dATEIsSet() && !rhs.dATEIsSet()) || (dATEIsSet() && rhs.dATEIsSet() && getDATE() == rhs.getDATE()))
    
    ;
}

bool AdsAnalyticsResponse_inner::operator!=(const AdsAnalyticsResponse_inner& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const AdsAnalyticsResponse_inner& o)
{
    j = nlohmann::json::object();
    j["AD_ID"] = o.m_AD_ID;
    if(o.dATEIsSet())
        j["DATE"] = o.m_DATE;
    
}

void from_json(const nlohmann::json& j, AdsAnalyticsResponse_inner& o)
{
    j.at("AD_ID").get_to(o.m_AD_ID);
    if(j.find("DATE") != j.end())
    {
        j.at("DATE").get_to(o.m_DATE);
        o.m_DATEIsSet = true;
    } 
    
}

std::string AdsAnalyticsResponse_inner::getADID() const
{
    return m_AD_ID;
}
void AdsAnalyticsResponse_inner::setADID(std::string const& value)
{
    m_AD_ID = value;
}
std::string AdsAnalyticsResponse_inner::getDATE() const
{
    return m_DATE;
}
void AdsAnalyticsResponse_inner::setDATE(std::string const& value)
{
    m_DATE = value;
    m_DATEIsSet = true;
}
bool AdsAnalyticsResponse_inner::dATEIsSet() const
{
    return m_DATEIsSet;
}
void AdsAnalyticsResponse_inner::unsetDATE()
{
    m_DATEIsSet = false;
}


} // namespace org::openapitools::server::model

