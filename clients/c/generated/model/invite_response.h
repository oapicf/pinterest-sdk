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
#include "object.h"



typedef struct invite_response_t {
    char *id; // string
    struct base_invite_data_response_invite_data_t *invite_data; //model
    int is_received_invite; //boolean
    struct business_access_user_summary_t *user; //model
    struct invite_assets_summary_t *assets_summary; //model
    list_t *business_roles; //primitive container
    object_t *created_by_business; //object
    object_t *created_by_user; //object
    int created_time; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} invite_response_t;

__attribute__((deprecated)) invite_response_t *invite_response_create(
    char *id,
    base_invite_data_response_invite_data_t *invite_data,
    int is_received_invite,
    business_access_user_summary_t *user,
    invite_assets_summary_t *assets_summary,
    list_t *business_roles,
    object_t *created_by_business,
    object_t *created_by_user,
    int created_time
);

void invite_response_free(invite_response_t *invite_response);

invite_response_t *invite_response_parseFromJSON(cJSON *invite_responseJSON);

cJSON *invite_response_convertToJSON(invite_response_t *invite_response);

#endif /* _invite_response_H_ */

