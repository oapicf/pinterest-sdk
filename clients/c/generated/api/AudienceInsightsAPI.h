#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/audience_definition_response.h"
#include "../model/audience_insight_type.h"
#include "../model/audience_insights_response.h"
#include "../model/error.h"

// Enum  for AudienceInsightsAPI_audienceInsightsGet
typedef enum  { pinterest_rest_api_audienceInsightsGet__NULL = 0, pinterest_rest_api_audienceInsightsGet__YOUR_TOTAL_AUDIENCE, pinterest_rest_api_audienceInsightsGet__YOUR_ENGAGED_AUDIENCE, pinterest_rest_api_audienceInsightsGet__PINTEREST_TOTAL_AUDIENCE } pinterest_rest_api_audienceInsightsGet_audience_insight_type_e;


// Get audience insights
//
// Get Audience Insights for an ad account. The response will return insights for 3 types of audiences: the ad account's engaged audience on Pinterest, the ad account's total audience on Pinterest and Pinterest's total audience.<p/> <a href=\"https://help.pinterest.com/en/business/article/audience-insights\" target=\"_blank\">Learn more about Audience Insights</a>.
//
audience_insights_response_t*
AudienceInsightsAPI_audienceInsightsGet(apiClient_t *apiClient, char *ad_account_id, audience_insight_type_e audience_insight_type);


// Get audience insights scope and type
//
// Get the scope and type of available audiences, which along with a date, is an audience that has recently had an interaction (referred to here as a type) on pins. Interacted pins can belong to at least the most common **partner** or **Pinterest** scopes. This means that user interactions made on advertiser or partner pins will have the **partner** scope. You can also have user interactions performed in general on Pinterest with the **Pinterest** scope. In that case, you can then use the returned type and scope values together on requests to other endpoints to retrieve insight metrics for a desired audience.
//
audience_definition_response_t*
AudienceInsightsAPI_audienceInsightsScopeAndTypeGet(apiClient_t *apiClient, char *ad_account_id);


