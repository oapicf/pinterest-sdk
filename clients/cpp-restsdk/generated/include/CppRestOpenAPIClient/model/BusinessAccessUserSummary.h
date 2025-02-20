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
 * BusinessAccessUserSummary.h
 *
 * Metadata of the member/partner that has access to the asset.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_BusinessAccessUserSummary_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_BusinessAccessUserSummary_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include <cpprest/details/basic_types.h>

namespace org {
namespace openapitools {
namespace client {
namespace model {



/// <summary>
/// Metadata of the member/partner that has access to the asset.
/// </summary>
class  BusinessAccessUserSummary
    : public ModelBase
{
public:
    BusinessAccessUserSummary();
    virtual ~BusinessAccessUserSummary();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// BusinessAccessUserSummary members

    /// <summary>
    /// Email of the business member/partner.
    /// </summary>
    utility::string_t getEmail() const;
    bool emailIsSet() const;
    void unsetEmail();

    void setEmail(const utility::string_t& value);

    /// <summary>
    /// Unique identifier of the business member/partner.
    /// </summary>
    utility::string_t getId() const;
    bool idIsSet() const;
    void unsetId();

    void setId(const utility::string_t& value);

    /// <summary>
    /// Username of the business member/partner.
    /// </summary>
    utility::string_t getUsername() const;
    bool usernameIsSet() const;
    void unsetUsername();

    void setUsername(const utility::string_t& value);


protected:
    utility::string_t m_Email;
    bool m_EmailIsSet;
    utility::string_t m_Id;
    bool m_IdIsSet;
    utility::string_t m_Username;
    bool m_UsernameIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_BusinessAccessUserSummary_H_ */
