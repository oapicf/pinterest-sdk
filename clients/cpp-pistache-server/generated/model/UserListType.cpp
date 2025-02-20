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


#include "UserListType.h"
#include "Helpers.h"
#include <stdexcept>
#include <sstream>

namespace org::openapitools::server::model
{

UserListType::UserListType()
{
    
}

void UserListType::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool UserListType::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool UserListType::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "UserListType" : pathPrefix;

    
    if (m_value == UserListType::eUserListType::INVALID_VALUE_OPENAPI_GENERATED)
    {
        success = false;
        msg << _pathPrefix << ": has no value;";
    }

    return success;
}

bool UserListType::operator==(const UserListType& rhs) const
{
    return
    getValue() == rhs.getValue()
    
    ;
}

bool UserListType::operator!=(const UserListType& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const UserListType& o)
{
    j = nlohmann::json::object();
    
    switch (o.getValue())
    {
        case UserListType::eUserListType::INVALID_VALUE_OPENAPI_GENERATED:
            j = "INVALID_VALUE_OPENAPI_GENERATED";
            break;
        case UserListType::eUserListType::EMAIL:
            j = "EMAIL";
            break;
        case UserListType::eUserListType::IDFA:
            j = "IDFA";
            break;
        case UserListType::eUserListType::MAID:
            j = "MAID";
            break;
        case UserListType::eUserListType::LR_ID:
            j = "LR_ID";
            break;
        case UserListType::eUserListType::DLX_ID:
            j = "DLX_ID";
            break;
        case UserListType::eUserListType::HASHED_PINNER_ID:
            j = "HASHED_PINNER_ID";
            break;
    }
}

void from_json(const nlohmann::json& j, UserListType& o)
{
    
    auto s = j.get<std::string>();
    if (s == "EMAIL") {
     o.setValue(UserListType::eUserListType::EMAIL);
    } 
    else if (s == "IDFA") {
     o.setValue(UserListType::eUserListType::IDFA);
    } 
    else if (s == "MAID") {
     o.setValue(UserListType::eUserListType::MAID);
    } 
    else if (s == "LR_ID") {
     o.setValue(UserListType::eUserListType::LR_ID);
    } 
    else if (s == "DLX_ID") {
     o.setValue(UserListType::eUserListType::DLX_ID);
    } 
    else if (s == "HASHED_PINNER_ID") {
     o.setValue(UserListType::eUserListType::HASHED_PINNER_ID);
    }  else {
     std::stringstream ss;
     ss << "Unexpected value " << s << " in json"
        << " cannot be converted to enum of type"
        << " UserListType::eUserListType";
     throw std::invalid_argument(ss.str());
    } 

}

UserListType::eUserListType UserListType::getValue() const
{
    return m_value;
}
void UserListType::setValue(UserListType::eUserListType value)
{
    m_value = value;
}

} // namespace org::openapitools::server::model

