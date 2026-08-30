/*
 * product_group_analytics_items.h
 *
 * 
 */

#ifndef _product_group_analytics_items_H_
#define _product_group_analytics_items_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct product_group_analytics_items_t product_group_analytics_items_t;




typedef struct product_group_analytics_items_t {
    char *date; //date
    char *product_group_id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} product_group_analytics_items_t;

__attribute__((deprecated)) product_group_analytics_items_t *product_group_analytics_items_create(
    char *date,
    char *product_group_id
);

void product_group_analytics_items_free(product_group_analytics_items_t *product_group_analytics_items);

product_group_analytics_items_t *product_group_analytics_items_parseFromJSON(cJSON *product_group_analytics_itemsJSON);

cJSON *product_group_analytics_items_convertToJSON(product_group_analytics_items_t *product_group_analytics_items);

#endif /* _product_group_analytics_items_H_ */

