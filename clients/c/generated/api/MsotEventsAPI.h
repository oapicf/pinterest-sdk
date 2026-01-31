#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/conversion_msot_events.h"
#include "../model/error.h"


// Send Measurement Source Of Truth (MSOT) attributed conversion events
//
// <strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong> <br> <p>Advertisers or their measurement partners can send attributed MSOT conversion events to Pinterest based on their <code>ad_account_id</code>. The request body should be a JSON object.</p> - These events will NOT be used in Reporting.
//
void
MsotEventsAPI_msotEventsCreate(apiClient_t *apiClient, char *ad_account_id, conversion_msot_events_t *conversion_msot_events);


