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


#include "MediaUploadStatus.h"
#include "Helpers.h"
#include <stdexcept>
#include <sstream>

namespace org::openapitools::server::model
{

MediaUploadStatus::MediaUploadStatus()
{
    
}

void MediaUploadStatus::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool MediaUploadStatus::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool MediaUploadStatus::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "MediaUploadStatus" : pathPrefix;

    
    if (m_value == MediaUploadStatus::eMediaUploadStatus::INVALID_VALUE_OPENAPI_GENERATED)
    {
        success = false;
        msg << _pathPrefix << ": has no value;";
    }

    return success;
}

bool MediaUploadStatus::operator==(const MediaUploadStatus& rhs) const
{
    return
    getValue() == rhs.getValue()
    
    ;
}

bool MediaUploadStatus::operator!=(const MediaUploadStatus& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const MediaUploadStatus& o)
{
    j = nlohmann::json::object();
    
    switch (o.getValue())
    {
        case MediaUploadStatus::eMediaUploadStatus::INVALID_VALUE_OPENAPI_GENERATED:
            j = "INVALID_VALUE_OPENAPI_GENERATED";
            break;
        case MediaUploadStatus::eMediaUploadStatus::REGISTERED:
            j = "registered";
            break;
        case MediaUploadStatus::eMediaUploadStatus::PROCESSING:
            j = "processing";
            break;
        case MediaUploadStatus::eMediaUploadStatus::SUCCEEDED:
            j = "succeeded";
            break;
        case MediaUploadStatus::eMediaUploadStatus::FAILED:
            j = "failed";
            break;
    }
}

void from_json(const nlohmann::json& j, MediaUploadStatus& o)
{
    
    auto s = j.get<std::string>();
    if (s == "registered") {
     o.setValue(MediaUploadStatus::eMediaUploadStatus::REGISTERED);
    } 
    else if (s == "processing") {
     o.setValue(MediaUploadStatus::eMediaUploadStatus::PROCESSING);
    } 
    else if (s == "succeeded") {
     o.setValue(MediaUploadStatus::eMediaUploadStatus::SUCCEEDED);
    } 
    else if (s == "failed") {
     o.setValue(MediaUploadStatus::eMediaUploadStatus::FAILED);
    }  else {
     std::stringstream ss;
     ss << "Unexpected value " << s << " in json"
        << " cannot be converted to enum of type"
        << " MediaUploadStatus::eMediaUploadStatus";
     throw std::invalid_argument(ss.str());
    } 

}

MediaUploadStatus::eMediaUploadStatus MediaUploadStatus::getValue() const
{
    return m_value;
}
void MediaUploadStatus::setValue(MediaUploadStatus::eMediaUploadStatus value)
{
    m_value = value;
}

} // namespace org::openapitools::server::model

