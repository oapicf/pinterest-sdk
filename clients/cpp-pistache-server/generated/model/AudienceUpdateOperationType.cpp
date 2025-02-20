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


#include "AudienceUpdateOperationType.h"
#include "Helpers.h"
#include <stdexcept>
#include <sstream>

namespace org::openapitools::server::model
{

AudienceUpdateOperationType::AudienceUpdateOperationType()
{
    
}

void AudienceUpdateOperationType::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool AudienceUpdateOperationType::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool AudienceUpdateOperationType::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "AudienceUpdateOperationType" : pathPrefix;

    
    if (m_value == AudienceUpdateOperationType::eAudienceUpdateOperationType::INVALID_VALUE_OPENAPI_GENERATED)
    {
        success = false;
        msg << _pathPrefix << ": has no value;";
    }

    return success;
}

bool AudienceUpdateOperationType::operator==(const AudienceUpdateOperationType& rhs) const
{
    return
    getValue() == rhs.getValue()
    
    ;
}

bool AudienceUpdateOperationType::operator!=(const AudienceUpdateOperationType& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const AudienceUpdateOperationType& o)
{
    j = nlohmann::json::object();
    
    switch (o.getValue())
    {
        case AudienceUpdateOperationType::eAudienceUpdateOperationType::INVALID_VALUE_OPENAPI_GENERATED:
            j = "INVALID_VALUE_OPENAPI_GENERATED";
            break;
        case AudienceUpdateOperationType::eAudienceUpdateOperationType::UPDATE:
            j = "UPDATE";
            break;
        case AudienceUpdateOperationType::eAudienceUpdateOperationType::REMOVE:
            j = "REMOVE";
            break;
    }
}

void from_json(const nlohmann::json& j, AudienceUpdateOperationType& o)
{
    
    auto s = j.get<std::string>();
    if (s == "UPDATE") {
     o.setValue(AudienceUpdateOperationType::eAudienceUpdateOperationType::UPDATE);
    } 
    else if (s == "REMOVE") {
     o.setValue(AudienceUpdateOperationType::eAudienceUpdateOperationType::REMOVE);
    }  else {
     std::stringstream ss;
     ss << "Unexpected value " << s << " in json"
        << " cannot be converted to enum of type"
        << " AudienceUpdateOperationType::eAudienceUpdateOperationType";
     throw std::invalid_argument(ss.str());
    } 

}

AudienceUpdateOperationType::eAudienceUpdateOperationType AudienceUpdateOperationType::getValue() const
{
    return m_value;
}
void AudienceUpdateOperationType::setValue(AudienceUpdateOperationType::eAudienceUpdateOperationType value)
{
    m_value = value;
}

} // namespace org::openapitools::server::model

