/*
 * integration_logs_success_response.h
 *
 * Response when logs are successfully processed.
 */

#ifndef _integration_logs_success_response_H_
#define _integration_logs_success_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct integration_logs_success_response_t integration_logs_success_response_t;




typedef struct integration_logs_success_response_t {
    char *message; // string

} integration_logs_success_response_t;

integration_logs_success_response_t *integration_logs_success_response_create(
    char *message
);

void integration_logs_success_response_free(integration_logs_success_response_t *integration_logs_success_response);

integration_logs_success_response_t *integration_logs_success_response_parseFromJSON(cJSON *integration_logs_success_responseJSON);

cJSON *integration_logs_success_response_convertToJSON(integration_logs_success_response_t *integration_logs_success_response);

#endif /* _integration_logs_success_response_H_ */

