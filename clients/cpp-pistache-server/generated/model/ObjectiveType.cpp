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


#include "ObjectiveType.h"
#include "Helpers.h"
#include <stdexcept>
#include <sstream>

namespace org::openapitools::server::model
{

ObjectiveType::ObjectiveType()
{
    
}

void ObjectiveType::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool ObjectiveType::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool ObjectiveType::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "ObjectiveType" : pathPrefix;

    
    if (m_value == ObjectiveType::eObjectiveType::INVALID_VALUE_OPENAPI_GENERATED)
    {
        success = false;
        msg << _pathPrefix << ": has no value;";
    }

    return success;
}

bool ObjectiveType::operator==(const ObjectiveType& rhs) const
{
    return
    getValue() == rhs.getValue()
    
    ;
}

bool ObjectiveType::operator!=(const ObjectiveType& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const ObjectiveType& o)
{
    j = nlohmann::json::object();
    
    switch (o.getValue())
    {
        case ObjectiveType::eObjectiveType::INVALID_VALUE_OPENAPI_GENERATED:
            j = "INVALID_VALUE_OPENAPI_GENERATED";
            break;
        case ObjectiveType::eObjectiveType::AWARENESS:
            j = "AWARENESS";
            break;
        case ObjectiveType::eObjectiveType::CONSIDERATION:
            j = "CONSIDERATION";
            break;
        case ObjectiveType::eObjectiveType::VIDEO_VIEW:
            j = "VIDEO_VIEW";
            break;
        case ObjectiveType::eObjectiveType::WEB_CONVERSION:
            j = "WEB_CONVERSION";
            break;
        case ObjectiveType::eObjectiveType::CATALOG_SALES:
            j = "CATALOG_SALES";
            break;
        case ObjectiveType::eObjectiveType::WEB_SESSIONS:
            j = "WEB_SESSIONS";
            break;
        case ObjectiveType::eObjectiveType::VIDEO_COMPLETION:
            j = "VIDEO_COMPLETION";
            break;
    }
}

void from_json(const nlohmann::json& j, ObjectiveType& o)
{
    
    auto s = j.get<std::string>();
    if (s == "AWARENESS") {
     o.setValue(ObjectiveType::eObjectiveType::AWARENESS);
    } 
    else if (s == "CONSIDERATION") {
     o.setValue(ObjectiveType::eObjectiveType::CONSIDERATION);
    } 
    else if (s == "VIDEO_VIEW") {
     o.setValue(ObjectiveType::eObjectiveType::VIDEO_VIEW);
    } 
    else if (s == "WEB_CONVERSION") {
     o.setValue(ObjectiveType::eObjectiveType::WEB_CONVERSION);
    } 
    else if (s == "CATALOG_SALES") {
     o.setValue(ObjectiveType::eObjectiveType::CATALOG_SALES);
    } 
    else if (s == "WEB_SESSIONS") {
     o.setValue(ObjectiveType::eObjectiveType::WEB_SESSIONS);
    } 
    else if (s == "VIDEO_COMPLETION") {
     o.setValue(ObjectiveType::eObjectiveType::VIDEO_COMPLETION);
    }  else {
     std::stringstream ss;
     ss << "Unexpected value " << s << " in json"
        << " cannot be converted to enum of type"
        << " ObjectiveType::eObjectiveType";
     throw std::invalid_argument(ss.str());
    } 

}

ObjectiveType::eObjectiveType ObjectiveType::getValue() const
{
    return m_value;
}
void ObjectiveType::setValue(ObjectiveType::eObjectiveType value)
{
    m_value = value;
}

} // namespace org::openapitools::server::model

