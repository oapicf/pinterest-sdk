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



#include "CppRestOpenAPIClient/model/MatchType.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {


namespace
{
using EnumUnderlyingType = utility::string_t;

MatchType::eMatchType toEnum(const EnumUnderlyingType& val)
{
    if (val == utility::conversions::to_string_t(U("BROAD")))
        return MatchType::eMatchType::MatchType_BROAD;
    if (val == utility::conversions::to_string_t(U("PHRASE")))
        return MatchType::eMatchType::MatchType_PHRASE;
    if (val == utility::conversions::to_string_t(U("EXACT")))
        return MatchType::eMatchType::MatchType_EXACT;
    if (val == utility::conversions::to_string_t(U("EXACT_NEGATIVE")))
        return MatchType::eMatchType::MatchType_EXACT_NEGATIVE;
    if (val == utility::conversions::to_string_t(U("PHRASE_NEGATIVE")))
        return MatchType::eMatchType::MatchType_PHRASE_NEGATIVE;
    return {};
}

EnumUnderlyingType fromEnum(MatchType::eMatchType e)
{
    switch (e)
    {
    case MatchType::eMatchType::MatchType_BROAD:
        return U("BROAD");
    case MatchType::eMatchType::MatchType_PHRASE:
        return U("PHRASE");
    case MatchType::eMatchType::MatchType_EXACT:
        return U("EXACT");
    case MatchType::eMatchType::MatchType_EXACT_NEGATIVE:
        return U("EXACT_NEGATIVE");
    case MatchType::eMatchType::MatchType_PHRASE_NEGATIVE:
        return U("PHRASE_NEGATIVE");
    default:
        break;
    }
    return {};
}
}

MatchType::MatchType()
{
}

MatchType::~MatchType()
{
}

void MatchType::validate()
{
    // TODO: implement validation
}

web::json::value MatchType::toJson() const
{
    auto val = fromEnum(m_value);
    return web::json::value(val);
}

bool MatchType::fromJson(const web::json::value& val)
{
    m_value = toEnum(val.as_string());
    return true;
}

void MatchType::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if (!namePrefix.empty() && namePrefix.back() != U('.'))
    {
        namePrefix.push_back(U('.'));
    }

    auto e = fromEnum(m_value);
    multipart->add(ModelBase::toHttpContent(namePrefix, e));
}

bool MatchType::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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

MatchType::eMatchType MatchType::getValue() const
{
   return m_value;
}

void MatchType::setValue(MatchType::eMatchType const value)
{
   m_value = value;
}


}
}
}
}


