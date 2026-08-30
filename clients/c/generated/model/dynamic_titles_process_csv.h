/*
 * dynamic_titles_process_csv.h
 *
 * 
 */

#ifndef _dynamic_titles_process_csv_H_
#define _dynamic_titles_process_csv_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct dynamic_titles_process_csv_t dynamic_titles_process_csv_t;

#include "dynamic_titles_process_csv_error.h"



typedef struct dynamic_titles_process_csv_t {
    list_t *errors; //nonprimitive container
    char *status; // string

    int _library_owned; // Is the library responsible for freeing this object?
} dynamic_titles_process_csv_t;

__attribute__((deprecated)) dynamic_titles_process_csv_t *dynamic_titles_process_csv_create(
    list_t *errors,
    char *status
);

void dynamic_titles_process_csv_free(dynamic_titles_process_csv_t *dynamic_titles_process_csv);

dynamic_titles_process_csv_t *dynamic_titles_process_csv_parseFromJSON(cJSON *dynamic_titles_process_csvJSON);

cJSON *dynamic_titles_process_csv_convertToJSON(dynamic_titles_process_csv_t *dynamic_titles_process_csv);

#endif /* _dynamic_titles_process_csv_H_ */

