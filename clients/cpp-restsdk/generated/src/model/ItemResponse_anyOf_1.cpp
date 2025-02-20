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



#include "CppRestOpenAPIClient/model/ItemResponse_anyOf_1.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {


void ItemResponse_anyOf_1::validate()
{
    // TODO: implement validation
}

const ItemResponse_anyOf_1::VariantType& ItemResponse_anyOf_1::getVariant() const
{
    return m_variantValue;
}

void ItemResponse_anyOf_1::setVariant(ItemResponse_anyOf_1::VariantType value)
{
    m_variantValue = value;
}

web::json::value ItemResponse_anyOf_1::toJson() const
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

void ItemResponse_anyOf_1::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    std::visit([&](auto&& arg) {
        using T = std::decay_t<decltype(arg)>;
        if constexpr (!std::is_same_v<T, std::monostate>) {
          arg.toMultipart(multipart, prefix);
        }
    }, m_variantValue);
}

template bool ItemResponse_anyOf_1::fromJson<CatalogsCreativeAssetsItemErrorResponse>(const web::json::value& json);
template bool ItemResponse_anyOf_1::fromMultiPart<CatalogsCreativeAssetsItemErrorResponse>(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix);
template bool ItemResponse_anyOf_1::fromJson<CatalogsHotelItemErrorResponse>(const web::json::value& json);
template bool ItemResponse_anyOf_1::fromMultiPart<CatalogsHotelItemErrorResponse>(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix);
template bool ItemResponse_anyOf_1::fromJson<CatalogsRetailItemErrorResponse>(const web::json::value& json);
template bool ItemResponse_anyOf_1::fromMultiPart<CatalogsRetailItemErrorResponse>(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix);


}
}
}
}


