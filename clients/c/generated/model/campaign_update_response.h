/*
 * campaign_update_response.h
 *
 * 
 */

#ifndef _campaign_update_response_H_
#define _campaign_update_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct campaign_update_response_t campaign_update_response_t;

#include "campaign_create_response_item.h"



typedef struct campaign_update_response_t {
    list_t *items; //nonprimitive container

} campaign_update_response_t;

campaign_update_response_t *campaign_update_response_create(
    list_t *items
);

void campaign_update_response_free(campaign_update_response_t *campaign_update_response);

campaign_update_response_t *campaign_update_response_parseFromJSON(cJSON *campaign_update_responseJSON);

cJSON *campaign_update_response_convertToJSON(campaign_update_response_t *campaign_update_response);

#endif /* _campaign_update_response_H_ */

