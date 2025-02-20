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


#include "CatalogsVerticalProductGroupUpdateRequest.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

CatalogsVerticalProductGroupUpdateRequest::CatalogsVerticalProductGroupUpdateRequest()
{
    m_Catalog_type = "";
    m_Catalog_typeIsSet = false;
    m_Name = "";
    m_NameIsSet = false;
    m_Description = "";
    m_DescriptionIsSet = false;
    m_FiltersIsSet = false;
    m_CountryIsSet = false;
    m_LocaleIsSet = false;
    
}

void CatalogsVerticalProductGroupUpdateRequest::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool CatalogsVerticalProductGroupUpdateRequest::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool CatalogsVerticalProductGroupUpdateRequest::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "CatalogsVerticalProductGroupUpdateRequest" : pathPrefix;

                            
    return success;
}

bool CatalogsVerticalProductGroupUpdateRequest::operator==(const CatalogsVerticalProductGroupUpdateRequest& rhs) const
{
    return
    
    
    
    ((!catalogTypeIsSet() && !rhs.catalogTypeIsSet()) || (catalogTypeIsSet() && rhs.catalogTypeIsSet() && getCatalogType() == rhs.getCatalogType())) &&
    
    
    ((!nameIsSet() && !rhs.nameIsSet()) || (nameIsSet() && rhs.nameIsSet() && getName() == rhs.getName())) &&
    
    
    ((!descriptionIsSet() && !rhs.descriptionIsSet()) || (descriptionIsSet() && rhs.descriptionIsSet() && getDescription() == rhs.getDescription())) &&
    
    
    ((!filtersIsSet() && !rhs.filtersIsSet()) || (filtersIsSet() && rhs.filtersIsSet() && getFilters() == rhs.getFilters())) &&
    
    
    ((!countryIsSet() && !rhs.countryIsSet()) || (countryIsSet() && rhs.countryIsSet() && getCountry() == rhs.getCountry())) &&
    
    
    ((!localeIsSet() && !rhs.localeIsSet()) || (localeIsSet() && rhs.localeIsSet() && getLocale() == rhs.getLocale()))
    
    ;
}

bool CatalogsVerticalProductGroupUpdateRequest::operator!=(const CatalogsVerticalProductGroupUpdateRequest& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const CatalogsVerticalProductGroupUpdateRequest& o)
{
    j = nlohmann::json::object();
    if(o.catalogTypeIsSet())
        j["catalog_type"] = o.m_Catalog_type;
    if(o.nameIsSet())
        j["name"] = o.m_Name;
    if(o.descriptionIsSet())
        j["description"] = o.m_Description;
    if(o.filtersIsSet())
        j["filters"] = o.m_Filters;
    if(o.countryIsSet())
        j["country"] = o.m_Country;
    if(o.localeIsSet())
        j["locale"] = o.m_Locale;
    
}

void from_json(const nlohmann::json& j, CatalogsVerticalProductGroupUpdateRequest& o)
{
    if(j.find("catalog_type") != j.end())
    {
        j.at("catalog_type").get_to(o.m_Catalog_type);
        o.m_Catalog_typeIsSet = true;
    } 
    if(j.find("name") != j.end())
    {
        j.at("name").get_to(o.m_Name);
        o.m_NameIsSet = true;
    } 
    if(j.find("description") != j.end())
    {
        j.at("description").get_to(o.m_Description);
        o.m_DescriptionIsSet = true;
    } 
    if(j.find("filters") != j.end())
    {
        j.at("filters").get_to(o.m_Filters);
        o.m_FiltersIsSet = true;
    } 
    if(j.find("country") != j.end())
    {
        j.at("country").get_to(o.m_Country);
        o.m_CountryIsSet = true;
    } 
    if(j.find("locale") != j.end())
    {
        j.at("locale").get_to(o.m_Locale);
        o.m_LocaleIsSet = true;
    } 
    
}

std::string CatalogsVerticalProductGroupUpdateRequest::getCatalogType() const
{
    return m_Catalog_type;
}
void CatalogsVerticalProductGroupUpdateRequest::setCatalogType(std::string const& value)
{
    m_Catalog_type = value;
    m_Catalog_typeIsSet = true;
}
bool CatalogsVerticalProductGroupUpdateRequest::catalogTypeIsSet() const
{
    return m_Catalog_typeIsSet;
}
void CatalogsVerticalProductGroupUpdateRequest::unsetCatalog_type()
{
    m_Catalog_typeIsSet = false;
}
std::string CatalogsVerticalProductGroupUpdateRequest::getName() const
{
    return m_Name;
}
void CatalogsVerticalProductGroupUpdateRequest::setName(std::string const& value)
{
    m_Name = value;
    m_NameIsSet = true;
}
bool CatalogsVerticalProductGroupUpdateRequest::nameIsSet() const
{
    return m_NameIsSet;
}
void CatalogsVerticalProductGroupUpdateRequest::unsetName()
{
    m_NameIsSet = false;
}
std::string CatalogsVerticalProductGroupUpdateRequest::getDescription() const
{
    return m_Description;
}
void CatalogsVerticalProductGroupUpdateRequest::setDescription(std::string const& value)
{
    m_Description = value;
    m_DescriptionIsSet = true;
}
bool CatalogsVerticalProductGroupUpdateRequest::descriptionIsSet() const
{
    return m_DescriptionIsSet;
}
void CatalogsVerticalProductGroupUpdateRequest::unsetDescription()
{
    m_DescriptionIsSet = false;
}
org::openapitools::server::model::CatalogsCreativeAssetsProductGroupFilters CatalogsVerticalProductGroupUpdateRequest::getFilters() const
{
    return m_Filters;
}
void CatalogsVerticalProductGroupUpdateRequest::setFilters(org::openapitools::server::model::CatalogsCreativeAssetsProductGroupFilters const& value)
{
    m_Filters = value;
    m_FiltersIsSet = true;
}
bool CatalogsVerticalProductGroupUpdateRequest::filtersIsSet() const
{
    return m_FiltersIsSet;
}
void CatalogsVerticalProductGroupUpdateRequest::unsetFilters()
{
    m_FiltersIsSet = false;
}
org::openapitools::server::model::Country CatalogsVerticalProductGroupUpdateRequest::getCountry() const
{
    return m_Country;
}
void CatalogsVerticalProductGroupUpdateRequest::setCountry(org::openapitools::server::model::Country const& value)
{
    m_Country = value;
    m_CountryIsSet = true;
}
bool CatalogsVerticalProductGroupUpdateRequest::countryIsSet() const
{
    return m_CountryIsSet;
}
void CatalogsVerticalProductGroupUpdateRequest::unsetCountry()
{
    m_CountryIsSet = false;
}
org::openapitools::server::model::CatalogsLocale CatalogsVerticalProductGroupUpdateRequest::getLocale() const
{
    return m_Locale;
}
void CatalogsVerticalProductGroupUpdateRequest::setLocale(org::openapitools::server::model::CatalogsLocale const& value)
{
    m_Locale = value;
    m_LocaleIsSet = true;
}
bool CatalogsVerticalProductGroupUpdateRequest::localeIsSet() const
{
    return m_LocaleIsSet;
}
void CatalogsVerticalProductGroupUpdateRequest::unsetLocale()
{
    m_LocaleIsSet = false;
}


} // namespace org::openapitools::server::model

