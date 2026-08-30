/*
 * campaign_batch_write_response_model.h
 *
 * Response model for batch campaign write operations.
 */

#ifndef _campaign_batch_write_response_model_H_
#define _campaign_batch_write_response_model_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct campaign_batch_write_response_model_t campaign_batch_write_response_model_t;

#include "campaign_batch_item.h"



typedef struct campaign_batch_write_response_model_t {
    list_t *items; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} campaign_batch_write_response_model_t;

__attribute__((deprecated)) campaign_batch_write_response_model_t *campaign_batch_write_response_model_create(
    list_t *items
);

void campaign_batch_write_response_model_free(campaign_batch_write_response_model_t *campaign_batch_write_response_model);

campaign_batch_write_response_model_t *campaign_batch_write_response_model_parseFromJSON(cJSON *campaign_batch_write_response_modelJSON);

cJSON *campaign_batch_write_response_model_convertToJSON(campaign_batch_write_response_model_t *campaign_batch_write_response_model);

#endif /* _campaign_batch_write_response_model_H_ */

