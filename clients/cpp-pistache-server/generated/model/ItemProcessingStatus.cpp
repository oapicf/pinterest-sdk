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


#include "ItemProcessingStatus.h"
#include "Helpers.h"
#include <stdexcept>
#include <sstream>

namespace org::openapitools::server::model
{

ItemProcessingStatus::ItemProcessingStatus()
{
    
}

void ItemProcessingStatus::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool ItemProcessingStatus::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool ItemProcessingStatus::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "ItemProcessingStatus" : pathPrefix;

    
    if (m_value == ItemProcessingStatus::eItemProcessingStatus::INVALID_VALUE_OPENAPI_GENERATED)
    {
        success = false;
        msg << _pathPrefix << ": has no value;";
    }

    return success;
}

bool ItemProcessingStatus::operator==(const ItemProcessingStatus& rhs) const
{
    return
    getValue() == rhs.getValue()
    
    ;
}

bool ItemProcessingStatus::operator!=(const ItemProcessingStatus& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const ItemProcessingStatus& o)
{
    j = nlohmann::json::object();
    
    switch (o.getValue())
    {
        case ItemProcessingStatus::eItemProcessingStatus::INVALID_VALUE_OPENAPI_GENERATED:
            j = "INVALID_VALUE_OPENAPI_GENERATED";
            break;
        case ItemProcessingStatus::eItemProcessingStatus::SUCCESS:
            j = "SUCCESS";
            break;
        case ItemProcessingStatus::eItemProcessingStatus::FAILURE:
            j = "FAILURE";
            break;
        case ItemProcessingStatus::eItemProcessingStatus::PROCESSING:
            j = "PROCESSING";
            break;
    }
}

void from_json(const nlohmann::json& j, ItemProcessingStatus& o)
{
    
    auto s = j.get<std::string>();
    if (s == "SUCCESS") {
     o.setValue(ItemProcessingStatus::eItemProcessingStatus::SUCCESS);
    } 
    else if (s == "FAILURE") {
     o.setValue(ItemProcessingStatus::eItemProcessingStatus::FAILURE);
    } 
    else if (s == "PROCESSING") {
     o.setValue(ItemProcessingStatus::eItemProcessingStatus::PROCESSING);
    }  else {
     std::stringstream ss;
     ss << "Unexpected value " << s << " in json"
        << " cannot be converted to enum of type"
        << " ItemProcessingStatus::eItemProcessingStatus";
     throw std::invalid_argument(ss.str());
    } 

}

ItemProcessingStatus::eItemProcessingStatus ItemProcessingStatus::getValue() const
{
    return m_value;
}
void ItemProcessingStatus::setValue(ItemProcessingStatus::eItemProcessingStatus value)
{
    m_value = value;
}

} // namespace org::openapitools::server::model

