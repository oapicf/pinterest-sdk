#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/brand_account.h"
#include "../model/brand_account_create.h"
#include "../model/brand_account_update.h"
#include "../model/business_membership_member.h"
#include "../model/delete_business_membership_200_response.h"
#include "../model/delete_business_membership_body.h"
#include "../model/delete_business_partners.h"
#include "../model/delete_business_partners_delete.h"
#include "../model/get_business_employers_200_response.h"
#include "../model/member_business_role.h"
#include "../model/partner_type.h"
#include "../model/pinterest_lib_error.h"
#include "../model/system_user_update_with_required_body.h"
#include "../model/update_business_memberships_response.h"

// Enum BUSINESSROLES for BusinessAccessRelationshipsAPI_getBusinessMembers
typedef enum  { pinterest_rest_api_getBusinessMembers_BUSINESSROLES_NULL = 0, pinterest_rest_api_getBusinessMembers_BUSINESSROLES_EMPLOYEE, pinterest_rest_api_getBusinessMembers_BUSINESSROLES_BIZ_ADMIN } pinterest_rest_api_getBusinessMembers_business_roles_e;

// Enum  for BusinessAccessRelationshipsAPI_getBusinessPartners
typedef enum  { pinterest_rest_api_getBusinessPartners__NULL = 0, pinterest_rest_api_getBusinessPartners__INTERNAL, pinterest_rest_api_getBusinessPartners__EXTERNAL } pinterest_rest_api_getBusinessPartners_partner_type_e;


// Create a Brand Account
//
// Create a Brand Account that will be a child business of a business hierarchy. Request must contain name, username, and country.
//
brand_account_t*
BusinessAccessRelationshipsAPI_brandAccountsCreate(apiClient_t *apiClient, char *business_hierarchy_id, brand_account_create_t *brand_account_create);


// Update a Brand Account
//
// Update an existing Brand Account
//
brand_account_t*
BusinessAccessRelationshipsAPI_brandAccountsUpdate(apiClient_t *apiClient, char *brand_account_id, char *business_hierarchy_id, brand_account_update_t *brand_account_update);


// Terminate business memberships
//
// Terminate memberships between the specified members and your business.
//
delete_business_membership_200_response_t*
BusinessAccessRelationshipsAPI_deleteBusinessMembership(apiClient_t *apiClient, char *business_id, delete_business_membership_body_t *delete_business_membership_body);


// Terminate business partnerships
//
// Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.
//
delete_business_partners_t*
BusinessAccessRelationshipsAPI_deleteBusinessPartners(apiClient_t *apiClient, char *business_id, delete_business_partners_delete_t *delete_business_partners_delete);


// List business employers for user
//
// Get all of the viewing user's business employers.
//
get_business_employers_200_response_t*
BusinessAccessRelationshipsAPI_getBusinessEmployers(apiClient_t *apiClient, int *assets_summary, char *bookmark, int *page_size);


// Get business members
//
// Get all members of the specified business. The return response will include the member's business_role and assets they have access to if assets_summary=TRUE
//
get_business_employers_200_response_t*
BusinessAccessRelationshipsAPI_getBusinessMembers(apiClient_t *apiClient, char *business_id, int *fetch_system_users, int *assets_summary, list_t *business_roles, char *member_ids, int *start_index, char *bookmark, int *page_size);


// Get business partners
//
// Get all partners of the specified business.  If the assets_summary=TRUE and: - partner_type=INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type=EXTERNAL, the business assets returned are your partner's business assets the partner has granted you   access to.
//
get_business_employers_200_response_t*
BusinessAccessRelationshipsAPI_getBusinessPartners(apiClient_t *apiClient, char *business_id, int *assets_summary, partner_type_e partner_type, char *partner_ids, int *start_index, int *sort_ascending, char *bookmark, int *page_size);


// Update a system user information.
//
// Update a system user information such as name.
//
void
BusinessAccessRelationshipsAPI_systemUserUpdate(apiClient_t *apiClient, char *business_id, char *system_user_id, system_user_update_with_required_body_t *system_user_update_with_required_body);


// Update member's business role
//
// Update a member's business role within the business.
//
update_business_memberships_response_t*
BusinessAccessRelationshipsAPI_updateBusinessMemberships(apiClient_t *apiClient, char *business_id, list_t *business_membership_member);


