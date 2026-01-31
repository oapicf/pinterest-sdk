/*
 * product_group_analytics_response_inner.h
 *
 * 
 */

#ifndef _product_group_analytics_response_inner_H_
#define _product_group_analytics_response_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct product_group_analytics_response_inner_t product_group_analytics_response_inner_t;

#include "any_type.h"



typedef struct product_group_analytics_response_inner_t {
    char *date; //date
    char *product_group_id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} product_group_analytics_response_inner_t;

__attribute__((deprecated)) product_group_analytics_response_inner_t *product_group_analytics_response_inner_create(
    char *date,
    char *product_group_id
);

void product_group_analytics_response_inner_free(product_group_analytics_response_inner_t *product_group_analytics_response_inner);

product_group_analytics_response_inner_t *product_group_analytics_response_inner_parseFromJSON(cJSON *product_group_analytics_response_innerJSON);

cJSON *product_group_analytics_response_inner_convertToJSON(product_group_analytics_response_inner_t *product_group_analytics_response_inner);

#endif /* _product_group_analytics_response_inner_H_ */

