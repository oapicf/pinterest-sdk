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


#include "CatalogsItemsRequest.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

CatalogsItemsRequest::CatalogsItemsRequest()
{
    
}

void CatalogsItemsRequest::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool CatalogsItemsRequest::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool CatalogsItemsRequest::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "CatalogsItemsRequest" : pathPrefix;

            
    if (!m_Language.validate(msg, _pathPrefix + ".language")) {
        msg << _pathPrefix << ": Language is invalid;";
        success = false;
    }    
    if (!m_Filters.validate(msg, _pathPrefix + ".filters")) {
        msg << _pathPrefix << ": Filters is invalid;";
        success = false;
    }
    return success;
}

bool CatalogsItemsRequest::operator==(const CatalogsItemsRequest& rhs) const
{
    return
    
    
    (getCountry() == rhs.getCountry())
     &&
    
    (getLanguage() == rhs.getLanguage())
     &&
    
    (getFilters() == rhs.getFilters())
    
    
    ;
}

bool CatalogsItemsRequest::operator!=(const CatalogsItemsRequest& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const CatalogsItemsRequest& o)
{
    j = nlohmann::json::object();
    j["country"] = o.m_Country;
    j["language"] = o.m_Language;
    j["filters"] = o.m_Filters;
    
}

void from_json(const nlohmann::json& j, CatalogsItemsRequest& o)
{
    j.at("country").get_to(o.m_Country);
    j.at("language").get_to(o.m_Language);
    j.at("filters").get_to(o.m_Filters);
    
}

org::openapitools::server::model::Country CatalogsItemsRequest::getCountry() const
{
    return m_Country;
}
void CatalogsItemsRequest::setCountry(org::openapitools::server::model::Country const& value)
{
    m_Country = value;
}
org::openapitools::server::model::CatalogsItemsRequest_language CatalogsItemsRequest::getLanguage() const
{
    return m_Language;
}
void CatalogsItemsRequest::setLanguage(org::openapitools::server::model::CatalogsItemsRequest_language const& value)
{
    m_Language = value;
}
org::openapitools::server::model::CatalogsItemsPostFilters CatalogsItemsRequest::getFilters() const
{
    return m_Filters;
}
void CatalogsItemsRequest::setFilters(org::openapitools::server::model::CatalogsItemsPostFilters const& value)
{
    m_Filters = value;
}


} // namespace org::openapitools::server::model

