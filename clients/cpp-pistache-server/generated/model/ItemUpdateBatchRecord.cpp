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


#include "ItemUpdateBatchRecord.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

ItemUpdateBatchRecord::ItemUpdateBatchRecord()
{
    m_Item_id = "";
    m_Item_idIsSet = false;
    m_AttributesIsSet = false;
    m_Update_maskIsSet = false;
    
}

void ItemUpdateBatchRecord::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool ItemUpdateBatchRecord::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool ItemUpdateBatchRecord::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "ItemUpdateBatchRecord" : pathPrefix;

                 
    if (updateMaskIsSet())
    {
        const std::vector<org::openapitools::server::model::UpdateMaskFieldType>& value = m_Update_mask;
        const std::string currentValuePath = _pathPrefix + ".updateMask";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const org::openapitools::server::model::UpdateMaskFieldType& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        success = value.validate(msg, currentValuePath) && success;
        
        
 
                i++;
            }
        }

    }
    
    return success;
}

bool ItemUpdateBatchRecord::operator==(const ItemUpdateBatchRecord& rhs) const
{
    return
    
    
    
    ((!itemIdIsSet() && !rhs.itemIdIsSet()) || (itemIdIsSet() && rhs.itemIdIsSet() && getItemId() == rhs.getItemId())) &&
    
    
    ((!attributesIsSet() && !rhs.attributesIsSet()) || (attributesIsSet() && rhs.attributesIsSet() && getAttributes() == rhs.getAttributes())) &&
    
    
    ((!updateMaskIsSet() && !rhs.updateMaskIsSet()) || (updateMaskIsSet() && rhs.updateMaskIsSet() && getUpdateMask() == rhs.getUpdateMask()))
    
    ;
}

bool ItemUpdateBatchRecord::operator!=(const ItemUpdateBatchRecord& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const ItemUpdateBatchRecord& o)
{
    j = nlohmann::json::object();
    if(o.itemIdIsSet())
        j["item_id"] = o.m_Item_id;
    if(o.attributesIsSet())
        j["attributes"] = o.m_Attributes;
    if(o.updateMaskIsSet() || !o.m_Update_mask.empty())
        j["update_mask"] = o.m_Update_mask;
    
}

void from_json(const nlohmann::json& j, ItemUpdateBatchRecord& o)
{
    if(j.find("item_id") != j.end())
    {
        j.at("item_id").get_to(o.m_Item_id);
        o.m_Item_idIsSet = true;
    } 
    if(j.find("attributes") != j.end())
    {
        j.at("attributes").get_to(o.m_Attributes);
        o.m_AttributesIsSet = true;
    } 
    if(j.find("update_mask") != j.end())
    {
        j.at("update_mask").get_to(o.m_Update_mask);
        o.m_Update_maskIsSet = true;
    } 
    
}

std::string ItemUpdateBatchRecord::getItemId() const
{
    return m_Item_id;
}
void ItemUpdateBatchRecord::setItemId(std::string const& value)
{
    m_Item_id = value;
    m_Item_idIsSet = true;
}
bool ItemUpdateBatchRecord::itemIdIsSet() const
{
    return m_Item_idIsSet;
}
void ItemUpdateBatchRecord::unsetItem_id()
{
    m_Item_idIsSet = false;
}
org::openapitools::server::model::UpdatableItemAttributes ItemUpdateBatchRecord::getAttributes() const
{
    return m_Attributes;
}
void ItemUpdateBatchRecord::setAttributes(org::openapitools::server::model::UpdatableItemAttributes const& value)
{
    m_Attributes = value;
    m_AttributesIsSet = true;
}
bool ItemUpdateBatchRecord::attributesIsSet() const
{
    return m_AttributesIsSet;
}
void ItemUpdateBatchRecord::unsetAttributes()
{
    m_AttributesIsSet = false;
}
std::vector<org::openapitools::server::model::UpdateMaskFieldType> ItemUpdateBatchRecord::getUpdateMask() const
{
    return m_Update_mask;
}
void ItemUpdateBatchRecord::setUpdateMask(std::vector<org::openapitools::server::model::UpdateMaskFieldType> const& value)
{
    m_Update_mask = value;
    m_Update_maskIsSet = true;
}
bool ItemUpdateBatchRecord::updateMaskIsSet() const
{
    return m_Update_maskIsSet;
}
void ItemUpdateBatchRecord::unsetUpdate_mask()
{
    m_Update_maskIsSet = false;
}


} // namespace org::openapitools::server::model

