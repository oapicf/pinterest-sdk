/*
 * customer_segment_create.h
 *
 * Resource create operation model.
 */

#ifndef _customer_segment_create_H_
#define _customer_segment_create_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct customer_segment_create_t customer_segment_create_t;




typedef struct customer_segment_create_t {
    list_t *audience_ids; //primitive container
    char *name; // string

    int _library_owned; // Is the library responsible for freeing this object?
} customer_segment_create_t;

__attribute__((deprecated)) customer_segment_create_t *customer_segment_create_create(
    list_t *audience_ids,
    char *name
);

void customer_segment_create_free(customer_segment_create_t *customer_segment_create);

customer_segment_create_t *customer_segment_create_parseFromJSON(cJSON *customer_segment_createJSON);

cJSON *customer_segment_create_convertToJSON(customer_segment_create_t *customer_segment_create);

#endif /* _customer_segment_create_H_ */

