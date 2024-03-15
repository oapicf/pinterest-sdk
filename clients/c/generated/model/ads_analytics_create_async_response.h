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
    bulk_reporting_job_status_t *report_status; // custom
    char *token; // string
    char *message; // string

} ads_analytics_create_async_response_t;

ads_analytics_create_async_response_t *ads_analytics_create_async_response_create(
    bulk_reporting_job_status_t *report_status,
    char *token,
    char *message
);

void ads_analytics_create_async_response_free(ads_analytics_create_async_response_t *ads_analytics_create_async_response);

ads_analytics_create_async_response_t *ads_analytics_create_async_response_parseFromJSON(cJSON *ads_analytics_create_async_responseJSON);

cJSON *ads_analytics_create_async_response_convertToJSON(ads_analytics_create_async_response_t *ads_analytics_create_async_response);

#endif /* _ads_analytics_create_async_response_H_ */

