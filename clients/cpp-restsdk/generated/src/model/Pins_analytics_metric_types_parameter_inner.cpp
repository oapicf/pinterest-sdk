/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.4.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "CppRestOpenAPIClient/model/Pins_analytics_metric_types_parameter_inner.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



Pins_analytics_metric_types_parameter_inner::Pins_analytics_metric_types_parameter_inner()
{
}

Pins_analytics_metric_types_parameter_inner::~Pins_analytics_metric_types_parameter_inner()
{
}

void Pins_analytics_metric_types_parameter_inner::validate()
{
    // TODO: implement validation
}

web::json::value Pins_analytics_metric_types_parameter_inner::toJson() const
{

    web::json::value val = web::json::value::object();
    

    return val;
}

bool Pins_analytics_metric_types_parameter_inner::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    return ok;
}

void Pins_analytics_metric_types_parameter_inner::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
}

bool Pins_analytics_metric_types_parameter_inner::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    return ok;
}

}
}
}
}

