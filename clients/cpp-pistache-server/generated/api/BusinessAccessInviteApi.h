/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.14.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
/*
 * BusinessAccessInviteApi.h
 *
 * 
 */

#ifndef BusinessAccessInviteApi_H_
#define BusinessAccessInviteApi_H_


#include "ApiBase.h"

#include <pistache/http.h>
#include <pistache/router.h>
#include <pistache/http_headers.h>

#include <optional>
#include <utility>

#include "AuthRespondInvitesBody.h"
#include "CancelInvitesBody.h"
#include "CreateAssetAccessRequestBody.h"
#include "CreateAssetAccessRequestResponse.h"
#include "CreateAssetInvitesRequest.h"
#include "CreateInvitesResultsResponseArray.h"
#include "CreateMembershipOrPartnershipInvitesBody.h"
#include "DeleteInvitesResultsResponseArray.h"
#include "Error.h"
#include "Get_invites_200_response.h"
#include "InviteType.h"
#include "RespondToInvitesResponseArray.h"
#include "UpdateInvitesResultsResponseArray.h"
#include <string>
#include <vector>

namespace org::openapitools::server::api
{

class  BusinessAccessInviteApi : public ApiBase {
public:
    explicit BusinessAccessInviteApi(const std::shared_ptr<Pistache::Rest::Router>& rtr);
    ~BusinessAccessInviteApi() override = default;
    void init() override;

    static const std::string base;

private:
    void setupRoutes();

    void asset_access_requests_create_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void cancel_invites_or_requests_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void create_asset_invites_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void create_membership_or_partnership_invites_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void get_invites_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void respond_business_access_invites_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void business_access_invite_api_default_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);

    /// <summary>
    /// Helper function to handle unexpected Exceptions during Parameter parsing and validation.
    /// May be overridden to return custom error formats. This is called inside a catch block.
    /// Important: When overriding, do not call `throw ex;`, but instead use `throw;`.
    /// </summary>
    virtual void handleParsingException(const std::exception& ex, Pistache::Http::ResponseWriter &response) const noexcept;

    /// <summary>
    /// Helper function to handle unexpected Exceptions during Parameter parsing and validation.
    /// May be overridden to return custom error formats. This is called inside a catch block.
    /// Important: When overriding, do not call `throw ex;`, but instead use `throw;`.
    /// </summary>
    virtual std::pair<Pistache::Http::Code, std::string> handleParsingException(const std::exception& ex) const noexcept;

    /// <summary>
    /// Helper function to handle unexpected Exceptions during processing of the request in handler functions.
    /// May be overridden to return custom error formats. This is called inside a catch block.
    /// Important: When overriding, do not call `throw ex;`, but instead use `throw;`.
    /// </summary>
    virtual void handleOperationException(const std::exception& ex, Pistache::Http::ResponseWriter &response) const noexcept;

    /// <summary>
    /// Helper function to handle unexpected Exceptions during processing of the request in handler functions.
    /// May be overridden to return custom error formats. This is called inside a catch block.
    /// Important: When overriding, do not call `throw ex;`, but instead use `throw;`.
    /// </summary>
    virtual std::pair<Pistache::Http::Code, std::string> handleOperationException(const std::exception& ex) const noexcept;

