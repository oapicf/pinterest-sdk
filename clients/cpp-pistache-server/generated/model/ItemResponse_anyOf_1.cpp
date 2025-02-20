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


#include "ItemResponse_anyOf_1.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

ItemResponse_anyOf_1::ItemResponse_anyOf_1()
{
    m_Item_id = "";
    m_Item_idIsSet = false;
    m_ErrorsIsSet = false;
    m_Hotel_id = "";
    m_Hotel_idIsSet = false;
    m_Creative_assets_id = "";
    m_Creative_assets_idIsSet = false;
    
}

void ItemResponse_anyOf_1::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool ItemResponse_anyOf_1::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool ItemResponse_anyOf_1::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "ItemResponse_anyOf_1" : pathPrefix;

                 
    if (errorsIsSet())
    {
        const std::vector<org::openapitools::server::model::ItemValidationEvent>& value = m_Errors;
        const std::string currentValuePath = _pathPrefix + ".errors";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const org::openapitools::server::model::ItemValidationEvent& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        success = value.validate(msg, currentValuePath + ".errors") && success;
 
                i++;
            }
        }

    }
            
    return success;
}

bool ItemResponse_anyOf_1::operator==(const ItemResponse_anyOf_1& rhs) const
{
    return
    
    
    (getCatalogType() == rhs.getCatalogType())
     &&
    
    
    ((!itemIdIsSet() && !rhs.itemIdIsSet()) || (itemIdIsSet() && rhs.itemIdIsSet() && getItemId() == rhs.getItemId())) &&
    
    
    ((!errorsIsSet() && !rhs.errorsIsSet()) || (errorsIsSet() && rhs.errorsIsSet() && getErrors() == rhs.getErrors())) &&
    
    
    ((!hotelIdIsSet() && !rhs.hotelIdIsSet()) || (hotelIdIsSet() && rhs.hotelIdIsSet() && getHotelId() == rhs.getHotelId())) &&
    
    
    ((!creativeAssetsIdIsSet() && !rhs.creativeAssetsIdIsSet()) || (creativeAssetsIdIsSet() && rhs.creativeAssetsIdIsSet() && getCreativeAssetsId() == rhs.getCreativeAssetsId()))
    
    ;
}

bool ItemResponse_anyOf_1::operator!=(const ItemResponse_anyOf_1& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const ItemResponse_anyOf_1& o)
{
    j = nlohmann::json::object();
    j["catalog_type"] = o.m_Catalog_type;
    if(o.itemIdIsSet())
        j["item_id"] = o.m_Item_id;
    if(o.errorsIsSet() || !o.m_Errors.empty())
        j["errors"] = o.m_Errors;
    if(o.hotelIdIsSet())
        j["hotel_id"] = o.m_Hotel_id;
    if(o.creativeAssetsIdIsSet())
        j["creative_assets_id"] = o.m_Creative_assets_id;
    
}

void from_json(const nlohmann::json& j, ItemResponse_anyOf_1& o)
{
    j.at("catalog_type").get_to(o.m_Catalog_type);
    if(j.find("item_id") != j.end())
    {
        j.at("item_id").get_to(o.m_Item_id);
        o.m_Item_idIsSet = true;
    } 
    if(j.find("errors") != j.end())
    {
        j.at("errors").get_to(o.m_Errors);
        o.m_ErrorsIsSet = true;
    } 
    if(j.find("hotel_id") != j.end())
    {
        j.at("hotel_id").get_to(o.m_Hotel_id);
        o.m_Hotel_idIsSet = true;
    } 
    if(j.find("creative_assets_id") != j.end())
    {
        j.at("creative_assets_id").get_to(o.m_Creative_assets_id);
        o.m_Creative_assets_idIsSet = true;
    } 
    
}

org::openapitools::server::model::CatalogsType ItemResponse_anyOf_1::getCatalogType() const
{
    return m_Catalog_type;
}
void ItemResponse_anyOf_1::setCatalogType(org::openapitools::server::model::CatalogsType const& value)
{
    m_Catalog_type = value;
}
std::string ItemResponse_anyOf_1::getItemId() const
{
    return m_Item_id;
}
void ItemResponse_anyOf_1::setItemId(std::string const& value)
{
    m_Item_id = value;
    m_Item_idIsSet = true;
}
bool ItemResponse_anyOf_1::itemIdIsSet() const
{
    return m_Item_idIsSet;
}
void ItemResponse_anyOf_1::unsetItem_id()
{
    m_Item_idIsSet = false;
}
std::vector<org::openapitools::server::model::ItemValidationEvent> ItemResponse_anyOf_1::getErrors() const
{
    return m_Errors;
}
void ItemResponse_anyOf_1::setErrors(std::vector<org::openapitools::server::model::ItemValidationEvent> const& value)
{
    m_Errors = value;
    m_ErrorsIsSet = true;
}
bool ItemResponse_anyOf_1::errorsIsSet() const
{
    return m_ErrorsIsSet;
}
void ItemResponse_anyOf_1::unsetErrors()
{
    m_ErrorsIsSet = false;
}
std::string ItemResponse_anyOf_1::getHotelId() const
{
    return m_Hotel_id;
}
void ItemResponse_anyOf_1::setHotelId(std::string const& value)
{
    m_Hotel_id = value;
    m_Hotel_idIsSet = true;
}
bool ItemResponse_anyOf_1::hotelIdIsSet() const
{
    return m_Hotel_idIsSet;
}
void ItemResponse_anyOf_1::unsetHotel_id()
{
    m_Hotel_idIsSet = false;
}
std::string ItemResponse_anyOf_1::getCreativeAssetsId() const
{
    return m_Creative_assets_id;
}
void ItemResponse_anyOf_1::setCreativeAssetsId(std::string const& value)
{
    m_Creative_assets_id = value;
    m_Creative_assets_idIsSet = true;
}
bool ItemResponse_anyOf_1::creativeAssetsIdIsSet() const
{
    return m_Creative_assets_idIsSet;
}
void ItemResponse_anyOf_1::unsetCreative_assets_id()
{
    m_Creative_assets_idIsSet = false;
}


} // namespace org::openapitools::server::model

