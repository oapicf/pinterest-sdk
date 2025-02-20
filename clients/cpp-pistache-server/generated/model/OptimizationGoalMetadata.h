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
 * OptimizationGoalMetadata.h
 *
 * 
 */

#ifndef OptimizationGoalMetadata_H_
#define OptimizationGoalMetadata_H_


#include "OptimizationGoalMetadata_conversion_tag_v3_goal_metadata.h"
#include "OptimizationGoalMetadata_scrollup_goal_metadata.h"
#include "OptimizationGoalMetadata_frequency_goal_metadata.h"
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  OptimizationGoalMetadata
{
public:
    OptimizationGoalMetadata();
    virtual ~OptimizationGoalMetadata() = default;


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

    bool operator==(const OptimizationGoalMetadata& rhs) const;
    bool operator!=(const OptimizationGoalMetadata& rhs) const;

    /////////////////////////////////////////////
    /// OptimizationGoalMetadata members

    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::OptimizationGoalMetadata_conversion_tag_v3_goal_metadata getConversionTagV3GoalMetadata() const;
    void setConversionTagV3GoalMetadata(org::openapitools::server::model::OptimizationGoalMetadata_conversion_tag_v3_goal_metadata const& value);
    bool conversionTagV3GoalMetadataIsSet() const;
    void unsetConversion_tag_v3_goal_metadata();
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::OptimizationGoalMetadata_frequency_goal_metadata getFrequencyGoalMetadata() const;
    void setFrequencyGoalMetadata(org::openapitools::server::model::OptimizationGoalMetadata_frequency_goal_metadata const& value);
    bool frequencyGoalMetadataIsSet() const;
    void unsetFrequency_goal_metadata();
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::OptimizationGoalMetadata_scrollup_goal_metadata getScrollupGoalMetadata() const;
    void setScrollupGoalMetadata(org::openapitools::server::model::OptimizationGoalMetadata_scrollup_goal_metadata const& value);
    bool scrollupGoalMetadataIsSet() const;
    void unsetScrollup_goal_metadata();

    friend  void to_json(nlohmann::json& j, const OptimizationGoalMetadata& o);
    friend  void from_json(const nlohmann::json& j, OptimizationGoalMetadata& o);
protected:
    org::openapitools::server::model::OptimizationGoalMetadata_conversion_tag_v3_goal_metadata m_Conversion_tag_v3_goal_metadata;
    bool m_Conversion_tag_v3_goal_metadataIsSet;
    org::openapitools::server::model::OptimizationGoalMetadata_frequency_goal_metadata m_Frequency_goal_metadata;
    bool m_Frequency_goal_metadataIsSet;
    org::openapitools::server::model::OptimizationGoalMetadata_scrollup_goal_metadata m_Scrollup_goal_metadata;
    bool m_Scrollup_goal_metadataIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* OptimizationGoalMetadata_H_ */
