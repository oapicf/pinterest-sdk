/*
 * invite_response.h
 *
 * 
 */

#ifndef _invite_response_H_
#define _invite_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct invite_response_t invite_response_t;

#include "base_invite_data_response_invite_data.h"
#include "business_access_user_summary.h"
#include "invite_assets_summary.h"



typedef struct invite_response_t {
    struct invite_assets_summary_t *assets_summary; //model
    list_t *business_roles; //primitive container
    struct business_access_user_summary_t *created_by_business; //model
    struct business_access_user_summary_t *created_by_user; //model
    int created_time; //numeric
    char *id; // string
    struct base_invite_data_response_invite_data_t *invite_data; //model
    int is_received_invite; //boolean
    struct business_access_user_summary_t *user; //model

} invite_response_t;

invite_response_t *invite_response_create(
    invite_assets_summary_t *assets_summary,
    list_t *business_roles,
    business_access_user_summary_t *created_by_business,
    business_access_user_summary_t *created_by_user,
    int created_time,
    char *id,
    base_invite_data_response_invite_data_t *invite_data,
    int is_received_invite,
    business_access_user_summary_t *user
);

void invite_response_free(invite_response_t *invite_response);

invite_response_t *invite_response_parseFromJSON(cJSON *invite_responseJSON);

cJSON *invite_response_convertToJSON(invite_response_t *invite_response);

#endif /* _invite_response_H_ */

