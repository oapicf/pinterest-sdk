/*
 * integration_log_client_request.h
 *
 * HTTP request details included in the log sent by the client.
 */

#ifndef _integration_log_client_request_H_
#define _integration_log_client_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct integration_log_client_request_t integration_log_client_request_t;

#include "http_method.h"



typedef struct integration_log_client_request_t {
    char *host; // string
    pinterest_rest_api_http_method__e method; //referenced enum
    char *path; // string
    list_t* request_headers; //map
    list_t* response_headers; //map
    int *response_status_code; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} integration_log_client_request_t;

__attribute__((deprecated)) integration_log_client_request_t *integration_log_client_request_create(
    char *host,
    pinterest_rest_api_http_method__e method,
    char *path,
    list_t* request_headers,
    list_t* response_headers,
    int *response_status_code
);

void integration_log_client_request_free(integration_log_client_request_t *integration_log_client_request);

integration_log_client_request_t *integration_log_client_request_parseFromJSON(cJSON *integration_log_client_requestJSON);

cJSON *integration_log_client_request_convertToJSON(integration_log_client_request_t *integration_log_client_request);

#endif /* _integration_log_client_request_H_ */

