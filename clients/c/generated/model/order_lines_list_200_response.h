/*
 * order_lines_list_200_response.h
 *
 * 
 */

#ifndef _order_lines_list_200_response_H_
#define _order_lines_list_200_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct order_lines_list_200_response_t order_lines_list_200_response_t;

#include "order_line.h"



typedef struct order_lines_list_200_response_t {
    list_t *items; //nonprimitive container
    char *bookmark; // string

} order_lines_list_200_response_t;

order_lines_list_200_response_t *order_lines_list_200_response_create(
    list_t *items,
    char *bookmark
);

void order_lines_list_200_response_free(order_lines_list_200_response_t *order_lines_list_200_response);

order_lines_list_200_response_t *order_lines_list_200_response_parseFromJSON(cJSON *order_lines_list_200_responseJSON);

cJSON *order_lines_list_200_response_convertToJSON(order_lines_list_200_response_t *order_lines_list_200_response);

#endif /* _order_lines_list_200_response_H_ */

