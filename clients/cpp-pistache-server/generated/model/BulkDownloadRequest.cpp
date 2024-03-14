/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.6.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/


#include "BulkDownloadRequest.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

BulkDownloadRequest::BulkDownloadRequest()
{
    m_Entity_typesIsSet = false;
    m_Entity_idsIsSet = false;
    m_Updated_since = "";
    m_Updated_sinceIsSet = false;
    m_Campaign_filterIsSet = false;
    m_Output_formatIsSet = false;
    
}

void BulkDownloadRequest::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool BulkDownloadRequest::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool BulkDownloadRequest::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "BulkDownloadRequest" : pathPrefix;

         
    if (entityTypesIsSet())
    {
        const std::vector<BulkEntityType>& value = m_Entity_types;
        const std::string currentValuePath = _pathPrefix + ".entityTypes";
                
        
        if (value.size() < 1)
        {
            success = false;
            msg << currentValuePath << ": must have at least 1 elements;";
        }
        if (value.size() > 5)
        {
            success = false;
            msg << currentValuePath << ": must have at most 5 elements;";
        }
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const org::openapitools::server::model::BulkEntityType& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        success = value.validate(msg, currentValuePath) && success;
        
        
 
                i++;
            }
        }

    }
         
    if (entityIdsIsSet())
    {
        const std::vector<std::string>& value = m_Entity_ids;
        const std::string currentValuePath = _pathPrefix + ".entityIds";
                
        
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
         
    if (updatedSinceIsSet())
    {
        const std::string& value = m_Updated_since;
        const std::string currentValuePath = _pathPrefix + ".updatedSince";
                
        

    }
            
    return success;
}

bool BulkDownloadRequest::operator==(const BulkDownloadRequest& rhs) const
{
    return
    
    
    
    ((!entityTypesIsSet() && !rhs.entityTypesIsSet()) || (entityTypesIsSet() && rhs.entityTypesIsSet() && getEntityTypes() == rhs.getEntityTypes())) &&
    
    
    ((!entityIdsIsSet() && !rhs.entityIdsIsSet()) || (entityIdsIsSet() && rhs.entityIdsIsSet() && getEntityIds() == rhs.getEntityIds())) &&
    
    
    ((!updatedSinceIsSet() && !rhs.updatedSinceIsSet()) || (updatedSinceIsSet() && rhs.updatedSinceIsSet() && getUpdatedSince() == rhs.getUpdatedSince())) &&
    
    
    ((!campaignFilterIsSet() && !rhs.campaignFilterIsSet()) || (campaignFilterIsSet() && rhs.campaignFilterIsSet() && getCampaignFilter() == rhs.getCampaignFilter())) &&
    
    
    ((!outputFormatIsSet() && !rhs.outputFormatIsSet()) || (outputFormatIsSet() && rhs.outputFormatIsSet() && getOutputFormat() == rhs.getOutputFormat()))
    
    ;
}

bool BulkDownloadRequest::operator!=(const BulkDownloadRequest& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const BulkDownloadRequest& o)
{
    j = nlohmann::json::object();
    if(o.entityTypesIsSet() || !o.m_Entity_types.empty())
        j["entity_types"] = o.m_Entity_types;
    if(o.entityIdsIsSet() || !o.m_Entity_ids.empty())
        j["entity_ids"] = o.m_Entity_ids;
    if(o.updatedSinceIsSet())
        j["updated_since"] = o.m_Updated_since;
    if(o.campaignFilterIsSet())
        j["campaign_filter"] = o.m_Campaign_filter;
    if(o.outputFormatIsSet())
        j["output_format"] = o.m_Output_format;
    
}

void from_json(const nlohmann::json& j, BulkDownloadRequest& o)
{
    if(j.find("entity_types") != j.end())
    {
        j.at("entity_types").get_to(o.m_Entity_types);
        o.m_Entity_typesIsSet = true;
    } 
    if(j.find("entity_ids") != j.end())
    {
        j.at("entity_ids").get_to(o.m_Entity_ids);
        o.m_Entity_idsIsSet = true;
    } 
    if(j.find("updated_since") != j.end())
    {
        j.at("updated_since").get_to(o.m_Updated_since);
        o.m_Updated_sinceIsSet = true;
    } 
    if(j.find("campaign_filter") != j.end())
    {
        j.at("campaign_filter").get_to(o.m_Campaign_filter);
        o.m_Campaign_filterIsSet = true;
    } 
    if(j.find("output_format") != j.end())
    {
        j.at("output_format").get_to(o.m_Output_format);
        o.m_Output_formatIsSet = true;
    } 
    
}

std::vector<BulkEntityType> BulkDownloadRequest::getEntityTypes() const
{
    return m_Entity_types;
}
void BulkDownloadRequest::setEntityTypes(std::vector<BulkEntityType> const& value)
{
    m_Entity_types = value;
    m_Entity_typesIsSet = true;
}
bool BulkDownloadRequest::entityTypesIsSet() const
{
    return m_Entity_typesIsSet;
}
void BulkDownloadRequest::unsetEntity_types()
{
    m_Entity_typesIsSet = false;
}
std::vector<std::string> BulkDownloadRequest::getEntityIds() const
{
    return m_Entity_ids;
}
void BulkDownloadRequest::setEntityIds(std::vector<std::string> const& value)
{
    m_Entity_ids = value;
    m_Entity_idsIsSet = true;
}
bool BulkDownloadRequest::entityIdsIsSet() const
{
    return m_Entity_idsIsSet;
}
void BulkDownloadRequest::unsetEntity_ids()
{
    m_Entity_idsIsSet = false;
}
std::string BulkDownloadRequest::getUpdatedSince() const
{
    return m_Updated_since;
}
void BulkDownloadRequest::setUpdatedSince(std::string const& value)
{
    m_Updated_since = value;
    m_Updated_sinceIsSet = true;
}
bool BulkDownloadRequest::updatedSinceIsSet() const
{
    return m_Updated_sinceIsSet;
}
void BulkDownloadRequest::unsetUpdated_since()
{
    m_Updated_sinceIsSet = false;
}
org::openapitools::server::model::BulkDownloadRequest_campaign_filter BulkDownloadRequest::getCampaignFilter() const
{
    return m_Campaign_filter;
}
void BulkDownloadRequest::setCampaignFilter(org::openapitools::server::model::BulkDownloadRequest_campaign_filter const& value)
{
    m_Campaign_filter = value;
    m_Campaign_filterIsSet = true;
}
bool BulkDownloadRequest::campaignFilterIsSet() const
{
    return m_Campaign_filterIsSet;
}
void BulkDownloadRequest::unsetCampaign_filter()
{
    m_Campaign_filterIsSet = false;
}
org::openapitools::server::model::BulkOutputFormat BulkDownloadRequest::getOutputFormat() const
{
    return m_Output_format;
}
void BulkDownloadRequest::setOutputFormat(org::openapitools::server::model::BulkOutputFormat const& value)
{
    m_Output_format = value;
    m_Output_formatIsSet = true;
}
bool BulkDownloadRequest::outputFormatIsSet() const
{
    return m_Output_formatIsSet;
}
void BulkDownloadRequest::unsetOutput_format()
{
    m_Output_formatIsSet = false;
}


} // namespace org::openapitools::server::model
