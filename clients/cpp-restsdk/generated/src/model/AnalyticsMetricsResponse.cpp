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



#include "CppRestOpenAPIClient/model/AnalyticsMetricsResponse.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



AnalyticsMetricsResponse::AnalyticsMetricsResponse()
{
    m_Summary_metricsIsSet = false;
    m_Daily_metricsIsSet = false;
}

AnalyticsMetricsResponse::~AnalyticsMetricsResponse()
{
}

void AnalyticsMetricsResponse::validate()
{
    // TODO: implement validation
}

web::json::value AnalyticsMetricsResponse::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_Summary_metricsIsSet)
    {
        val[utility::conversions::to_string_t(U("summary_metrics"))] = ModelBase::toJson(m_Summary_metrics);
    }
    if(m_Daily_metricsIsSet)
    {
        val[utility::conversions::to_string_t(U("daily_metrics"))] = ModelBase::toJson(m_Daily_metrics);
    }

    return val;
}

bool AnalyticsMetricsResponse::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("summary_metrics"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("summary_metrics")));
        if(!fieldValue.is_null())
        {
            std::map<utility::string_t, double> refVal_setSummaryMetrics;
            ok &= ModelBase::fromJson(fieldValue, refVal_setSummaryMetrics);
            setSummaryMetrics(refVal_setSummaryMetrics);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("daily_metrics"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("daily_metrics")));
        if(!fieldValue.is_null())
        {
            std::vector<std::shared_ptr<AnalyticsDailyMetrics>> refVal_setDailyMetrics;
            ok &= ModelBase::fromJson(fieldValue, refVal_setDailyMetrics);
            setDailyMetrics(refVal_setDailyMetrics);
        }
    }
    return ok;
}

void AnalyticsMetricsResponse::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_Summary_metricsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("summary_metrics")), m_Summary_metrics));
    }
    if(m_Daily_metricsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("daily_metrics")), m_Daily_metrics));
    }
}

bool AnalyticsMetricsResponse::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("summary_metrics"))))
    {
        std::map<utility::string_t, double> refVal_setSummaryMetrics;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("summary_metrics"))), refVal_setSummaryMetrics );
        setSummaryMetrics(refVal_setSummaryMetrics);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("daily_metrics"))))
    {
        std::vector<std::shared_ptr<AnalyticsDailyMetrics>> refVal_setDailyMetrics;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("daily_metrics"))), refVal_setDailyMetrics );
        setDailyMetrics(refVal_setDailyMetrics);
    }
    return ok;
}

std::map<utility::string_t, double>& AnalyticsMetricsResponse::getSummaryMetrics()
{
    return m_Summary_metrics;
}

void AnalyticsMetricsResponse::setSummaryMetrics(std::map<utility::string_t, double> value)
{
    m_Summary_metrics = value;
    m_Summary_metricsIsSet = true;
}

bool AnalyticsMetricsResponse::summaryMetricsIsSet() const
{
    return m_Summary_metricsIsSet;
}

void AnalyticsMetricsResponse::unsetSummary_metrics()
{
    m_Summary_metricsIsSet = false;
}
std::vector<std::shared_ptr<AnalyticsDailyMetrics>>& AnalyticsMetricsResponse::getDailyMetrics()
{
    return m_Daily_metrics;
}

void AnalyticsMetricsResponse::setDailyMetrics(const std::vector<std::shared_ptr<AnalyticsDailyMetrics>>& value)
{
    m_Daily_metrics = value;
    m_Daily_metricsIsSet = true;
}

bool AnalyticsMetricsResponse::dailyMetricsIsSet() const
{
    return m_Daily_metricsIsSet;
}

void AnalyticsMetricsResponse::unsetDaily_metrics()
{
    m_Daily_metricsIsSet = false;
}
}
}
}
}


