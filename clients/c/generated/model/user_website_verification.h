/*
 * user_website_verification.h
 *
 * 
 */

#ifndef _user_website_verification_H_
#define _user_website_verification_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct user_website_verification_t user_website_verification_t;




typedef struct user_website_verification_t {
    char *dns_txt_record; // string
    char *file_content; // string
    char *filename; // string
    char *metatag; // string
    char *verification_code; // string

    int _library_owned; // Is the library responsible for freeing this object?
} user_website_verification_t;

__attribute__((deprecated)) user_website_verification_t *user_website_verification_create(
    char *dns_txt_record,
    char *file_content,
    char *filename,
    char *metatag,
    char *verification_code
);

void user_website_verification_free(user_website_verification_t *user_website_verification);

user_website_verification_t *user_website_verification_parseFromJSON(cJSON *user_website_verificationJSON);

cJSON *user_website_verification_convertToJSON(user_website_verification_t *user_website_verification);

#endif /* _user_website_verification_H_ */

