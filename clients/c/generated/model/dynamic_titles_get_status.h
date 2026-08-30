/*
 * dynamic_titles_get_status.h
 *
 * 
 */

#ifndef _dynamic_titles_get_status_H_
#define _dynamic_titles_get_status_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct dynamic_titles_get_status_t dynamic_titles_get_status_t;




typedef struct dynamic_titles_get_status_t {
    int *generated_count; //numeric
    int *is_ready; //boolean
    int *reviewed_count; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} dynamic_titles_get_status_t;

__attribute__((deprecated)) dynamic_titles_get_status_t *dynamic_titles_get_status_create(
    int *generated_count,
    int *is_ready,
    int *reviewed_count
);

void dynamic_titles_get_status_free(dynamic_titles_get_status_t *dynamic_titles_get_status);

dynamic_titles_get_status_t *dynamic_titles_get_status_parseFromJSON(cJSON *dynamic_titles_get_statusJSON);

cJSON *dynamic_titles_get_status_convertToJSON(dynamic_titles_get_status_t *dynamic_titles_get_status);

#endif /* _dynamic_titles_get_status_H_ */

