/*
 * notification_post_request.h
 *
 * Any valid JSON object
 */

#ifndef _notification_post_request_H_
#define _notification_post_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct notification_post_request_t notification_post_request_t;

#include "any_type.h"



typedef struct notification_post_request_t {

    int _library_owned; // Is the library responsible for freeing this object?
} notification_post_request_t;

__attribute__((deprecated)) notification_post_request_t *notification_post_request_create(
);

void notification_post_request_free(notification_post_request_t *notification_post_request);

notification_post_request_t *notification_post_request_parseFromJSON(cJSON *notification_post_requestJSON);

cJSON *notification_post_request_convertToJSON(notification_post_request_t *notification_post_request);

#endif /* _notification_post_request_H_ */

