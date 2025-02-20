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
 * AdsAnalyticsMetricsFilter.h
 *
 * 
 */

#ifndef AdsAnalyticsMetricsFilter_H_
#define AdsAnalyticsMetricsFilter_H_


#include "AdsAnalyticsFilterColumn.h"
#include "AdsAnalyticsFilterOperator.h"
#include <vector>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  AdsAnalyticsMetricsFilter
{
public:
    AdsAnalyticsMetricsFilter();
    virtual ~AdsAnalyticsMetricsFilter() = default;


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

    bool operator==(const AdsAnalyticsMetricsFilter& rhs) const;
    bool operator!=(const AdsAnalyticsMetricsFilter& rhs) const;

    /////////////////////////////////////////////
    /// AdsAnalyticsMetricsFilter members

    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::AdsAnalyticsFilterColumn getField() const;
    void setField(org::openapitools::server::model::AdsAnalyticsFilterColumn const& value);
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::AdsAnalyticsFilterOperator getROperator() const;
    void setROperator(org::openapitools::server::model::AdsAnalyticsFilterOperator const& value);
    /// <summary>
    /// List of values for filtering
    /// </summary>
    std::vector<double> getValues() const;
    void setValues(std::vector<double> const value);

    friend  void to_json(nlohmann::json& j, const AdsAnalyticsMetricsFilter& o);
    friend  void from_json(const nlohmann::json& j, AdsAnalyticsMetricsFilter& o);
protected:
    org::openapitools::server::model::AdsAnalyticsFilterColumn m_Field;

    org::openapitools::server::model::AdsAnalyticsFilterOperator m_r_operator;

    std::vector<double> m_Values;

    
};

} // namespace org::openapitools::server::model

#endif /* AdsAnalyticsMetricsFilter_H_ */
