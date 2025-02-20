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
* BusinessAccessInviteApiImpl.h
*
* 
*/

#ifndef BUSINESS_ACCESS_INVITE_API_IMPL_H_
#define BUSINESS_ACCESS_INVITE_API_IMPL_H_


#include <pistache/endpoint.h>
#include <pistache/http.h>
#include <pistache/router.h>
#include <memory>
#include <optional>

#include <BusinessAccessInviteApi.h>


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

using namespace org::openapitools::server::model;

class  BusinessAccessInviteApiImpl : public org::openapitools::server::api::BusinessAccessInviteApi {
public:
    explicit BusinessAccessInviteApiImpl(const std::shared_ptr<Pistache::Rest::Router>& rtr);
    ~BusinessAccessInviteApiImpl() override = default;

    void asset_access_requests_create(const std::string &businessId, const CreateAssetAccessRequestBody &createAssetAccessRequestBody, Pistache::Http::ResponseWriter &response);
    void cancel_invites_or_requests(const std::string &businessId, const CancelInvitesBody &cancelInvitesBody, Pistache::Http::ResponseWriter &response);
    void create_asset_invites(const std::string &businessId, const CreateAssetInvitesRequest &createAssetInvitesRequest, Pistache::Http::ResponseWriter &response);
    void create_membership_or_partnership_invites(const std::string &businessId, const CreateMembershipOrPartnershipInvitesBody &createMembershipOrPartnershipInvitesBody, Pistache::Http::ResponseWriter &response);
    void get_invites(const std::string &businessId, const std::optional<bool> &isMember, const std::optional<std::vector<std::string>> &inviteStatus, const std::optional<org::openapitools::server::model::InviteType> &inviteType, const std::optional<std::string> &bookmark, const std::optional<int32_t> &pageSize, Pistache::Http::ResponseWriter &response);
    void respond_business_access_invites(const AuthRespondInvitesBody &authRespondInvitesBody, Pistache::Http::ResponseWriter &response);

};

} // namespace org::openapitools::server::api



#endif
