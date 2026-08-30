/*
 * cancel_invite_result.h
 *
 * 
 */

#ifndef _cancel_invite_result_H_
#define _cancel_invite_result_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct cancel_invite_result_t cancel_invite_result_t;

#include "cancel_invite_result_user.h"
#include "invite_data_response.h"



typedef struct cancel_invite_result_t {
    char *id; // string
    struct invite_data_response_t *invite_data; //model
    int *is_received_invite; //boolean
    struct cancel_invite_result_user_t *user; //model

    int _library_owned; // Is the library responsible for freeing this object?
} cancel_invite_result_t;

__attribute__((deprecated)) cancel_invite_result_t *cancel_invite_result_create(
    char *id,
    invite_data_response_t *invite_data,
    int *is_received_invite,
    cancel_invite_result_user_t *user
);

void cancel_invite_result_free(cancel_invite_result_t *cancel_invite_result);

cancel_invite_result_t *cancel_invite_result_parseFromJSON(cJSON *cancel_invite_resultJSON);

cJSON *cancel_invite_result_convertToJSON(cancel_invite_result_t *cancel_invite_result);

#endif /* _cancel_invite_result_H_ */

