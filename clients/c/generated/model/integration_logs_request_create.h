/*
 * integration_logs_request_create.h
 *
 * Resource create operation model.
 */

#ifndef _integration_logs_request_create_H_
#define _integration_logs_request_create_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct integration_logs_request_create_t integration_logs_request_create_t;

#include "integration_log.h"



typedef struct integration_logs_request_create_t {
    list_t *logs; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} integration_logs_request_create_t;

__attribute__((deprecated)) integration_logs_request_create_t *integration_logs_request_create_create(
    list_t *logs
);

void integration_logs_request_create_free(integration_logs_request_create_t *integration_logs_request_create);

integration_logs_request_create_t *integration_logs_request_create_parseFromJSON(cJSON *integration_logs_request_createJSON);

cJSON *integration_logs_request_create_convertToJSON(integration_logs_request_create_t *integration_logs_request_create);

#endif /* _integration_logs_request_create_H_ */

