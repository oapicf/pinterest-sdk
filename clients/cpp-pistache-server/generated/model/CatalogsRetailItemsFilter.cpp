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


#include "CatalogsRetailItemsFilter.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

CatalogsRetailItemsFilter::CatalogsRetailItemsFilter()
{
    m_Catalog_type = "";
    m_Catalog_id = "";
    m_Catalog_idIsSet = false;
    
}

void CatalogsRetailItemsFilter::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool CatalogsRetailItemsFilter::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool CatalogsRetailItemsFilter::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "CatalogsRetailItemsFilter" : pathPrefix;

             
    
    /* Item_ids */ {
        const std::vector<std::string>& value = m_Item_ids;
        const std::string currentValuePath = _pathPrefix + ".itemIds";
                
        
        if (value.size() < 1)
        {
            success = false;
            msg << currentValuePath << ": must have at least 1 elements;";
        }
        if (value.size() > 100)
        {
            success = false;
            msg << currentValuePath << ": must have at most 100 elements;";
        }
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const std::string& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        
 
                i++;
            }
        }

    }
         
    if (catalogIdIsSet())
    {
        const std::string& value = m_Catalog_id;
        const std::string currentValuePath = _pathPrefix + ".catalogId";
                
        

    }
    
    return success;
}

bool CatalogsRetailItemsFilter::operator==(const CatalogsRetailItemsFilter& rhs) const
{
    return
    
    
    (getCatalogType() == rhs.getCatalogType())
     &&
    
    (getItemIds() == rhs.getItemIds())
     &&
    
    
    ((!catalogIdIsSet() && !rhs.catalogIdIsSet()) || (catalogIdIsSet() && rhs.catalogIdIsSet() && getCatalogId() == rhs.getCatalogId()))
    
    ;
}

bool CatalogsRetailItemsFilter::operator!=(const CatalogsRetailItemsFilter& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const CatalogsRetailItemsFilter& o)
{
    j = nlohmann::json::object();
    j["catalog_type"] = o.m_Catalog_type;
    j["item_ids"] = o.m_Item_ids;
    if(o.catalogIdIsSet())
        j["catalog_id"] = o.m_Catalog_id;
    
}

void from_json(const nlohmann::json& j, CatalogsRetailItemsFilter& o)
{
    j.at("catalog_type").get_to(o.m_Catalog_type);
    j.at("item_ids").get_to(o.m_Item_ids);
    if(j.find("catalog_id") != j.end())
    {
        j.at("catalog_id").get_to(o.m_Catalog_id);
        o.m_Catalog_idIsSet = true;
    } 
    
}

std::string CatalogsRetailItemsFilter::getCatalogType() const
{
    return m_Catalog_type;
}
void CatalogsRetailItemsFilter::setCatalogType(std::string const& value)
{
    m_Catalog_type = value;
}
std::vector<std::string> CatalogsRetailItemsFilter::getItemIds() const
{
    return m_Item_ids;
}
void CatalogsRetailItemsFilter::setItemIds(std::vector<std::string> const& value)
{
    m_Item_ids = value;
}
std::string CatalogsRetailItemsFilter::getCatalogId() const
{
    return m_Catalog_id;
}
void CatalogsRetailItemsFilter::setCatalogId(std::string const& value)
{
    m_Catalog_id = value;
    m_Catalog_idIsSet = true;
}
bool CatalogsRetailItemsFilter::catalogIdIsSet() const
{
    return m_Catalog_idIsSet;
}
void CatalogsRetailItemsFilter::unsetCatalog_id()
{
    m_Catalog_idIsSet = false;
}


} // namespace org::openapitools::server::model

