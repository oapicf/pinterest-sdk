/*
 * bulk_upsert_status.h
 *
 * 
 */

#ifndef _bulk_upsert_status_H_
#define _bulk_upsert_status_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct bulk_upsert_status_t bulk_upsert_status_t;


// Enum  for bulk_upsert_status

typedef enum { pinterest_rest_api_bulk_upsert_status__NULL = 0, pinterest_rest_api_bulk_upsert_status__RUNNING, pinterest_rest_api_bulk_upsert_status__SUCCEEDED, pinterest_rest_api_bulk_upsert_status__FAILED } pinterest_rest_api_bulk_upsert_status__e;

char* bulk_upsert_status_bulk_upsert_status_ToString(pinterest_rest_api_bulk_upsert_status__e bulk_upsert_status);

pinterest_rest_api_bulk_upsert_status__e bulk_upsert_status_bulk_upsert_status_FromString(char* bulk_upsert_status);

//cJSON *bulk_upsert_status_bulk_upsert_status_convertToJSON(pinterest_rest_api_bulk_upsert_status__e bulk_upsert_status);

//pinterest_rest_api_bulk_upsert_status__e bulk_upsert_status_bulk_upsert_status_parseFromJSON(cJSON *bulk_upsert_statusJSON);

#endif /* _bulk_upsert_status_H_ */

