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
 * DeleteAssetGroupBody.h
 *
 * Request body used to delete asset groups
 */

#ifndef DeleteAssetGroupBody_H_
#define DeleteAssetGroupBody_H_


#include <string>
#include <vector>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Request body used to delete asset groups
/// </summary>
class  DeleteAssetGroupBody
{
public:
    DeleteAssetGroupBody();
    virtual ~DeleteAssetGroupBody() = default;


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

    bool operator==(const DeleteAssetGroupBody& rhs) const;
    bool operator!=(const DeleteAssetGroupBody& rhs) const;

    /////////////////////////////////////////////
    /// DeleteAssetGroupBody members

    /// <summary>
    /// List of ids of asset groups to be deleted
    /// </summary>
    std::vector<std::string> getAssetGroupsToDelete() const;
    void setAssetGroupsToDelete(std::vector<std::string> const& value);

    friend  void to_json(nlohmann::json& j, const DeleteAssetGroupBody& o);
    friend  void from_json(const nlohmann::json& j, DeleteAssetGroupBody& o);
protected:
    std::vector<std::string> m_Asset_groups_to_delete;

    
};

} // namespace org::openapitools::server::model

#endif /* DeleteAssetGroupBody_H_ */
