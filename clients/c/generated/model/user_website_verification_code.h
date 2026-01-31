/*
 * user_website_verification_code.h
 *
 * 
 */

#ifndef _user_website_verification_code_H_
#define _user_website_verification_code_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct user_website_verification_code_t user_website_verification_code_t;




typedef struct user_website_verification_code_t {
    char *dns_txt_record; // string
    char *file_content; // string
    char *filename; // string
    char *metatag; // string
    char *verification_code; // string

    int _library_owned; // Is the library responsible for freeing this object?
} user_website_verification_code_t;

__attribute__((deprecated)) user_website_verification_code_t *user_website_verification_code_create(
    char *dns_txt_record,
    char *file_content,
    char *filename,
    char *metatag,
    char *verification_code
);

void user_website_verification_code_free(user_website_verification_code_t *user_website_verification_code);

user_website_verification_code_t *user_website_verification_code_parseFromJSON(cJSON *user_website_verification_codeJSON);

cJSON *user_website_verification_code_convertToJSON(user_website_verification_code_t *user_website_verification_code);

#endif /* _user_website_verification_code_H_ */

