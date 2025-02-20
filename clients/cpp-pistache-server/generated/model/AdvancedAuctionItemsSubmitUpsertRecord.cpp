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


#include "AdvancedAuctionItemsSubmitUpsertRecord.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

AdvancedAuctionItemsSubmitUpsertRecord::AdvancedAuctionItemsSubmitUpsertRecord()
{
    m_Item_id = "";
    
}

void AdvancedAuctionItemsSubmitUpsertRecord::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool AdvancedAuctionItemsSubmitUpsertRecord::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool AdvancedAuctionItemsSubmitUpsertRecord::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "AdvancedAuctionItemsSubmitUpsertRecord" : pathPrefix;

                    
    if (!m_Bid_options.validate(msg, _pathPrefix + ".bidOptions")) {
        msg << _pathPrefix << ": Bid_options is invalid;";
        success = false;
    }     
    
    /* Update_mask */ {
        const std::vector<org::openapitools::server::model::UpdateMaskBidOptionField>& value = m_Update_mask;
        const std::string currentValuePath = _pathPrefix + ".updateMask";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const org::openapitools::server::model::UpdateMaskBidOptionField& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        success = value.validate(msg, currentValuePath) && success;
        
        
 
                i++;
            }
        }

    }
    
    return success;
}

bool AdvancedAuctionItemsSubmitUpsertRecord::operator==(const AdvancedAuctionItemsSubmitUpsertRecord& rhs) const
{
    return
    
    
    (getItemId() == rhs.getItemId())
     &&
    
    (getCountry() == rhs.getCountry())
     &&
    
    (getLanguage() == rhs.getLanguage())
     &&
    
    (getBidOptions() == rhs.getBidOptions())
     &&
    
    (getUpdateMask() == rhs.getUpdateMask())
    
    
    ;
}

bool AdvancedAuctionItemsSubmitUpsertRecord::operator!=(const AdvancedAuctionItemsSubmitUpsertRecord& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const AdvancedAuctionItemsSubmitUpsertRecord& o)
{
    j = nlohmann::json::object();
    j["item_id"] = o.m_Item_id;
    j["country"] = o.m_Country;
    j["language"] = o.m_Language;
    j["bid_options"] = o.m_Bid_options;
    j["update_mask"] = o.m_Update_mask;
    
}

void from_json(const nlohmann::json& j, AdvancedAuctionItemsSubmitUpsertRecord& o)
{
    j.at("item_id").get_to(o.m_Item_id);
    j.at("country").get_to(o.m_Country);
    j.at("language").get_to(o.m_Language);
    j.at("bid_options").get_to(o.m_Bid_options);
    j.at("update_mask").get_to(o.m_Update_mask);
    
}

std::string AdvancedAuctionItemsSubmitUpsertRecord::getItemId() const
{
    return m_Item_id;
}
void AdvancedAuctionItemsSubmitUpsertRecord::setItemId(std::string const& value)
{
    m_Item_id = value;
}
org::openapitools::server::model::Country AdvancedAuctionItemsSubmitUpsertRecord::getCountry() const
{
    return m_Country;
}
void AdvancedAuctionItemsSubmitUpsertRecord::setCountry(org::openapitools::server::model::Country const& value)
{
    m_Country = value;
}
org::openapitools::server::model::Language AdvancedAuctionItemsSubmitUpsertRecord::getLanguage() const
{
    return m_Language;
}
void AdvancedAuctionItemsSubmitUpsertRecord::setLanguage(org::openapitools::server::model::Language const& value)
{
    m_Language = value;
}
org::openapitools::server::model::AdvancedAuctionBidOptions AdvancedAuctionItemsSubmitUpsertRecord::getBidOptions() const
{
    return m_Bid_options;
}
void AdvancedAuctionItemsSubmitUpsertRecord::setBidOptions(org::openapitools::server::model::AdvancedAuctionBidOptions const& value)
{
    m_Bid_options = value;
}
std::vector<org::openapitools::server::model::UpdateMaskBidOptionField> AdvancedAuctionItemsSubmitUpsertRecord::getUpdateMask() const
{
    return m_Update_mask;
}
void AdvancedAuctionItemsSubmitUpsertRecord::setUpdateMask(std::vector<org::openapitools::server::model::UpdateMaskBidOptionField> const& value)
{
    m_Update_mask = value;
}


} // namespace org::openapitools::server::model

