/*
 * catalogs_status.h
 *
 * Status for catalogs entities. Present in catalogs_feed values. When a feed is deleted, the response will inform DELETED as status.
 */

#ifndef _catalogs_status_H_
#define _catalogs_status_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_status_t catalogs_status_t;


// Enum  for catalogs_status

typedef enum { pinterest_rest_api_catalogs_status__NULL = 0, pinterest_rest_api_catalogs_status__ACTIVE, pinterest_rest_api_catalogs_status__INACTIVE } pinterest_rest_api_catalogs_status__e;

char* catalogs_status_catalogs_status_ToString(pinterest_rest_api_catalogs_status__e catalogs_status);

pinterest_rest_api_catalogs_status__e catalogs_status_catalogs_status_FromString(char* catalogs_status);

//cJSON *catalogs_status_catalogs_status_convertToJSON(pinterest_rest_api_catalogs_status__e catalogs_status);

//pinterest_rest_api_catalogs_status__e catalogs_status_catalogs_status_parseFromJSON(cJSON *catalogs_statusJSON);

#endif /* _catalogs_status_H_ */

