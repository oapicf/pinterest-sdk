/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.9.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * AssetIdPermissions.h
 *
 * An object containing the permissions a business member has on the asset.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_AssetIdPermissions_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_AssetIdPermissions_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include "CppRestOpenAPIClient/model/AssetGroupBinding.h"
#include <cpprest/details/basic_types.h>
#include <vector>

namespace org {
namespace openapitools {
namespace client {
namespace model {

class AssetGroupBinding;


/// <summary>
/// An object containing the permissions a business member has on the asset.
/// </summary>
class  AssetIdPermissions
    : public ModelBase
{
public:
    AssetIdPermissions();
    virtual ~AssetIdPermissions();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// AssetIdPermissions members

    /// <summary>
    /// Unique identifier of a business asset.
    /// </summary>
    utility::string_t getAssetId() const;
    bool assetIdIsSet() const;
    void unsetAsset_id();

    void setAssetId(const utility::string_t& value);

    /// <summary>
    /// Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP.
    /// </summary>
    utility::string_t getAssetType() const;
    bool assetTypeIsSet() const;
    void unsetAsset_type();

    void setAssetType(const utility::string_t& value);

    /// <summary>
    /// Permission levels member or partner has on an asset.
    /// </summary>
    std::vector<utility::string_t>& getPermissions();
    bool permissionsIsSet() const;
    void unsetPermissions();

    void setPermissions(const std::vector<utility::string_t>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<AssetGroupBinding> getAssetGroupInfo() const;
    bool assetGroupInfoIsSet() const;
    void unsetAsset_group_info();

    void setAssetGroupInfo(const std::shared_ptr<AssetGroupBinding>& value);


protected:
    utility::string_t m_Asset_id;
    bool m_Asset_idIsSet;
    utility::string_t m_Asset_type;
    bool m_Asset_typeIsSet;
    std::vector<utility::string_t> m_Permissions;
    bool m_PermissionsIsSet;
    std::shared_ptr<AssetGroupBinding> m_Asset_group_info;
    bool m_Asset_group_infoIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_AssetIdPermissions_H_ */
