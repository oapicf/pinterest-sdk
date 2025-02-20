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



#include "CppRestOpenAPIClient/model/CatalogsProduct.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {


void CatalogsProduct::validate()
{
    // TODO: implement validation
}

const CatalogsProduct::VariantType& CatalogsProduct::getVariant() const
{
    return m_variantValue;
}

void CatalogsProduct::setVariant(CatalogsProduct::VariantType value)
{
    m_variantValue = value;
}

web::json::value CatalogsProduct::toJson() const
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

void CatalogsProduct::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    std::visit([&](auto&& arg) {
        using T = std::decay_t<decltype(arg)>;
        if constexpr (!std::is_same_v<T, std::monostate>) {
          arg.toMultipart(multipart, prefix);
        }
    }, m_variantValue);
}

template bool CatalogsProduct::fromJson<CatalogsCreativeAssetsProduct>(const web::json::value& json);
template bool CatalogsProduct::fromMultiPart<CatalogsCreativeAssetsProduct>(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix);
template bool CatalogsProduct::fromJson<CatalogsHotelProduct>(const web::json::value& json);
template bool CatalogsProduct::fromMultiPart<CatalogsHotelProduct>(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix);
template bool CatalogsProduct::fromJson<CatalogsRetailProduct>(const web::json::value& json);
template bool CatalogsProduct::fromMultiPart<CatalogsRetailProduct>(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix);


}
}
}
}


