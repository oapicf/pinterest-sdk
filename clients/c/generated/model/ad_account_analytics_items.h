/*
 * ad_account_analytics_items.h
 *
 * 
 */

#ifndef _ad_account_analytics_items_H_
#define _ad_account_analytics_items_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ad_account_analytics_items_t ad_account_analytics_items_t;




typedef struct ad_account_analytics_items_t {
    char *ad_account_id; // string
    char *date; //date

    int _library_owned; // Is the library responsible for freeing this object?
} ad_account_analytics_items_t;

__attribute__((deprecated)) ad_account_analytics_items_t *ad_account_analytics_items_create(
    char *ad_account_id,
    char *date
);

void ad_account_analytics_items_free(ad_account_analytics_items_t *ad_account_analytics_items);

ad_account_analytics_items_t *ad_account_analytics_items_parseFromJSON(cJSON *ad_account_analytics_itemsJSON);

cJSON *ad_account_analytics_items_convertToJSON(ad_account_analytics_items_t *ad_account_analytics_items);

#endif /* _ad_account_analytics_items_H_ */

