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


#include "CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest::CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest()
{
    m_Catalog_type = "";
    m_Catalog_id = "";
    
}

void CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest" : pathPrefix;

             
    
    /* Catalog_id */ {
        const std::string& value = m_Catalog_id;
        const std::string currentValuePath = _pathPrefix + ".catalogId";
                
        

    }
        
    if (!m_Filters.validate(msg, _pathPrefix + ".filters")) {
        msg << _pathPrefix << ": Filters is invalid;";
        success = false;
    }
    return success;
}

bool CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest::operator==(const CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest& rhs) const
{
    return
    
    
    (getCatalogType() == rhs.getCatalogType())
     &&
    
    (getCatalogId() == rhs.getCatalogId())
     &&
    
    (getFilters() == rhs.getFilters())
    
    
    ;
}

bool CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest::operator!=(const CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest& o)
{
    j = nlohmann::json::object();
    j["catalog_type"] = o.m_Catalog_type;
    j["catalog_id"] = o.m_Catalog_id;
    j["filters"] = o.m_Filters;
    
}

void from_json(const nlohmann::json& j, CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest& o)
{
    j.at("catalog_type").get_to(o.m_Catalog_type);
    j.at("catalog_id").get_to(o.m_Catalog_id);
    j.at("filters").get_to(o.m_Filters);
    
}

std::string CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest::getCatalogType() const
{
    return m_Catalog_type;
}
void CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest::setCatalogType(std::string const& value)
{
    m_Catalog_type = value;
}
std::string CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest::getCatalogId() const
{
    return m_Catalog_id;
}
void CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest::setCatalogId(std::string const& value)
{
    m_Catalog_id = value;
}
org::openapitools::server::model::CatalogsCreativeAssetsProductGroupFilters CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest::getFilters() const
{
    return m_Filters;
}
void CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest::setFilters(org::openapitools::server::model::CatalogsCreativeAssetsProductGroupFilters const& value)
{
    m_Filters = value;
}


} // namespace org::openapitools::server::model

