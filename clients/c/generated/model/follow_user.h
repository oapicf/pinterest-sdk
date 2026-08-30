/*
 * follow_user.h
 *
 * 
 */

#ifndef _follow_user_H_
#define _follow_user_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct follow_user_t follow_user_t;




typedef struct follow_user_t {
    char *type; // string
    char *username; // string

    int _library_owned; // Is the library responsible for freeing this object?
} follow_user_t;

__attribute__((deprecated)) follow_user_t *follow_user_create(
    char *type,
    char *username
);

void follow_user_free(follow_user_t *follow_user);

follow_user_t *follow_user_parseFromJSON(cJSON *follow_userJSON);

cJSON *follow_user_convertToJSON(follow_user_t *follow_user);

#endif /* _follow_user_H_ */

