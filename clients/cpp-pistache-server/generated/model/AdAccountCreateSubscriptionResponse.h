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
 * AdAccountCreateSubscriptionResponse.h
 *
 * 
 */

#ifndef AdAccountCreateSubscriptionResponse_H_
#define AdAccountCreateSubscriptionResponse_H_


#include <string>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  AdAccountCreateSubscriptionResponse
{
public:
    AdAccountCreateSubscriptionResponse();
    virtual ~AdAccountCreateSubscriptionResponse() = default;


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

    bool operator==(const AdAccountCreateSubscriptionResponse& rhs) const;
    bool operator!=(const AdAccountCreateSubscriptionResponse& rhs) const;

    /////////////////////////////////////////////
    /// AdAccountCreateSubscriptionResponse members

    /// <summary>
    /// Subscription ID.
    /// </summary>
    std::string getId() const;
    void setId(std::string const& value);
    bool idIsSet() const;
    void unsetId();
    /// <summary>
    /// Base64 encoded key for client to decrypt lead data.
    /// </summary>
    std::string getCryptographicKey() const;
    void setCryptographicKey(std::string const& value);
    bool cryptographicKeyIsSet() const;
    void unsetCryptographic_key();
    /// <summary>
    /// Lead data encryption algorithm.
    /// </summary>
    std::string getCryptographicAlgorithm() const;
    void setCryptographicAlgorithm(std::string const& value);
    bool cryptographicAlgorithmIsSet() const;
    void unsetCryptographic_algorithm();
    /// <summary>
    /// Subscription creation time. Unix timestamp in milliseconds.
    /// </summary>
    int32_t getCreatedTime() const;
    void setCreatedTime(int32_t const value);
    bool createdTimeIsSet() const;
    void unsetCreated_time();

    friend  void to_json(nlohmann::json& j, const AdAccountCreateSubscriptionResponse& o);
    friend  void from_json(const nlohmann::json& j, AdAccountCreateSubscriptionResponse& o);
protected:
    std::string m_Id;
    bool m_IdIsSet;
    std::string m_Cryptographic_key;
    bool m_Cryptographic_keyIsSet;
    std::string m_Cryptographic_algorithm;
    bool m_Cryptographic_algorithmIsSet;
    int32_t m_Created_time;
    bool m_Created_timeIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* AdAccountCreateSubscriptionResponse_H_ */
