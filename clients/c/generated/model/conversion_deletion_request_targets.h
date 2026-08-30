/*
 * conversion_deletion_request_targets.h
 *
 * 
 */

#ifndef _conversion_deletion_request_targets_H_
#define _conversion_deletion_request_targets_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct conversion_deletion_request_targets_t conversion_deletion_request_targets_t;

#include "conversion_deletion_request_epik_targets.h"
#include "conversion_deletion_request_user_email_targets.h"



typedef struct conversion_deletion_request_targets_t {
    list_t *user_emails; //primitive container
    list_t *epiks; //primitive container

    int _library_owned; // Is the library responsible for freeing this object?
} conversion_deletion_request_targets_t;

__attribute__((deprecated)) conversion_deletion_request_targets_t *conversion_deletion_request_targets_create(
    list_t *user_emails,
    list_t *epiks
);

void conversion_deletion_request_targets_free(conversion_deletion_request_targets_t *conversion_deletion_request_targets);

conversion_deletion_request_targets_t *conversion_deletion_request_targets_parseFromJSON(cJSON *conversion_deletion_request_targetsJSON);

cJSON *conversion_deletion_request_targets_convertToJSON(conversion_deletion_request_targets_t *conversion_deletion_request_targets);

#endif /* _conversion_deletion_request_targets_H_ */

