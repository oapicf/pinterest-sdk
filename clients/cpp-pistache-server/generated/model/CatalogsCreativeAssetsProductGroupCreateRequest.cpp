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


#include "CatalogsCreativeAssetsProductGroupCreateRequest.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

CatalogsCreativeAssetsProductGroupCreateRequest::CatalogsCreativeAssetsProductGroupCreateRequest()
{
    m_Catalog_type = "";
    m_Name = "";
    m_Description = "";
    m_DescriptionIsSet = false;
    m_Catalog_id = "";
    
}

void CatalogsCreativeAssetsProductGroupCreateRequest::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool CatalogsCreativeAssetsProductGroupCreateRequest::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool CatalogsCreativeAssetsProductGroupCreateRequest::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "CatalogsCreativeAssetsProductGroupCreateRequest" : pathPrefix;

                    
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

bool CatalogsCreativeAssetsProductGroupCreateRequest::operator==(const CatalogsCreativeAssetsProductGroupCreateRequest& rhs) const
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
    
    
    ;
}

bool CatalogsCreativeAssetsProductGroupCreateRequest::operator!=(const CatalogsCreativeAssetsProductGroupCreateRequest& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const CatalogsCreativeAssetsProductGroupCreateRequest& o)
{
    j = nlohmann::json::object();
    j["catalog_type"] = o.m_Catalog_type;
    j["name"] = o.m_Name;
    if(o.descriptionIsSet())
        j["description"] = o.m_Description;
    j["filters"] = o.m_Filters;
    j["catalog_id"] = o.m_Catalog_id;
    
}

void from_json(const nlohmann::json& j, CatalogsCreativeAssetsProductGroupCreateRequest& o)
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
    
}

std::string CatalogsCreativeAssetsProductGroupCreateRequest::getCatalogType() const
{
    return m_Catalog_type;
}
void CatalogsCreativeAssetsProductGroupCreateRequest::setCatalogType(std::string const& value)
{
    m_Catalog_type = value;
}
std::string CatalogsCreativeAssetsProductGroupCreateRequest::getName() const
{
    return m_Name;
}
void CatalogsCreativeAssetsProductGroupCreateRequest::setName(std::string const& value)
{
    m_Name = value;
}
std::string CatalogsCreativeAssetsProductGroupCreateRequest::getDescription() const
{
    return m_Description;
}
void CatalogsCreativeAssetsProductGroupCreateRequest::setDescription(std::string const& value)
{
    m_Description = value;
    m_DescriptionIsSet = true;
}
bool CatalogsCreativeAssetsProductGroupCreateRequest::descriptionIsSet() const
{
    return m_DescriptionIsSet;
}
void CatalogsCreativeAssetsProductGroupCreateRequest::unsetDescription()
{
    m_DescriptionIsSet = false;
}
org::openapitools::server::model::CatalogsCreativeAssetsProductGroupFilters CatalogsCreativeAssetsProductGroupCreateRequest::getFilters() const
{
    return m_Filters;
}
void CatalogsCreativeAssetsProductGroupCreateRequest::setFilters(org::openapitools::server::model::CatalogsCreativeAssetsProductGroupFilters const& value)
{
    m_Filters = value;
}
std::string CatalogsCreativeAssetsProductGroupCreateRequest::getCatalogId() const
{
    return m_Catalog_id;
}
void CatalogsCreativeAssetsProductGroupCreateRequest::setCatalogId(std::string const& value)
{
    m_Catalog_id = value;
}


} // namespace org::openapitools::server::model

