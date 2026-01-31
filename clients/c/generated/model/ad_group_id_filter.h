/*
 * ad_group_id_filter.h
 *
 * 
 */

#ifndef _ad_group_id_filter_H_
#define _ad_group_id_filter_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ad_group_id_filter_t ad_group_id_filter_t;




typedef struct ad_group_id_filter_t {
    list_t *ad_group_ids; //primitive container

    int _library_owned; // Is the library responsible for freeing this object?
} ad_group_id_filter_t;

__attribute__((deprecated)) ad_group_id_filter_t *ad_group_id_filter_create(
    list_t *ad_group_ids
);

void ad_group_id_filter_free(ad_group_id_filter_t *ad_group_id_filter);

ad_group_id_filter_t *ad_group_id_filter_parseFromJSON(cJSON *ad_group_id_filterJSON);

cJSON *ad_group_id_filter_convertToJSON(ad_group_id_filter_t *ad_group_id_filter);

#endif /* _ad_group_id_filter_H_ */

