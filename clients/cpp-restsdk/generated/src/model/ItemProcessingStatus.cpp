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



#include "CppRestOpenAPIClient/model/ItemProcessingStatus.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {


namespace
{
using EnumUnderlyingType = utility::string_t;

ItemProcessingStatus::eItemProcessingStatus toEnum(const EnumUnderlyingType& val)
{
    if (val == utility::conversions::to_string_t(U("SUCCESS")))
        return ItemProcessingStatus::eItemProcessingStatus::ItemProcessingStatus_SUCCESS;
    if (val == utility::conversions::to_string_t(U("FAILURE")))
        return ItemProcessingStatus::eItemProcessingStatus::ItemProcessingStatus_FAILURE;
    if (val == utility::conversions::to_string_t(U("PROCESSING")))
        return ItemProcessingStatus::eItemProcessingStatus::ItemProcessingStatus_PROCESSING;
    return {};
}

EnumUnderlyingType fromEnum(ItemProcessingStatus::eItemProcessingStatus e)
{
    switch (e)
    {
    case ItemProcessingStatus::eItemProcessingStatus::ItemProcessingStatus_SUCCESS:
        return U("SUCCESS");
    case ItemProcessingStatus::eItemProcessingStatus::ItemProcessingStatus_FAILURE:
        return U("FAILURE");
    case ItemProcessingStatus::eItemProcessingStatus::ItemProcessingStatus_PROCESSING:
        return U("PROCESSING");
    default:
        break;
    }
    return {};
}
}

ItemProcessingStatus::ItemProcessingStatus()
{
}

ItemProcessingStatus::~ItemProcessingStatus()
{
}

void ItemProcessingStatus::validate()
{
    // TODO: implement validation
}

web::json::value ItemProcessingStatus::toJson() const
{
    auto val = fromEnum(m_value);
    return web::json::value(val);
}

bool ItemProcessingStatus::fromJson(const web::json::value& val)
{
    m_value = toEnum(val.as_string());
    return true;
}

void ItemProcessingStatus::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if (!namePrefix.empty() && namePrefix.back() != U('.'))
    {
        namePrefix.push_back(U('.'));
    }

    auto e = fromEnum(m_value);
    multipart->add(ModelBase::toHttpContent(namePrefix, e));
}

bool ItemProcessingStatus::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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

ItemProcessingStatus::eItemProcessingStatus ItemProcessingStatus::getValue() const
{
   return m_value;
}

void ItemProcessingStatus::setValue(ItemProcessingStatus::eItemProcessingStatus const value)
{
   m_value = value;
}


}
}
}
}


