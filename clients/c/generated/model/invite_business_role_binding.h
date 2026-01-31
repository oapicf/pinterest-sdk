/*
 * invite_business_role_binding.h
 *
 * 
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
#include "object.h"



typedef struct invite_business_role_binding_t {
    char *id; // string
    struct base_invite_data_response_invite_data_t *invite_data; //model
    int is_received_invite; //boolean
    object_t *user; //object
    char *created_by_business_id; // string
    char *created_by_user_id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} invite_business_role_binding_t;

__attribute__((deprecated)) invite_business_role_binding_t *invite_business_role_binding_create(
    char *id,
    base_invite_data_response_invite_data_t *invite_data,
    int is_received_invite,
    object_t *user,
    char *created_by_business_id,
    char *created_by_user_id
);

void invite_business_role_binding_free(invite_business_role_binding_t *invite_business_role_binding);

invite_business_role_binding_t *invite_business_role_binding_parseFromJSON(cJSON *invite_business_role_bindingJSON);

cJSON *invite_business_role_binding_convertToJSON(invite_business_role_binding_t *invite_business_role_binding);

#endif /* _invite_business_role_binding_H_ */

