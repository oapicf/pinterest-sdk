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
 * TopPinsAnalyticsResponse_date_availability.h
 *
 * 
 */

#ifndef TopPinsAnalyticsResponse_date_availability_H_
#define TopPinsAnalyticsResponse_date_availability_H_


#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  TopPinsAnalyticsResponse_date_availability
{
public:
    TopPinsAnalyticsResponse_date_availability();
    virtual ~TopPinsAnalyticsResponse_date_availability() = default;


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

    bool operator==(const TopPinsAnalyticsResponse_date_availability& rhs) const;
    bool operator!=(const TopPinsAnalyticsResponse_date_availability& rhs) const;

    /////////////////////////////////////////////
    /// TopPinsAnalyticsResponse_date_availability members

    /// <summary>
    /// 
    /// </summary>
    double getLatestAvailableTimestamp() const;
    void setLatestAvailableTimestamp(double const value);
    bool latestAvailableTimestampIsSet() const;
    void unsetLatest_available_timestamp();
    /// <summary>
    /// 
    /// </summary>
    bool isIsRealtime() const;
    void setIsRealtime(bool const value);
    bool isRealtimeIsSet() const;
    void unsetIs_realtime();

    friend  void to_json(nlohmann::json& j, const TopPinsAnalyticsResponse_date_availability& o);
    friend  void from_json(const nlohmann::json& j, TopPinsAnalyticsResponse_date_availability& o);
protected:
    double m_Latest_available_timestamp;
    bool m_Latest_available_timestampIsSet;
    bool m_Is_realtime;
    bool m_Is_realtimeIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* TopPinsAnalyticsResponse_date_availability_H_ */
