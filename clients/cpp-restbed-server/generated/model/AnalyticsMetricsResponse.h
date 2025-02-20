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

#ifndef AnalyticsMetricsResponse_H_
#define AnalyticsMetricsResponse_H_



#include "AnalyticsDailyMetrics.h"
#include <map>
#include <vector>
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  AnalyticsMetricsResponse 
{
public:
    AnalyticsMetricsResponse() = default;
    explicit AnalyticsMetricsResponse(boost::property_tree::ptree const& pt);
    virtual ~AnalyticsMetricsResponse() = default;

    AnalyticsMetricsResponse(const AnalyticsMetricsResponse& other) = default; // copy constructor
    AnalyticsMetricsResponse(AnalyticsMetricsResponse&& other) noexcept = default; // move constructor

    AnalyticsMetricsResponse& operator=(const AnalyticsMetricsResponse& other) = default; // copy assignment
    AnalyticsMetricsResponse& operator=(AnalyticsMetricsResponse&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// AnalyticsMetricsResponse members

    /// <summary>
    /// The metric name and value over the requested period for each requested metric
    /// </summary>
    std::map<std::string, double> getSummaryMetrics() const;
    void setSummaryMetrics(std::map<std::string, double> value);

    /// <summary>
    /// Array with the requested daily metric records
    /// </summary>
    std::vector<AnalyticsDailyMetrics> getDailyMetrics() const;
    void setDailyMetrics(std::vector<AnalyticsDailyMetrics> value);

protected:
    std::map<std::string, double> m_Summary_metrics;
    std::vector<AnalyticsDailyMetrics> m_Daily_metrics;
};

std::vector<AnalyticsMetricsResponse> createAnalyticsMetricsResponseVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<AnalyticsMetricsResponse>(const AnalyticsMetricsResponse& val) {
    return val.toPropertyTree();
}

template<>
inline AnalyticsMetricsResponse fromPt<AnalyticsMetricsResponse>(const boost::property_tree::ptree& pt) {
    AnalyticsMetricsResponse ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* AnalyticsMetricsResponse_H_ */
