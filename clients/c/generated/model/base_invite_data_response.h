/*
 * base_invite_data_response.h
 *
 * Common invite/request data returned by the business access endpoints.
 */

#ifndef _base_invite_data_response_H_
#define _base_invite_data_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct base_invite_data_response_t base_invite_data_response_t;

#include "business_access_user_summary.h"
#include "invite_data_response.h"



typedef struct base_invite_data_response_t {
    char *id; // string
    struct invite_data_response_t *invite_data; //model
    int *is_received_invite; //boolean
    struct business_access_user_summary_t *user; //model

    int _library_owned; // Is the library responsible for freeing this object?
} base_invite_data_response_t;

__attribute__((deprecated)) base_invite_data_response_t *base_invite_data_response_create(
    char *id,
    invite_data_response_t *invite_data,
    int *is_received_invite,
    business_access_user_summary_t *user
);

void base_invite_data_response_free(base_invite_data_response_t *base_invite_data_response);

base_invite_data_response_t *base_invite_data_response_parseFromJSON(cJSON *base_invite_data_responseJSON);

cJSON *base_invite_data_response_convertToJSON(base_invite_data_response_t *base_invite_data_response);

#endif /* _base_invite_data_response_H_ */

