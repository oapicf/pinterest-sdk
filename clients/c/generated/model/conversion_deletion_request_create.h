/*
 * conversion_deletion_request_create.h
 *
 * Resource create operation model.
 */

#ifndef _conversion_deletion_request_create_H_
#define _conversion_deletion_request_create_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct conversion_deletion_request_create_t conversion_deletion_request_create_t;

#include "conversion_deletion_request_targets.h"



typedef struct conversion_deletion_request_create_t {
    struct conversion_deletion_request_targets_t *deletion_targets; //model

    int _library_owned; // Is the library responsible for freeing this object?
} conversion_deletion_request_create_t;

__attribute__((deprecated)) conversion_deletion_request_create_t *conversion_deletion_request_create_create(
    conversion_deletion_request_targets_t *deletion_targets
);

void conversion_deletion_request_create_free(conversion_deletion_request_create_t *conversion_deletion_request_create);

conversion_deletion_request_create_t *conversion_deletion_request_create_parseFromJSON(cJSON *conversion_deletion_request_createJSON);

cJSON *conversion_deletion_request_create_convertToJSON(conversion_deletion_request_create_t *conversion_deletion_request_create);

#endif /* _conversion_deletion_request_create_H_ */

