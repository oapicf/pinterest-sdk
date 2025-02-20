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


#include "TrendType.h"
#include "Helpers.h"
#include <stdexcept>
#include <sstream>

namespace org::openapitools::server::model
{

TrendType::TrendType()
{
    
}

void TrendType::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool TrendType::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool TrendType::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "TrendType" : pathPrefix;

    
    if (m_value == TrendType::eTrendType::INVALID_VALUE_OPENAPI_GENERATED)
    {
        success = false;
        msg << _pathPrefix << ": has no value;";
    }

    return success;
}

bool TrendType::operator==(const TrendType& rhs) const
{
    return
    getValue() == rhs.getValue()
    
    ;
}

bool TrendType::operator!=(const TrendType& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const TrendType& o)
{
    j = nlohmann::json::object();
    
    switch (o.getValue())
    {
        case TrendType::eTrendType::INVALID_VALUE_OPENAPI_GENERATED:
            j = "INVALID_VALUE_OPENAPI_GENERATED";
            break;
        case TrendType::eTrendType::GROWING:
            j = "growing";
            break;
        case TrendType::eTrendType::MONTHLY:
            j = "monthly";
            break;
        case TrendType::eTrendType::YEARLY:
            j = "yearly";
            break;
        case TrendType::eTrendType::SEASONAL:
            j = "seasonal";
            break;
    }
}

void from_json(const nlohmann::json& j, TrendType& o)
{
    
    auto s = j.get<std::string>();
    if (s == "growing") {
     o.setValue(TrendType::eTrendType::GROWING);
    } 
    else if (s == "monthly") {
     o.setValue(TrendType::eTrendType::MONTHLY);
    } 
    else if (s == "yearly") {
     o.setValue(TrendType::eTrendType::YEARLY);
    } 
    else if (s == "seasonal") {
     o.setValue(TrendType::eTrendType::SEASONAL);
    }  else {
     std::stringstream ss;
     ss << "Unexpected value " << s << " in json"
        << " cannot be converted to enum of type"
        << " TrendType::eTrendType";
     throw std::invalid_argument(ss.str());
    } 

}

TrendType::eTrendType TrendType::getValue() const
{
    return m_value;
}
void TrendType::setValue(TrendType::eTrendType value)
{
    m_value = value;
}

} // namespace org::openapitools::server::model

