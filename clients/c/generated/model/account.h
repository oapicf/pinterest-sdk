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
    char *about; // string
    pinterest_rest_api_account_ACCOUNTTYPE_e account_type; //enum
    int board_count; //numeric
    char *business_name; // string
    int follower_count; //numeric
    int following_count; //numeric
    char *id; // string
    int monthly_views; //numeric
    int pin_count; //numeric
    char *profile_image; // string
    char *username; // string
    char *website_url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} account_t;

__attribute__((deprecated)) account_t *account_create(
    char *about,
    pinterest_rest_api_account_ACCOUNTTYPE_e account_type,
    int board_count,
    char *business_name,
    int follower_count,
    int following_count,
    char *id,
    int monthly_views,
    int pin_count,
    char *profile_image,
    char *username,
    char *website_url
);

void account_free(account_t *account);

account_t *account_parseFromJSON(cJSON *accountJSON);

cJSON *account_convertToJSON(account_t *account);

#endif /* _account_H_ */

