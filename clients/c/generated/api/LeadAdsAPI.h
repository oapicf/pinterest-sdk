#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/ad_accounts_subscriptions_get_list_200_response.h"
#include "../model/lead_subscription.h"
#include "../model/lead_subscription_post_params_create.h"
#include "../model/pinterest_lib_error.h"


// Delete lead ads subscription
//
// Delete an existing lead ads webhook subscription by ID.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.'
//
lead_subscription_t*
LeadAdsAPI_adAccountsSubscriptionsDelById(apiClient_t *apiClient, char *ad_account_id, char *subscription_id);


// Get lead ads subscription by ID
//
// Get an existing lead ads webhook subscription by ID.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.'
//
lead_subscription_t*
LeadAdsAPI_adAccountsSubscriptionsGetById(apiClient_t *apiClient, char *ad_account_id, char *subscription_id);


// Get lead ads subscriptions
//
// Get the advertiser's list of lead ads subscriptions. Only requests for the OWNER or ADMIN of the ad_account will be allowed.
//
ad_accounts_subscriptions_get_list_200_response_t*
LeadAdsAPI_adAccountsSubscriptionsGetList(apiClient_t *apiClient, char *ad_account_id, char *bookmark, int *page_size);


// Create lead ads subscription
//
// Create a lead ads webhook subscription. Subscriptions allow Pinterest to deliver lead data from Ads Manager directly to the subscriber. Subscriptions can exist for a specific lead form or at ad account level.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.   - Advertisers can set up multiple integrations using ad_account_id + lead_form_id but only one integration per unique records.   - For data security, egress lead data is encrypted with AES-256-GCM.
//
lead_subscription_t*
LeadAdsAPI_adAccountsSubscriptionsPost(apiClient_t *apiClient, char *ad_account_id, lead_subscription_post_params_create_t *lead_subscription_post_params_create);


