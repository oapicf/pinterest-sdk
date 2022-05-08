/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.3.0
* Contact: pinterest-api@pinterest.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/


#include "CatalogsItemsBatch.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

CatalogsItemsBatch::CatalogsItemsBatch()
{
    m_ItemsIsSet = false;
    m_Batch_id = "";
    m_Batch_idIsSet = false;
    m_Created_time = "";
    m_Created_timeIsSet = false;
    m_Completed_time = "";
    m_Completed_timeIsSet = false;
    m_StatusIsSet = false;
    
}

void CatalogsItemsBatch::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool CatalogsItemsBatch::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool CatalogsItemsBatch::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "CatalogsItemsBatch" : pathPrefix;

         
    if (itemsIsSet())
    {
        const std::vector<ItemProcessingRecord>& value = m_Items;
        const std::string currentValuePath = _pathPrefix + ".items";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const ItemProcessingRecord& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        success = value.validate(msg, currentValuePath + ".items") && success;
 
                i++;
            }
        }

    }
                    
    return success;
}

bool CatalogsItemsBatch::operator==(const CatalogsItemsBatch& rhs) const
{
    return
    
    
    
    ((!itemsIsSet() && !rhs.itemsIsSet()) || (itemsIsSet() && rhs.itemsIsSet() && getItems() == rhs.getItems())) &&
    
    
    ((!batchIdIsSet() && !rhs.batchIdIsSet()) || (batchIdIsSet() && rhs.batchIdIsSet() && getBatchId() == rhs.getBatchId())) &&
    
    
    ((!createdTimeIsSet() && !rhs.createdTimeIsSet()) || (createdTimeIsSet() && rhs.createdTimeIsSet() && getCreatedTime() == rhs.getCreatedTime())) &&
    
    
    ((!completedTimeIsSet() && !rhs.completedTimeIsSet()) || (completedTimeIsSet() && rhs.completedTimeIsSet() && getCompletedTime() == rhs.getCompletedTime())) &&
    
    
    ((!statusIsSet() && !rhs.statusIsSet()) || (statusIsSet() && rhs.statusIsSet() && getStatus() == rhs.getStatus()))
    
    ;
}

bool CatalogsItemsBatch::operator!=(const CatalogsItemsBatch& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const CatalogsItemsBatch& o)
{
    j = nlohmann::json();
    if(o.itemsIsSet() || !o.m_Items.empty())
        j["items"] = o.m_Items;
    if(o.batchIdIsSet())
        j["batch_id"] = o.m_Batch_id;
    if(o.createdTimeIsSet())
        j["created_time"] = o.m_Created_time;
    if(o.completedTimeIsSet())
        j["completed_time"] = o.m_Completed_time;
    if(o.statusIsSet())
        j["status"] = o.m_Status;
    
}

void from_json(const nlohmann::json& j, CatalogsItemsBatch& o)
{
    if(j.find("items") != j.end())
    {
        j.at("items").get_to(o.m_Items);
        o.m_ItemsIsSet = true;
    } 
    if(j.find("batch_id") != j.end())
    {
        j.at("batch_id").get_to(o.m_Batch_id);
        o.m_Batch_idIsSet = true;
    } 
    if(j.find("created_time") != j.end())
    {
        j.at("created_time").get_to(o.m_Created_time);
        o.m_Created_timeIsSet = true;
    } 
    if(j.find("completed_time") != j.end())
    {
        j.at("completed_time").get_to(o.m_Completed_time);
        o.m_Completed_timeIsSet = true;
    } 
    if(j.find("status") != j.end())
    {
        j.at("status").get_to(o.m_Status);
        o.m_StatusIsSet = true;
    } 
    
}

std::vector<ItemProcessingRecord> CatalogsItemsBatch::getItems() const
{
    return m_Items;
}
void CatalogsItemsBatch::setItems(std::vector<ItemProcessingRecord> const& value)
{
    m_Items = value;
    m_ItemsIsSet = true;
}
bool CatalogsItemsBatch::itemsIsSet() const
{
    return m_ItemsIsSet;
}
void CatalogsItemsBatch::unsetItems()
{
    m_ItemsIsSet = false;
}
std::string CatalogsItemsBatch::getBatchId() const
{
    return m_Batch_id;
}
void CatalogsItemsBatch::setBatchId(std::string const& value)
{
    m_Batch_id = value;
    m_Batch_idIsSet = true;
}
bool CatalogsItemsBatch::batchIdIsSet() const
{
    return m_Batch_idIsSet;
}
void CatalogsItemsBatch::unsetBatch_id()
{
    m_Batch_idIsSet = false;
}
std::string CatalogsItemsBatch::getCreatedTime() const
{
    return m_Created_time;
}
void CatalogsItemsBatch::setCreatedTime(std::string const& value)
{
    m_Created_time = value;
    m_Created_timeIsSet = true;
}
bool CatalogsItemsBatch::createdTimeIsSet() const
{
    return m_Created_timeIsSet;
}
void CatalogsItemsBatch::unsetCreated_time()
{
    m_Created_timeIsSet = false;
}
std::string CatalogsItemsBatch::getCompletedTime() const
{
    return m_Completed_time;
}
void CatalogsItemsBatch::setCompletedTime(std::string const& value)
{
    m_Completed_time = value;
    m_Completed_timeIsSet = true;
}
bool CatalogsItemsBatch::completedTimeIsSet() const
{
    return m_Completed_timeIsSet;
}
void CatalogsItemsBatch::unsetCompleted_time()
{
    m_Completed_timeIsSet = false;
}
BatchOperationStatus CatalogsItemsBatch::getStatus() const
{
    return m_Status;
}
void CatalogsItemsBatch::setStatus(BatchOperationStatus const& value)
{
    m_Status = value;
    m_StatusIsSet = true;
}
bool CatalogsItemsBatch::statusIsSet() const
{
    return m_StatusIsSet;
}
void CatalogsItemsBatch::unsetStatus()
{
    m_StatusIsSet = false;
}


} // namespace org::openapitools::server::model
