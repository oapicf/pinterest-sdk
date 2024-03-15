/*
 * bulk_reporting_job_status.h
 *
 * Possible status for a bulk reporting job
 */

#ifndef _bulk_reporting_job_status_H_
#define _bulk_reporting_job_status_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct bulk_reporting_job_status_t bulk_reporting_job_status_t;


// Enum  for bulk_reporting_job_status

typedef enum { pinterest_rest_api_bulk_reporting_job_status__NULL = 0, pinterest_rest_api_bulk_reporting_job_status__DOES_NOT_EXIST, pinterest_rest_api_bulk_reporting_job_status__FINISHED, pinterest_rest_api_bulk_reporting_job_status__IN_PROGRESS, pinterest_rest_api_bulk_reporting_job_status__EXPIRED, pinterest_rest_api_bulk_reporting_job_status__FAILED, pinterest_rest_api_bulk_reporting_job_status__CANCELLED } pinterest_rest_api_bulk_reporting_job_status__e;

char* bulk_reporting_job_status_bulk_reporting_job_status_ToString(pinterest_rest_api_bulk_reporting_job_status__e bulk_reporting_job_status);

pinterest_rest_api_bulk_reporting_job_status__e bulk_reporting_job_status_bulk_reporting_job_status_FromString(char* bulk_reporting_job_status);

//cJSON *bulk_reporting_job_status_bulk_reporting_job_status_convertToJSON(pinterest_rest_api_bulk_reporting_job_status__e bulk_reporting_job_status);

//pinterest_rest_api_bulk_reporting_job_status__e bulk_reporting_job_status_bulk_reporting_job_status_parseFromJSON(cJSON *bulk_reporting_job_statusJSON);

#endif /* _bulk_reporting_job_status_H_ */

