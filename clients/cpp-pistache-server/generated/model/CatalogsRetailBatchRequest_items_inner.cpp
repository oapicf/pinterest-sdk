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


#include "CatalogsRetailBatchRequest_items_inner.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

CatalogsRetailBatchRequest_items_inner::CatalogsRetailBatchRequest_items_inner()
{
    m_Item_id = "";
    m_Operation = "";
    m_Update_maskIsSet = false;
    
}

void CatalogsRetailBatchRequest_items_inner::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool CatalogsRetailBatchRequest_items_inner::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool CatalogsRetailBatchRequest_items_inner::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "CatalogsRetailBatchRequest_items_inner" : pathPrefix;

                
    if (!m_Attributes.validate(msg, _pathPrefix + ".attributes")) {
        msg << _pathPrefix << ": Attributes is invalid;";
        success = false;
    }     
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

bool CatalogsRetailBatchRequest_items_inner::operator==(const CatalogsRetailBatchRequest_items_inner& rhs) const
{
    return
    
    
    (getItemId() == rhs.getItemId())
     &&
    
    (getOperation() == rhs.getOperation())
     &&
    
    (getAttributes() == rhs.getAttributes())
     &&
    
    
    ((!updateMaskIsSet() && !rhs.updateMaskIsSet()) || (updateMaskIsSet() && rhs.updateMaskIsSet() && getUpdateMask() == rhs.getUpdateMask()))
    
    ;
}

bool CatalogsRetailBatchRequest_items_inner::operator!=(const CatalogsRetailBatchRequest_items_inner& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const CatalogsRetailBatchRequest_items_inner& o)
{
    j = nlohmann::json::object();
    j["item_id"] = o.m_Item_id;
    j["operation"] = o.m_Operation;
    j["attributes"] = o.m_Attributes;
    if(o.updateMaskIsSet() || !o.m_Update_mask.empty())
        j["update_mask"] = o.m_Update_mask;
    
}

void from_json(const nlohmann::json& j, CatalogsRetailBatchRequest_items_inner& o)
{
    j.at("item_id").get_to(o.m_Item_id);
    j.at("operation").get_to(o.m_Operation);
    j.at("attributes").get_to(o.m_Attributes);
    if(j.find("update_mask") != j.end())
    {
        j.at("update_mask").get_to(o.m_Update_mask);
        o.m_Update_maskIsSet = true;
    } 
    
}

std::string CatalogsRetailBatchRequest_items_inner::getItemId() const
{
    return m_Item_id;
}
void CatalogsRetailBatchRequest_items_inner::setItemId(std::string const& value)
{
    m_Item_id = value;
}
std::string CatalogsRetailBatchRequest_items_inner::getOperation() const
{
    return m_Operation;
}
void CatalogsRetailBatchRequest_items_inner::setOperation(std::string const& value)
{
    m_Operation = value;
}
org::openapitools::server::model::ItemAttributesRequest CatalogsRetailBatchRequest_items_inner::getAttributes() const
{
    return m_Attributes;
}
void CatalogsRetailBatchRequest_items_inner::setAttributes(org::openapitools::server::model::ItemAttributesRequest const& value)
{
    m_Attributes = value;
}
std::vector<org::openapitools::server::model::UpdateMaskFieldType> CatalogsRetailBatchRequest_items_inner::getUpdateMask() const
{
    return m_Update_mask;
}
void CatalogsRetailBatchRequest_items_inner::setUpdateMask(std::vector<org::openapitools::server::model::UpdateMaskFieldType> const& value)
{
    m_Update_mask = value;
    m_Update_maskIsSet = true;
}
bool CatalogsRetailBatchRequest_items_inner::updateMaskIsSet() const
{
    return m_Update_maskIsSet;
}
void CatalogsRetailBatchRequest_items_inner::unsetUpdate_mask()
{
    m_Update_maskIsSet = false;
}


} // namespace org::openapitools::server::model

