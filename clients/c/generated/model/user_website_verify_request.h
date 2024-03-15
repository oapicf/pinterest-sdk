/*
 * user_website_verify_request.h
 *
 * User website verification request
 */

#ifndef _user_website_verify_request_H_
#define _user_website_verify_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct user_website_verify_request_t user_website_verify_request_t;


// Enum VERIFICATIONMETHOD for user_website_verify_request

typedef enum  { pinterest_rest_api_user_website_verify_request_VERIFICATIONMETHOD_NULL = 0, pinterest_rest_api_user_website_verify_request_VERIFICATIONMETHOD_FILENAME, pinterest_rest_api_user_website_verify_request_VERIFICATIONMETHOD_METATAG, pinterest_rest_api_user_website_verify_request_VERIFICATIONMETHOD_DNSTXT } pinterest_rest_api_user_website_verify_request_VERIFICATIONMETHOD_e;

char* user_website_verify_request_verification_method_ToString(pinterest_rest_api_user_website_verify_request_VERIFICATIONMETHOD_e verification_method);

pinterest_rest_api_user_website_verify_request_VERIFICATIONMETHOD_e user_website_verify_request_verification_method_FromString(char* verification_method);



typedef struct user_website_verify_request_t {
    char *website; // string
    pinterest_rest_api_user_website_verify_request_VERIFICATIONMETHOD_e verification_method; //enum

} user_website_verify_request_t;

user_website_verify_request_t *user_website_verify_request_create(
    char *website,
    pinterest_rest_api_user_website_verify_request_VERIFICATIONMETHOD_e verification_method
);

void user_website_verify_request_free(user_website_verify_request_t *user_website_verify_request);

user_website_verify_request_t *user_website_verify_request_parseFromJSON(cJSON *user_website_verify_requestJSON);

cJSON *user_website_verify_request_convertToJSON(user_website_verify_request_t *user_website_verify_request);

#endif /* _user_website_verify_request_H_ */

