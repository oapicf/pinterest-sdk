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


// Enum METHOD for integration_log_client_request

typedef enum  { pinterest_rest_api_integration_log_client_request_METHOD_NULL = 0, pinterest_rest_api_integration_log_client_request_METHOD_GET, pinterest_rest_api_integration_log_client_request_METHOD_HEAD, pinterest_rest_api_integration_log_client_request_METHOD_POST, pinterest_rest_api_integration_log_client_request_METHOD_PUT, pinterest_rest_api_integration_log_client_request_METHOD__DELETE, pinterest_rest_api_integration_log_client_request_METHOD_CONNECT, pinterest_rest_api_integration_log_client_request_METHOD_OPTIONS, pinterest_rest_api_integration_log_client_request_METHOD_TRACE, pinterest_rest_api_integration_log_client_request_METHOD_PATCH } pinterest_rest_api_integration_log_client_request_METHOD_e;

char* integration_log_client_request_method_ToString(pinterest_rest_api_integration_log_client_request_METHOD_e method);

pinterest_rest_api_integration_log_client_request_METHOD_e integration_log_client_request_method_FromString(char* method);



typedef struct integration_log_client_request_t {
    pinterest_rest_api_integration_log_client_request_METHOD_e method; //enum
    char *host; // string
    char *path; // string
    list_t* request_headers; //map
    list_t* response_headers; //map
    int response_status_code; //numeric

} integration_log_client_request_t;

integration_log_client_request_t *integration_log_client_request_create(
    pinterest_rest_api_integration_log_client_request_METHOD_e method,
    char *host,
    char *path,
    list_t* request_headers,
    list_t* response_headers,
    int response_status_code
);

void integration_log_client_request_free(integration_log_client_request_t *integration_log_client_request);

integration_log_client_request_t *integration_log_client_request_parseFromJSON(cJSON *integration_log_client_requestJSON);

cJSON *integration_log_client_request_convertToJSON(integration_log_client_request_t *integration_log_client_request);

#endif /* _integration_log_client_request_H_ */

