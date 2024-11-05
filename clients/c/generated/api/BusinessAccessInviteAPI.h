#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/auth_respond_invites_body.h"
#include "../model/cancel_invites_body.h"
#include "../model/create_asset_access_request_body.h"
#include "../model/create_asset_access_request_response.h"
#include "../model/create_asset_invites_request.h"
#include "../model/create_invites_results_response_array.h"
#include "../model/create_membership_or_partnership_invites_body.h"
#include "../model/delete_invites_results_response_array.h"
#include "../model/error.h"
#include "../model/get_invites_200_response.h"
#include "../model/invite_type.h"
#include "../model/respond_to_invites_response_array.h"
#include "../model/update_invites_results_response_array.h"

// Enum INVITESTATUS for BusinessAccessInviteAPI_getInvites
typedef enum  { pinterest_rest_api_getInvites_INVITESTATUS_NULL = 0, pinterest_rest_api_getInvites_INVITESTATUS_PENDING, pinterest_rest_api_getInvites_INVITESTATUS_EXPIRED } pinterest_rest_api_getInvites_invite_status_e;

// Enum  for BusinessAccessInviteAPI_getInvites
typedef enum  { pinterest_rest_api_getInvites__NULL = 0, pinterest_rest_api_getInvites__MEMBER_INVITE, pinterest_rest_api_getInvites__PARTNER_INVITE, pinterest_rest_api_getInvites__PARTNER_REQUEST } pinterest_rest_api_getInvites_invite_type_e;


// Create a request to access an existing partner's assets.
//
// Create a request to access an existing partner's assets with the specified permissions. The request will be sent to the partner for approval. The assets that can be requested are ad accounts and profiles.
//
create_asset_access_request_response_t*
BusinessAccessInviteAPI_assetAccessRequestsCreate(apiClient_t *apiClient, char *business_id, create_asset_access_request_body_t *create_asset_access_request_body);


// Cancel invites/requests
//
// Cancel membership/partnership invites and/or requests.
//
delete_invites_results_response_array_t*
BusinessAccessInviteAPI_cancelInvitesOrRequests(apiClient_t *apiClient, char *business_id, cancel_invites_body_t *cancel_invites_body);


// Update invite/request with an asset permission
//
// Assign asset permissions information to an existing invite/request. Can be used to: - Request access to a partner's asset. Note: This is only for when no existing partnership exists. If an existing   partnership exists, use \"Create a request to access an existing partner's assets\" to request access to your   partner's assets.     - invite_type=\"PARTNER_REQUEST\" - Invite a partner to access your business assets. Note: This is only for when there is no existing partnership.   If there is an existing partnership, use \"Assign/Update partner asset permissions\" to assign a partner access to   new assets.     - invite_type=\"PARTNER_INVITE\" - Invite a member to access your business assets. Note: This is only for when there is no existing membership.   If there is an existing membership, use \"Assign/Update member asset permissions\" to assign a member access to new   assets.     - invite_type=\"MEMBER_INVITE\"  To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview.
//
update_invites_results_response_array_t*
BusinessAccessInviteAPI_createAssetInvites(apiClient_t *apiClient, char *business_id, create_asset_invites_request_t *create_asset_invites_request);


// Create invites or requests
//
// Create batch invites or requests. Can create batch invites or requests as described below. - Invite members to join the business. This would required specifying the following:     - invite_type=\"MEMBER_INVITE\"     - business_role=\"EMPLOYEE\" OR business_role=\"BIZ_ADMIN\" (To learn more about business roles, visit     https://help.pinterest.com/en/business/article/profile-permissions-in-business-access.)     - members - Invite partners to access your business assets. This would require specifying the following:     - invite_type=\"PARTNER_INVITE\"     - business_role=\"PARTNER\"     - partners - Request to be a partner so you can access their assets. This would require specifying the following:     - invite_type=\"PARTNER_REQUEST\"     - business_role=\"PARTNER\"     - partners
//
create_invites_results_response_array_t*
BusinessAccessInviteAPI_createMembershipOrPartnershipInvites(apiClient_t *apiClient, char *business_id, create_membership_or_partnership_invites_body_t *create_membership_or_partnership_invites_body);


// Get invites/requests
//
// Get the membership/partnership invites and/or requests for the authorized user.
//
get_invites_200_response_t*
BusinessAccessInviteAPI_getInvites(apiClient_t *apiClient, char *business_id, int *is_member, list_t *invite_status, invite_type_e invite_type, char *bookmark, int *page_size);


// Accept or decline an invite/request
//
// Accept or decline invites or requests.
//
respond_to_invites_response_array_t*
BusinessAccessInviteAPI_respondBusinessAccessInvites(apiClient_t *apiClient, auth_respond_invites_body_t *auth_respond_invites_body);


