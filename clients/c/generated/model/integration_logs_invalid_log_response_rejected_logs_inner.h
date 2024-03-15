/*
 * integration_logs_invalid_log_response_rejected_logs_inner.h
 *
 * 
 */

#ifndef _integration_logs_invalid_log_response_rejected_logs_inner_H_
#define _integration_logs_invalid_log_response_rejected_logs_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct integration_logs_invalid_log_response_rejected_logs_inner_t integration_logs_invalid_log_response_rejected_logs_inner_t;




typedef struct integration_logs_invalid_log_response_rejected_logs_inner_t {
    int log_index; //numeric
    char *field; // string
    char *value; // string
    char *reason; // string

} integration_logs_invalid_log_response_rejected_logs_inner_t;

integration_logs_invalid_log_response_rejected_logs_inner_t *integration_logs_invalid_log_response_rejected_logs_inner_create(
    int log_index,
    char *field,
    char *value,
    char *reason
);

void integration_logs_invalid_log_response_rejected_logs_inner_free(integration_logs_invalid_log_response_rejected_logs_inner_t *integration_logs_invalid_log_response_rejected_logs_inner);

integration_logs_invalid_log_response_rejected_logs_inner_t *integration_logs_invalid_log_response_rejected_logs_inner_parseFromJSON(cJSON *integration_logs_invalid_log_response_rejected_logs_innerJSON);

cJSON *integration_logs_invalid_log_response_rejected_logs_inner_convertToJSON(integration_logs_invalid_log_response_rejected_logs_inner_t *integration_logs_invalid_log_response_rejected_logs_inner);

#endif /* _integration_logs_invalid_log_response_rejected_logs_inner_H_ */

