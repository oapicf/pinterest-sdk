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



#include "CppRestOpenAPIClient/model/BulkEntityType.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {


namespace
{
using EnumUnderlyingType = utility::string_t;

BulkEntityType::eBulkEntityType toEnum(const EnumUnderlyingType& val)
{
    if (val == utility::conversions::to_string_t(U("CAMPAIGN")))
        return BulkEntityType::eBulkEntityType::BulkEntityType_CAMPAIGN;
    if (val == utility::conversions::to_string_t(U("AD_GROUP")))
        return BulkEntityType::eBulkEntityType::BulkEntityType_AD_GROUP;
    if (val == utility::conversions::to_string_t(U("PRODUCT_GROUP")))
        return BulkEntityType::eBulkEntityType::BulkEntityType_PRODUCT_GROUP;
    if (val == utility::conversions::to_string_t(U("AD")))
        return BulkEntityType::eBulkEntityType::BulkEntityType_AD;
    if (val == utility::conversions::to_string_t(U("KEYWORD")))
        return BulkEntityType::eBulkEntityType::BulkEntityType_KEYWORD;
    return {};
}

EnumUnderlyingType fromEnum(BulkEntityType::eBulkEntityType e)
{
    switch (e)
    {
    case BulkEntityType::eBulkEntityType::BulkEntityType_CAMPAIGN:
        return U("CAMPAIGN");
    case BulkEntityType::eBulkEntityType::BulkEntityType_AD_GROUP:
        return U("AD_GROUP");
    case BulkEntityType::eBulkEntityType::BulkEntityType_PRODUCT_GROUP:
        return U("PRODUCT_GROUP");
    case BulkEntityType::eBulkEntityType::BulkEntityType_AD:
        return U("AD");
    case BulkEntityType::eBulkEntityType::BulkEntityType_KEYWORD:
        return U("KEYWORD");
    default:
        break;
    }
    return {};
}
}

BulkEntityType::BulkEntityType()
{
}

BulkEntityType::~BulkEntityType()
{
}

void BulkEntityType::validate()
{
    // TODO: implement validation
}

web::json::value BulkEntityType::toJson() const
{
    auto val = fromEnum(m_value);
    return web::json::value(val);
}

bool BulkEntityType::fromJson(const web::json::value& val)
{
    m_value = toEnum(val.as_string());
    return true;
}

void BulkEntityType::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if (!namePrefix.empty() && namePrefix.back() != U('.'))
    {
        namePrefix.push_back(U('.'));
    }

    auto e = fromEnum(m_value);
    multipart->add(ModelBase::toHttpContent(namePrefix, e));
}

bool BulkEntityType::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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

BulkEntityType::eBulkEntityType BulkEntityType::getValue() const
{
   return m_value;
}

void BulkEntityType::setValue(BulkEntityType::eBulkEntityType const value)
{
   m_value = value;
}


}
}
}
}


