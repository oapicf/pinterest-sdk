/*
 * integration_logs_invalid_log_response_rejected_logs_items.h
 *
 * 
 */

#ifndef _integration_logs_invalid_log_response_rejected_logs_items_H_
#define _integration_logs_invalid_log_response_rejected_logs_items_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct integration_logs_invalid_log_response_rejected_logs_items_t integration_logs_invalid_log_response_rejected_logs_items_t;




typedef struct integration_logs_invalid_log_response_rejected_logs_items_t {
    char *field; // string
    int *log_index; //numeric
    char *reason; // string
    char *value; // string

    int _library_owned; // Is the library responsible for freeing this object?
} integration_logs_invalid_log_response_rejected_logs_items_t;

__attribute__((deprecated)) integration_logs_invalid_log_response_rejected_logs_items_t *integration_logs_invalid_log_response_rejected_logs_items_create(
    char *field,
    int *log_index,
    char *reason,
    char *value
);

void integration_logs_invalid_log_response_rejected_logs_items_free(integration_logs_invalid_log_response_rejected_logs_items_t *integration_logs_invalid_log_response_rejected_logs_items);

integration_logs_invalid_log_response_rejected_logs_items_t *integration_logs_invalid_log_response_rejected_logs_items_parseFromJSON(cJSON *integration_logs_invalid_log_response_rejected_logs_itemsJSON);

cJSON *integration_logs_invalid_log_response_rejected_logs_items_convertToJSON(integration_logs_invalid_log_response_rejected_logs_items_t *integration_logs_invalid_log_response_rejected_logs_items);

#endif /* _integration_logs_invalid_log_response_rejected_logs_items_H_ */

