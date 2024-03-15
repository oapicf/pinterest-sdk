/*
 * delivery_metrics_response_items_inner.h
 *
 * 
 */

#ifndef _delivery_metrics_response_items_inner_H_
#define _delivery_metrics_response_items_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct delivery_metrics_response_items_inner_t delivery_metrics_response_items_inner_t;


// Enum CATEGORY for delivery_metrics_response_items_inner

typedef enum  { pinterest_rest_api_delivery_metrics_response_items_inner_CATEGORY_NULL = 0, pinterest_rest_api_delivery_metrics_response_items_inner_CATEGORY_ADS, pinterest_rest_api_delivery_metrics_response_items_inner_CATEGORY_ORGANIC } pinterest_rest_api_delivery_metrics_response_items_inner_CATEGORY_e;

char* delivery_metrics_response_items_inner_category_ToString(pinterest_rest_api_delivery_metrics_response_items_inner_CATEGORY_e category);

pinterest_rest_api_delivery_metrics_response_items_inner_CATEGORY_e delivery_metrics_response_items_inner_category_FromString(char* category);



typedef struct delivery_metrics_response_items_inner_t {
    char *name; // string
    pinterest_rest_api_delivery_metrics_response_items_inner_CATEGORY_e category; //enum
    char *definition; // string
    char *display_name; // string

} delivery_metrics_response_items_inner_t;

delivery_metrics_response_items_inner_t *delivery_metrics_response_items_inner_create(
    char *name,
    pinterest_rest_api_delivery_metrics_response_items_inner_CATEGORY_e category,
    char *definition,
    char *display_name
);

void delivery_metrics_response_items_inner_free(delivery_metrics_response_items_inner_t *delivery_metrics_response_items_inner);

delivery_metrics_response_items_inner_t *delivery_metrics_response_items_inner_parseFromJSON(cJSON *delivery_metrics_response_items_innerJSON);

cJSON *delivery_metrics_response_items_inner_convertToJSON(delivery_metrics_response_items_inner_t *delivery_metrics_response_items_inner);

#endif /* _delivery_metrics_response_items_inner_H_ */

