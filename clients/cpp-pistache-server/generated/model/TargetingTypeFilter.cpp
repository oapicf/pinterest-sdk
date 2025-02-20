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


#include "TargetingTypeFilter.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

TargetingTypeFilter::TargetingTypeFilter()
{
    m_Targeting_typesIsSet = false;
    
}

void TargetingTypeFilter::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool TargetingTypeFilter::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool TargetingTypeFilter::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "TargetingTypeFilter" : pathPrefix;

         
    if (targetingTypesIsSet())
    {
        const std::vector<org::openapitools::server::model::AdsAnalyticsTargetingType>& value = m_Targeting_types;
        const std::string currentValuePath = _pathPrefix + ".targetingTypes";
                
        
        if (value.size() < 1)
        {
            success = false;
            msg << currentValuePath << ": must have at least 1 elements;";
        }
        if (value.size() > 5)
        {
            success = false;
            msg << currentValuePath << ": must have at most 5 elements;";
        }
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const org::openapitools::server::model::AdsAnalyticsTargetingType& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        success = value.validate(msg, currentValuePath) && success;
        
        
 
                i++;
            }
        }

    }
    
    return success;
}

bool TargetingTypeFilter::operator==(const TargetingTypeFilter& rhs) const
{
    return
    
    
    
    ((!targetingTypesIsSet() && !rhs.targetingTypesIsSet()) || (targetingTypesIsSet() && rhs.targetingTypesIsSet() && getTargetingTypes() == rhs.getTargetingTypes()))
    
    ;
}

bool TargetingTypeFilter::operator!=(const TargetingTypeFilter& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const TargetingTypeFilter& o)
{
    j = nlohmann::json::object();
    if(o.targetingTypesIsSet() || !o.m_Targeting_types.empty())
        j["targeting_types"] = o.m_Targeting_types;
    
}

void from_json(const nlohmann::json& j, TargetingTypeFilter& o)
{
    if(j.find("targeting_types") != j.end())
    {
        j.at("targeting_types").get_to(o.m_Targeting_types);
        o.m_Targeting_typesIsSet = true;
    } 
    
}

std::vector<org::openapitools::server::model::AdsAnalyticsTargetingType> TargetingTypeFilter::getTargetingTypes() const
{
    return m_Targeting_types;
}
void TargetingTypeFilter::setTargetingTypes(std::vector<org::openapitools::server::model::AdsAnalyticsTargetingType> const& value)
{
    m_Targeting_types = value;
    m_Targeting_typesIsSet = true;
}
bool TargetingTypeFilter::targetingTypesIsSet() const
{
    return m_Targeting_typesIsSet;
}
void TargetingTypeFilter::unsetTargeting_types()
{
    m_Targeting_typesIsSet = false;
}


} // namespace org::openapitools::server::model

