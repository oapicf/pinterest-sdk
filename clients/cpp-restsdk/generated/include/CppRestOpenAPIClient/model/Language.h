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
 * Language.h
 *
 * Language code, which is among the offical ISO 639-1 language list.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_Language_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_Language_H_


#include "CppRestOpenAPIClient/ModelBase.h"


namespace org {
namespace openapitools {
namespace client {
namespace model {


class  Language
    : public ModelBase
{
public:
    Language();
    virtual ~Language();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    enum class eLanguage
    {
        Language_AM,
        Language_AR,
        Language_AZ,
        Language_BG,
        Language_BN,
        Language_BS,
        Language_CA,
        Language_CS,
        Language_DA,
        Language_DV,
        Language_DZ,
        Language_DE,
        Language_EL,
        Language_EN,
        Language_ES,
        Language_ET,
        Language_FA,
        Language_FI,
        Language_FR,
        Language_HE,
        Language_HI,
        Language_HR,
        Language_HU,
        Language_HY,
        Language_ID,
        Language_IN,
        Language_IS,
        Language_IT,
        Language_IW,
        Language_JA,
        Language_KA,
        Language_KM,
        Language_KO,
        Language_LO,
        Language_LT,
        Language_LV,
        Language_MK,
        Language_MN,
        Language_MS,
        Language_MY,
        Language_NB,
        Language_NE,
        Language_NL,
        Language_NO,
        Language_PL,
        Language_PT,
        Language_RO,
        Language_RU,
        Language_SK,
        Language_SL,
        Language_SQ,
        Language_SR,
        Language_SV,
        Language_TL,
        Language_UK,
        Language_VI,
        Language_TE,
        Language_TH,
        Language_TR,
        Language_XX,
        Language_ZH,
    };

    eLanguage getValue() const;
    void setValue(eLanguage const value);

    protected:
        eLanguage m_value;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_Language_H_ */
