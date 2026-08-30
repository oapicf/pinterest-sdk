/*
 * bulk_campaign_delivery_estimates_response.h
 *
 * Bulk campaign delivery estimates response.
 */

#ifndef _bulk_campaign_delivery_estimates_response_H_
#define _bulk_campaign_delivery_estimates_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct bulk_campaign_delivery_estimates_response_t bulk_campaign_delivery_estimates_response_t;

#include "bulk_campaign_delivery_estimates_item.h"



typedef struct bulk_campaign_delivery_estimates_response_t {
    list_t *data; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} bulk_campaign_delivery_estimates_response_t;

__attribute__((deprecated)) bulk_campaign_delivery_estimates_response_t *bulk_campaign_delivery_estimates_response_create(
    list_t *data
);

void bulk_campaign_delivery_estimates_response_free(bulk_campaign_delivery_estimates_response_t *bulk_campaign_delivery_estimates_response);

bulk_campaign_delivery_estimates_response_t *bulk_campaign_delivery_estimates_response_parseFromJSON(cJSON *bulk_campaign_delivery_estimates_responseJSON);

cJSON *bulk_campaign_delivery_estimates_response_convertToJSON(bulk_campaign_delivery_estimates_response_t *bulk_campaign_delivery_estimates_response);

#endif /* _bulk_campaign_delivery_estimates_response_H_ */

