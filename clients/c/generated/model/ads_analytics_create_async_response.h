/*
 * ads_analytics_create_async_response.h
 *
 * 
 */

#ifndef _ads_analytics_create_async_response_H_
#define _ads_analytics_create_async_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ads_analytics_create_async_response_t ads_analytics_create_async_response_t;

#include "bulk_reporting_job_status.h"



typedef struct ads_analytics_create_async_response_t {
    char *message; // string
    pinterest_rest_api_bulk_reporting_job_status__e report_status; //referenced enum
    char *token; // string

    int _library_owned; // Is the library responsible for freeing this object?
} ads_analytics_create_async_response_t;

__attribute__((deprecated)) ads_analytics_create_async_response_t *ads_analytics_create_async_response_create(
    char *message,
    pinterest_rest_api_bulk_reporting_job_status__e report_status,
    char *token
);

void ads_analytics_create_async_response_free(ads_analytics_create_async_response_t *ads_analytics_create_async_response);

ads_analytics_create_async_response_t *ads_analytics_create_async_response_parseFromJSON(cJSON *ads_analytics_create_async_responseJSON);

cJSON *ads_analytics_create_async_response_convertToJSON(ads_analytics_create_async_response_t *ads_analytics_create_async_response);

#endif /* _ads_analytics_create_async_response_H_ */

