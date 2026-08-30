#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/conversion_msot_events_create.h"
#include "../model/object.h"
#include "../model/pinterest_lib_error.h"


// Send Measurement Source Of Truth (MSOT) attributed conversion events
//
// **This feature is currently in beta and not available to all apps.** If you are interested in joining the beta, reach out to your Pinterest account manager.  Advertisers or their measurement partners can send attributed MSOT conversion events to Pinterest based on their `ad_account_id`. The request body should be a JSON object.  - These events will not be used in Reporting.
//
void
MsotEventsAPI_msotEventsCreate(apiClient_t *apiClient, char *ad_account_id, conversion_msot_events_create_t *conversion_msot_events_create);


