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



#include "CppRestOpenAPIClient/model/PinMediaSource.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {


void PinMediaSource::validate()
{
    // TODO: implement validation
}

const PinMediaSource::VariantType& PinMediaSource::getVariant() const
{
    return m_variantValue;
}

void PinMediaSource::setVariant(PinMediaSource::VariantType value)
{
    m_variantValue = value;
}

web::json::value PinMediaSource::toJson() const
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

void PinMediaSource::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    std::visit([&](auto&& arg) {
        using T = std::decay_t<decltype(arg)>;
        if constexpr (!std::is_same_v<T, std::monostate>) {
          arg.toMultipart(multipart, prefix);
        }
    }, m_variantValue);
}

template bool PinMediaSource::fromJson<PinMediaSourceImageBase64>(const web::json::value& json);
template bool PinMediaSource::fromMultiPart<PinMediaSourceImageBase64>(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix);
template bool PinMediaSource::fromJson<PinMediaSourceImageURL>(const web::json::value& json);
template bool PinMediaSource::fromMultiPart<PinMediaSourceImageURL>(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix);
template bool PinMediaSource::fromJson<PinMediaSourceImagesBase64>(const web::json::value& json);
template bool PinMediaSource::fromMultiPart<PinMediaSourceImagesBase64>(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix);
template bool PinMediaSource::fromJson<PinMediaSourceImagesURL>(const web::json::value& json);
template bool PinMediaSource::fromMultiPart<PinMediaSourceImagesURL>(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix);
template bool PinMediaSource::fromJson<PinMediaSourcePinURL>(const web::json::value& json);
template bool PinMediaSource::fromMultiPart<PinMediaSourcePinURL>(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix);
template bool PinMediaSource::fromJson<PinMediaSourceVideoID>(const web::json::value& json);
template bool PinMediaSource::fromMultiPart<PinMediaSourceVideoID>(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix);


}
}
}
}


