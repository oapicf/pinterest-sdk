/*
 * ads_analytics_get_async_response.h
 *
 * 
 */

#ifndef _ads_analytics_get_async_response_H_
#define _ads_analytics_get_async_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ads_analytics_get_async_response_t ads_analytics_get_async_response_t;

#include "bulk_reporting_job_status.h"



typedef struct ads_analytics_get_async_response_t {
    pinterest_rest_api_bulk_reporting_job_status__e report_status; //referenced enum
    double *size; //numeric
    char *url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} ads_analytics_get_async_response_t;

__attribute__((deprecated)) ads_analytics_get_async_response_t *ads_analytics_get_async_response_create(
    pinterest_rest_api_bulk_reporting_job_status__e report_status,
    double *size,
    char *url
);

void ads_analytics_get_async_response_free(ads_analytics_get_async_response_t *ads_analytics_get_async_response);

ads_analytics_get_async_response_t *ads_analytics_get_async_response_parseFromJSON(cJSON *ads_analytics_get_async_responseJSON);

cJSON *ads_analytics_get_async_response_convertToJSON(ads_analytics_get_async_response_t *ads_analytics_get_async_response);

#endif /* _ads_analytics_get_async_response_H_ */

