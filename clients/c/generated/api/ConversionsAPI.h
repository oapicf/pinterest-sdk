#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/advertiser_defined_events_create_200_response.h"
#include "../model/advertiser_defined_events_create_request.h"
#include "../model/advertiser_defined_events_get_200_response.h"
#include "../model/pinterest_lib_error.h"


// Create advertiser defined events
//
// Map advertiser defined events to standard events for the given ad account.
//
advertiser_defined_events_create_200_response_t*
ConversionsAPI_advertiserDefinedEventsCreate(apiClient_t *apiClient, char *ad_account_id, advertiser_defined_events_create_request_t *advertiser_defined_events_create_request);


// Delete advertiser defined events
//
// Untrack advertiser defined events for the given ad account.
//
advertiser_defined_events_create_200_response_t*
ConversionsAPI_advertiserDefinedEventsDelete(apiClient_t *apiClient, char *ad_account_id, list_t *event_names);


// Get advertiser defined events
//
// Get advertiser defined events for the given ad account.
//
advertiser_defined_events_get_200_response_t*
ConversionsAPI_advertiserDefinedEventsGet(apiClient_t *apiClient, char *ad_account_id);


// Update advertiser defined events
//
// Update advertiser defined event names or mappings for the given ad account.
//
advertiser_defined_events_create_200_response_t*
ConversionsAPI_advertiserDefinedEventsUpdate(apiClient_t *apiClient, char *ad_account_id, advertiser_defined_events_create_request_t *advertiser_defined_events_create_request);


