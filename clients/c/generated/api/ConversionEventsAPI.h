#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/conversion_events.h"
#include "../model/conversion_events_create.h"
#include "../model/detailed_error.h"
#include "../model/pinterest_lib_error.h"


// Send conversions
//
// The Pinterest API offers advertisers a way to send Pinterest their conversion information (including web conversions, in-app conversions, or even offline conversions) based on their `ad_account_id`. The request body should be a JSON object. - This endpoint requires an `access_token` be generated through Ads Manager. Review the [Conversions Guide](/docs/api-features/conversion-overview/) for more details. (Note that the authorization header required is `Authorization: Bearer <access_token>`). - The token's `user_account` must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Audience, Campaign. (Note that the token can be used across multiple ad accounts under an user ID.) - This endpoint has a rate limit of 5,000 calls per minute per ad account. - If the merchant is submitting this information using both Pinterest conversion tags and the Pinterest API, Pinterest will remove duplicate information before reporting. (Note that events that took place offline cannot be deduplicated.)
//
conversion_events_t*
ConversionEventsAPI_eventsCreate(apiClient_t *apiClient, char *ad_account_id, conversion_events_create_t *conversion_events_create, int *test);


