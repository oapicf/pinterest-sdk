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
 * BatchOperation.h
 *
 * The operation performed by the batch. The DELETE_DISCONTINUED operation only updates availablity to \&quot;Out of Stock\&quot;.
 */

#ifndef BatchOperation_H_
#define BatchOperation_H_


#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// The operation performed by the batch. The DELETE_DISCONTINUED operation only updates availablity to \&quot;Out of Stock\&quot;.
/// </summary>
class  BatchOperation
{
public:
    BatchOperation();
    virtual ~BatchOperation() = default;

    enum class eBatchOperation {
    // To have a valid default value.
    // Avoiding name clashes with user defined
    // enum values
    INVALID_VALUE_OPENAPI_GENERATED = 0,
    UPDATE, 
    UPSERT, 
    CREATE, 
    DELETE_DISCONTINUED, 
    DELETE
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

    bool operator==(const BatchOperation& rhs) const;
    bool operator!=(const BatchOperation& rhs) const;

    /////////////////////////////////////////////
    /// BatchOperation members

    BatchOperation::eBatchOperation getValue() const;
    void setValue(BatchOperation::eBatchOperation value);
    
    friend  void to_json(nlohmann::json& j, const BatchOperation& o);
    friend  void from_json(const nlohmann::json& j, BatchOperation& o);
protected:
    BatchOperation::eBatchOperation m_value = BatchOperation::eBatchOperation::INVALID_VALUE_OPENAPI_GENERATED;
};

} // namespace org::openapitools::server::model

#endif /* BatchOperation_H_ */
