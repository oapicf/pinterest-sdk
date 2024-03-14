/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.6.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.4.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * AudienceType.h
 *
 * Audience type
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_AudienceType_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_AudienceType_H_


#include "CppRestOpenAPIClient/ModelBase.h"


namespace org {
namespace openapitools {
namespace client {
namespace model {

class  AudienceType
    : public ModelBase
{
public:
    AudienceType();
    virtual ~AudienceType();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    enum class eAudienceType
    {
        AudienceType_CUSTOMER_LIST,
        AudienceType_VISITOR,
        AudienceType_ENGAGEMENT,
        AudienceType_ACTALIKE,
    };

    eAudienceType getValue() const;
    void setValue(eAudienceType const value);

    protected:
        eAudienceType m_value;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_AudienceType_H_ */