    /// <summary>
    /// Create a request to access an existing partner&#39;s assets.
    /// </summary>
    /// <remarks>
    /// Create a request to access an existing partner&#39;s assets with the specified permissions. The request will be sent to the partner for approval. The assets that can be requested are ad accounts and profiles.
    /// </remarks>
    /// <param name="businessId">Unique identifier of the requesting business.</param>
    /// <param name="createAssetAccessRequestBody"></param>
    virtual void asset_access_requests_create(const std::string &businessId, const org::openapitools::server::model::CreateAssetAccessRequestBody &createAssetAccessRequestBody, Pistache::Http::ResponseWriter &response) = 0;
    /// <summary>
    /// Cancel invites/requests
    /// </summary>
    /// <remarks>
    /// Cancel membership/partnership invites and/or requests.
    /// </remarks>
    /// <param name="businessId">Business id</param>
    /// <param name="cancelInvitesBody">A list with invite ids</param>
    virtual void cancel_invites_or_requests(const std::string &businessId, const org::openapitools::server::model::CancelInvitesBody &cancelInvitesBody, Pistache::Http::ResponseWriter &response) = 0;
    /// <summary>
    /// Update invite/request with an asset permission
    /// </summary>
    /// <remarks>
    /// Assign asset permissions information to an existing invite/request. Can be used to: - Request access to a partner&#39;s asset. Note: This is only for when no existing partnership exists. If an existing   partnership exists, use \&quot;Create a request to access an existing partner&#39;s assets\&quot; to request access to your   partner&#39;s assets.     - invite_type&#x3D;\&quot;PARTNER_REQUEST\&quot; - Invite a partner to access your business assets. Note: This is only for when there is no existing partnership.   If there is an existing partnership, use \&quot;Assign/Update partner asset permissions\&quot; to assign a partner access to   new assets.     - invite_type&#x3D;\&quot;PARTNER_INVITE\&quot; - Invite a member to access your business assets. Note: This is only for when there is no existing membership.   If there is an existing membership, use \&quot;Assign/Update member asset permissions\&quot; to assign a member access to new   assets.     - invite_type&#x3D;\&quot;MEMBER_INVITE\&quot;  To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview.
    /// </remarks>
    /// <param name="businessId">Unique identifier of the requesting business.</param>
    /// <param name="createAssetInvitesRequest">A list of invites/requests together with the asset permissions to be assigned to the invite/request. </param>
    virtual void create_asset_invites(const std::string &businessId, const org::openapitools::server::model::CreateAssetInvitesRequest &createAssetInvitesRequest, Pistache::Http::ResponseWriter &response) = 0;
    /// <summary>
    /// Create invites or requests
    /// </summary>
    /// <remarks>
    /// Create batch invites or requests. Can create batch invites or requests as described below. - Invite members to join the business. This would required specifying the following:     - invite_type&#x3D;\&quot;MEMBER_INVITE\&quot;     - business_role&#x3D;\&quot;EMPLOYEE\&quot; OR business_role&#x3D;\&quot;BIZ_ADMIN\&quot; (To learn more about business roles, visit     https://help.pinterest.com/en/business/article/profile-permissions-in-business-access.)     - members - Invite partners to access your business assets. This would require specifying the following:     - invite_type&#x3D;\&quot;PARTNER_INVITE\&quot;     - business_role&#x3D;\&quot;PARTNER\&quot;     - partners - Request to be a partner so you can access their assets. This would require specifying the following:     - invite_type&#x3D;\&quot;PARTNER_REQUEST\&quot;     - business_role&#x3D;\&quot;PARTNER\&quot;     - partners
    /// </remarks>
    /// <param name="businessId">Business id</param>
    /// <param name="createMembershipOrPartnershipInvitesBody">An object with the properties: invite_type, partners, members, business_role</param>
    virtual void create_membership_or_partnership_invites(const std::string &businessId, const org::openapitools::server::model::CreateMembershipOrPartnershipInvitesBody &createMembershipOrPartnershipInvitesBody, Pistache::Http::ResponseWriter &response) = 0;
    /// <summary>
    /// Get invites/requests
    /// </summary>
    /// <remarks>
    /// Get the membership/partnership invites and/or requests for the authorized user.
    /// </remarks>
    /// <param name="businessId">Unique identifier of the requesting business.</param>
    /// <param name="isMember">A boolean field to indicate whether the invite is to create a partnership or a membership. (optional, default to true)</param>
    /// <param name="inviteStatus">A list of invite statuses to filter invites by. Only invites whose status is in the provided statuses will be returned. (optional, default to std::vector&lt;std::shared_ptr&lt;std::string&gt;&gt;())</param>
    /// <param name="inviteType">Invite type to filter invites by. Only invites of the specified type will be returned. (optional, default to std::make_shared&lt;InviteType&gt;())</param>
    /// <param name="bookmark">Cursor used to fetch the next page of items (optional, default to &quot;&quot;)</param>
    /// <param name="pageSize">Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. (optional, default to 25)</param>
    virtual void get_invites(const std::string &businessId, const std::optional<bool> &isMember, const std::optional<std::vector<std::string>> &inviteStatus, const std::optional<org::openapitools::server::model::InviteType> &inviteType, const std::optional<std::string> &bookmark, const std::optional<int32_t> &pageSize, Pistache::Http::ResponseWriter &response) = 0;
    /// <summary>
    /// Accept or decline an invite/request
    /// </summary>
    /// <remarks>
    /// Accept or decline invites or requests.
    /// </remarks>
    /// <param name="authRespondInvitesBody"></param>
    virtual void respond_business_access_invites(const org::openapitools::server::model::AuthRespondInvitesBody &authRespondInvitesBody, Pistache::Http::ResponseWriter &response) = 0;

};

} // namespace org::openapitools::server::api

#endif /* BusinessAccessInviteApi_H_ */

