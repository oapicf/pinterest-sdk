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


#include "BulkOutputFormat.h"
#include "Helpers.h"
#include <stdexcept>
#include <sstream>

namespace org::openapitools::server::model
{

BulkOutputFormat::BulkOutputFormat()
{
    
}

void BulkOutputFormat::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool BulkOutputFormat::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool BulkOutputFormat::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "BulkOutputFormat" : pathPrefix;

    
    if (m_value == BulkOutputFormat::eBulkOutputFormat::INVALID_VALUE_OPENAPI_GENERATED)
    {
        success = false;
        msg << _pathPrefix << ": has no value;";
    }

    return success;
}

bool BulkOutputFormat::operator==(const BulkOutputFormat& rhs) const
{
    return
    getValue() == rhs.getValue()
    
    ;
}

bool BulkOutputFormat::operator!=(const BulkOutputFormat& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const BulkOutputFormat& o)
{
    j = nlohmann::json::object();
    
    switch (o.getValue())
    {
        case BulkOutputFormat::eBulkOutputFormat::INVALID_VALUE_OPENAPI_GENERATED:
            j = "INVALID_VALUE_OPENAPI_GENERATED";
            break;
        case BulkOutputFormat::eBulkOutputFormat::CSV:
            j = "CSV";
            break;
        case BulkOutputFormat::eBulkOutputFormat::JSON:
            j = "JSON";
            break;
    }
}

void from_json(const nlohmann::json& j, BulkOutputFormat& o)
{
    
    auto s = j.get<std::string>();
    if (s == "CSV") {
     o.setValue(BulkOutputFormat::eBulkOutputFormat::CSV);
    } 
    else if (s == "JSON") {
     o.setValue(BulkOutputFormat::eBulkOutputFormat::JSON);
    }  else {
     std::stringstream ss;
     ss << "Unexpected value " << s << " in json"
        << " cannot be converted to enum of type"
        << " BulkOutputFormat::eBulkOutputFormat";
     throw std::invalid_argument(ss.str());
    } 

}

BulkOutputFormat::eBulkOutputFormat BulkOutputFormat::getValue() const
{
    return m_value;
}
void BulkOutputFormat::setValue(BulkOutputFormat::eBulkOutputFormat value)
{
    m_value = value;
}

} // namespace org::openapitools::server::model

