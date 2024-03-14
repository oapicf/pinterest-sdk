/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.6.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.4.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "CppRestOpenAPIClient/model/CurrencyFilter.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



CurrencyFilter::CurrencyFilter()
{
    m_CURRENCYIsSet = false;
}

CurrencyFilter::~CurrencyFilter()
{
}

void CurrencyFilter::validate()
{
    // TODO: implement validation
}

web::json::value CurrencyFilter::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_CURRENCYIsSet)
    {
        val[utility::conversions::to_string_t(U("CURRENCY"))] = ModelBase::toJson(m_CURRENCY);
    }

    return val;
}

bool CurrencyFilter::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("CURRENCY"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("CURRENCY")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<CatalogsProductGroupCurrencyCriteria> refVal_setCURRENCY;
            ok &= ModelBase::fromJson(fieldValue, refVal_setCURRENCY);
            setCURRENCY(refVal_setCURRENCY);
        }
    }
    return ok;
}

void CurrencyFilter::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_CURRENCYIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("CURRENCY")), m_CURRENCY));
    }
}

bool CurrencyFilter::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("CURRENCY"))))
    {
        std::shared_ptr<CatalogsProductGroupCurrencyCriteria> refVal_setCURRENCY;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("CURRENCY"))), refVal_setCURRENCY );
        setCURRENCY(refVal_setCURRENCY);
    }
    return ok;
}

std::shared_ptr<CatalogsProductGroupCurrencyCriteria> CurrencyFilter::getCURRENCY() const
{
    return m_CURRENCY;
}

void CurrencyFilter::setCURRENCY(const std::shared_ptr<CatalogsProductGroupCurrencyCriteria>& value)
{
    m_CURRENCY = value;
    m_CURRENCYIsSet = true;
}

bool CurrencyFilter::cURRENCYIsSet() const
{
    return m_CURRENCYIsSet;
}

void CurrencyFilter::unsetCURRENCY()
{
    m_CURRENCYIsSet = false;
}
}
}
}
}

