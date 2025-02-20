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
 * BusinessAccessUserSummary.h
 *
 * Metadata of the member/partner that has access to the asset.
 */

#ifndef BusinessAccessUserSummary_H_
#define BusinessAccessUserSummary_H_


#include <string>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Metadata of the member/partner that has access to the asset.
/// </summary>
class  BusinessAccessUserSummary
{
public:
    BusinessAccessUserSummary();
    virtual ~BusinessAccessUserSummary() = default;


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

    bool operator==(const BusinessAccessUserSummary& rhs) const;
    bool operator!=(const BusinessAccessUserSummary& rhs) const;

    /////////////////////////////////////////////
    /// BusinessAccessUserSummary members

    /// <summary>
    /// Email of the business member/partner.
    /// </summary>
    std::string getEmail() const;
    void setEmail(std::string const& value);
    bool emailIsSet() const;
    void unsetEmail();
    /// <summary>
    /// Unique identifier of the business member/partner.
    /// </summary>
    std::string getId() const;
    void setId(std::string const& value);
    bool idIsSet() const;
    void unsetId();
    /// <summary>
    /// Username of the business member/partner.
    /// </summary>
    std::string getUsername() const;
    void setUsername(std::string const& value);
    bool usernameIsSet() const;
    void unsetUsername();

    friend  void to_json(nlohmann::json& j, const BusinessAccessUserSummary& o);
    friend  void from_json(const nlohmann::json& j, BusinessAccessUserSummary& o);
protected:
    std::string m_Email;
    bool m_EmailIsSet;
    std::string m_Id;
    bool m_IdIsSet;
    std::string m_Username;
    bool m_UsernameIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* BusinessAccessUserSummary_H_ */
