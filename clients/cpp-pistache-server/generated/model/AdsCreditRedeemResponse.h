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
 * AdsCreditRedeemResponse.h
 *
 * 
 */

#ifndef AdsCreditRedeemResponse_H_
#define AdsCreditRedeemResponse_H_


#include <string>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  AdsCreditRedeemResponse
{
public:
    AdsCreditRedeemResponse();
    virtual ~AdsCreditRedeemResponse() = default;


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

    bool operator==(const AdsCreditRedeemResponse& rhs) const;
    bool operator!=(const AdsCreditRedeemResponse& rhs) const;

    /////////////////////////////////////////////
    /// AdsCreditRedeemResponse members

    /// <summary>
    /// Returns true if the offer code was successfully applied(validateOnly&#x3D;false) or can be applied(validateOnly&#x3D;true).
    /// </summary>
    bool isSuccess() const;
    void setSuccess(bool const value);
    bool successIsSet() const;
    void unsetSuccess();
    /// <summary>
    /// Error code type if error occurs
    /// </summary>
    int32_t getErrorCode() const;
    void setErrorCode(int32_t const value);
    bool errorCodeIsSet() const;
    void unsetErrorCode();
    /// <summary>
    /// Reason for failure
    /// </summary>
    std::string getErrorMessage() const;
    void setErrorMessage(std::string const& value);
    bool errorMessageIsSet() const;
    void unsetErrorMessage();

    friend  void to_json(nlohmann::json& j, const AdsCreditRedeemResponse& o);
    friend  void from_json(const nlohmann::json& j, AdsCreditRedeemResponse& o);
protected:
    bool m_Success;
    bool m_SuccessIsSet;
    int32_t m_ErrorCode;
    bool m_ErrorCodeIsSet;
    std::string m_ErrorMessage;
    bool m_ErrorMessageIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* AdsCreditRedeemResponse_H_ */
