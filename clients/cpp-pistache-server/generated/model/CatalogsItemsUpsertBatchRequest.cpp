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


#include "CatalogsItemsUpsertBatchRequest.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

CatalogsItemsUpsertBatchRequest::CatalogsItemsUpsertBatchRequest()
{
    
}

void CatalogsItemsUpsertBatchRequest::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool CatalogsItemsUpsertBatchRequest::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool CatalogsItemsUpsertBatchRequest::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "CatalogsItemsUpsertBatchRequest" : pathPrefix;

            
    if (!m_Language.validate(msg, _pathPrefix + ".language")) {
        msg << _pathPrefix << ": Language is invalid;";
        success = false;
    }         
    
    /* Items */ {
        const std::vector<org::openapitools::server::model::ItemUpsertBatchRecord>& value = m_Items;
        const std::string currentValuePath = _pathPrefix + ".items";
                
        
        if (value.size() < 1)
        {
            success = false;
            msg << currentValuePath << ": must have at least 1 elements;";
        }
        if (value.size() > 1000)
        {
            success = false;
            msg << currentValuePath << ": must have at most 1000 elements;";
        }
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const org::openapitools::server::model::ItemUpsertBatchRecord& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        success = value.validate(msg, currentValuePath + ".items") && success;
 
                i++;
            }
        }

    }
    
    return success;
}

bool CatalogsItemsUpsertBatchRequest::operator==(const CatalogsItemsUpsertBatchRequest& rhs) const
{
    return
    
    
    (getCountry() == rhs.getCountry())
     &&
    
    (getLanguage() == rhs.getLanguage())
     &&
    
    (getOperation() == rhs.getOperation())
     &&
    
    (getItems() == rhs.getItems())
    
    
    ;
}

bool CatalogsItemsUpsertBatchRequest::operator!=(const CatalogsItemsUpsertBatchRequest& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const CatalogsItemsUpsertBatchRequest& o)
{
    j = nlohmann::json::object();
    j["country"] = o.m_Country;
    j["language"] = o.m_Language;
    j["operation"] = o.m_Operation;
    j["items"] = o.m_Items;
    
}

void from_json(const nlohmann::json& j, CatalogsItemsUpsertBatchRequest& o)
{
    j.at("country").get_to(o.m_Country);
    j.at("language").get_to(o.m_Language);
    j.at("operation").get_to(o.m_Operation);
    j.at("items").get_to(o.m_Items);
    
}

org::openapitools::server::model::Country CatalogsItemsUpsertBatchRequest::getCountry() const
{
    return m_Country;
}
void CatalogsItemsUpsertBatchRequest::setCountry(org::openapitools::server::model::Country const& value)
{
    m_Country = value;
}
org::openapitools::server::model::CatalogsItemsRequest_language CatalogsItemsUpsertBatchRequest::getLanguage() const
{
    return m_Language;
}
void CatalogsItemsUpsertBatchRequest::setLanguage(org::openapitools::server::model::CatalogsItemsRequest_language const& value)
{
    m_Language = value;
}
org::openapitools::server::model::BatchOperation CatalogsItemsUpsertBatchRequest::getOperation() const
{
    return m_Operation;
}
void CatalogsItemsUpsertBatchRequest::setOperation(org::openapitools::server::model::BatchOperation const& value)
{
    m_Operation = value;
}
std::vector<org::openapitools::server::model::ItemUpsertBatchRecord> CatalogsItemsUpsertBatchRequest::getItems() const
{
    return m_Items;
}
void CatalogsItemsUpsertBatchRequest::setItems(std::vector<org::openapitools::server::model::ItemUpsertBatchRecord> const& value)
{
    m_Items = value;
}


} // namespace org::openapitools::server::model

