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
 * EntityStatus.h
 *
 * Entity status
 */

#ifndef EntityStatus_H_
#define EntityStatus_H_


#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Entity status
/// </summary>
class  EntityStatus
{
public:
    EntityStatus();
    virtual ~EntityStatus() = default;

    enum class eEntityStatus {
    // To have a valid default value.
    // Avoiding name clashes with user defined
    // enum values
    INVALID_VALUE_OPENAPI_GENERATED = 0,
    ACTIVE, 
    PAUSED, 
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

    bool operator==(const EntityStatus& rhs) const;
    bool operator!=(const EntityStatus& rhs) const;

    /////////////////////////////////////////////
    /// EntityStatus members

    EntityStatus::eEntityStatus getValue() const;
    void setValue(EntityStatus::eEntityStatus value);
    
    friend void to_json(nlohmann::json& j, const EntityStatus& o);
    friend void from_json(const nlohmann::json& j, EntityStatus& o);
protected:
    EntityStatus::eEntityStatus m_value = EntityStatus::eEntityStatus::INVALID_VALUE_OPENAPI_GENERATED;
};

} // namespace org::openapitools::server::model

#endif /* EntityStatus_H_ */