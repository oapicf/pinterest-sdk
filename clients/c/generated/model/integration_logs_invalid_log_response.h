/*
 * integration_logs_invalid_log_response.h
 *
 * Schema describing the response when a log has invalid fields.
 */

#ifndef _integration_logs_invalid_log_response_H_
#define _integration_logs_invalid_log_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct integration_logs_invalid_log_response_t integration_logs_invalid_log_response_t;

#include "integration_logs_invalid_log_response_rejected_logs_inner.h"



typedef struct integration_logs_invalid_log_response_t {
    list_t *rejected_logs; //nonprimitive container

} integration_logs_invalid_log_response_t;

integration_logs_invalid_log_response_t *integration_logs_invalid_log_response_create(
    list_t *rejected_logs
);

void integration_logs_invalid_log_response_free(integration_logs_invalid_log_response_t *integration_logs_invalid_log_response);

integration_logs_invalid_log_response_t *integration_logs_invalid_log_response_parseFromJSON(cJSON *integration_logs_invalid_log_responseJSON);

cJSON *integration_logs_invalid_log_response_convertToJSON(integration_logs_invalid_log_response_t *integration_logs_invalid_log_response);

#endif /* _integration_logs_invalid_log_response_H_ */

