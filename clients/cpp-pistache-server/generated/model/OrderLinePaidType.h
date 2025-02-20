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
 * OrderLinePaidType.h
 *
 * Order Line Paid Type
 */

#ifndef OrderLinePaidType_H_
#define OrderLinePaidType_H_


#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Order Line Paid Type
/// </summary>
class  OrderLinePaidType
{
public:
    OrderLinePaidType();
    virtual ~OrderLinePaidType() = default;

    enum class eOrderLinePaidType {
    // To have a valid default value.
    // Avoiding name clashes with user defined
    // enum values
    INVALID_VALUE_OPENAPI_GENERATED = 0,
    PAID, 
    BONUS, 
    MAKE_GOOD, 
    TEST
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

    bool operator==(const OrderLinePaidType& rhs) const;
    bool operator!=(const OrderLinePaidType& rhs) const;

    /////////////////////////////////////////////
    /// OrderLinePaidType members

    OrderLinePaidType::eOrderLinePaidType getValue() const;
    void setValue(OrderLinePaidType::eOrderLinePaidType value);
    
    friend  void to_json(nlohmann::json& j, const OrderLinePaidType& o);
    friend  void from_json(const nlohmann::json& j, OrderLinePaidType& o);
protected:
    OrderLinePaidType::eOrderLinePaidType m_value = OrderLinePaidType::eOrderLinePaidType::INVALID_VALUE_OPENAPI_GENERATED;
};

} // namespace org::openapitools::server::model

#endif /* OrderLinePaidType_H_ */
