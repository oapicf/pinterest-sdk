#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/advertiser_defined_events_response.h"
#include "../model/error.h"


// Get advertiser defined events
//
// <p>Get advertiser defined events for the given ad account.</p>
//
advertiser_defined_events_response_t*
ConversionsAPI_advertiserDefinedEventsGet(apiClient_t *apiClient, char *ad_account_id);


