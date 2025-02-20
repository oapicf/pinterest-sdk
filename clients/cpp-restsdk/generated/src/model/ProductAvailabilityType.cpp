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



#include "CppRestOpenAPIClient/model/ProductAvailabilityType.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {


namespace
{
using EnumUnderlyingType = utility::string_t;

ProductAvailabilityType::eProductAvailabilityType toEnum(const EnumUnderlyingType& val)
{
    if (val == utility::conversions::to_string_t(U("IN_STOCK")))
        return ProductAvailabilityType::eProductAvailabilityType::ProductAvailabilityType_IN_STOCK;
    if (val == utility::conversions::to_string_t(U("OUT_OF_STOCK")))
        return ProductAvailabilityType::eProductAvailabilityType::ProductAvailabilityType_OUT_OF_STOCK;
    if (val == utility::conversions::to_string_t(U("PREORDER")))
        return ProductAvailabilityType::eProductAvailabilityType::ProductAvailabilityType_PREORDER;
    return {};
}

EnumUnderlyingType fromEnum(ProductAvailabilityType::eProductAvailabilityType e)
{
    switch (e)
    {
    case ProductAvailabilityType::eProductAvailabilityType::ProductAvailabilityType_IN_STOCK:
        return U("IN_STOCK");
    case ProductAvailabilityType::eProductAvailabilityType::ProductAvailabilityType_OUT_OF_STOCK:
        return U("OUT_OF_STOCK");
    case ProductAvailabilityType::eProductAvailabilityType::ProductAvailabilityType_PREORDER:
        return U("PREORDER");
    default:
        break;
    }
    return {};
}
}

ProductAvailabilityType::ProductAvailabilityType()
{
}

ProductAvailabilityType::~ProductAvailabilityType()
{
}

void ProductAvailabilityType::validate()
{
    // TODO: implement validation
}

web::json::value ProductAvailabilityType::toJson() const
{
    auto val = fromEnum(m_value);
    return web::json::value(val);
}

bool ProductAvailabilityType::fromJson(const web::json::value& val)
{
    m_value = toEnum(val.as_string());
    return true;
}

void ProductAvailabilityType::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if (!namePrefix.empty() && namePrefix.back() != U('.'))
    {
        namePrefix.push_back(U('.'));
    }

    auto e = fromEnum(m_value);
    multipart->add(ModelBase::toHttpContent(namePrefix, e));
}

bool ProductAvailabilityType::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if (!namePrefix.empty() && namePrefix.back() != U('.'))
    {
        namePrefix.push_back(U('.'));
    }
    {
        EnumUnderlyingType e;
        ok = ModelBase::fromHttpContent(multipart->getContent(namePrefix), e);
        if (ok)
        {
            auto v = toEnum(e);
            setValue(v);
        }
    }
    return ok;
}

ProductAvailabilityType::eProductAvailabilityType ProductAvailabilityType::getValue() const
{
   return m_value;
}

void ProductAvailabilityType::setValue(ProductAvailabilityType::eProductAvailabilityType const value)
{
   m_value = value;
}


}
}
}
}


