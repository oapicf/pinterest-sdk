/*
 * user_website_create.h
 *
 * Resource create operation model.
 */

#ifndef _user_website_create_H_
#define _user_website_create_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct user_website_create_t user_website_create_t;

#include "website_verification_method.h"



typedef struct user_website_create_t {
    website_verification_method_t *verification_method; // custom
    char *website; // string

    int _library_owned; // Is the library responsible for freeing this object?
} user_website_create_t;

__attribute__((deprecated)) user_website_create_t *user_website_create_create(
    website_verification_method_t *verification_method,
    char *website
);

void user_website_create_free(user_website_create_t *user_website_create);

user_website_create_t *user_website_create_parseFromJSON(cJSON *user_website_createJSON);

cJSON *user_website_create_convertToJSON(user_website_create_t *user_website_create);

#endif /* _user_website_create_H_ */

