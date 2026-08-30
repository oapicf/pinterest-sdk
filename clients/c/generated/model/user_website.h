/*
 * user_website.h
 *
 * 
 */

#ifndef _user_website_H_
#define _user_website_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct user_website_t user_website_t;




typedef struct user_website_t {
    char *status; // string
    char *verified_at; // string
    char *website; // string

    int _library_owned; // Is the library responsible for freeing this object?
} user_website_t;

__attribute__((deprecated)) user_website_t *user_website_create(
    char *status,
    char *verified_at,
    char *website
);

void user_website_free(user_website_t *user_website);

user_website_t *user_website_parseFromJSON(cJSON *user_websiteJSON);

cJSON *user_website_convertToJSON(user_website_t *user_website);

#endif /* _user_website_H_ */

