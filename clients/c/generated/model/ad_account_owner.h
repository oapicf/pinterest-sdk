/*
 * ad_account_owner.h
 *
 * 
 */

#ifndef _ad_account_owner_H_
#define _ad_account_owner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ad_account_owner_t ad_account_owner_t;




typedef struct ad_account_owner_t {
    char *username; // string
    char *id; // string

} ad_account_owner_t;

ad_account_owner_t *ad_account_owner_create(
    char *username,
    char *id
);

void ad_account_owner_free(ad_account_owner_t *ad_account_owner);

ad_account_owner_t *ad_account_owner_parseFromJSON(cJSON *ad_account_ownerJSON);

cJSON *ad_account_owner_convertToJSON(ad_account_owner_t *ad_account_owner);

#endif /* _ad_account_owner_H_ */

