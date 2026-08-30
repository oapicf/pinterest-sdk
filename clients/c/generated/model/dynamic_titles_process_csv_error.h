/*
 * dynamic_titles_process_csv_error.h
 *
 * 
 */

#ifndef _dynamic_titles_process_csv_error_H_
#define _dynamic_titles_process_csv_error_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct dynamic_titles_process_csv_error_t dynamic_titles_process_csv_error_t;




typedef struct dynamic_titles_process_csv_error_t {
    char *error_type; // string
    int *row_number; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} dynamic_titles_process_csv_error_t;

__attribute__((deprecated)) dynamic_titles_process_csv_error_t *dynamic_titles_process_csv_error_create(
    char *error_type,
    int *row_number
);

void dynamic_titles_process_csv_error_free(dynamic_titles_process_csv_error_t *dynamic_titles_process_csv_error);

dynamic_titles_process_csv_error_t *dynamic_titles_process_csv_error_parseFromJSON(cJSON *dynamic_titles_process_csv_errorJSON);

cJSON *dynamic_titles_process_csv_error_convertToJSON(dynamic_titles_process_csv_error_t *dynamic_titles_process_csv_error);

#endif /* _dynamic_titles_process_csv_error_H_ */

