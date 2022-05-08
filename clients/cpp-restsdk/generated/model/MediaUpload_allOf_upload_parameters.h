/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.3.0
 * Contact: pinterest-api@pinterest.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 5.4.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * MediaUpload_allOf_upload_parameters.h
 *
 * The list of parameter key/value pairs you will need to send with your POST request to upload your media file.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_MediaUpload_allOf_upload_parameters_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_MediaUpload_allOf_upload_parameters_H_


#include "ModelBase.h"

#include <cpprest/details/basic_types.h>

namespace org {
namespace openapitools {
namespace client {
namespace model {


/// <summary>
/// The list of parameter key/value pairs you will need to send with your POST request to upload your media file.
/// </summary>
class  MediaUpload_allOf_upload_parameters
    : public ModelBase
{
public:
    MediaUpload_allOf_upload_parameters();
    virtual ~MediaUpload_allOf_upload_parameters();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// MediaUpload_allOf_upload_parameters members

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getXAmzDate() const;
    bool xAmzDateIsSet() const;
    void unsetX_amz_date();

    void setXAmzDate(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getXAmzSignature() const;
    bool xAmzSignatureIsSet() const;
    void unsetX_amz_signature();

    void setXAmzSignature(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getXAmzSecurityToken() const;
    bool xAmzSecurityTokenIsSet() const;
    void unsetX_amz_security_token();

    void setXAmzSecurityToken(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getXAmzAlgorithm() const;
    bool xAmzAlgorithmIsSet() const;
    void unsetX_amz_algorithm();

    void setXAmzAlgorithm(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getKey() const;
    bool keyIsSet() const;
    void unsetKey();

    void setKey(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getPolicy() const;
    bool policyIsSet() const;
    void unsetPolicy();

    void setPolicy(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getXAmzCredential() const;
    bool xAmzCredentialIsSet() const;
    void unsetX_amz_credential();

    void setXAmzCredential(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getContentType() const;
    bool contentTypeIsSet() const;
    void unsetContent_Type();

    void setContentType(const utility::string_t& value);


protected:
    utility::string_t m_X_amz_date;
    bool m_X_amz_dateIsSet;
    utility::string_t m_X_amz_signature;
    bool m_X_amz_signatureIsSet;
    utility::string_t m_X_amz_security_token;
    bool m_X_amz_security_tokenIsSet;
    utility::string_t m_X_amz_algorithm;
    bool m_X_amz_algorithmIsSet;
    utility::string_t m_Key;
    bool m_KeyIsSet;
    utility::string_t m_Policy;
    bool m_PolicyIsSet;
    utility::string_t m_X_amz_credential;
    bool m_X_amz_credentialIsSet;
    utility::string_t m_Content_Type;
    bool m_Content_TypeIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_MediaUpload_allOf_upload_parameters_H_ */