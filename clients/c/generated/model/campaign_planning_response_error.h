/*
 * campaign_planning_response_error.h
 *
 * Error encountered while estimating delivery for a campaign.
 */

#ifndef _campaign_planning_response_error_H_
#define _campaign_planning_response_error_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct campaign_planning_response_error_t campaign_planning_response_error_t;

#include "campaign_planning_response_error_code.h"



typedef struct campaign_planning_response_error_t {
    pinterest_rest_api_campaign_planning_response_error_code__e code; //referenced enum
    char *message; // string

    int _library_owned; // Is the library responsible for freeing this object?
} campaign_planning_response_error_t;

__attribute__((deprecated)) campaign_planning_response_error_t *campaign_planning_response_error_create(
    pinterest_rest_api_campaign_planning_response_error_code__e code,
    char *message
);

void campaign_planning_response_error_free(campaign_planning_response_error_t *campaign_planning_response_error);

campaign_planning_response_error_t *campaign_planning_response_error_parseFromJSON(cJSON *campaign_planning_response_errorJSON);

cJSON *campaign_planning_response_error_convertToJSON(campaign_planning_response_error_t *campaign_planning_response_error);

#endif /* _campaign_planning_response_error_H_ */

