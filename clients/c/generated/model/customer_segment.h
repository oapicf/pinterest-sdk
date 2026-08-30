/*
 * customer_segment.h
 *
 * 
 */

#ifndef _customer_segment_H_
#define _customer_segment_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct customer_segment_t customer_segment_t;

#include "targeting_template_status.h"



typedef struct customer_segment_t {
    char *ad_account_id; // string
    list_t *audience_ids; //primitive container
    int *created_time; //numeric
    char *id; // string
    char *name; // string
    targeting_template_status_t *status; // custom
    int *updated_time; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} customer_segment_t;

__attribute__((deprecated)) customer_segment_t *customer_segment_create(
    char *ad_account_id,
    list_t *audience_ids,
    int *created_time,
    char *id,
    char *name,
    targeting_template_status_t *status,
    int *updated_time
);

void customer_segment_free(customer_segment_t *customer_segment);

customer_segment_t *customer_segment_parseFromJSON(cJSON *customer_segmentJSON);

cJSON *customer_segment_convertToJSON(customer_segment_t *customer_segment);

#endif /* _customer_segment_H_ */

