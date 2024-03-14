/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.6.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
/*
 * NonNullableProductAvailabilityType.h
 *
 * Product availability.
 */

#ifndef NonNullableProductAvailabilityType_H_
#define NonNullableProductAvailabilityType_H_


#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Product availability.
/// </summary>
class  NonNullableProductAvailabilityType
{
public:
    NonNullableProductAvailabilityType();
    virtual ~NonNullableProductAvailabilityType() = default;

    enum class eNonNullableProductAvailabilityType {
    // To have a valid default value.
    // Avoiding name clashes with user defined
    // enum values
    INVALID_VALUE_OPENAPI_GENERATED = 0,
    IN_STOCK, 
    OUT_OF_STOCK, 
    PREORDER
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

    bool operator==(const NonNullableProductAvailabilityType& rhs) const;
    bool operator!=(const NonNullableProductAvailabilityType& rhs) const;

    /////////////////////////////////////////////
    /// NonNullableProductAvailabilityType members

    NonNullableProductAvailabilityType::eNonNullableProductAvailabilityType getValue() const;
    void setValue(NonNullableProductAvailabilityType::eNonNullableProductAvailabilityType value);
    
    friend  void to_json(nlohmann::json& j, const NonNullableProductAvailabilityType& o);
    friend  void from_json(const nlohmann::json& j, NonNullableProductAvailabilityType& o);
protected:
    NonNullableProductAvailabilityType::eNonNullableProductAvailabilityType m_value = NonNullableProductAvailabilityType::eNonNullableProductAvailabilityType::INVALID_VALUE_OPENAPI_GENERATED;
};

} // namespace org::openapitools::server::model

#endif /* NonNullableProductAvailabilityType_H_ */