/*
 * metrics_response_data_items.h
 *
 * 
 */

#ifndef _metrics_response_data_items_H_
#define _metrics_response_data_items_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct metrics_response_data_items_t metrics_response_data_items_t;

#include "object.h"



typedef struct metrics_response_data_items_t {
    object_t *metrics; //object
    char *targeting_type; // string
    char *targeting_value; // string

    int _library_owned; // Is the library responsible for freeing this object?
} metrics_response_data_items_t;

__attribute__((deprecated)) metrics_response_data_items_t *metrics_response_data_items_create(
    object_t *metrics,
    char *targeting_type,
    char *targeting_value
);

void metrics_response_data_items_free(metrics_response_data_items_t *metrics_response_data_items);

metrics_response_data_items_t *metrics_response_data_items_parseFromJSON(cJSON *metrics_response_data_itemsJSON);

cJSON *metrics_response_data_items_convertToJSON(metrics_response_data_items_t *metrics_response_data_items);

#endif /* _metrics_response_data_items_H_ */

