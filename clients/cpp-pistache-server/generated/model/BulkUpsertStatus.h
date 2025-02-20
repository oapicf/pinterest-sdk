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
 * BulkUpsertStatus.h
 *
 * 
 */

#ifndef BulkUpsertStatus_H_
#define BulkUpsertStatus_H_


#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  BulkUpsertStatus
{
public:
    BulkUpsertStatus();
    virtual ~BulkUpsertStatus() = default;

    enum class eBulkUpsertStatus {
    // To have a valid default value.
    // Avoiding name clashes with user defined
    // enum values
    INVALID_VALUE_OPENAPI_GENERATED = 0,
    RUNNING, 
    SUCCEEDED, 
    FAILED
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

    bool operator==(const BulkUpsertStatus& rhs) const;
    bool operator!=(const BulkUpsertStatus& rhs) const;

    /////////////////////////////////////////////
    /// BulkUpsertStatus members

    BulkUpsertStatus::eBulkUpsertStatus getValue() const;
    void setValue(BulkUpsertStatus::eBulkUpsertStatus value);
    
    friend  void to_json(nlohmann::json& j, const BulkUpsertStatus& o);
    friend  void from_json(const nlohmann::json& j, BulkUpsertStatus& o);
protected:
    BulkUpsertStatus::eBulkUpsertStatus m_value = BulkUpsertStatus::eBulkUpsertStatus::INVALID_VALUE_OPENAPI_GENERATED;
};

} // namespace org::openapitools::server::model

#endif /* BulkUpsertStatus_H_ */
