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
 * TargetingTypeFilter.h
 *
 * 
 */

#ifndef TargetingTypeFilter_H_
#define TargetingTypeFilter_H_


#include "AdsAnalyticsTargetingType.h"
#include <vector>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  TargetingTypeFilter
{
public:
    TargetingTypeFilter();
    virtual ~TargetingTypeFilter() = default;


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

    bool operator==(const TargetingTypeFilter& rhs) const;
    bool operator!=(const TargetingTypeFilter& rhs) const;

    /////////////////////////////////////////////
    /// TargetingTypeFilter members

    /// <summary>
    /// List of targeting types. Requires &#x60;level&#x60; to be a value ending in &#x60;_TARGETING&#x60;. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users.
    /// </summary>
    std::vector<org::openapitools::server::model::AdsAnalyticsTargetingType> getTargetingTypes() const;
    void setTargetingTypes(std::vector<org::openapitools::server::model::AdsAnalyticsTargetingType> const& value);
    bool targetingTypesIsSet() const;
    void unsetTargeting_types();

    friend  void to_json(nlohmann::json& j, const TargetingTypeFilter& o);
    friend  void from_json(const nlohmann::json& j, TargetingTypeFilter& o);
protected:
    std::vector<org::openapitools::server::model::AdsAnalyticsTargetingType> m_Targeting_types;
    bool m_Targeting_typesIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* TargetingTypeFilter_H_ */
