/*
 * brand_accounts_create_200_response.h
 *
 * 
 */

#ifndef _brand_accounts_create_200_response_H_
#define _brand_accounts_create_200_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct brand_accounts_create_200_response_t brand_accounts_create_200_response_t;




typedef struct brand_accounts_create_200_response_t {
    char *brand_account_id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} brand_accounts_create_200_response_t;

__attribute__((deprecated)) brand_accounts_create_200_response_t *brand_accounts_create_200_response_create(
    char *brand_account_id
);

void brand_accounts_create_200_response_free(brand_accounts_create_200_response_t *brand_accounts_create_200_response);

brand_accounts_create_200_response_t *brand_accounts_create_200_response_parseFromJSON(cJSON *brand_accounts_create_200_responseJSON);

cJSON *brand_accounts_create_200_response_convertToJSON(brand_accounts_create_200_response_t *brand_accounts_create_200_response);

#endif /* _brand_accounts_create_200_response_H_ */

