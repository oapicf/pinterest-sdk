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
 * MatchType.h
 *
 * Keyword match type
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_MatchType_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_MatchType_H_


#include "CppRestOpenAPIClient/ModelBase.h"


namespace org {
namespace openapitools {
namespace client {
namespace model {

class  MatchType
    : public ModelBase
{
public:
    MatchType();
    virtual ~MatchType();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    enum class eMatchType
    {
        MatchType_BROAD,
        MatchType_PHRASE,
        MatchType_EXACT,
        MatchType_EXACT_NEGATIVE,
        MatchType_PHRASE_NEGATIVE,
    };

    eMatchType getValue() const;
    void setValue(eMatchType const value);

    protected:
        eMatchType m_value;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_MatchType_H_ */