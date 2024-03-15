/*
 * integration_logs_request.h
 *
 * Batch of logs sent from an integration application.
 */

#ifndef _integration_logs_request_H_
#define _integration_logs_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct integration_logs_request_t integration_logs_request_t;

#include "integration_log.h"



typedef struct integration_logs_request_t {
    list_t *logs; //nonprimitive container

} integration_logs_request_t;

integration_logs_request_t *integration_logs_request_create(
    list_t *logs
);

void integration_logs_request_free(integration_logs_request_t *integration_logs_request);

integration_logs_request_t *integration_logs_request_parseFromJSON(cJSON *integration_logs_requestJSON);

cJSON *integration_logs_request_convertToJSON(integration_logs_request_t *integration_logs_request);

#endif /* _integration_logs_request_H_ */

