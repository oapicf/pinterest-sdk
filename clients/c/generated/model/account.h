/*
 * account.h
 *
 * 
 */

#ifndef _account_H_
#define _account_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct account_t account_t;


// Enum ACCOUNTTYPE for account

typedef enum  { pinterest_rest_api_account_ACCOUNTTYPE_NULL = 0, pinterest_rest_api_account_ACCOUNTTYPE_PINNER, pinterest_rest_api_account_ACCOUNTTYPE_BUSINESS } pinterest_rest_api_account_ACCOUNTTYPE_e;

char* account_account_type_ToString(pinterest_rest_api_account_ACCOUNTTYPE_e account_type);

pinterest_rest_api_account_ACCOUNTTYPE_e account_account_type_FromString(char* account_type);



typedef struct account_t {
    pinterest_rest_api_account_ACCOUNTTYPE_e account_type; //enum
    char *profile_image; // string
    char *website_url; // string
    char *username; // string

} account_t;

account_t *account_create(
    pinterest_rest_api_account_ACCOUNTTYPE_e account_type,
    char *profile_image,
    char *website_url,
    char *username
);

void account_free(account_t *account);

account_t *account_parseFromJSON(cJSON *accountJSON);

cJSON *account_convertToJSON(account_t *account);

#endif /* _account_H_ */

