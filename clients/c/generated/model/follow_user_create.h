/*
 * follow_user_create.h
 *
 * Resource create operation model.
 */

#ifndef _follow_user_create_H_
#define _follow_user_create_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct follow_user_create_t follow_user_create_t;




typedef struct follow_user_create_t {
    int *auto_follow; //boolean

    int _library_owned; // Is the library responsible for freeing this object?
} follow_user_create_t;

__attribute__((deprecated)) follow_user_create_t *follow_user_create_create(
    int *auto_follow
);

void follow_user_create_free(follow_user_create_t *follow_user_create);

follow_user_create_t *follow_user_create_parseFromJSON(cJSON *follow_user_createJSON);

cJSON *follow_user_create_convertToJSON(follow_user_create_t *follow_user_create);

#endif /* _follow_user_create_H_ */

