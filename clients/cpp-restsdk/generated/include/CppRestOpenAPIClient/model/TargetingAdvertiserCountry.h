/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.4.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * TargetingAdvertiserCountry.h
 *
 * Advertiser&#39;s ISO two character country code.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_TargetingAdvertiserCountry_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_TargetingAdvertiserCountry_H_


#include "CppRestOpenAPIClient/ModelBase.h"


namespace org {
namespace openapitools {
namespace client {
namespace model {

class  TargetingAdvertiserCountry
    : public ModelBase
{
public:
    TargetingAdvertiserCountry();
    virtual ~TargetingAdvertiserCountry();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    enum class eTargetingAdvertiserCountry
    {
        TargetingAdvertiserCountry_US,
        TargetingAdvertiserCountry_GB,
        TargetingAdvertiserCountry_CA,
        TargetingAdvertiserCountry_IE,
        TargetingAdvertiserCountry_AU,
        TargetingAdvertiserCountry_NZ,
        TargetingAdvertiserCountry_FR,
        TargetingAdvertiserCountry_SE,
        TargetingAdvertiserCountry_IL,
        TargetingAdvertiserCountry_DE,
        TargetingAdvertiserCountry_AT,
        TargetingAdvertiserCountry_IT,
        TargetingAdvertiserCountry_ES,
        TargetingAdvertiserCountry_NL,
        TargetingAdvertiserCountry_BE,
        TargetingAdvertiserCountry_PT,
        TargetingAdvertiserCountry_CH,
        TargetingAdvertiserCountry_HK,
        TargetingAdvertiserCountry_JP,
        TargetingAdvertiserCountry_KR,
        TargetingAdvertiserCountry_SG,
        TargetingAdvertiserCountry_NO,
        TargetingAdvertiserCountry_DK,
        TargetingAdvertiserCountry_FI,
        TargetingAdvertiserCountry_CY,
        TargetingAdvertiserCountry_LU,
        TargetingAdvertiserCountry_MT,
        TargetingAdvertiserCountry_PL,
        TargetingAdvertiserCountry_RO,
        TargetingAdvertiserCountry_HU,
        TargetingAdvertiserCountry_CZ,
        TargetingAdvertiserCountry_GR,
        TargetingAdvertiserCountry_SK,
        TargetingAdvertiserCountry_BR,
        TargetingAdvertiserCountry_MX,
        TargetingAdvertiserCountry_AR,
        TargetingAdvertiserCountry_CL,
        TargetingAdvertiserCountry_CO,
    };

    eTargetingAdvertiserCountry getValue() const;
    void setValue(eTargetingAdvertiserCountry const value);

    protected:
        eTargetingAdvertiserCountry m_value;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_TargetingAdvertiserCountry_H_ */