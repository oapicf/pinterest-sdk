/*
 * notification_response.h
 *
 * 
 */

#ifndef _notification_response_H_
#define _notification_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct notification_response_t notification_response_t;




typedef struct notification_response_t {
    char *error_msg; // string
    int *received_at; //numeric
    int *success; //boolean

    int _library_owned; // Is the library responsible for freeing this object?
} notification_response_t;

__attribute__((deprecated)) notification_response_t *notification_response_create(
    char *error_msg,
    int *received_at,
    int *success
);

void notification_response_free(notification_response_t *notification_response);

notification_response_t *notification_response_parseFromJSON(cJSON *notification_responseJSON);

cJSON *notification_response_convertToJSON(notification_response_t *notification_response);

#endif /* _notification_response_H_ */

