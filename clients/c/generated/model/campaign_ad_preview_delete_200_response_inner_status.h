/*
 * campaign_ad_preview_delete_200_response_inner_status.h
 *
 * 
 */

#ifndef _campaign_ad_preview_delete_200_response_inner_status_H_
#define _campaign_ad_preview_delete_200_response_inner_status_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct campaign_ad_preview_delete_200_response_inner_status_t campaign_ad_preview_delete_200_response_inner_status_t;

#include "pinterest_lib_error.h"
#include "pinterest_lib_status204.h"

// Enum STATUSCODE for campaign_ad_preview_delete_200_response_inner_status

typedef enum  { pinterest_rest_api_campaign_ad_preview_delete_200_response_inner_status_STATUSCODE_NULL = 0, pinterest_rest_api_campaign_ad_preview_delete_200_response_inner_status_STATUSCODE__204 } pinterest_rest_api_campaign_ad_preview_delete_200_response_inner_status_STATUSCODE_e;

char* campaign_ad_preview_delete_200_response_inner_status_status_code_ToString(pinterest_rest_api_campaign_ad_preview_delete_200_response_inner_status_STATUSCODE_e status_code);

pinterest_rest_api_campaign_ad_preview_delete_200_response_inner_status_STATUSCODE_e campaign_ad_preview_delete_200_response_inner_status_status_code_FromString(char* status_code);



typedef struct campaign_ad_preview_delete_200_response_inner_status_t {
    double *status_code; //numeric
    int *code; //numeric
    char *message; // string

    int _library_owned; // Is the library responsible for freeing this object?
} campaign_ad_preview_delete_200_response_inner_status_t;

__attribute__((deprecated)) campaign_ad_preview_delete_200_response_inner_status_t *campaign_ad_preview_delete_200_response_inner_status_create(
    double *status_code,
    int *code,
    char *message
);

void campaign_ad_preview_delete_200_response_inner_status_free(campaign_ad_preview_delete_200_response_inner_status_t *campaign_ad_preview_delete_200_response_inner_status);

campaign_ad_preview_delete_200_response_inner_status_t *campaign_ad_preview_delete_200_response_inner_status_parseFromJSON(cJSON *campaign_ad_preview_delete_200_response_inner_statusJSON);

cJSON *campaign_ad_preview_delete_200_response_inner_status_convertToJSON(campaign_ad_preview_delete_200_response_inner_status_t *campaign_ad_preview_delete_200_response_inner_status);

#endif /* _campaign_ad_preview_delete_200_response_inner_status_H_ */

