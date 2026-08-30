/*
 * summary_status.h
 *
 * Summary status for campaign
 */

#ifndef _summary_status_H_
#define _summary_status_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct summary_status_t summary_status_t;


// Enum  for summary_status

typedef enum { pinterest_rest_api_summary_status__NULL = 0, pinterest_rest_api_summary_status__RUNNING, pinterest_rest_api_summary_status__PAUSED, pinterest_rest_api_summary_status__NOT_STARTED, pinterest_rest_api_summary_status__COMPLETED, pinterest_rest_api_summary_status__ADVERTISER_DISABLED, pinterest_rest_api_summary_status__ARCHIVED, pinterest_rest_api_summary_status__DRAFT, pinterest_rest_api_summary_status__DELETED_DRAFT } pinterest_rest_api_summary_status__e;

char* summary_status_summary_status_ToString(pinterest_rest_api_summary_status__e summary_status);

pinterest_rest_api_summary_status__e summary_status_summary_status_FromString(char* summary_status);

cJSON *summary_status_convertToJSON(pinterest_rest_api_summary_status__e summary_status);

pinterest_rest_api_summary_status__e summary_status_parseFromJSON(cJSON *summary_statusJSON);

#endif /* _summary_status_H_ */

