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
 * TermsOfService.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_TermsOfService_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_TermsOfService_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include <cpprest/details/basic_types.h>

namespace org {
namespace openapitools {
namespace client {
namespace model {


/// <summary>
/// 
/// </summary>
class  TermsOfService
    : public ModelBase
{
public:
    TermsOfService();
    virtual ~TermsOfService();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// TermsOfService members

    /// <summary>
    /// The ID of the terms of service
    /// </summary>
    utility::string_t getId() const;
    bool idIsSet() const;
    void unsetId();

    void setId(const utility::string_t& value);

    /// <summary>
    /// The terms of service content
    /// </summary>
    utility::string_t getHtml() const;
    bool htmlIsSet() const;
    void unsetHtml();

    void setHtml(const utility::string_t& value);

    /// <summary>
    /// Whether the ad account has accepted terms of service.
    /// </summary>
    bool isHasAccepted() const;
    bool hasAcceptedIsSet() const;
    void unsetHas_accepted();

    void setHasAccepted(bool value);

    /// <summary>
    /// The ID of the ad account.
    /// </summary>
    utility::string_t getAdAccountId() const;
    bool adAccountIdIsSet() const;
    void unsetAd_account_id();

    void setAdAccountId(const utility::string_t& value);


protected:
    utility::string_t m_Id;
    bool m_IdIsSet;
    utility::string_t m_Html;
    bool m_HtmlIsSet;
    bool m_Has_accepted;
    bool m_Has_acceptedIsSet;
    utility::string_t m_Ad_account_id;
    bool m_Ad_account_idIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_TermsOfService_H_ */