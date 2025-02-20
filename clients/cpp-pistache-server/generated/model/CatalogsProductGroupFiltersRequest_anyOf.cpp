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


#include "CatalogsProductGroupFiltersRequest_anyOf.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

CatalogsProductGroupFiltersRequest_anyOf::CatalogsProductGroupFiltersRequest_anyOf()
{
    
}

void CatalogsProductGroupFiltersRequest_anyOf::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool CatalogsProductGroupFiltersRequest_anyOf::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool CatalogsProductGroupFiltersRequest_anyOf::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "CatalogsProductGroupFiltersRequest_anyOf" : pathPrefix;

         
    
    /* Any_of */ {
        const std::vector<org::openapitools::server::model::CatalogsProductGroupFilterKeys>& value = m_Any_of;
        const std::string currentValuePath = _pathPrefix + ".anyOf";
                
        
        if (value.size() < 1)
        {
            success = false;
            msg << currentValuePath << ": must have at least 1 elements;";
        }
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const org::openapitools::server::model::CatalogsProductGroupFilterKeys& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        
 
                i++;
            }
        }

    }
    
    return success;
}

bool CatalogsProductGroupFiltersRequest_anyOf::operator==(const CatalogsProductGroupFiltersRequest_anyOf& rhs) const
{
    return
    
    
    (getAnyOf() == rhs.getAnyOf())
    
    
    ;
}

bool CatalogsProductGroupFiltersRequest_anyOf::operator!=(const CatalogsProductGroupFiltersRequest_anyOf& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const CatalogsProductGroupFiltersRequest_anyOf& o)
{
    j = nlohmann::json::object();
    j["any_of"] = o.m_Any_of;
    
}

void from_json(const nlohmann::json& j, CatalogsProductGroupFiltersRequest_anyOf& o)
{
    j.at("any_of").get_to(o.m_Any_of);
    
}

std::vector<org::openapitools::server::model::CatalogsProductGroupFilterKeys> CatalogsProductGroupFiltersRequest_anyOf::getAnyOf() const
{
    return m_Any_of;
}
void CatalogsProductGroupFiltersRequest_anyOf::setAnyOf(std::vector<org::openapitools::server::model::CatalogsProductGroupFilterKeys> const& value)
{
    m_Any_of = value;
}


} // namespace org::openapitools::server::model

