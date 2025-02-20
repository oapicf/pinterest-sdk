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


#include "AudienceCreateRequest_1_audience_type.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

AudienceCreateRequest_1_audience_type::AudienceCreateRequest_1_audience_type()
{
    
}

void AudienceCreateRequest_1_audience_type::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool AudienceCreateRequest_1_audience_type::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool AudienceCreateRequest_1_audience_type::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "AudienceCreateRequest_1_audience_type" : pathPrefix;

    
    return success;
}

bool AudienceCreateRequest_1_audience_type::operator==(const AudienceCreateRequest_1_audience_type& rhs) const
{
    return
    
    
    ;
}

bool AudienceCreateRequest_1_audience_type::operator!=(const AudienceCreateRequest_1_audience_type& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const AudienceCreateRequest_1_audience_type& o)
{
    j = nlohmann::json::object();
    
}

void from_json(const nlohmann::json& j, AudienceCreateRequest_1_audience_type& o)
{
    
}



} // namespace org::openapitools::server::model

