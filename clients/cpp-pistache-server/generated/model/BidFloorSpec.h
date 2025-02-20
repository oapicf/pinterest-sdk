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
 * BidFloorSpec.h
 *
 * 
 */

#ifndef BidFloorSpec_H_
#define BidFloorSpec_H_


#include "Country.h"
#include "CreativeType.h"
#include "ObjectiveType.h"
#include "ActionType.h"
#include "OptimizationGoalMetadata.h"
#include "Currency.h"
#include <vector>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  BidFloorSpec
{
public:
    BidFloorSpec();
    virtual ~BidFloorSpec() = default;


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

    bool operator==(const BidFloorSpec& rhs) const;
    bool operator!=(const BidFloorSpec& rhs) const;

    /////////////////////////////////////////////
    /// BidFloorSpec members

    /// <summary>
    /// 
    /// </summary>
    std::vector<org::openapitools::server::model::Country> getCountries() const;
    void setCountries(std::vector<org::openapitools::server::model::Country> const& value);
    bool countriesIsSet() const;
    void unsetCountries();
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::Currency getCurrency() const;
    void setCurrency(org::openapitools::server::model::Currency const& value);
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::ObjectiveType getObjectiveType() const;
    void setObjectiveType(org::openapitools::server::model::ObjectiveType const& value);
    bool objectiveTypeIsSet() const;
    void unsetObjective_type();
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::ActionType getBillableEvent() const;
    void setBillableEvent(org::openapitools::server::model::ActionType const& value);
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::OptimizationGoalMetadata getOptimizationGoalMetadata() const;
    void setOptimizationGoalMetadata(org::openapitools::server::model::OptimizationGoalMetadata const& value);
    bool optimizationGoalMetadataIsSet() const;
    void unsetOptimization_goal_metadata();
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::CreativeType getCreativeType() const;
    void setCreativeType(org::openapitools::server::model::CreativeType const& value);
    bool creativeTypeIsSet() const;
    void unsetCreative_type();

    friend  void to_json(nlohmann::json& j, const BidFloorSpec& o);
    friend  void from_json(const nlohmann::json& j, BidFloorSpec& o);
protected:
    std::vector<org::openapitools::server::model::Country> m_Countries;
    bool m_CountriesIsSet;
    org::openapitools::server::model::Currency m_Currency;

    org::openapitools::server::model::ObjectiveType m_Objective_type;
    bool m_Objective_typeIsSet;
    org::openapitools::server::model::ActionType m_Billable_event;

    org::openapitools::server::model::OptimizationGoalMetadata m_Optimization_goal_metadata;
    bool m_Optimization_goal_metadataIsSet;
    org::openapitools::server::model::CreativeType m_Creative_type;
    bool m_Creative_typeIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* BidFloorSpec_H_ */
