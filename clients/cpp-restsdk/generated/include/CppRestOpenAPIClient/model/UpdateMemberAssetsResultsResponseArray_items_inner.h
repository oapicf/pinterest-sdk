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
 * UpdateMemberAssetsResultsResponseArray_items_inner.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_UpdateMemberAssetsResultsResponseArray_items_inner_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_UpdateMemberAssetsResultsResponseArray_items_inner_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include "CppRestOpenAPIClient/model/UsersForIndividualAssetResponse.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

class UsersForIndividualAssetResponse;


/// <summary>
/// 
/// </summary>
class  UpdateMemberAssetsResultsResponseArray_items_inner
    : public ModelBase
{
public:
    UpdateMemberAssetsResultsResponseArray_items_inner();
    virtual ~UpdateMemberAssetsResultsResponseArray_items_inner();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// UpdateMemberAssetsResultsResponseArray_items_inner members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<UsersForIndividualAssetResponse> getResponse() const;
    bool responseIsSet() const;
    void unsetResponse();

    void setResponse(const std::shared_ptr<UsersForIndividualAssetResponse>& value);


protected:
    std::shared_ptr<UsersForIndividualAssetResponse> m_Response;
    bool m_ResponseIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_UpdateMemberAssetsResultsResponseArray_items_inner_H_ */
