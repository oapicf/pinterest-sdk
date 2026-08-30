#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/ad_accounts_audience.h"
#include "../model/ad_accounts_audience_create.h"
#include "../model/ad_accounts_audience_update.h"
#include "../model/audience_ownership_type.h"
#include "../model/audiences_list_200_response.h"
#include "../model/pinterest_lib_error.h"
#include "../model/pinterest_lib_pagination_order.h"

// Enum  for AudiencesAPI_audiencesList
typedef enum  { pinterest_rest_api_audiencesList__NULL = 0, pinterest_rest_api_audiencesList__ASCENDING, pinterest_rest_api_audiencesList__DESCENDING } pinterest_rest_api_audiencesList_order_e;

// Enum  for AudiencesAPI_audiencesList
typedef enum  { pinterest_rest_api_audiencesList__NULL = 0, pinterest_rest_api_audiencesList__OWNED, pinterest_rest_api_audiencesList__RECEIVED } pinterest_rest_api_audiencesList_ownership_type_e;


// Create audience
//
// Create a new audience for the ad account.
//
ad_accounts_audience_t*
AudiencesAPI_audiencesCreate(apiClient_t *apiClient, char *ad_account_id, ad_accounts_audience_create_t *ad_accounts_audience_create);


// Get audience
//
// Get a specific audience given the audience ID.
//
ad_accounts_audience_t*
AudiencesAPI_audiencesGet(apiClient_t *apiClient, char *audience_id, char *ad_account_id);


// List audiences
//
// Get list of audiences for the ad account.
//
audiences_list_200_response_t*
AudiencesAPI_audiencesList(apiClient_t *apiClient, char *ad_account_id, char *bookmark, int *page_size, pinterest_lib_pagination_order_e order, audience_ownership_type_e ownership_type, int *exclude_nca);


// Update audience
//
// Update an existing audience for the ad account.
//
ad_accounts_audience_t*
AudiencesAPI_audiencesUpdate(apiClient_t *apiClient, char *audience_id, char *ad_account_id, ad_accounts_audience_update_t *ad_accounts_audience_update);


