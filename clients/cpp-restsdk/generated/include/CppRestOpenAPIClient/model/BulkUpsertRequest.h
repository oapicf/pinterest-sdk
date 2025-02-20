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
 * BulkUpsertRequest.h
 *
 * Two set of objects to be managed asyncronusly by bulk. One for creations, one for modifications.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_BulkUpsertRequest_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_BulkUpsertRequest_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include "CppRestOpenAPIClient/model/BulkUpsertRequestCreate.h"
#include "CppRestOpenAPIClient/model/BulkUpsertRequestUpdate.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

class BulkUpsertRequestCreate;
class BulkUpsertRequestUpdate;


/// <summary>
/// Two set of objects to be managed asyncronusly by bulk. One for creations, one for modifications.
/// </summary>
class  BulkUpsertRequest
    : public ModelBase
{
public:
    BulkUpsertRequest();
    virtual ~BulkUpsertRequest();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// BulkUpsertRequest members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<BulkUpsertRequestCreate> getCreate() const;
    bool createIsSet() const;
    void unsetCreate();

    void setCreate(const std::shared_ptr<BulkUpsertRequestCreate>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<BulkUpsertRequestUpdate> getUpdate() const;
    bool updateIsSet() const;
    void unsetUpdate();

    void setUpdate(const std::shared_ptr<BulkUpsertRequestUpdate>& value);


protected:
    std::shared_ptr<BulkUpsertRequestCreate> m_Create;
    bool m_CreateIsSet;
    std::shared_ptr<BulkUpsertRequestUpdate> m_Update;
    bool m_UpdateIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_BulkUpsertRequest_H_ */
