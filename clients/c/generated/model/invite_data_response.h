/*
 * invite_data_response.h
 *
 * Metadata for the invite/request.
 */

#ifndef _invite_data_response_H_
#define _invite_data_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct invite_data_response_t invite_data_response_t;




typedef struct invite_data_response_t {
    int *invite_expiration; //numeric
    char *invite_status; // string
    char *invite_type; // string
    int *last_updated_time; //numeric
    int *sent_at; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} invite_data_response_t;

__attribute__((deprecated)) invite_data_response_t *invite_data_response_create(
    int *invite_expiration,
    char *invite_status,
    char *invite_type,
    int *last_updated_time,
    int *sent_at
);

void invite_data_response_free(invite_data_response_t *invite_data_response);

invite_data_response_t *invite_data_response_parseFromJSON(cJSON *invite_data_responseJSON);

cJSON *invite_data_response_convertToJSON(invite_data_response_t *invite_data_response);

#endif /* _invite_data_response_H_ */

