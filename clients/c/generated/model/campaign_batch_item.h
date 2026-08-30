/*
 * campaign_batch_item.h
 *
 * Item in a batch campaign response.
 */

#ifndef _campaign_batch_item_H_
#define _campaign_batch_item_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct campaign_batch_item_t campaign_batch_item_t;

#include "campaign_batch_response_data.h"
#include "exception.h"



typedef struct campaign_batch_item_t {
    struct campaign_batch_response_data_t *data; //model
    list_t *exceptions; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} campaign_batch_item_t;

__attribute__((deprecated)) campaign_batch_item_t *campaign_batch_item_create(
    campaign_batch_response_data_t *data,
    list_t *exceptions
);

void campaign_batch_item_free(campaign_batch_item_t *campaign_batch_item);

campaign_batch_item_t *campaign_batch_item_parseFromJSON(cJSON *campaign_batch_itemJSON);

cJSON *campaign_batch_item_convertToJSON(campaign_batch_item_t *campaign_batch_item);

#endif /* _campaign_batch_item_H_ */

