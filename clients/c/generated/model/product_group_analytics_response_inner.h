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
    char *product_group_id; // string
    char *date; //date

} product_group_analytics_response_inner_t;

product_group_analytics_response_inner_t *product_group_analytics_response_inner_create(
    char *product_group_id,
    char *date
);

void product_group_analytics_response_inner_free(product_group_analytics_response_inner_t *product_group_analytics_response_inner);

product_group_analytics_response_inner_t *product_group_analytics_response_inner_parseFromJSON(cJSON *product_group_analytics_response_innerJSON);

cJSON *product_group_analytics_response_inner_convertToJSON(product_group_analytics_response_inner_t *product_group_analytics_response_inner);

#endif /* _product_group_analytics_response_inner_H_ */

