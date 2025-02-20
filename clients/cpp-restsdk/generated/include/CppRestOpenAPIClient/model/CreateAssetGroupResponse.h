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
 * CreateAssetGroupResponse.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_CreateAssetGroupResponse_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_CreateAssetGroupResponse_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include "CppRestOpenAPIClient/model/AssetGroupBinding.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

class AssetGroupBinding;


/// <summary>
/// 
/// </summary>
class  CreateAssetGroupResponse
    : public ModelBase
{
public:
    CreateAssetGroupResponse();
    virtual ~CreateAssetGroupResponse();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// CreateAssetGroupResponse members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<AssetGroupBinding> getAssetGroup() const;
    bool assetGroupIsSet() const;
    void unsetAsset_group();

    void setAssetGroup(const std::shared_ptr<AssetGroupBinding>& value);


protected:
    std::shared_ptr<AssetGroupBinding> m_Asset_group;
    bool m_Asset_groupIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_CreateAssetGroupResponse_H_ */
