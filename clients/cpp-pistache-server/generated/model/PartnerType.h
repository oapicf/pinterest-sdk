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
 * PartnerType.h
 *
 * 
 */

#ifndef PartnerType_H_
#define PartnerType_H_


#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  PartnerType
{
public:
    PartnerType();
    virtual ~PartnerType() = default;

    enum class ePartnerType {
    // To have a valid default value.
    // Avoiding name clashes with user defined
    // enum values
    INVALID_VALUE_OPENAPI_GENERATED = 0,
    INTERNAL, 
    EXTERNAL
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

    bool operator==(const PartnerType& rhs) const;
    bool operator!=(const PartnerType& rhs) const;

    /////////////////////////////////////////////
    /// PartnerType members

    PartnerType::ePartnerType getValue() const;
    void setValue(PartnerType::ePartnerType value);
    
    friend  void to_json(nlohmann::json& j, const PartnerType& o);
    friend  void from_json(const nlohmann::json& j, PartnerType& o);
protected:
    PartnerType::ePartnerType m_value = PartnerType::ePartnerType::INVALID_VALUE_OPENAPI_GENERATED;
};

} // namespace org::openapitools::server::model

#endif /* PartnerType_H_ */
