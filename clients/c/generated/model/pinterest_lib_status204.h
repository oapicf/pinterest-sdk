/*
 * pinterest_lib_status204.h
 *
 * The resource was successfully deleted.
 */

#ifndef _pinterest_lib_status204_H_
#define _pinterest_lib_status204_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pinterest_lib_status204_t pinterest_lib_status204_t;


// Enum STATUSCODE for pinterest_lib_status204

typedef enum  { pinterest_rest_api_pinterest_lib_status204_STATUSCODE_NULL = 0, pinterest_rest_api_pinterest_lib_status204_STATUSCODE__204 } pinterest_rest_api_pinterest_lib_status204_STATUSCODE_e;

char* pinterest_lib_status204_status_code_ToString(pinterest_rest_api_pinterest_lib_status204_STATUSCODE_e status_code);

pinterest_rest_api_pinterest_lib_status204_STATUSCODE_e pinterest_lib_status204_status_code_FromString(char* status_code);



typedef struct pinterest_lib_status204_t {
    double *status_code; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} pinterest_lib_status204_t;

__attribute__((deprecated)) pinterest_lib_status204_t *pinterest_lib_status204_create(
    double *status_code
);

void pinterest_lib_status204_free(pinterest_lib_status204_t *pinterest_lib_status204);

pinterest_lib_status204_t *pinterest_lib_status204_parseFromJSON(cJSON *pinterest_lib_status204JSON);

cJSON *pinterest_lib_status204_convertToJSON(pinterest_lib_status204_t *pinterest_lib_status204);

#endif /* _pinterest_lib_status204_H_ */

