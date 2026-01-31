/*
 * campaign_id_filter.h
 *
 * 
 */

#ifndef _campaign_id_filter_H_
#define _campaign_id_filter_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct campaign_id_filter_t campaign_id_filter_t;




typedef struct campaign_id_filter_t {
    list_t *campaign_ids; //primitive container

    int _library_owned; // Is the library responsible for freeing this object?
} campaign_id_filter_t;

__attribute__((deprecated)) campaign_id_filter_t *campaign_id_filter_create(
    list_t *campaign_ids
);

void campaign_id_filter_free(campaign_id_filter_t *campaign_id_filter);

campaign_id_filter_t *campaign_id_filter_parseFromJSON(cJSON *campaign_id_filterJSON);

cJSON *campaign_id_filter_convertToJSON(campaign_id_filter_t *campaign_id_filter);

#endif /* _campaign_id_filter_H_ */

