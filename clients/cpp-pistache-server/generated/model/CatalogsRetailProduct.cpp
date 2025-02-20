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


#include "CatalogsRetailProduct.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

CatalogsRetailProduct::CatalogsRetailProduct()
{
    m_Catalog_type = "";
    
}

void CatalogsRetailProduct::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool CatalogsRetailProduct::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool CatalogsRetailProduct::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "CatalogsRetailProduct" : pathPrefix;

            
    if (!m_Metadata.validate(msg, _pathPrefix + ".metadata")) {
        msg << _pathPrefix << ": Metadata is invalid;";
        success = false;
    }    
    if (!m_Pin.validate(msg, _pathPrefix + ".pin")) {
        msg << _pathPrefix << ": Pin is invalid;";
        success = false;
    }
    return success;
}

bool CatalogsRetailProduct::operator==(const CatalogsRetailProduct& rhs) const
{
    return
    
    
    (getCatalogType() == rhs.getCatalogType())
     &&
    
    (getMetadata() == rhs.getMetadata())
     &&
    
    (getPin() == rhs.getPin())
    
    
    ;
}

bool CatalogsRetailProduct::operator!=(const CatalogsRetailProduct& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const CatalogsRetailProduct& o)
{
    j = nlohmann::json::object();
    j["catalog_type"] = o.m_Catalog_type;
    j["metadata"] = o.m_Metadata;
    j["pin"] = o.m_Pin;
    
}

void from_json(const nlohmann::json& j, CatalogsRetailProduct& o)
{
    j.at("catalog_type").get_to(o.m_Catalog_type);
    j.at("metadata").get_to(o.m_Metadata);
    j.at("pin").get_to(o.m_Pin);
    
}

std::string CatalogsRetailProduct::getCatalogType() const
{
    return m_Catalog_type;
}
void CatalogsRetailProduct::setCatalogType(std::string const& value)
{
    m_Catalog_type = value;
}
org::openapitools::server::model::CatalogsRetailProductMetadata CatalogsRetailProduct::getMetadata() const
{
    return m_Metadata;
}
void CatalogsRetailProduct::setMetadata(org::openapitools::server::model::CatalogsRetailProductMetadata const& value)
{
    m_Metadata = value;
}
org::openapitools::server::model::Pin CatalogsRetailProduct::getPin() const
{
    return m_Pin;
}
void CatalogsRetailProduct::setPin(org::openapitools::server::model::Pin const& value)
{
    m_Pin = value;
}


} // namespace org::openapitools::server::model

