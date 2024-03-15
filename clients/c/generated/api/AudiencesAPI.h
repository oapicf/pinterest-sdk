#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/audience.h"
#include "../model/audience_create_custom_request.h"
#include "../model/audience_create_request.h"
#include "../model/audience_update_request.h"
#include "../model/audiences_list_200_response.h"
#include "../model/error.h"

// Enum ORDER for AudiencesAPI_audiencesList
typedef enum  { pinterest_rest_api_audiencesList_ORDER_NULL = 0, pinterest_rest_api_audiencesList_ORDER_ASCENDING, pinterest_rest_api_audiencesList_ORDER_DESCENDING } pinterest_rest_api_audiencesList_order_e;

// Enum OWNERSHIPTYPE for AudiencesAPI_audiencesList
typedef enum  { pinterest_rest_api_audiencesList_OWNERSHIPTYPE_NULL = 0, pinterest_rest_api_audiencesList_OWNERSHIPTYPE_OWNED, pinterest_rest_api_audiencesList_OWNERSHIPTYPE_RECEIVED } pinterest_rest_api_audiencesList_ownership_type_e;


// Create audience
//
// Create an audience you can use in targeting for specific ad groups. Targeting combines customer information with the ways users interact with Pinterest to help you reach specific groups of users; you can include or exclude specific audience_ids when you create an ad group. <p/> For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>.
//
audience_t*
AudiencesAPI_audiencesCreate(apiClient_t *apiClient, char *ad_account_id, audience_create_request_t *audience_create_request);


// Create custom audience
//
// Create a custom audience and find the audiences you want your ads to reach.
//
audience_t*
AudiencesAPI_audiencesCreateCustom(apiClient_t *apiClient, char *ad_account_id, audience_create_custom_request_t *audience_create_custom_request);


// Get audience
//
// Get a specific audience given the audience ID.
//
audience_t*
AudiencesAPI_audiencesGet(apiClient_t *apiClient, char *ad_account_id, char *audience_id);


// List audiences
//
// Get list of audiences for the ad account.
//
audiences_list_200_response_t*
AudiencesAPI_audiencesList(apiClient_t *apiClient, char *ad_account_id, char *bookmark, pinterest_rest_api_audiencesList_order_e order, int *page_size, pinterest_rest_api_audiencesList_ownership_type_e ownership_type);


// Update audience
//
// Update (edit or remove) an existing targeting audience.
//
audience_t*
AudiencesAPI_audiencesUpdate(apiClient_t *apiClient, char *ad_account_id, char *audience_id, audience_update_request_t *audience_update_request);


