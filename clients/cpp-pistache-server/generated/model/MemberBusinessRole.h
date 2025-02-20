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
 * MemberBusinessRole.h
 *
 * The access level a member/partner has to the business. Values are case-sensitive. &lt;br&gt; - EMPLOYEE: Can only view and access ad accounts you assign to them. They cannot see details about other employees, external partners or other ad accounts. &lt;br&gt; - BIZ_ADMIN: Have full control of roles and can add employees, external partners as well as grant ad account access.
 */

#ifndef MemberBusinessRole_H_
#define MemberBusinessRole_H_


#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// The access level a member/partner has to the business. Values are case-sensitive. &lt;br&gt; - EMPLOYEE: Can only view and access ad accounts you assign to them. They cannot see details about other employees, external partners or other ad accounts. &lt;br&gt; - BIZ_ADMIN: Have full control of roles and can add employees, external partners as well as grant ad account access.
/// </summary>
class  MemberBusinessRole
{
public:
    MemberBusinessRole();
    virtual ~MemberBusinessRole() = default;

    enum class eMemberBusinessRole {
    // To have a valid default value.
    // Avoiding name clashes with user defined
    // enum values
    INVALID_VALUE_OPENAPI_GENERATED = 0,
    EMPLOYEE, 
    BIZ_ADMIN
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

    bool operator==(const MemberBusinessRole& rhs) const;
    bool operator!=(const MemberBusinessRole& rhs) const;

    /////////////////////////////////////////////
    /// MemberBusinessRole members

    MemberBusinessRole::eMemberBusinessRole getValue() const;
    void setValue(MemberBusinessRole::eMemberBusinessRole value);
    
    friend  void to_json(nlohmann::json& j, const MemberBusinessRole& o);
    friend  void from_json(const nlohmann::json& j, MemberBusinessRole& o);
protected:
    MemberBusinessRole::eMemberBusinessRole m_value = MemberBusinessRole::eMemberBusinessRole::INVALID_VALUE_OPENAPI_GENERATED;
};

} // namespace org::openapitools::server::model

#endif /* MemberBusinessRole_H_ */
