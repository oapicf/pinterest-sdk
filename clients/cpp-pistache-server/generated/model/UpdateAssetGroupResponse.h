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
 * UpdateAssetGroupResponse.h
 *
 * 
 */

#ifndef UpdateAssetGroupResponse_H_
#define UpdateAssetGroupResponse_H_


#include "AssetGroupBinding.h"
#include <vector>
#include "UpdateAssetGroupResponse_exceptions_inner.h"
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  UpdateAssetGroupResponse
{
public:
    UpdateAssetGroupResponse();
    virtual ~UpdateAssetGroupResponse() = default;


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

    bool operator==(const UpdateAssetGroupResponse& rhs) const;
    bool operator!=(const UpdateAssetGroupResponse& rhs) const;

    /////////////////////////////////////////////
    /// UpdateAssetGroupResponse members

    /// <summary>
    /// A list of successfully edited asset groups.
    /// </summary>
    std::vector<org::openapitools::server::model::AssetGroupBinding> getUpdatedAssetGroups() const;
    void setUpdatedAssetGroups(std::vector<org::openapitools::server::model::AssetGroupBinding> const& value);
    bool updatedAssetGroupsIsSet() const;
    void unsetUpdated_asset_groups();
    /// <summary>
    /// A list of errors associated with the asset groups. Will be returned if there is an error.
    /// </summary>
    std::vector<org::openapitools::server::model::UpdateAssetGroupResponse_exceptions_inner> getExceptions() const;
    void setExceptions(std::vector<org::openapitools::server::model::UpdateAssetGroupResponse_exceptions_inner> const& value);
    bool exceptionsIsSet() const;
    void unsetExceptions();

    friend  void to_json(nlohmann::json& j, const UpdateAssetGroupResponse& o);
    friend  void from_json(const nlohmann::json& j, UpdateAssetGroupResponse& o);
protected:
    std::vector<org::openapitools::server::model::AssetGroupBinding> m_Updated_asset_groups;
    bool m_Updated_asset_groupsIsSet;
    std::vector<org::openapitools::server::model::UpdateAssetGroupResponse_exceptions_inner> m_Exceptions;
    bool m_ExceptionsIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* UpdateAssetGroupResponse_H_ */
