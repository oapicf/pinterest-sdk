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
 * UserSingleAssetBinding.h
 *
 * An object containing the permissions a business member/partner has on the asset.
 */

#ifndef UserSingleAssetBinding_H_
#define UserSingleAssetBinding_H_


#include <string>
#include <vector>
#include "BusinessAccessUserSummary.h"
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// An object containing the permissions a business member/partner has on the asset.
/// </summary>
class  UserSingleAssetBinding
{
public:
    UserSingleAssetBinding();
    virtual ~UserSingleAssetBinding() = default;


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

    bool operator==(const UserSingleAssetBinding& rhs) const;
    bool operator!=(const UserSingleAssetBinding& rhs) const;

    /////////////////////////////////////////////
    /// UserSingleAssetBinding members

    /// <summary>
    /// Permission levels member or partner has on an asset.
    /// </summary>
    std::vector<std::string> getPermissions() const;
    void setPermissions(std::vector<std::string> const& value);
    bool permissionsIsSet() const;
    void unsetPermissions();
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::BusinessAccessUserSummary getUser() const;
    void setUser(org::openapitools::server::model::BusinessAccessUserSummary const& value);
    bool userIsSet() const;
    void unsetUser();

    friend  void to_json(nlohmann::json& j, const UserSingleAssetBinding& o);
    friend  void from_json(const nlohmann::json& j, UserSingleAssetBinding& o);
protected:
    std::vector<std::string> m_Permissions;
    bool m_PermissionsIsSet;
    org::openapitools::server::model::BusinessAccessUserSummary m_User;
    bool m_UserIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* UserSingleAssetBinding_H_ */
