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
 * IntegrationLogsInvalidLogResponse_rejected_logs_inner.h
 *
 * 
 */

#ifndef IntegrationLogsInvalidLogResponse_rejected_logs_inner_H_
#define IntegrationLogsInvalidLogResponse_rejected_logs_inner_H_


#include <string>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  IntegrationLogsInvalidLogResponse_rejected_logs_inner
{
public:
    IntegrationLogsInvalidLogResponse_rejected_logs_inner();
    virtual ~IntegrationLogsInvalidLogResponse_rejected_logs_inner() = default;


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

    bool operator==(const IntegrationLogsInvalidLogResponse_rejected_logs_inner& rhs) const;
    bool operator!=(const IntegrationLogsInvalidLogResponse_rejected_logs_inner& rhs) const;

    /////////////////////////////////////////////
    /// IntegrationLogsInvalidLogResponse_rejected_logs_inner members

    /// <summary>
    /// Index of the log in the batch.
    /// </summary>
    int32_t getLogIndex() const;
    void setLogIndex(int32_t const value);
    bool logIndexIsSet() const;
    void unsetLog_index();
    /// <summary>
    /// The field name containing an invalid value.
    /// </summary>
    std::string getField() const;
    void setField(std::string const& value);
    /// <summary>
    /// The value that is invalid.
    /// </summary>
    std::string getValue() const;
    void setValue(std::string const& value);
    /// <summary>
    /// The reason the value is invalid.
    /// </summary>
    std::string getReason() const;
    void setReason(std::string const& value);

    friend  void to_json(nlohmann::json& j, const IntegrationLogsInvalidLogResponse_rejected_logs_inner& o);
    friend  void from_json(const nlohmann::json& j, IntegrationLogsInvalidLogResponse_rejected_logs_inner& o);
protected:
    int32_t m_Log_index;
    bool m_Log_indexIsSet;
    std::string m_Field;

    std::string m_Value;

    std::string m_Reason;

    
};

} // namespace org::openapitools::server::model

#endif /* IntegrationLogsInvalidLogResponse_rejected_logs_inner_H_ */
