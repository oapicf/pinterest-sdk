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
 * UpdateMemberBusinessRoleBody.h
 *
 * Single instance of a business member to have its role updated
 */

#ifndef UpdateMemberBusinessRoleBody_H_
#define UpdateMemberBusinessRoleBody_H_


#include "BusinessRoleForMembers.h"
#include <string>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Single instance of a business member to have its role updated
/// </summary>
class  UpdateMemberBusinessRoleBody
{
public:
    UpdateMemberBusinessRoleBody();
    virtual ~UpdateMemberBusinessRoleBody() = default;


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

    bool operator==(const UpdateMemberBusinessRoleBody& rhs) const;
    bool operator!=(const UpdateMemberBusinessRoleBody& rhs) const;

    /////////////////////////////////////////////
    /// UpdateMemberBusinessRoleBody members

    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::BusinessRoleForMembers getBusinessRole() const;
    void setBusinessRole(org::openapitools::server::model::BusinessRoleForMembers const& value);
    /// <summary>
    /// Unique identifier of the member
    /// </summary>
    std::string getMemberId() const;
    void setMemberId(std::string const& value);

    friend  void to_json(nlohmann::json& j, const UpdateMemberBusinessRoleBody& o);
    friend  void from_json(const nlohmann::json& j, UpdateMemberBusinessRoleBody& o);
protected:
    org::openapitools::server::model::BusinessRoleForMembers m_Business_role;

    std::string m_Member_id;

    
};

} // namespace org::openapitools::server::model

#endif /* UpdateMemberBusinessRoleBody_H_ */
