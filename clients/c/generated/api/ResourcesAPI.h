#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/ad_account_countries_get_200_response.h"
#include "../model/book_closed.h"
#include "../model/delivery_metrics_get_200_response.h"
#include "../model/object.h"
#include "../model/pinterest_lib_error.h"
#include "../model/public_targeting_type.h"
#include "../model/report_type.h"
#include "../model/single_interest_targeting_option.h"

// Enum  for ResourcesAPI_deliveryMetricsGet
typedef enum  { pinterest_rest_api_deliveryMetricsGet__NULL = 0, pinterest_rest_api_deliveryMetricsGet__SYNC, pinterest_rest_api_deliveryMetricsGet__ASYNC } pinterest_rest_api_deliveryMetricsGet_report_type_e;

// Enum  for ResourcesAPI_targetingOptionsGet
typedef enum  { pinterest_rest_api_targetingOptionsGet__NULL = 0, pinterest_rest_api_targetingOptionsGet__APPTYPE, pinterest_rest_api_targetingOptionsGet__GENDER, pinterest_rest_api_targetingOptionsGet__LOCALE, pinterest_rest_api_targetingOptionsGet__AGE_BUCKET, pinterest_rest_api_targetingOptionsGet__LOCATION, pinterest_rest_api_targetingOptionsGet__GEO, pinterest_rest_api_targetingOptionsGet__INTEREST, pinterest_rest_api_targetingOptionsGet__KEYWORD, pinterest_rest_api_targetingOptionsGet__AUDIENCE_INCLUDE, pinterest_rest_api_targetingOptionsGet__AUDIENCE_EXCLUDE } pinterest_rest_api_targetingOptionsGet_targeting_type_e;


// Get ad accounts countries
//
// Get Ad Accounts countries
//
ad_account_countries_get_200_response_t*
ResourcesAPI_adAccountCountriesGet(apiClient_t *apiClient);


// Get available metrics' definitions
//
// Get the definitions for ads and organic metrics available across both synchronous and asynchronous report endpoints. The `display_name` attribute will match how the metric is named in our native tools like Ads Manager. See [Organic Analytics](/docs/api-features/analytics-overview/) and [Ads Analytics](/docs/api-features/ads-reporting/) for more information.
//
delivery_metrics_get_200_response_t*
ResourcesAPI_deliveryMetricsGet(apiClient_t *apiClient, report_type_e report_type);


// Get interest details
//
// Get details of a specific interest given interest ID.  Click [here](https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid=118370875) for a spreadsheet listing interests and their IDs.
//
single_interest_targeting_option_t*
ResourcesAPI_interestTargetingOptionsGet(apiClient_t *apiClient, char *interest_id);


// Get lead form questions
//
// Get a list of all lead form question type names. Some questions might not be used.  **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
//
void
ResourcesAPI_leadFormQuestionsGet(apiClient_t *apiClient);


// Get metrics ready state
//
// Learn whether conversion or non-conversion metrics are finalized and ready to query.
//
book_closed_t*
ResourcesAPI_metricsReadyStateGet(apiClient_t *apiClient, char *date);


// Get targeting options
//
//     You can use targeting values in ads placement to define your intended audience.      Targeting metrics are organized around targeting specifications.      For more information on ads targeting, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting).      **Sample return:**      ```     [{\"36313\": \"Australia: Moreton Bay - North\", \"124735\": \"Canada: North Battleford\", \"36109\": \"Australia: Murray\", \"36108\": \"Australia: Mid North Coast\", \"36101\": \"Australia: Capital Region\", \"811\": \"U.S.: Reno\", \"36103\": \"Australia: Central West\", \"36102\": \"Australia: Central Coast\", \"36105\": \"Australia: Far West and Orana\", \"36104\": \"Australia: Coffs Harbour - Grafton\", \"36107\": \"Australia: Illawarra\", \"36106\": \"Australia: Hunter Valley Exc Newcastle\", \"554017\": \"New Zealand: Wanganui\", \"554016\": \"New Zealand: Marlborough\", \"554015\": \"New Zealand: Gisborne\", \"554014\": \"New Zealand: Tararua\", \"554013\": \"New Zealand: Invercargill\", \"GR\": \"Greece\", \"554011\": \"New Zealand: Whangarei\", \"554010\": \"New Zealand: Far North\", \"717\": \"U.S.: Quincy-Hannibal-Keokuk\", \"716\": \"U.S.: Baton Rouge\",...}]     ```
//
list_t*
ResourcesAPI_targetingOptionsGet(apiClient_t *apiClient, public_targeting_type_e targeting_type, char *ad_account_id, char *client_id, char *oauth_signature, char *timestamp);


