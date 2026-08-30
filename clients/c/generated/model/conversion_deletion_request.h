/*
 * conversion_deletion_request.h
 *
 * Conversion deletion request
 */

#ifndef _conversion_deletion_request_H_
#define _conversion_deletion_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct conversion_deletion_request_t conversion_deletion_request_t;

#include "conversion_deletion_request_status.h"



typedef struct conversion_deletion_request_t {
    char *created_time; //date
    char *processed_time; //date
    char *request_id; // string
    conversion_deletion_request_status_t *status; // custom

    int _library_owned; // Is the library responsible for freeing this object?
} conversion_deletion_request_t;

__attribute__((deprecated)) conversion_deletion_request_t *conversion_deletion_request_create(
    char *created_time,
    char *processed_time,
    char *request_id,
    conversion_deletion_request_status_t *status
);

void conversion_deletion_request_free(conversion_deletion_request_t *conversion_deletion_request);

conversion_deletion_request_t *conversion_deletion_request_parseFromJSON(cJSON *conversion_deletion_requestJSON);

cJSON *conversion_deletion_request_convertToJSON(conversion_deletion_request_t *conversion_deletion_request);

#endif /* _conversion_deletion_request_H_ */

