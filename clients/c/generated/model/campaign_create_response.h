/*
 * campaign_create_response.h
 *
 * 
 */

#ifndef _campaign_create_response_H_
#define _campaign_create_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct campaign_create_response_t campaign_create_response_t;

#include "campaign_create_response_item.h"



typedef struct campaign_create_response_t {
    list_t *items; //nonprimitive container

} campaign_create_response_t;

campaign_create_response_t *campaign_create_response_create(
    list_t *items
);

void campaign_create_response_free(campaign_create_response_t *campaign_create_response);

campaign_create_response_t *campaign_create_response_parseFromJSON(cJSON *campaign_create_responseJSON);

cJSON *campaign_create_response_convertToJSON(campaign_create_response_t *campaign_create_response);

#endif /* _campaign_create_response_H_ */

