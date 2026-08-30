/*
 * delivery_metrics_response_items_items.h
 *
 * 
 */

#ifndef _delivery_metrics_response_items_items_H_
#define _delivery_metrics_response_items_items_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct delivery_metrics_response_items_items_t delivery_metrics_response_items_items_t;


// Enum CATEGORY for delivery_metrics_response_items_items

typedef enum  { pinterest_rest_api_delivery_metrics_response_items_items_CATEGORY_NULL = 0, pinterest_rest_api_delivery_metrics_response_items_items_CATEGORY_ADS, pinterest_rest_api_delivery_metrics_response_items_items_CATEGORY_ORGANIC } pinterest_rest_api_delivery_metrics_response_items_items_CATEGORY_e;

char* delivery_metrics_response_items_items_category_ToString(pinterest_rest_api_delivery_metrics_response_items_items_CATEGORY_e category);

pinterest_rest_api_delivery_metrics_response_items_items_CATEGORY_e delivery_metrics_response_items_items_category_FromString(char* category);



typedef struct delivery_metrics_response_items_items_t {
    pinterest_rest_api_delivery_metrics_response_items_items_CATEGORY_e category; //enum
    char *definition; // string
    char *display_name; // string
    char *name; // string

    int _library_owned; // Is the library responsible for freeing this object?
} delivery_metrics_response_items_items_t;

__attribute__((deprecated)) delivery_metrics_response_items_items_t *delivery_metrics_response_items_items_create(
    pinterest_rest_api_delivery_metrics_response_items_items_CATEGORY_e category,
    char *definition,
    char *display_name,
    char *name
);

void delivery_metrics_response_items_items_free(delivery_metrics_response_items_items_t *delivery_metrics_response_items_items);

delivery_metrics_response_items_items_t *delivery_metrics_response_items_items_parseFromJSON(cJSON *delivery_metrics_response_items_itemsJSON);

cJSON *delivery_metrics_response_items_items_convertToJSON(delivery_metrics_response_items_items_t *delivery_metrics_response_items_items);

#endif /* _delivery_metrics_response_items_items_H_ */

