#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/error.h"
#include "../model/terms_of_service.h"


// Get terms of service
//
// Get the text of the terms of service and see whether the advertiser has accepted the terms of service.
//
terms_of_service_t*
TermsOfServiceAPI_termsOfServiceGet(apiClient_t *apiClient, char *ad_account_id, int *include_html, char *tos_type);


