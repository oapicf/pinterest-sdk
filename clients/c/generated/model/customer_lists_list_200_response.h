/*
 * customer_lists_list_200_response.h
 *
 * 
 */

#ifndef _customer_lists_list_200_response_H_
#define _customer_lists_list_200_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct customer_lists_list_200_response_t customer_lists_list_200_response_t;

#include "customer_list.h"



typedef struct customer_lists_list_200_response_t {
    list_t *items; //nonprimitive container
    char *bookmark; // string

} customer_lists_list_200_response_t;

customer_lists_list_200_response_t *customer_lists_list_200_response_create(
    list_t *items,
    char *bookmark
);

void customer_lists_list_200_response_free(customer_lists_list_200_response_t *customer_lists_list_200_response);

customer_lists_list_200_response_t *customer_lists_list_200_response_parseFromJSON(cJSON *customer_lists_list_200_responseJSON);

cJSON *customer_lists_list_200_response_convertToJSON(customer_lists_list_200_response_t *customer_lists_list_200_response);

#endif /* _customer_lists_list_200_response_H_ */

