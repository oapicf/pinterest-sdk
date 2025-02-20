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
 * AdsAnalyticsResponse_inner.h
 *
 * 
 */

#ifndef AdsAnalyticsResponse_inner_H_
#define AdsAnalyticsResponse_inner_H_


#include <nlohmann/json.hpp>
#include <string>
#include <map>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  AdsAnalyticsResponse_inner
{
public:
    AdsAnalyticsResponse_inner();
    virtual ~AdsAnalyticsResponse_inner() = default;


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

    bool operator==(const AdsAnalyticsResponse_inner& rhs) const;
    bool operator!=(const AdsAnalyticsResponse_inner& rhs) const;

    /////////////////////////////////////////////
    /// AdsAnalyticsResponse_inner members

    /// <summary>
    /// The ID of the ad that this metrics belongs to.
    /// </summary>
    std::string getADID() const;
    void setADID(std::string const& value);
    /// <summary>
    /// Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;)
    /// </summary>
    std::string getDATE() const;
    void setDATE(std::string const& value);
    bool dATEIsSet() const;
    void unsetDATE();

    friend  void to_json(nlohmann::json& j, const AdsAnalyticsResponse_inner& o);
    friend  void from_json(const nlohmann::json& j, AdsAnalyticsResponse_inner& o);
protected:
    std::string m_AD_ID;

    std::string m_DATE;
    bool m_DATEIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* AdsAnalyticsResponse_inner_H_ */
