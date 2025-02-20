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
 * AnalyticsDailyMetrics.h
 *
 * 
 */

#ifndef AnalyticsDailyMetrics_H_
#define AnalyticsDailyMetrics_H_


#include "DataStatus.h"
#include <string>
#include <map>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  AnalyticsDailyMetrics
{
public:
    AnalyticsDailyMetrics();
    virtual ~AnalyticsDailyMetrics() = default;


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

    bool operator==(const AnalyticsDailyMetrics& rhs) const;
    bool operator!=(const AnalyticsDailyMetrics& rhs) const;

    /////////////////////////////////////////////
    /// AnalyticsDailyMetrics members

    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::DataStatus getDataStatus() const;
    void setDataStatus(org::openapitools::server::model::DataStatus const& value);
    bool dataStatusIsSet() const;
    void unsetData_status();
    /// <summary>
    /// Metrics date (UTC): YYYY-MM-DD.
    /// </summary>
    std::string getDate() const;
    void setDate(std::string const& value);
    bool dateIsSet() const;
    void unsetdate();
    /// <summary>
    /// The metric name and daily value for each requested metric
    /// </summary>
    std::map<std::string, double> getMetrics() const;
    void setMetrics(std::map<std::string, double> const value);
    bool metricsIsSet() const;
    void unsetMetrics();

    friend  void to_json(nlohmann::json& j, const AnalyticsDailyMetrics& o);
    friend  void from_json(const nlohmann::json& j, AnalyticsDailyMetrics& o);
protected:
    org::openapitools::server::model::DataStatus m_Data_status;
    bool m_Data_statusIsSet;
    std::string m_date;
    bool m_dateIsSet;
    std::map<std::string, double> m_Metrics;
    bool m_MetricsIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* AnalyticsDailyMetrics_H_ */
