/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.12.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
/*
 * Gender.h
 *
 * 
 */

#ifndef Gender_H_
#define Gender_H_


#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  Gender
{
public:
    Gender();
    virtual ~Gender() = default;

    enum class eGender {
    // To have a valid default value.
    // Avoiding name clashes with user defined
    // enum values
    INVALID_VALUE_OPENAPI_GENERATED = 0,
    FEMALE, 
    MALE, 
    UNISEX
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

    bool operator==(const Gender& rhs) const;
    bool operator!=(const Gender& rhs) const;

    /////////////////////////////////////////////
    /// Gender members

    Gender::eGender getValue() const;
    void setValue(Gender::eGender value);
    
    friend  void to_json(nlohmann::json& j, const Gender& o);
    friend  void from_json(const nlohmann::json& j, Gender& o);
protected:
    Gender::eGender m_value = Gender::eGender::INVALID_VALUE_OPENAPI_GENERATED;
};

} // namespace org::openapitools::server::model

#endif /* Gender_H_ */