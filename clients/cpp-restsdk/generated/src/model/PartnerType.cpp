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



#include "CppRestOpenAPIClient/model/PartnerType.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {


namespace
{
using EnumUnderlyingType = utility::string_t;

PartnerType::ePartnerType toEnum(const EnumUnderlyingType& val)
{
    if (val == utility::conversions::to_string_t(U("INTERNAL")))
        return PartnerType::ePartnerType::PartnerType_INTERNAL;
    if (val == utility::conversions::to_string_t(U("EXTERNAL")))
        return PartnerType::ePartnerType::PartnerType_EXTERNAL;
    return {};
}

EnumUnderlyingType fromEnum(PartnerType::ePartnerType e)
{
    switch (e)
    {
    case PartnerType::ePartnerType::PartnerType_INTERNAL:
        return U("INTERNAL");
    case PartnerType::ePartnerType::PartnerType_EXTERNAL:
        return U("EXTERNAL");
    default:
        break;
    }
    return {};
}
}

PartnerType::PartnerType()
{
}

PartnerType::~PartnerType()
{
}

void PartnerType::validate()
{
    // TODO: implement validation
}

web::json::value PartnerType::toJson() const
{
    auto val = fromEnum(m_value);
    return web::json::value(val);
}

bool PartnerType::fromJson(const web::json::value& val)
{
    m_value = toEnum(val.as_string());
    return true;
}

void PartnerType::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if (!namePrefix.empty() && namePrefix.back() != U('.'))
    {
        namePrefix.push_back(U('.'));
    }

    auto e = fromEnum(m_value);
    multipart->add(ModelBase::toHttpContent(namePrefix, e));
}

bool PartnerType::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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

PartnerType::ePartnerType PartnerType::getValue() const
{
   return m_value;
}

void PartnerType::setValue(PartnerType::ePartnerType const value)
{
   m_value = value;
}


}
}
}
}


