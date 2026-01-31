/*
 * amazon_connect_request.h
 *
 * Request containing OTP and Amazon storefront info called by Amazon
 */

#ifndef _amazon_connect_request_H_
#define _amazon_connect_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct amazon_connect_request_t amazon_connect_request_t;




typedef struct amazon_connect_request_t {
    char *amazon_storefront_id; // string
    char *amazon_storefront_name; // string
    char *amazon_storefront_url; // string
    char *amazon_user_id; // string
    int is_amazon_account_linked; //boolean
    char *one_time_passcode; // string
    char *pinterest_user_id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} amazon_connect_request_t;

__attribute__((deprecated)) amazon_connect_request_t *amazon_connect_request_create(
    char *amazon_storefront_id,
    char *amazon_storefront_name,
    char *amazon_storefront_url,
    char *amazon_user_id,
    int is_amazon_account_linked,
    char *one_time_passcode,
    char *pinterest_user_id
);

void amazon_connect_request_free(amazon_connect_request_t *amazon_connect_request);

amazon_connect_request_t *amazon_connect_request_parseFromJSON(cJSON *amazon_connect_requestJSON);

cJSON *amazon_connect_request_convertToJSON(amazon_connect_request_t *amazon_connect_request);

#endif /* _amazon_connect_request_H_ */

