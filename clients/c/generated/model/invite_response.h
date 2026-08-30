/*
 * invite_response.h
 *
 * A user&#39;s username or email OR a partner id that caused the error.
 */

#ifndef _invite_response_H_
#define _invite_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct invite_response_t invite_response_t;

#include "business_access_user_summary.h"
#include "invite_assets_summary.h"
#include "invite_data_response.h"



typedef struct invite_response_t {
    struct invite_assets_summary_t *assets_summary; //model
    list_t *business_roles; //primitive container
    struct business_access_user_summary_t *created_by_business; //model
    struct business_access_user_summary_t *created_by_user; //model
    int *created_time; //numeric
    char *id; // string
    struct invite_data_response_t *invite_data; //model
    int *is_received_invite; //boolean
    struct business_access_user_summary_t *user; //model

    int _library_owned; // Is the library responsible for freeing this object?
} invite_response_t;

__attribute__((deprecated)) invite_response_t *invite_response_create(
    invite_assets_summary_t *assets_summary,
    list_t *business_roles,
    business_access_user_summary_t *created_by_business,
    business_access_user_summary_t *created_by_user,
    int *created_time,
    char *id,
    invite_data_response_t *invite_data,
    int *is_received_invite,
    business_access_user_summary_t *user
);

void invite_response_free(invite_response_t *invite_response);

invite_response_t *invite_response_parseFromJSON(cJSON *invite_responseJSON);

cJSON *invite_response_convertToJSON(invite_response_t *invite_response);

#endif /* _invite_response_H_ */

