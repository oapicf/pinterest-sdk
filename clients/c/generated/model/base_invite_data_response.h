/*
 * base_invite_data_response.h
 *
 * 
 */

#ifndef _base_invite_data_response_H_
#define _base_invite_data_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct base_invite_data_response_t base_invite_data_response_t;

#include "base_invite_data_response_invite_data.h"
#include "business_access_user_summary.h"



typedef struct base_invite_data_response_t {
    char *id; // string
    struct base_invite_data_response_invite_data_t *invite_data; //model
    int is_received_invite; //boolean
    struct business_access_user_summary_t *user; //model

} base_invite_data_response_t;

base_invite_data_response_t *base_invite_data_response_create(
    char *id,
    base_invite_data_response_invite_data_t *invite_data,
    int is_received_invite,
    business_access_user_summary_t *user
);

void base_invite_data_response_free(base_invite_data_response_t *base_invite_data_response);

base_invite_data_response_t *base_invite_data_response_parseFromJSON(cJSON *base_invite_data_responseJSON);

cJSON *base_invite_data_response_convertToJSON(base_invite_data_response_t *base_invite_data_response);

#endif /* _base_invite_data_response_H_ */

