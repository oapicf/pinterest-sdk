/*
 * record_counts.h
 *
 * 
 */

#ifndef _record_counts_H_
#define _record_counts_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct record_counts_t record_counts_t;




typedef struct record_counts_t {
    int *invalid; //numeric
    int *processed; //numeric
    int *valid; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} record_counts_t;

__attribute__((deprecated)) record_counts_t *record_counts_create(
    int *invalid,
    int *processed,
    int *valid
);

void record_counts_free(record_counts_t *record_counts);

record_counts_t *record_counts_parseFromJSON(cJSON *record_countsJSON);

cJSON *record_counts_convertToJSON(record_counts_t *record_counts);

#endif /* _record_counts_H_ */

