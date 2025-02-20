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


#include "CatalogsFeedValidationDetails.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

CatalogsFeedValidationDetails::CatalogsFeedValidationDetails()
{
    
}

void CatalogsFeedValidationDetails::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool CatalogsFeedValidationDetails::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool CatalogsFeedValidationDetails::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "CatalogsFeedValidationDetails" : pathPrefix;

        
    if (!m_Errors.validate(msg, _pathPrefix + ".errors")) {
        msg << _pathPrefix << ": Errors is invalid;";
        success = false;
    }    
    if (!m_Warnings.validate(msg, _pathPrefix + ".warnings")) {
        msg << _pathPrefix << ": Warnings is invalid;";
        success = false;
    }
    return success;
}

bool CatalogsFeedValidationDetails::operator==(const CatalogsFeedValidationDetails& rhs) const
{
    return
    
    
    (getErrors() == rhs.getErrors())
     &&
    
    (getWarnings() == rhs.getWarnings())
    
    
    ;
}

bool CatalogsFeedValidationDetails::operator!=(const CatalogsFeedValidationDetails& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const CatalogsFeedValidationDetails& o)
{
    j = nlohmann::json::object();
    j["errors"] = o.m_Errors;
    j["warnings"] = o.m_Warnings;
    
}

void from_json(const nlohmann::json& j, CatalogsFeedValidationDetails& o)
{
    j.at("errors").get_to(o.m_Errors);
    j.at("warnings").get_to(o.m_Warnings);
    
}

org::openapitools::server::model::CatalogsFeedValidationErrors CatalogsFeedValidationDetails::getErrors() const
{
    return m_Errors;
}
void CatalogsFeedValidationDetails::setErrors(org::openapitools::server::model::CatalogsFeedValidationErrors const& value)
{
    m_Errors = value;
}
org::openapitools::server::model::CatalogsFeedValidationWarnings CatalogsFeedValidationDetails::getWarnings() const
{
    return m_Warnings;
}
void CatalogsFeedValidationDetails::setWarnings(org::openapitools::server::model::CatalogsFeedValidationWarnings const& value)
{
    m_Warnings = value;
}


} // namespace org::openapitools::server::model

