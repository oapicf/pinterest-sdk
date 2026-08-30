/*
 * total_count_by_entity_status.h
 *
 * Breakdown of asset counts by entity status.
 */

#ifndef _total_count_by_entity_status_H_
#define _total_count_by_entity_status_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct total_count_by_entity_status_t total_count_by_entity_status_t;




typedef struct total_count_by_entity_status_t {
    int *active; //numeric
    int *archived; //numeric
    int *paused; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} total_count_by_entity_status_t;

__attribute__((deprecated)) total_count_by_entity_status_t *total_count_by_entity_status_create(
    int *active,
    int *archived,
    int *paused
);

void total_count_by_entity_status_free(total_count_by_entity_status_t *total_count_by_entity_status);

total_count_by_entity_status_t *total_count_by_entity_status_parseFromJSON(cJSON *total_count_by_entity_statusJSON);

cJSON *total_count_by_entity_status_convertToJSON(total_count_by_entity_status_t *total_count_by_entity_status);

#endif /* _total_count_by_entity_status_H_ */

