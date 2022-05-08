/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.3.0
* Contact: pinterest-api@pinterest.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
/*
 * PinPromotionSummaryStatus.h
 *
 * Summary status for pin promotions
 */

#ifndef PinPromotionSummaryStatus_H_
#define PinPromotionSummaryStatus_H_


#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Summary status for pin promotions
/// </summary>
class  PinPromotionSummaryStatus
{
public:
    PinPromotionSummaryStatus();
    virtual ~PinPromotionSummaryStatus() = default;

    enum class ePinPromotionSummaryStatus {
    // To have a valid default value.
    // Avoiding name clashes with user defined
    // enum values
    INVALID_VALUE_OPENAPI_GENERATED = 0,
    APPROVED, 
    PAUSED, 
    PENDING, 
    REJECTED, 
    ADVERTISER_DISABLED, 
    ARCHIVED
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

    bool operator==(const PinPromotionSummaryStatus& rhs) const;
    bool operator!=(const PinPromotionSummaryStatus& rhs) const;

    /////////////////////////////////////////////
    /// PinPromotionSummaryStatus members

    PinPromotionSummaryStatus::ePinPromotionSummaryStatus getValue() const;
    void setValue(PinPromotionSummaryStatus::ePinPromotionSummaryStatus value);
    
    friend void to_json(nlohmann::json& j, const PinPromotionSummaryStatus& o);
    friend void from_json(const nlohmann::json& j, PinPromotionSummaryStatus& o);
protected:
    PinPromotionSummaryStatus::ePinPromotionSummaryStatus m_value = PinPromotionSummaryStatus::ePinPromotionSummaryStatus::INVALID_VALUE_OPENAPI_GENERATED;
};

} // namespace org::openapitools::server::model

#endif /* PinPromotionSummaryStatus_H_ */