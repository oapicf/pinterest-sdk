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
 * OptimizationGoalMetadata_frequency_goal_metadata.h
 *
 * 
 */

#ifndef OptimizationGoalMetadata_frequency_goal_metadata_H_
#define OptimizationGoalMetadata_frequency_goal_metadata_H_


#include <string>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  OptimizationGoalMetadata_frequency_goal_metadata
{
public:
    OptimizationGoalMetadata_frequency_goal_metadata();
    virtual ~OptimizationGoalMetadata_frequency_goal_metadata() = default;


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

    bool operator==(const OptimizationGoalMetadata_frequency_goal_metadata& rhs) const;
    bool operator!=(const OptimizationGoalMetadata_frequency_goal_metadata& rhs) const;

    /////////////////////////////////////////////
    /// OptimizationGoalMetadata_frequency_goal_metadata members

    /// <summary>
    /// 
    /// </summary>
    int32_t getFrequency() const;
    void setFrequency(int32_t const value);
    bool frequencyIsSet() const;
    void unsetFrequency();
    /// <summary>
    /// User entity counts time range
    /// </summary>
    std::string getTimerange() const;
    void setTimerange(std::string const& value);
    bool timerangeIsSet() const;
    void unsetTimerange();

    friend  void to_json(nlohmann::json& j, const OptimizationGoalMetadata_frequency_goal_metadata& o);
    friend  void from_json(const nlohmann::json& j, OptimizationGoalMetadata_frequency_goal_metadata& o);
protected:
    int32_t m_Frequency;
    bool m_FrequencyIsSet;
    std::string m_Timerange;
    bool m_TimerangeIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* OptimizationGoalMetadata_frequency_goal_metadata_H_ */
