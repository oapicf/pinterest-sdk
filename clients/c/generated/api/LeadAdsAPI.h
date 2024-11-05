#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/ad_account_create_subscription_request.h"
#include "../model/ad_account_create_subscription_response.h"
#include "../model/ad_account_get_subscription_response.h"
#include "../model/ad_accounts_subscriptions_get_list_200_response.h"
#include "../model/error.h"


// Delete lead ads subscription
//
// Delete an existing lead ads webhook subscription by ID. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>
//
void
LeadAdsAPI_adAccountsSubscriptionsDelById(apiClient_t *apiClient, char *ad_account_id, char *subscription_id);


// Get lead ads subscription
//
// Get a specific lead ads subscription record. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>
//
ad_account_get_subscription_response_t*
LeadAdsAPI_adAccountsSubscriptionsGetById(apiClient_t *apiClient, char *ad_account_id, char *subscription_id);


// Get lead ads subscriptions
//
// Get the advertiser's list of lead ads subscriptions. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>
//
ad_accounts_subscriptions_get_list_200_response_t*
LeadAdsAPI_adAccountsSubscriptionsGetList(apiClient_t *apiClient, char *ad_account_id, int *page_size, char *bookmark);


// Create lead ads subscription
//
// Create a lead ads webhook subscription. Subscriptions allow Pinterest to deliver lead data from Ads Manager directly to the subscriber. Subscriptions can exist for a specific lead form or at ad account level. - Only requests for the OWNER or ADMIN of the ad_account will be allowed. - Advertisers can set up multiple integrations using ad_account_id + lead_form_id but only one integration per unique records. - For data security, egress lead data is encrypted with AES-256-GCM.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>
//
ad_account_create_subscription_response_t*
LeadAdsAPI_adAccountsSubscriptionsPost(apiClient_t *apiClient, char *ad_account_id, ad_account_create_subscription_request_t *ad_account_create_subscription_request);


