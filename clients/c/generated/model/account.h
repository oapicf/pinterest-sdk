/*
 * account.h
 *
 * User account model containing properties related to a user&#39;s account.
 */

#ifndef _account_H_
#define _account_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct account_t account_t;

#include "user_account_type.h"



typedef struct account_t {
    char *about; // string
    user_account_type_t *account_type; // custom
    int *board_count; //numeric
    char *business_name; // string
    int *follower_count; //numeric
    int *following_count; //numeric
    char *id; // string
    int *monthly_views; //numeric
    int *pin_count; //numeric
    char *profile_image; // string
    char *username; // string
    char *website_url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} account_t;

__attribute__((deprecated)) account_t *account_create(
    char *about,
    user_account_type_t *account_type,
    int *board_count,
    char *business_name,
    int *follower_count,
    int *following_count,
    char *id,
    int *monthly_views,
    int *pin_count,
    char *profile_image,
    char *username,
    char *website_url
);

void account_free(account_t *account);

account_t *account_parseFromJSON(cJSON *accountJSON);

cJSON *account_convertToJSON(account_t *account);

#endif /* _account_H_ */

