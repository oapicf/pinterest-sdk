/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.14.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
/*
 * AnalyticsMetricsResponse.h
 *
 * 
 */

#ifndef AnalyticsMetricsResponse_H_
#define AnalyticsMetricsResponse_H_


#include "AnalyticsDailyMetrics.h"
#include <map>
#include <vector>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  AnalyticsMetricsResponse
{
public:
    AnalyticsMetricsResponse();
    virtual ~AnalyticsMetricsResponse() = default;


    /// <summary>
    /// Validate the current data in the model. Throws a ValidationException on failure.
    /// </summary>
    void validate() const;

    /// <summary>
    /// Validate the current data in the model. Returns false on error and writes an error
    /// message into the given stringstream.
    /// </summary>
    bool validate(std::stringstream& msg) const;

    /// <summary>
    /// Helper overload for validate. Used when one model stores another model and calls it's validate.
    /// Not meant to be called outside that case.
    /// </summary>
    bool validate(std::stringstream& msg, const std::string& pathPrefix) const;

    bool operator==(const AnalyticsMetricsResponse& rhs) const;
    bool operator!=(const AnalyticsMetricsResponse& rhs) const;

    /////////////////////////////////////////////
    /// AnalyticsMetricsResponse members

    /// <summary>
    /// The metric name and value over the requested period for each requested metric
    /// </summary>
    std::map<std::string, double> getSummaryMetrics() const;
    void setSummaryMetrics(std::map<std::string, double> const value);
    bool summaryMetricsIsSet() const;
    void unsetSummary_metrics();
    /// <summary>
    /// Array with the requested daily metric records
    /// </summary>
    std::vector<org::openapitools::server::model::AnalyticsDailyMetrics> getDailyMetrics() const;
    void setDailyMetrics(std::vector<org::openapitools::server::model::AnalyticsDailyMetrics> const& value);
    bool dailyMetricsIsSet() const;
    void unsetDaily_metrics();

    friend  void to_json(nlohmann::json& j, const AnalyticsMetricsResponse& o);
    friend  void from_json(const nlohmann::json& j, AnalyticsMetricsResponse& o);
protected:
    std::map<std::string, double> m_Summary_metrics;
    bool m_Summary_metricsIsSet;
    std::vector<org::openapitools::server::model::AnalyticsDailyMetrics> m_Daily_metrics;
    bool m_Daily_metricsIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* AnalyticsMetricsResponse_H_ */
