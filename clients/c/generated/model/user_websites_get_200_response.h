/*
 * user_websites_get_200_response.h
 *
 * 
 */

#ifndef _user_websites_get_200_response_H_
#define _user_websites_get_200_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct user_websites_get_200_response_t user_websites_get_200_response_t;

#include "user_website.h"



typedef struct user_websites_get_200_response_t {
    char *bookmark; // string
    list_t *items; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} user_websites_get_200_response_t;

__attribute__((deprecated)) user_websites_get_200_response_t *user_websites_get_200_response_create(
    char *bookmark,
    list_t *items
);

void user_websites_get_200_response_free(user_websites_get_200_response_t *user_websites_get_200_response);

user_websites_get_200_response_t *user_websites_get_200_response_parseFromJSON(cJSON *user_websites_get_200_responseJSON);

cJSON *user_websites_get_200_response_convertToJSON(user_websites_get_200_response_t *user_websites_get_200_response);

#endif /* _user_websites_get_200_response_H_ */

