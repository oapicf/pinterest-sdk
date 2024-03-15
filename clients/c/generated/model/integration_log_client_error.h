/*
 * integration_log_client_error.h
 *
 * System error details included in the log sent by the client.
 */

#ifndef _integration_log_client_error_H_
#define _integration_log_client_error_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct integration_log_client_error_t integration_log_client_error_t;




typedef struct integration_log_client_error_t {
    char *cause; // string
    int column_number; //numeric
    char *file_name; // string
    int line_number; //numeric
    char *message; // string
    char *message_detail; // string
    char *name; // string
    int number; //numeric
    char *stack_trace; // string

} integration_log_client_error_t;

integration_log_client_error_t *integration_log_client_error_create(
    char *cause,
    int column_number,
    char *file_name,
    int line_number,
    char *message,
    char *message_detail,
    char *name,
    int number,
    char *stack_trace
);

void integration_log_client_error_free(integration_log_client_error_t *integration_log_client_error);

integration_log_client_error_t *integration_log_client_error_parseFromJSON(cJSON *integration_log_client_errorJSON);

cJSON *integration_log_client_error_convertToJSON(integration_log_client_error_t *integration_log_client_error);

#endif /* _integration_log_client_error_H_ */

