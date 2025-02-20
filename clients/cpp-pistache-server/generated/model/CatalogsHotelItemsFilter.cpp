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


#include "CatalogsHotelItemsFilter.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

CatalogsHotelItemsFilter::CatalogsHotelItemsFilter()
{
    m_Catalog_type = "";
    m_Catalog_id = "";
    m_Catalog_idIsSet = false;
    
}

void CatalogsHotelItemsFilter::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool CatalogsHotelItemsFilter::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool CatalogsHotelItemsFilter::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "CatalogsHotelItemsFilter" : pathPrefix;

             
    
    /* Hotel_ids */ {
        const std::vector<std::string>& value = m_Hotel_ids;
        const std::string currentValuePath = _pathPrefix + ".hotelIds";
                
        
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

bool CatalogsHotelItemsFilter::operator==(const CatalogsHotelItemsFilter& rhs) const
{
    return
    
    
    (getCatalogType() == rhs.getCatalogType())
     &&
    
    (getHotelIds() == rhs.getHotelIds())
     &&
    
    
    ((!catalogIdIsSet() && !rhs.catalogIdIsSet()) || (catalogIdIsSet() && rhs.catalogIdIsSet() && getCatalogId() == rhs.getCatalogId()))
    
    ;
}

bool CatalogsHotelItemsFilter::operator!=(const CatalogsHotelItemsFilter& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const CatalogsHotelItemsFilter& o)
{
    j = nlohmann::json::object();
    j["catalog_type"] = o.m_Catalog_type;
    j["hotel_ids"] = o.m_Hotel_ids;
    if(o.catalogIdIsSet())
        j["catalog_id"] = o.m_Catalog_id;
    
}

void from_json(const nlohmann::json& j, CatalogsHotelItemsFilter& o)
{
    j.at("catalog_type").get_to(o.m_Catalog_type);
    j.at("hotel_ids").get_to(o.m_Hotel_ids);
    if(j.find("catalog_id") != j.end())
    {
        j.at("catalog_id").get_to(o.m_Catalog_id);
        o.m_Catalog_idIsSet = true;
    } 
    
}

std::string CatalogsHotelItemsFilter::getCatalogType() const
{
    return m_Catalog_type;
}
void CatalogsHotelItemsFilter::setCatalogType(std::string const& value)
{
    m_Catalog_type = value;
}
std::vector<std::string> CatalogsHotelItemsFilter::getHotelIds() const
{
    return m_Hotel_ids;
}
void CatalogsHotelItemsFilter::setHotelIds(std::vector<std::string> const& value)
{
    m_Hotel_ids = value;
}
std::string CatalogsHotelItemsFilter::getCatalogId() const
{
    return m_Catalog_id;
}
void CatalogsHotelItemsFilter::setCatalogId(std::string const& value)
{
    m_Catalog_id = value;
    m_Catalog_idIsSet = true;
}
bool CatalogsHotelItemsFilter::catalogIdIsSet() const
{
    return m_Catalog_idIsSet;
}
void CatalogsHotelItemsFilter::unsetCatalog_id()
{
    m_Catalog_idIsSet = false;
}


} // namespace org::openapitools::server::model

