/*
 * ad_batch_item.h
 *
 * 
 */

#ifndef _ad_batch_item_H_
#define _ad_batch_item_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ad_batch_item_t ad_batch_item_t;

#include "ad.h"
#include "pinterest_lib_error.h"



typedef struct ad_batch_item_t {
    struct ad_t *data; //model
    struct pinterest_lib_error_t *exceptions; //model

    int _library_owned; // Is the library responsible for freeing this object?
} ad_batch_item_t;

__attribute__((deprecated)) ad_batch_item_t *ad_batch_item_create(
    ad_t *data,
    pinterest_lib_error_t *exceptions
);

void ad_batch_item_free(ad_batch_item_t *ad_batch_item);

ad_batch_item_t *ad_batch_item_parseFromJSON(cJSON *ad_batch_itemJSON);

cJSON *ad_batch_item_convertToJSON(ad_batch_item_t *ad_batch_item);

#endif /* _ad_batch_item_H_ */

