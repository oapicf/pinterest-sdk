/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.3.0
* Contact: pinterest-api@pinterest.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/


#include "AvailabilityFilter.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

AvailabilityFilter::AvailabilityFilter()
{
    
}

void AvailabilityFilter::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool AvailabilityFilter::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool AvailabilityFilter::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "AvailabilityFilter" : pathPrefix;

        
    return success;
}

bool AvailabilityFilter::operator==(const AvailabilityFilter& rhs) const
{
    return
    
    
    (getAVAILABILITY() == rhs.getAVAILABILITY())
    
    
    ;
}

bool AvailabilityFilter::operator!=(const AvailabilityFilter& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const AvailabilityFilter& o)
{
    j = nlohmann::json();
    j["AVAILABILITY"] = o.m_AVAILABILITY;
    
}

void from_json(const nlohmann::json& j, AvailabilityFilter& o)
{
    j.at("AVAILABILITY").get_to(o.m_AVAILABILITY);
    
}

CatalogsProductGroupMultipleStringCriteria AvailabilityFilter::getAVAILABILITY() const
{
    return m_AVAILABILITY;
}
void AvailabilityFilter::setAVAILABILITY(CatalogsProductGroupMultipleStringCriteria const& value)
{
    m_AVAILABILITY = value;
}


} // namespace org::openapitools::server::model
