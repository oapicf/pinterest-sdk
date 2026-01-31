/*
 * system_user_update_request.h
 *
 * 
 */

#ifndef _system_user_update_request_H_
#define _system_user_update_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct system_user_update_request_t system_user_update_request_t;




typedef struct system_user_update_request_t {
    char *name; // string

    int _library_owned; // Is the library responsible for freeing this object?
} system_user_update_request_t;

__attribute__((deprecated)) system_user_update_request_t *system_user_update_request_create(
    char *name
);

void system_user_update_request_free(system_user_update_request_t *system_user_update_request);

system_user_update_request_t *system_user_update_request_parseFromJSON(cJSON *system_user_update_requestJSON);

cJSON *system_user_update_request_convertToJSON(system_user_update_request_t *system_user_update_request);

#endif /* _system_user_update_request_H_ */

