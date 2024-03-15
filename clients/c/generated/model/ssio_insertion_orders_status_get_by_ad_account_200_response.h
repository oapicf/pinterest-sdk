/*
 * ssio_insertion_orders_status_get_by_ad_account_200_response.h
 *
 * 
 */

#ifndef _ssio_insertion_orders_status_get_by_ad_account_200_response_H_
#define _ssio_insertion_orders_status_get_by_ad_account_200_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ssio_insertion_orders_status_get_by_ad_account_200_response_t ssio_insertion_orders_status_get_by_ad_account_200_response_t;

#include "ssio_insertion_order_status.h"



typedef struct ssio_insertion_orders_status_get_by_ad_account_200_response_t {
    list_t *items; //nonprimitive container
    char *bookmark; // string

} ssio_insertion_orders_status_get_by_ad_account_200_response_t;

ssio_insertion_orders_status_get_by_ad_account_200_response_t *ssio_insertion_orders_status_get_by_ad_account_200_response_create(
    list_t *items,
    char *bookmark
);

void ssio_insertion_orders_status_get_by_ad_account_200_response_free(ssio_insertion_orders_status_get_by_ad_account_200_response_t *ssio_insertion_orders_status_get_by_ad_account_200_response);

ssio_insertion_orders_status_get_by_ad_account_200_response_t *ssio_insertion_orders_status_get_by_ad_account_200_response_parseFromJSON(cJSON *ssio_insertion_orders_status_get_by_ad_account_200_responseJSON);

cJSON *ssio_insertion_orders_status_get_by_ad_account_200_response_convertToJSON(ssio_insertion_orders_status_get_by_ad_account_200_response_t *ssio_insertion_orders_status_get_by_ad_account_200_response);

#endif /* _ssio_insertion_orders_status_get_by_ad_account_200_response_H_ */

