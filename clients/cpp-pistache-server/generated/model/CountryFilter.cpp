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


#include "CountryFilter.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

CountryFilter::CountryFilter()
{
    
}

void CountryFilter::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool CountryFilter::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool CountryFilter::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "CountryFilter" : pathPrefix;

        
    return success;
}

bool CountryFilter::operator==(const CountryFilter& rhs) const
{
    return
    
    
    (getCOUNTRY() == rhs.getCOUNTRY())
    
    
    ;
}

bool CountryFilter::operator!=(const CountryFilter& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const CountryFilter& o)
{
    j = nlohmann::json::object();
    j["COUNTRY"] = o.m_COUNTRY;
    
}

void from_json(const nlohmann::json& j, CountryFilter& o)
{
    j.at("COUNTRY").get_to(o.m_COUNTRY);
    
}

org::openapitools::server::model::CatalogsProductGroupMultipleCountriesCriteria CountryFilter::getCOUNTRY() const
{
    return m_COUNTRY;
}
void CountryFilter::setCOUNTRY(org::openapitools::server::model::CatalogsProductGroupMultipleCountriesCriteria const& value)
{
    m_COUNTRY = value;
}


} // namespace org::openapitools::server::model
