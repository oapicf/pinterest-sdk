/*
 * ssio_order_lines_get_by_ad_account_200_response.h
 *
 * 
 */

#ifndef _ssio_order_lines_get_by_ad_account_200_response_H_
#define _ssio_order_lines_get_by_ad_account_200_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ssio_order_lines_get_by_ad_account_200_response_t ssio_order_lines_get_by_ad_account_200_response_t;

#include "ssio_order_line.h"



typedef struct ssio_order_lines_get_by_ad_account_200_response_t {
    list_t *items; //nonprimitive container
    char *bookmark; // string

} ssio_order_lines_get_by_ad_account_200_response_t;

ssio_order_lines_get_by_ad_account_200_response_t *ssio_order_lines_get_by_ad_account_200_response_create(
    list_t *items,
    char *bookmark
);

void ssio_order_lines_get_by_ad_account_200_response_free(ssio_order_lines_get_by_ad_account_200_response_t *ssio_order_lines_get_by_ad_account_200_response);

ssio_order_lines_get_by_ad_account_200_response_t *ssio_order_lines_get_by_ad_account_200_response_parseFromJSON(cJSON *ssio_order_lines_get_by_ad_account_200_responseJSON);

cJSON *ssio_order_lines_get_by_ad_account_200_response_convertToJSON(ssio_order_lines_get_by_ad_account_200_response_t *ssio_order_lines_get_by_ad_account_200_response);

#endif /* _ssio_order_lines_get_by_ad_account_200_response_H_ */

