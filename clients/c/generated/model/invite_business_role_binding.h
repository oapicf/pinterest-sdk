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

#include "business_access_user_summary.h"
#include "invite_data_response.h"



typedef struct invite_business_role_binding_t {
    char *created_by_business_id; // string
    char *created_by_user_id; // string
    char *id; // string
    struct invite_data_response_t *invite_data; //model
    int *is_received_invite; //boolean
    struct business_access_user_summary_t *user; //model

    int _library_owned; // Is the library responsible for freeing this object?
} invite_business_role_binding_t;

__attribute__((deprecated)) invite_business_role_binding_t *invite_business_role_binding_create(
    char *created_by_business_id,
    char *created_by_user_id,
    char *id,
    invite_data_response_t *invite_data,
    int *is_received_invite,
    business_access_user_summary_t *user
);

void invite_business_role_binding_free(invite_business_role_binding_t *invite_business_role_binding);

invite_business_role_binding_t *invite_business_role_binding_parseFromJSON(cJSON *invite_business_role_bindingJSON);

cJSON *invite_business_role_binding_convertToJSON(invite_business_role_binding_t *invite_business_role_binding);

#endif /* _invite_business_role_binding_H_ */

