/*
 * supplemental_items_batch_response.h
 *
 * Response model for supplemental items batch operation
 */

#ifndef _supplemental_items_batch_response_H_
#define _supplemental_items_batch_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct supplemental_items_batch_response_t supplemental_items_batch_response_t;

#include "supplemental_item_batch_operation_status.h"
#include "supplemental_operation_result.h"



typedef struct supplemental_items_batch_response_t {
    char *batch_id; // string
    char *completed_time; //date time
    char *created_time; //date time
    list_t *operation_results; //nonprimitive container
    supplemental_item_batch_operation_status_t *status; // custom

    int _library_owned; // Is the library responsible for freeing this object?
} supplemental_items_batch_response_t;

__attribute__((deprecated)) supplemental_items_batch_response_t *supplemental_items_batch_response_create(
    char *batch_id,
    char *completed_time,
    char *created_time,
    list_t *operation_results,
    supplemental_item_batch_operation_status_t *status
);

void supplemental_items_batch_response_free(supplemental_items_batch_response_t *supplemental_items_batch_response);

supplemental_items_batch_response_t *supplemental_items_batch_response_parseFromJSON(cJSON *supplemental_items_batch_responseJSON);

cJSON *supplemental_items_batch_response_convertToJSON(supplemental_items_batch_response_t *supplemental_items_batch_response);

#endif /* _supplemental_items_batch_response_H_ */

