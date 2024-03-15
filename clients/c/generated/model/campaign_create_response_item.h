/*
 * campaign_create_response_item.h
 *
 * 
 */

#ifndef _campaign_create_response_item_H_
#define _campaign_create_response_item_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct campaign_create_response_item_t campaign_create_response_item_t;

#include "campaign_create_response_data.h"
#include "exception.h"



typedef struct campaign_create_response_item_t {
    struct campaign_create_response_data_t *data; //model
    list_t *exceptions; //nonprimitive container

} campaign_create_response_item_t;

campaign_create_response_item_t *campaign_create_response_item_create(
    campaign_create_response_data_t *data,
    list_t *exceptions
);

void campaign_create_response_item_free(campaign_create_response_item_t *campaign_create_response_item);

campaign_create_response_item_t *campaign_create_response_item_parseFromJSON(cJSON *campaign_create_response_itemJSON);

cJSON *campaign_create_response_item_convertToJSON(campaign_create_response_item_t *campaign_create_response_item);

#endif /* _campaign_create_response_item_H_ */

