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
 * UpdateMaskBidOptionField.h
 *
 * bid option field to apply operation updates to
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_UpdateMaskBidOptionField_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_UpdateMaskBidOptionField_H_


#include "CppRestOpenAPIClient/ModelBase.h"


namespace org {
namespace openapitools {
namespace client {
namespace model {


class  UpdateMaskBidOptionField
    : public ModelBase
{
public:
    UpdateMaskBidOptionField();
    virtual ~UpdateMaskBidOptionField();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    enum class eUpdateMaskBidOptionField
    {
        UpdateMaskBidOptionField_BID,
        UpdateMaskBidOptionField_APP_TYPE_BID_MULTIPLIER_SET,
        UpdateMaskBidOptionField_PLACEMENT_BID_MULTIPLIER_SET,
    };

    eUpdateMaskBidOptionField getValue() const;
    void setValue(eUpdateMaskBidOptionField const value);

    protected:
        eUpdateMaskBidOptionField m_value;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_UpdateMaskBidOptionField_H_ */
