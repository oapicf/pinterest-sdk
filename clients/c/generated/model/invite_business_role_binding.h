/*
 * invite_business_role_binding.h
 *
 * An invite object if the invite/request was successfully updated. Will only be provided if the an invite/request is successfully updated.
 */

#ifndef _invite_business_role_binding_H_
#define _invite_business_role_binding_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct invite_business_role_binding_t invite_business_role_binding_t;

#include "base_invite_data_response_invite_data.h"
#include "business_access_user_summary.h"



typedef struct invite_business_role_binding_t {
    char *created_by_business_id; // string
    char *created_by_user_id; // string
    struct business_access_user_summary_t *user; //model
    char *id; // string
    struct base_invite_data_response_invite_data_t *invite_data; //model
    int is_received_invite; //boolean

} invite_business_role_binding_t;

invite_business_role_binding_t *invite_business_role_binding_create(
    char *created_by_business_id,
    char *created_by_user_id,
    business_access_user_summary_t *user,
    char *id,
    base_invite_data_response_invite_data_t *invite_data,
    int is_received_invite
);

void invite_business_role_binding_free(invite_business_role_binding_t *invite_business_role_binding);

invite_business_role_binding_t *invite_business_role_binding_parseFromJSON(cJSON *invite_business_role_bindingJSON);

cJSON *invite_business_role_binding_convertToJSON(invite_business_role_binding_t *invite_business_role_binding);

#endif /* _invite_business_role_binding_H_ */

