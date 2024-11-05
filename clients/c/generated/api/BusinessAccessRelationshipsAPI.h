#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/delete_partners_request.h"
#include "../model/delete_partners_response.h"
#include "../model/deleted_members_response.h"
#include "../model/error.h"
#include "../model/get_business_employers_200_response.h"
#include "../model/get_business_members_200_response.h"
#include "../model/get_business_partners_200_response.h"
#include "../model/member_business_role.h"
#include "../model/members_to_delete_body.h"
#include "../model/partner_type.h"
#include "../model/update_member_business_role_body.h"
#include "../model/update_member_results_response_array.h"

// Enum BUSINESSROLES for BusinessAccessRelationshipsAPI_getBusinessMembers
typedef enum  { pinterest_rest_api_getBusinessMembers_BUSINESSROLES_NULL = 0, pinterest_rest_api_getBusinessMembers_BUSINESSROLES_EMPLOYEE, pinterest_rest_api_getBusinessMembers_BUSINESSROLES_BIZ_ADMIN } pinterest_rest_api_getBusinessMembers_business_roles_e;

// Enum  for BusinessAccessRelationshipsAPI_getBusinessPartners
typedef enum  { pinterest_rest_api_getBusinessPartners__NULL = 0, pinterest_rest_api_getBusinessPartners__INTERNAL, pinterest_rest_api_getBusinessPartners__EXTERNAL } pinterest_rest_api_getBusinessPartners_partner_type_e;


// Terminate business memberships
//
// Terminate memberships between the specified members and your business.
//
deleted_members_response_t*
BusinessAccessRelationshipsAPI_deleteBusinessMembership(apiClient_t *apiClient, char *business_id, members_to_delete_body_t *members_to_delete_body);


// Terminate business partnerships
//
// Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.
//
delete_partners_response_t*
BusinessAccessRelationshipsAPI_deleteBusinessPartners(apiClient_t *apiClient, char *business_id, delete_partners_request_t *delete_partners_request);


// List business employers for user
//
// Get all of the viewing user's business employers.
//
get_business_employers_200_response_t*
BusinessAccessRelationshipsAPI_getBusinessEmployers(apiClient_t *apiClient, int *page_size, char *bookmark);


// Get business members
//
// Get all members of the specified business. The return response will include the member's business_role and assets they have access to if assets_summary=TRUE
//
get_business_members_200_response_t*
BusinessAccessRelationshipsAPI_getBusinessMembers(apiClient_t *apiClient, char *business_id, int *assets_summary, list_t *business_roles, char *member_ids, int *start_index, char *bookmark, int *page_size);


// Get business partners
//
// Get all partners of the specified business.  If the assets_summary=TRUE and: - partner_type=INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type=EXTERNAL, the business assets returned are your partner's business assets the partner has granted you   access to.
//
get_business_partners_200_response_t*
BusinessAccessRelationshipsAPI_getBusinessPartners(apiClient_t *apiClient, char *business_id, int *assets_summary, partner_type_e partner_type, char *partner_ids, int *start_index, int *page_size, char *bookmark);


// Update member's business role
//
// Update a member's business role within the business.
//
update_member_results_response_array_t*
BusinessAccessRelationshipsAPI_updateBusinessMemberships(apiClient_t *apiClient, char *business_id, list_t *update_member_business_role_body);


