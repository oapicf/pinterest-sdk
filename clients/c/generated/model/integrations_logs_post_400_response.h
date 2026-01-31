/*
 * integrations_logs_post_400_response.h
 *
 * 
 */

#ifndef _integrations_logs_post_400_response_H_
#define _integrations_logs_post_400_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct integrations_logs_post_400_response_t integrations_logs_post_400_response_t;

#include "detailed_error.h"
#include "error.h"
#include "object.h"



typedef struct integrations_logs_post_400_response_t {
    int code; //numeric
    char *message; // string
    object_t *details; //object

    int _library_owned; // Is the library responsible for freeing this object?
} integrations_logs_post_400_response_t;

__attribute__((deprecated)) integrations_logs_post_400_response_t *integrations_logs_post_400_response_create(
    int code,
    char *message,
    object_t *details
);

void integrations_logs_post_400_response_free(integrations_logs_post_400_response_t *integrations_logs_post_400_response);

integrations_logs_post_400_response_t *integrations_logs_post_400_response_parseFromJSON(cJSON *integrations_logs_post_400_responseJSON);

cJSON *integrations_logs_post_400_response_convertToJSON(integrations_logs_post_400_response_t *integrations_logs_post_400_response);

#endif /* _integrations_logs_post_400_response_H_ */

