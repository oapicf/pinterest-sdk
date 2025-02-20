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
 * AdsAnalyticsTargetingType.h
 *
 * Reporting targeting type
 */

#ifndef AdsAnalyticsTargetingType_H_
#define AdsAnalyticsTargetingType_H_


#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Reporting targeting type
/// </summary>
class  AdsAnalyticsTargetingType
{
public:
    AdsAnalyticsTargetingType();
    virtual ~AdsAnalyticsTargetingType() = default;

    enum class eAdsAnalyticsTargetingType {
    // To have a valid default value.
    // Avoiding name clashes with user defined
    // enum values
    INVALID_VALUE_OPENAPI_GENERATED = 0,
    KEYWORD, 
    APPTYPE, 
    GENDER, 
    LOCATION, 
    PLACEMENT, 
    COUNTRY, 
    TARGETED_INTEREST, 
    PINNER_INTEREST, 
    AUDIENCE_INCLUDE, 
    GEO, 
    AGE_BUCKET, 
    REGION, 
    AGE_BUCKET_AND_GENDER
    };

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

    bool operator==(const AdsAnalyticsTargetingType& rhs) const;
    bool operator!=(const AdsAnalyticsTargetingType& rhs) const;

    /////////////////////////////////////////////
    /// AdsAnalyticsTargetingType members

    AdsAnalyticsTargetingType::eAdsAnalyticsTargetingType getValue() const;
    void setValue(AdsAnalyticsTargetingType::eAdsAnalyticsTargetingType value);
    
    friend  void to_json(nlohmann::json& j, const AdsAnalyticsTargetingType& o);
    friend  void from_json(const nlohmann::json& j, AdsAnalyticsTargetingType& o);
protected:
    AdsAnalyticsTargetingType::eAdsAnalyticsTargetingType m_value = AdsAnalyticsTargetingType::eAdsAnalyticsTargetingType::INVALID_VALUE_OPENAPI_GENERATED;
};

} // namespace org::openapitools::server::model

#endif /* AdsAnalyticsTargetingType_H_ */
