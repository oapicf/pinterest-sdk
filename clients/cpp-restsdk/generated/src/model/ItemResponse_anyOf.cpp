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



#include "CppRestOpenAPIClient/model/ItemResponse_anyOf.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {


void ItemResponse_anyOf::validate()
{
    // TODO: implement validation
}

const ItemResponse_anyOf::VariantType& ItemResponse_anyOf::getVariant() const
{
    return m_variantValue;
}

void ItemResponse_anyOf::setVariant(ItemResponse_anyOf::VariantType value)
{
    m_variantValue = value;
}

web::json::value ItemResponse_anyOf::toJson() const
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

void ItemResponse_anyOf::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    std::visit([&](auto&& arg) {
        using T = std::decay_t<decltype(arg)>;
        if constexpr (!std::is_same_v<T, std::monostate>) {
          arg.toMultipart(multipart, prefix);
        }
    }, m_variantValue);
}

template bool ItemResponse_anyOf::fromJson<CatalogsCreativeAssetsItemResponse>(const web::json::value& json);
template bool ItemResponse_anyOf::fromMultiPart<CatalogsCreativeAssetsItemResponse>(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix);
template bool ItemResponse_anyOf::fromJson<CatalogsHotelItemResponse>(const web::json::value& json);
template bool ItemResponse_anyOf::fromMultiPart<CatalogsHotelItemResponse>(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix);
template bool ItemResponse_anyOf::fromJson<CatalogsRetailItemResponse>(const web::json::value& json);
template bool ItemResponse_anyOf::fromMultiPart<CatalogsRetailItemResponse>(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix);


}
}
}
}


