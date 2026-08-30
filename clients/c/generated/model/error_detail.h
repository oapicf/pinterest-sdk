/*
 * error_detail.h
 *
 * 
 */

#ifndef _error_detail_H_
#define _error_detail_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct error_detail_t error_detail_t;




typedef struct error_detail_t {
    int *count; //numeric
    int *error_code; //numeric
    char *message; // string

    int _library_owned; // Is the library responsible for freeing this object?
} error_detail_t;

__attribute__((deprecated)) error_detail_t *error_detail_create(
    int *count,
    int *error_code,
    char *message
);

void error_detail_free(error_detail_t *error_detail);

error_detail_t *error_detail_parseFromJSON(cJSON *error_detailJSON);

cJSON *error_detail_convertToJSON(error_detail_t *error_detail);

#endif /* _error_detail_H_ */

