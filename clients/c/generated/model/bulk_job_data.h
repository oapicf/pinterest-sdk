/*
 * bulk_job_data.h
 *
 * Bulk request result data.
 */

#ifndef _bulk_job_data_H_
#define _bulk_job_data_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct bulk_job_data_t bulk_job_data_t;

#include "bulk_request_status.h"



typedef struct bulk_job_data_t {
    char *result_url; // string
    pinterest_rest_api_bulk_request_status__e status; //referenced enum
    int *workload_id; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} bulk_job_data_t;

__attribute__((deprecated)) bulk_job_data_t *bulk_job_data_create(
    char *result_url,
    pinterest_rest_api_bulk_request_status__e status,
    int *workload_id
);

void bulk_job_data_free(bulk_job_data_t *bulk_job_data);

bulk_job_data_t *bulk_job_data_parseFromJSON(cJSON *bulk_job_dataJSON);

cJSON *bulk_job_data_convertToJSON(bulk_job_data_t *bulk_job_data);

#endif /* _bulk_job_data_H_ */

