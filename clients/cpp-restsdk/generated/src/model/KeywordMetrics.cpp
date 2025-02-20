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



#include "CppRestOpenAPIClient/model/KeywordMetrics.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



KeywordMetrics::KeywordMetrics()
{
    m_Avg_cpc_in_micro_currency = 0.0;
    m_Avg_cpc_in_micro_currencyIsSet = false;
    m_Keyword_query_volume = utility::conversions::to_string_t("");
    m_Keyword_query_volumeIsSet = false;
}

KeywordMetrics::~KeywordMetrics()
{
}

void KeywordMetrics::validate()
{
    // TODO: implement validation
}

web::json::value KeywordMetrics::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_Avg_cpc_in_micro_currencyIsSet)
    {
        val[utility::conversions::to_string_t(U("avg_cpc_in_micro_currency"))] = ModelBase::toJson(m_Avg_cpc_in_micro_currency);
    }
    if(m_Keyword_query_volumeIsSet)
    {
        val[utility::conversions::to_string_t(U("keyword_query_volume"))] = ModelBase::toJson(m_Keyword_query_volume);
    }

    return val;
}

bool KeywordMetrics::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("avg_cpc_in_micro_currency"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("avg_cpc_in_micro_currency")));
        if(!fieldValue.is_null())
        {
            double refVal_setAvgCpcInMicroCurrency;
            ok &= ModelBase::fromJson(fieldValue, refVal_setAvgCpcInMicroCurrency);
            setAvgCpcInMicroCurrency(refVal_setAvgCpcInMicroCurrency);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("keyword_query_volume"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("keyword_query_volume")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setKeywordQueryVolume;
            ok &= ModelBase::fromJson(fieldValue, refVal_setKeywordQueryVolume);
            setKeywordQueryVolume(refVal_setKeywordQueryVolume);
        }
    }
    return ok;
}

void KeywordMetrics::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_Avg_cpc_in_micro_currencyIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("avg_cpc_in_micro_currency")), m_Avg_cpc_in_micro_currency));
    }
    if(m_Keyword_query_volumeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("keyword_query_volume")), m_Keyword_query_volume));
    }
}

bool KeywordMetrics::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("avg_cpc_in_micro_currency"))))
    {
        double refVal_setAvgCpcInMicroCurrency;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("avg_cpc_in_micro_currency"))), refVal_setAvgCpcInMicroCurrency );
        setAvgCpcInMicroCurrency(refVal_setAvgCpcInMicroCurrency);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("keyword_query_volume"))))
    {
        utility::string_t refVal_setKeywordQueryVolume;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("keyword_query_volume"))), refVal_setKeywordQueryVolume );
        setKeywordQueryVolume(refVal_setKeywordQueryVolume);
    }
    return ok;
}

double KeywordMetrics::getAvgCpcInMicroCurrency() const
{
    return m_Avg_cpc_in_micro_currency;
}

void KeywordMetrics::setAvgCpcInMicroCurrency(double value)
{
    m_Avg_cpc_in_micro_currency = value;
    m_Avg_cpc_in_micro_currencyIsSet = true;
}

bool KeywordMetrics::avgCpcInMicroCurrencyIsSet() const
{
    return m_Avg_cpc_in_micro_currencyIsSet;
}

void KeywordMetrics::unsetAvg_cpc_in_micro_currency()
{
    m_Avg_cpc_in_micro_currencyIsSet = false;
}
utility::string_t KeywordMetrics::getKeywordQueryVolume() const
{
    return m_Keyword_query_volume;
}

void KeywordMetrics::setKeywordQueryVolume(const utility::string_t& value)
{
    m_Keyword_query_volume = value;
    m_Keyword_query_volumeIsSet = true;
}

bool KeywordMetrics::keywordQueryVolumeIsSet() const
{
    return m_Keyword_query_volumeIsSet;
}

void KeywordMetrics::unsetKeyword_query_volume()
{
    m_Keyword_query_volumeIsSet = false;
}
}
}
}
}


