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
 * UpdatePartnerAssetAccessBody_accesses_inner.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_UpdatePartnerAssetAccessBody_accesses_inner_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_UpdatePartnerAssetAccessBody_accesses_inner_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include "CppRestOpenAPIClient/model/Permissions.h"
#include <cpprest/details/basic_types.h>
#include <vector>

namespace org {
namespace openapitools {
namespace client {
namespace model {



/// <summary>
/// 
/// </summary>
class  UpdatePartnerAssetAccessBody_accesses_inner
    : public ModelBase
{
public:
    UpdatePartnerAssetAccessBody_accesses_inner();
    virtual ~UpdatePartnerAssetAccessBody_accesses_inner();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// UpdatePartnerAssetAccessBody_accesses_inner members

    /// <summary>
    /// Unique identifier of a business partner to update asset access to.
    /// </summary>
    utility::string_t getPartnerId() const;
    bool partnerIdIsSet() const;
    void unsetPartner_id();

    void setPartnerId(const utility::string_t& value);

    /// <summary>
    /// Unique identifier of the business asset.
    /// </summary>
    utility::string_t getAssetId() const;
    bool assetIdIsSet() const;
    void unsetAsset_id();

    void setAssetId(const utility::string_t& value);

    /// <summary>
    /// A non-empty array of permissions to assign to the partner.
    /// </summary>
    std::vector<std::shared_ptr<Permissions>>& getPermissions();
    bool permissionsIsSet() const;
    void unsetPermissions();

    void setPermissions(const std::vector<std::shared_ptr<Permissions>>& value);


protected:
    utility::string_t m_Partner_id;
    bool m_Partner_idIsSet;
    utility::string_t m_Asset_id;
    bool m_Asset_idIsSet;
    std::vector<std::shared_ptr<Permissions>> m_Permissions;
    bool m_PermissionsIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_UpdatePartnerAssetAccessBody_accesses_inner_H_ */
