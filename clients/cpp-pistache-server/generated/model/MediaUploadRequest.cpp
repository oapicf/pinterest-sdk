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


#include "MediaUploadRequest.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

MediaUploadRequest::MediaUploadRequest()
{
    
}

void MediaUploadRequest::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool MediaUploadRequest::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool MediaUploadRequest::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "MediaUploadRequest" : pathPrefix;

        
    return success;
}

bool MediaUploadRequest::operator==(const MediaUploadRequest& rhs) const
{
    return
    
    
    (getMediaType() == rhs.getMediaType())
    
    
    ;
}

bool MediaUploadRequest::operator!=(const MediaUploadRequest& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const MediaUploadRequest& o)
{
    j = nlohmann::json::object();
    j["media_type"] = o.m_Media_type;
    
}

void from_json(const nlohmann::json& j, MediaUploadRequest& o)
{
    j.at("media_type").get_to(o.m_Media_type);
    
}

org::openapitools::server::model::MediaUploadType MediaUploadRequest::getMediaType() const
{
    return m_Media_type;
}
void MediaUploadRequest::setMediaType(org::openapitools::server::model::MediaUploadType const& value)
{
    m_Media_type = value;
}


} // namespace org::openapitools::server::model
