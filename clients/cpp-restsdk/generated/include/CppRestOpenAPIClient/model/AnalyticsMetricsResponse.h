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

/*
 * AnalyticsMetricsResponse.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_AnalyticsMetricsResponse_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_AnalyticsMetricsResponse_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include <map>
#include <vector>
#include "CppRestOpenAPIClient/model/AnalyticsDailyMetrics.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

class AnalyticsDailyMetrics;


/// <summary>
/// 
/// </summary>
class  AnalyticsMetricsResponse
    : public ModelBase
{
public:
    AnalyticsMetricsResponse();
    virtual ~AnalyticsMetricsResponse();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// AnalyticsMetricsResponse members

    /// <summary>
    /// The metric name and value over the requested period for each requested metric
    /// </summary>
    std::map<utility::string_t, double>& getSummaryMetrics();
    bool summaryMetricsIsSet() const;
    void unsetSummary_metrics();

    void setSummaryMetrics(std::map<utility::string_t, double> value);

    /// <summary>
    /// Array with the requested daily metric records
    /// </summary>
    std::vector<std::shared_ptr<AnalyticsDailyMetrics>>& getDailyMetrics();
    bool dailyMetricsIsSet() const;
    void unsetDaily_metrics();

    void setDailyMetrics(const std::vector<std::shared_ptr<AnalyticsDailyMetrics>>& value);


protected:
    std::map<utility::string_t, double> m_Summary_metrics;
    bool m_Summary_metricsIsSet;
    std::vector<std::shared_ptr<AnalyticsDailyMetrics>> m_Daily_metrics;
    bool m_Daily_metricsIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_AnalyticsMetricsResponse_H_ */
