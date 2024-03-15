/*
 * user_following_get_200_response.h
 *
 * 
 */

#ifndef _user_following_get_200_response_H_
#define _user_following_get_200_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct user_following_get_200_response_t user_following_get_200_response_t;

#include "user_summary.h"



typedef struct user_following_get_200_response_t {
    list_t *items; //nonprimitive container
    char *bookmark; // string

} user_following_get_200_response_t;

user_following_get_200_response_t *user_following_get_200_response_create(
    list_t *items,
    char *bookmark
);

void user_following_get_200_response_free(user_following_get_200_response_t *user_following_get_200_response);

user_following_get_200_response_t *user_following_get_200_response_parseFromJSON(cJSON *user_following_get_200_responseJSON);

cJSON *user_following_get_200_response_convertToJSON(user_following_get_200_response_t *user_following_get_200_response);

#endif /* _user_following_get_200_response_H_ */

