/*
 * ad_batch_write_response_model.h
 *
 * 
 */

#ifndef _ad_batch_write_response_model_H_
#define _ad_batch_write_response_model_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ad_batch_write_response_model_t ad_batch_write_response_model_t;

#include "ad_batch_item.h"



typedef struct ad_batch_write_response_model_t {
    list_t *items; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} ad_batch_write_response_model_t;

__attribute__((deprecated)) ad_batch_write_response_model_t *ad_batch_write_response_model_create(
    list_t *items
);

void ad_batch_write_response_model_free(ad_batch_write_response_model_t *ad_batch_write_response_model);

ad_batch_write_response_model_t *ad_batch_write_response_model_parseFromJSON(cJSON *ad_batch_write_response_modelJSON);

cJSON *ad_batch_write_response_model_convertToJSON(ad_batch_write_response_model_t *ad_batch_write_response_model);

#endif /* _ad_batch_write_response_model_H_ */

