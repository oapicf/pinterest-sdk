/*
 * brand_account.h
 *
 * 
 */

#ifndef _brand_account_H_
#define _brand_account_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct brand_account_t brand_account_t;




typedef struct brand_account_t {
    char *brand_account_id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} brand_account_t;

__attribute__((deprecated)) brand_account_t *brand_account_create(
    char *brand_account_id
);

void brand_account_free(brand_account_t *brand_account);

brand_account_t *brand_account_parseFromJSON(cJSON *brand_accountJSON);

cJSON *brand_account_convertToJSON(brand_account_t *brand_account);

#endif /* _brand_account_H_ */

