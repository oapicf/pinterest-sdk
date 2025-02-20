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


#include "GenderFilter.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

GenderFilter::GenderFilter()
{
    
}

void GenderFilter::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool GenderFilter::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool GenderFilter::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "GenderFilter" : pathPrefix;

        
    return success;
}

bool GenderFilter::operator==(const GenderFilter& rhs) const
{
    return
    
    
    (getGENDER() == rhs.getGENDER())
    
    
    ;
}

bool GenderFilter::operator!=(const GenderFilter& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const GenderFilter& o)
{
    j = nlohmann::json::object();
    j["GENDER"] = o.m_GENDER;
    
}

void from_json(const nlohmann::json& j, GenderFilter& o)
{
    j.at("GENDER").get_to(o.m_GENDER);
    
}

org::openapitools::server::model::CatalogsProductGroupMultipleGenderCriteria GenderFilter::getGENDER() const
{
    return m_GENDER;
}
void GenderFilter::setGENDER(org::openapitools::server::model::CatalogsProductGroupMultipleGenderCriteria const& value)
{
    m_GENDER = value;
}


} // namespace org::openapitools::server::model

