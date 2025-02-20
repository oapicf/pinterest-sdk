/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.9.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "CppRestOpenAPIClient/model/ItemAttributesRequest_allOf_image_link.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {


void ItemAttributesRequest_allOf_image_link::validate()
{
    // TODO: implement validation
}

const ItemAttributesRequest_allOf_image_link::VariantType& ItemAttributesRequest_allOf_image_link::getVariant() const
{
    return m_variantValue;
}

void ItemAttributesRequest_allOf_image_link::setVariant(ItemAttributesRequest_allOf_image_link::VariantType value)
{
    m_variantValue = value;
}

web::json::value ItemAttributesRequest_allOf_image_link::toJson() const
{
    web::json::value val = web::json::value::object();

    std::visit([&](auto&& arg) {
        using T = std::decay_t<decltype(arg)>;
        if constexpr (std::is_same_v<T, std::monostate>) {
            val = web::json::value::null();
        } else {
            val = arg.toJson();
        }
    }, m_variantValue);

    return val;
}

void ItemAttributesRequest_allOf_image_link::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    std::visit([&](auto&& arg) {
        using T = std::decay_t<decltype(arg)>;
        if constexpr (!std::is_same_v<T, std::monostate>) {
          arg.toMultipart(multipart, prefix);
        }
    }, m_variantValue);
}

template bool ItemAttributesRequest_allOf_image_link::fromJson<std::vector&lt;utility::string_t&gt;>(const web::json::value& json);
template bool ItemAttributesRequest_allOf_image_link::fromMultiPart<std::vector&lt;utility::string_t&gt;>(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix);
template bool ItemAttributesRequest_allOf_image_link::fromJson<utility::string_t>(const web::json::value& json);
template bool ItemAttributesRequest_allOf_image_link::fromMultiPart<utility::string_t>(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix);


}
}
}
}


