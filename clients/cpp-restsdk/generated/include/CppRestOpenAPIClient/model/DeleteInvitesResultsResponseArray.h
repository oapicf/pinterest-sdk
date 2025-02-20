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
 * DeleteInvitesResultsResponseArray.h
 *
 * Response to delete invites sent to Members or Partners, if there is an exception, return the exception mapped with the invite id
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_DeleteInvitesResultsResponseArray_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_DeleteInvitesResultsResponseArray_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include "CppRestOpenAPIClient/model/DeleteInvitesResultsResponseArray_items_inner.h"
#include <vector>

namespace org {
namespace openapitools {
namespace client {
namespace model {

class DeleteInvitesResultsResponseArray_items_inner;


/// <summary>
/// Response to delete invites sent to Members or Partners, if there is an exception, return the exception mapped with the invite id
/// </summary>
class  DeleteInvitesResultsResponseArray
    : public ModelBase
{
public:
    DeleteInvitesResultsResponseArray();
    virtual ~DeleteInvitesResultsResponseArray();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// DeleteInvitesResultsResponseArray members

    /// <summary>
    /// List of invite/Request deletion status. If there is an error, an exception object will be returned. If the invite/request was successfully cancelled, an invite object will be returned for the invite that was cancelled.
    /// </summary>
    std::vector<std::shared_ptr<DeleteInvitesResultsResponseArray_items_inner>>& getItems();
    bool itemsIsSet() const;
    void unsetItems();

    void setItems(const std::vector<std::shared_ptr<DeleteInvitesResultsResponseArray_items_inner>>& value);


protected:
    std::vector<std::shared_ptr<DeleteInvitesResultsResponseArray_items_inner>> m_Items;
    bool m_ItemsIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_DeleteInvitesResultsResponseArray_H_ */
