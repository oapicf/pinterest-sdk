/*
 * system_user_update_with_required_body.h
 *
 * Resource create or update operation model with required body fields (no OptionalProperties).
 */

#ifndef _system_user_update_with_required_body_H_
#define _system_user_update_with_required_body_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct system_user_update_with_required_body_t system_user_update_with_required_body_t;




typedef struct system_user_update_with_required_body_t {
    char *name; // string

    int _library_owned; // Is the library responsible for freeing this object?
} system_user_update_with_required_body_t;

__attribute__((deprecated)) system_user_update_with_required_body_t *system_user_update_with_required_body_create(
    char *name
);

void system_user_update_with_required_body_free(system_user_update_with_required_body_t *system_user_update_with_required_body);

system_user_update_with_required_body_t *system_user_update_with_required_body_parseFromJSON(cJSON *system_user_update_with_required_bodyJSON);

cJSON *system_user_update_with_required_body_convertToJSON(system_user_update_with_required_body_t *system_user_update_with_required_body);

#endif /* _system_user_update_with_required_body_H_ */

