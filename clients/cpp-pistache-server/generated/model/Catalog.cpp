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


#include "Catalog.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

Catalog::Catalog()
{
    m_Created_at = "";
    m_Id = "";
    m_Updated_at = "";
    m_Name = "";
    
}

void Catalog::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool Catalog::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool Catalog::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "Catalog" : pathPrefix;

             
    
    /* Id */ {
        const std::string& value = m_Id;
        const std::string currentValuePath = _pathPrefix + ".id";
                
        

    }
                
    return success;
}

bool Catalog::operator==(const Catalog& rhs) const
{
    return
    
    
    (getCreatedAt() == rhs.getCreatedAt())
     &&
    
    (getId() == rhs.getId())
     &&
    
    (getUpdatedAt() == rhs.getUpdatedAt())
     &&
    
    (getName() == rhs.getName())
     &&
    
    (getCatalogType() == rhs.getCatalogType())
    
    
    ;
}

bool Catalog::operator!=(const Catalog& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const Catalog& o)
{
    j = nlohmann::json::object();
    j["created_at"] = o.m_Created_at;
    j["id"] = o.m_Id;
    j["updated_at"] = o.m_Updated_at;
    j["name"] = o.m_Name;
    j["catalog_type"] = o.m_Catalog_type;
    
}

void from_json(const nlohmann::json& j, Catalog& o)
{
    j.at("created_at").get_to(o.m_Created_at);
    j.at("id").get_to(o.m_Id);
    j.at("updated_at").get_to(o.m_Updated_at);
    j.at("name").get_to(o.m_Name);
    j.at("catalog_type").get_to(o.m_Catalog_type);
    
}

std::string Catalog::getCreatedAt() const
{
    return m_Created_at;
}
void Catalog::setCreatedAt(std::string const& value)
{
    m_Created_at = value;
}
std::string Catalog::getId() const
{
    return m_Id;
}
void Catalog::setId(std::string const& value)
{
    m_Id = value;
}
std::string Catalog::getUpdatedAt() const
{
    return m_Updated_at;
}
void Catalog::setUpdatedAt(std::string const& value)
{
    m_Updated_at = value;
}
std::string Catalog::getName() const
{
    return m_Name;
}
void Catalog::setName(std::string const& value)
{
    m_Name = value;
}
org::openapitools::server::model::CatalogsType Catalog::getCatalogType() const
{
    return m_Catalog_type;
}
void Catalog::setCatalogType(org::openapitools::server::model::CatalogsType const& value)
{
    m_Catalog_type = value;
}


} // namespace org::openapitools::server::model

