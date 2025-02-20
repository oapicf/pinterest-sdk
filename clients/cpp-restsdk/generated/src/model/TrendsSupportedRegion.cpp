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



#include "CppRestOpenAPIClient/model/TrendsSupportedRegion.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {


namespace
{
using EnumUnderlyingType = utility::string_t;

TrendsSupportedRegion::eTrendsSupportedRegion toEnum(const EnumUnderlyingType& val)
{
    if (val == utility::conversions::to_string_t(U("US")))
        return TrendsSupportedRegion::eTrendsSupportedRegion::TrendsSupportedRegion_US;
    if (val == utility::conversions::to_string_t(U("CA")))
        return TrendsSupportedRegion::eTrendsSupportedRegion::TrendsSupportedRegion_CA;
    if (val == utility::conversions::to_string_t(U("DE")))
        return TrendsSupportedRegion::eTrendsSupportedRegion::TrendsSupportedRegion_DE;
    if (val == utility::conversions::to_string_t(U("FR")))
        return TrendsSupportedRegion::eTrendsSupportedRegion::TrendsSupportedRegion_FR;
    if (val == utility::conversions::to_string_t(U("ES")))
        return TrendsSupportedRegion::eTrendsSupportedRegion::TrendsSupportedRegion_ES;
    if (val == utility::conversions::to_string_t(U("IT")))
        return TrendsSupportedRegion::eTrendsSupportedRegion::TrendsSupportedRegion_IT;
    if (val == utility::conversions::to_string_t(U("DE+AT+CH")))
        return TrendsSupportedRegion::eTrendsSupportedRegion::TrendsSupportedRegion_DE_AT_CH;
    if (val == utility::conversions::to_string_t(U("GB+IE")))
        return TrendsSupportedRegion::eTrendsSupportedRegion::TrendsSupportedRegion_GB_IE;
    if (val == utility::conversions::to_string_t(U("IT+ES+PT+GR+MT")))
        return TrendsSupportedRegion::eTrendsSupportedRegion::TrendsSupportedRegion_IT_ES_PT_GR_MT;
    if (val == utility::conversions::to_string_t(U("PL+RO+HU+SK+CZ")))
        return TrendsSupportedRegion::eTrendsSupportedRegion::TrendsSupportedRegion_PL_RO_HU_SK_CZ;
    if (val == utility::conversions::to_string_t(U("SE+DK+FI+NO")))
        return TrendsSupportedRegion::eTrendsSupportedRegion::TrendsSupportedRegion_SE_DK_FI_NO;
    if (val == utility::conversions::to_string_t(U("NL+BE+LU")))
        return TrendsSupportedRegion::eTrendsSupportedRegion::TrendsSupportedRegion_NL_BE_LU;
    if (val == utility::conversions::to_string_t(U("AR")))
        return TrendsSupportedRegion::eTrendsSupportedRegion::TrendsSupportedRegion_AR;
    if (val == utility::conversions::to_string_t(U("BR")))
        return TrendsSupportedRegion::eTrendsSupportedRegion::TrendsSupportedRegion_BR;
    if (val == utility::conversions::to_string_t(U("CO")))
        return TrendsSupportedRegion::eTrendsSupportedRegion::TrendsSupportedRegion_CO;
    if (val == utility::conversions::to_string_t(U("MX")))
        return TrendsSupportedRegion::eTrendsSupportedRegion::TrendsSupportedRegion_MX;
    if (val == utility::conversions::to_string_t(U("MX+AR+CO+CL")))
        return TrendsSupportedRegion::eTrendsSupportedRegion::TrendsSupportedRegion_MX_AR_CO_CL;
    if (val == utility::conversions::to_string_t(U("AU+NZ")))
        return TrendsSupportedRegion::eTrendsSupportedRegion::TrendsSupportedRegion_AU_NZ;
    return {};
}

EnumUnderlyingType fromEnum(TrendsSupportedRegion::eTrendsSupportedRegion e)
{
    switch (e)
    {
    case TrendsSupportedRegion::eTrendsSupportedRegion::TrendsSupportedRegion_US:
        return U("US");
    case TrendsSupportedRegion::eTrendsSupportedRegion::TrendsSupportedRegion_CA:
        return U("CA");
    case TrendsSupportedRegion::eTrendsSupportedRegion::TrendsSupportedRegion_DE:
        return U("DE");
    case TrendsSupportedRegion::eTrendsSupportedRegion::TrendsSupportedRegion_FR:
        return U("FR");
    case TrendsSupportedRegion::eTrendsSupportedRegion::TrendsSupportedRegion_ES:
        return U("ES");
    case TrendsSupportedRegion::eTrendsSupportedRegion::TrendsSupportedRegion_IT:
        return U("IT");
    case TrendsSupportedRegion::eTrendsSupportedRegion::TrendsSupportedRegion_DE_AT_CH:
        return U("DE+AT+CH");
    case TrendsSupportedRegion::eTrendsSupportedRegion::TrendsSupportedRegion_GB_IE:
        return U("GB+IE");
    case TrendsSupportedRegion::eTrendsSupportedRegion::TrendsSupportedRegion_IT_ES_PT_GR_MT:
        return U("IT+ES+PT+GR+MT");
    case TrendsSupportedRegion::eTrendsSupportedRegion::TrendsSupportedRegion_PL_RO_HU_SK_CZ:
        return U("PL+RO+HU+SK+CZ");
    case TrendsSupportedRegion::eTrendsSupportedRegion::TrendsSupportedRegion_SE_DK_FI_NO:
        return U("SE+DK+FI+NO");
    case TrendsSupportedRegion::eTrendsSupportedRegion::TrendsSupportedRegion_NL_BE_LU:
        return U("NL+BE+LU");
    case TrendsSupportedRegion::eTrendsSupportedRegion::TrendsSupportedRegion_AR:
        return U("AR");
    case TrendsSupportedRegion::eTrendsSupportedRegion::TrendsSupportedRegion_BR:
        return U("BR");
    case TrendsSupportedRegion::eTrendsSupportedRegion::TrendsSupportedRegion_CO:
        return U("CO");
    case TrendsSupportedRegion::eTrendsSupportedRegion::TrendsSupportedRegion_MX:
        return U("MX");
    case TrendsSupportedRegion::eTrendsSupportedRegion::TrendsSupportedRegion_MX_AR_CO_CL:
        return U("MX+AR+CO+CL");
    case TrendsSupportedRegion::eTrendsSupportedRegion::TrendsSupportedRegion_AU_NZ:
        return U("AU+NZ");
    default:
        break;
    }
    return {};
}
}

TrendsSupportedRegion::TrendsSupportedRegion()
{
}

TrendsSupportedRegion::~TrendsSupportedRegion()
{
}

void TrendsSupportedRegion::validate()
{
    // TODO: implement validation
}

web::json::value TrendsSupportedRegion::toJson() const
{
    auto val = fromEnum(m_value);
    return web::json::value(val);
}

bool TrendsSupportedRegion::fromJson(const web::json::value& val)
{
    m_value = toEnum(val.as_string());
    return true;
}

void TrendsSupportedRegion::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if (!namePrefix.empty() && namePrefix.back() != U('.'))
    {
        namePrefix.push_back(U('.'));
    }

    auto e = fromEnum(m_value);
    multipart->add(ModelBase::toHttpContent(namePrefix, e));
}

bool TrendsSupportedRegion::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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

TrendsSupportedRegion::eTrendsSupportedRegion TrendsSupportedRegion::getValue() const
{
   return m_value;
}

void TrendsSupportedRegion::setValue(TrendsSupportedRegion::eTrendsSupportedRegion const value)
{
   m_value = value;
}


}
}
}
}


