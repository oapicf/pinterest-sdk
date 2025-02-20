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
 * CreateInvitesResultsResponseArray_items_inner.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_CreateInvitesResultsResponseArray_items_inner_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_CreateInvitesResultsResponseArray_items_inner_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include "CppRestOpenAPIClient/model/CreateInvitesResultsResponseArray_items_inner_invite.h"
#include "CppRestOpenAPIClient/model/InviteExceptionResponse.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

class InviteExceptionResponse;
class CreateInvitesResultsResponseArray_items_inner_invite;


/// <summary>
/// 
/// </summary>
class  CreateInvitesResultsResponseArray_items_inner
    : public ModelBase
{
public:
    CreateInvitesResultsResponseArray_items_inner();
    virtual ~CreateInvitesResultsResponseArray_items_inner();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// CreateInvitesResultsResponseArray_items_inner members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<InviteExceptionResponse> getException() const;
    bool exceptionIsSet() const;
    void unsetException();

    void setException(const std::shared_ptr<InviteExceptionResponse>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<CreateInvitesResultsResponseArray_items_inner_invite> getInvite() const;
    bool inviteIsSet() const;
    void unsetInvite();

    void setInvite(const std::shared_ptr<CreateInvitesResultsResponseArray_items_inner_invite>& value);


protected:
    std::shared_ptr<InviteExceptionResponse> m_Exception;
    bool m_ExceptionIsSet;
    std::shared_ptr<CreateInvitesResultsResponseArray_items_inner_invite> m_Invite;
    bool m_InviteIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_CreateInvitesResultsResponseArray_items_inner_H_ */
