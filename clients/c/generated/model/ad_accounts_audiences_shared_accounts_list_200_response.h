/*
 * ad_accounts_audiences_shared_accounts_list_200_response.h
 *
 * 
 */

#ifndef _ad_accounts_audiences_shared_accounts_list_200_response_H_
#define _ad_accounts_audiences_shared_accounts_list_200_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ad_accounts_audiences_shared_accounts_list_200_response_t ad_accounts_audiences_shared_accounts_list_200_response_t;

#include "shared_audience_account.h"



typedef struct ad_accounts_audiences_shared_accounts_list_200_response_t {
    char *bookmark; // string
    list_t *items; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} ad_accounts_audiences_shared_accounts_list_200_response_t;

__attribute__((deprecated)) ad_accounts_audiences_shared_accounts_list_200_response_t *ad_accounts_audiences_shared_accounts_list_200_response_create(
    char *bookmark,
    list_t *items
);

void ad_accounts_audiences_shared_accounts_list_200_response_free(ad_accounts_audiences_shared_accounts_list_200_response_t *ad_accounts_audiences_shared_accounts_list_200_response);

ad_accounts_audiences_shared_accounts_list_200_response_t *ad_accounts_audiences_shared_accounts_list_200_response_parseFromJSON(cJSON *ad_accounts_audiences_shared_accounts_list_200_responseJSON);

cJSON *ad_accounts_audiences_shared_accounts_list_200_response_convertToJSON(ad_accounts_audiences_shared_accounts_list_200_response_t *ad_accounts_audiences_shared_accounts_list_200_response);

#endif /* _ad_accounts_audiences_shared_accounts_list_200_response_H_ */

