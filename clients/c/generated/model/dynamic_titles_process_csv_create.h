/*
 * dynamic_titles_process_csv_create.h
 *
 * Resource create operation model.
 */

#ifndef _dynamic_titles_process_csv_create_H_
#define _dynamic_titles_process_csv_create_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct dynamic_titles_process_csv_create_t dynamic_titles_process_csv_create_t;




typedef struct dynamic_titles_process_csv_create_t {
    char *request_id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} dynamic_titles_process_csv_create_t;

__attribute__((deprecated)) dynamic_titles_process_csv_create_t *dynamic_titles_process_csv_create_create(
    char *request_id
);

void dynamic_titles_process_csv_create_free(dynamic_titles_process_csv_create_t *dynamic_titles_process_csv_create);

dynamic_titles_process_csv_create_t *dynamic_titles_process_csv_create_parseFromJSON(cJSON *dynamic_titles_process_csv_createJSON);

cJSON *dynamic_titles_process_csv_create_convertToJSON(dynamic_titles_process_csv_create_t *dynamic_titles_process_csv_create);

#endif /* _dynamic_titles_process_csv_create_H_ */

