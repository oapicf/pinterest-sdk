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


#include "CatalogsVerticalProductGroupCreateRequest.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

CatalogsVerticalProductGroupCreateRequest::CatalogsVerticalProductGroupCreateRequest()
{
    m_Catalog_type = "";
    m_Name = "";
    m_Description = "";
    m_DescriptionIsSet = false;
    m_Catalog_id = "";
    
}

void CatalogsVerticalProductGroupCreateRequest::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool CatalogsVerticalProductGroupCreateRequest::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool CatalogsVerticalProductGroupCreateRequest::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "CatalogsVerticalProductGroupCreateRequest" : pathPrefix;

                    
    if (!m_Filters.validate(msg, _pathPrefix + ".filters")) {
        msg << _pathPrefix << ": Filters is invalid;";
        success = false;
    }     
    
    /* Catalog_id */ {
        const std::string& value = m_Catalog_id;
        const std::string currentValuePath = _pathPrefix + ".catalogId";
                
        

    }
            
    return success;
}

bool CatalogsVerticalProductGroupCreateRequest::operator==(const CatalogsVerticalProductGroupCreateRequest& rhs) const
{
    return
    
    
    (getCatalogType() == rhs.getCatalogType())
     &&
    
    (getName() == rhs.getName())
     &&
    
    
    ((!descriptionIsSet() && !rhs.descriptionIsSet()) || (descriptionIsSet() && rhs.descriptionIsSet() && getDescription() == rhs.getDescription())) &&
    
    (getFilters() == rhs.getFilters())
     &&
    
    (getCatalogId() == rhs.getCatalogId())
     &&
    
    (getCountry() == rhs.getCountry())
     &&
    
    (getLocale() == rhs.getLocale())
    
    
    ;
}

bool CatalogsVerticalProductGroupCreateRequest::operator!=(const CatalogsVerticalProductGroupCreateRequest& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const CatalogsVerticalProductGroupCreateRequest& o)
{
    j = nlohmann::json::object();
    j["catalog_type"] = o.m_Catalog_type;
    j["name"] = o.m_Name;
    if(o.descriptionIsSet())
        j["description"] = o.m_Description;
    j["filters"] = o.m_Filters;
    j["catalog_id"] = o.m_Catalog_id;
    j["country"] = o.m_Country;
    j["locale"] = o.m_Locale;
    
}

void from_json(const nlohmann::json& j, CatalogsVerticalProductGroupCreateRequest& o)
{
    j.at("catalog_type").get_to(o.m_Catalog_type);
    j.at("name").get_to(o.m_Name);
    if(j.find("description") != j.end())
    {
        j.at("description").get_to(o.m_Description);
        o.m_DescriptionIsSet = true;
    } 
    j.at("filters").get_to(o.m_Filters);
    j.at("catalog_id").get_to(o.m_Catalog_id);
    j.at("country").get_to(o.m_Country);
    j.at("locale").get_to(o.m_Locale);
    
}

std::string CatalogsVerticalProductGroupCreateRequest::getCatalogType() const
{
    return m_Catalog_type;
}
void CatalogsVerticalProductGroupCreateRequest::setCatalogType(std::string const& value)
{
    m_Catalog_type = value;
}
std::string CatalogsVerticalProductGroupCreateRequest::getName() const
{
    return m_Name;
}
void CatalogsVerticalProductGroupCreateRequest::setName(std::string const& value)
{
    m_Name = value;
}
std::string CatalogsVerticalProductGroupCreateRequest::getDescription() const
{
    return m_Description;
}
void CatalogsVerticalProductGroupCreateRequest::setDescription(std::string const& value)
{
    m_Description = value;
    m_DescriptionIsSet = true;
}
bool CatalogsVerticalProductGroupCreateRequest::descriptionIsSet() const
{
    return m_DescriptionIsSet;
}
void CatalogsVerticalProductGroupCreateRequest::unsetDescription()
{
    m_DescriptionIsSet = false;
}
org::openapitools::server::model::CatalogsCreativeAssetsProductGroupFilters CatalogsVerticalProductGroupCreateRequest::getFilters() const
{
    return m_Filters;
}
void CatalogsVerticalProductGroupCreateRequest::setFilters(org::openapitools::server::model::CatalogsCreativeAssetsProductGroupFilters const& value)
{
    m_Filters = value;
}
std::string CatalogsVerticalProductGroupCreateRequest::getCatalogId() const
{
    return m_Catalog_id;
}
void CatalogsVerticalProductGroupCreateRequest::setCatalogId(std::string const& value)
{
    m_Catalog_id = value;
}
org::openapitools::server::model::Country CatalogsVerticalProductGroupCreateRequest::getCountry() const
{
    return m_Country;
}
void CatalogsVerticalProductGroupCreateRequest::setCountry(org::openapitools::server::model::Country const& value)
{
    m_Country = value;
}
org::openapitools::server::model::CatalogsLocale CatalogsVerticalProductGroupCreateRequest::getLocale() const
{
    return m_Locale;
}
void CatalogsVerticalProductGroupCreateRequest::setLocale(org::openapitools::server::model::CatalogsLocale const& value)
{
    m_Locale = value;
}


} // namespace org::openapitools::server::model

