/*
 * ad_groups_create_200_response_items_inner.h
 *
 * 
 */

#ifndef _ad_groups_create_200_response_items_inner_H_
#define _ad_groups_create_200_response_items_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ad_groups_create_200_response_items_inner_t ad_groups_create_200_response_items_inner_t;

#include "ad_group.h"
#include "pinterest_lib_batch_item_exception.h"



typedef struct ad_groups_create_200_response_items_inner_t {
    struct ad_group_t *data; //model
    list_t *exceptions; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} ad_groups_create_200_response_items_inner_t;

__attribute__((deprecated)) ad_groups_create_200_response_items_inner_t *ad_groups_create_200_response_items_inner_create(
    ad_group_t *data,
    list_t *exceptions
);

void ad_groups_create_200_response_items_inner_free(ad_groups_create_200_response_items_inner_t *ad_groups_create_200_response_items_inner);

ad_groups_create_200_response_items_inner_t *ad_groups_create_200_response_items_inner_parseFromJSON(cJSON *ad_groups_create_200_response_items_innerJSON);

cJSON *ad_groups_create_200_response_items_inner_convertToJSON(ad_groups_create_200_response_items_inner_t *ad_groups_create_200_response_items_inner);

#endif /* _ad_groups_create_200_response_items_inner_H_ */

