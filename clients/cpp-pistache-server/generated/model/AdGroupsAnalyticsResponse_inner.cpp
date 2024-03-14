/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.6.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/


#include "AdGroupsAnalyticsResponse_inner.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

AdGroupsAnalyticsResponse_inner::AdGroupsAnalyticsResponse_inner()
{
    m_AD_GROUP_ID = "";
    m_DATEIsSet = false;
    
}

void AdGroupsAnalyticsResponse_inner::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool AdGroupsAnalyticsResponse_inner::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool AdGroupsAnalyticsResponse_inner::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "AdGroupsAnalyticsResponse_inner" : pathPrefix;

         
    
    /* AD_GROUP_ID */ {
        const std::string& value = m_AD_GROUP_ID;
        const std::string currentValuePath = _pathPrefix + ".aDGROUPID";
                
        

    }
        
    return success;
}

bool AdGroupsAnalyticsResponse_inner::operator==(const AdGroupsAnalyticsResponse_inner& rhs) const
{
    return
    
    
    (getADGROUPID() == rhs.getADGROUPID())
     &&
    
    
    ((!dATEIsSet() && !rhs.dATEIsSet()) || (dATEIsSet() && rhs.dATEIsSet() && getDATE() == rhs.getDATE()))
    
    ;
}

bool AdGroupsAnalyticsResponse_inner::operator!=(const AdGroupsAnalyticsResponse_inner& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const AdGroupsAnalyticsResponse_inner& o)
{
    j = nlohmann::json::object();
    j["AD_GROUP_ID"] = o.m_AD_GROUP_ID;
    if(o.dATEIsSet())
        j["DATE"] = o.m_DATE;
    
}

void from_json(const nlohmann::json& j, AdGroupsAnalyticsResponse_inner& o)
{
    j.at("AD_GROUP_ID").get_to(o.m_AD_GROUP_ID);
    if(j.find("DATE") != j.end())
    {
        j.at("DATE").get_to(o.m_DATE);
        o.m_DATEIsSet = true;
    } 
    
}

std::string AdGroupsAnalyticsResponse_inner::getADGROUPID() const
{
    return m_AD_GROUP_ID;
}
void AdGroupsAnalyticsResponse_inner::setADGROUPID(std::string const& value)
{
    m_AD_GROUP_ID = value;
}
std::string AdGroupsAnalyticsResponse_inner::getDATE() const
{
    return m_DATE;
}
void AdGroupsAnalyticsResponse_inner::setDATE(std::string const& value)
{
    m_DATE = value;
    m_DATEIsSet = true;
}
bool AdGroupsAnalyticsResponse_inner::dATEIsSet() const
{
    return m_DATEIsSet;
}
void AdGroupsAnalyticsResponse_inner::unsetDATE()
{
    m_DATEIsSet = false;
}


} // namespace org::openapitools::server::model
