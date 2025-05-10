/*
 * update_member_business_role_body.h
 *
 * Single instance of a business member to have its role updated
 */

#ifndef _update_member_business_role_body_H_
#define _update_member_business_role_body_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct update_member_business_role_body_t update_member_business_role_body_t;

#include "business_role_for_members.h"



typedef struct update_member_business_role_body_t {
    pinterest_rest_api_business_role_for_members__e business_role; //referenced enum
    char *member_id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} update_member_business_role_body_t;

__attribute__((deprecated)) update_member_business_role_body_t *update_member_business_role_body_create(
    pinterest_rest_api_business_role_for_members__e business_role,
    char *member_id
);

void update_member_business_role_body_free(update_member_business_role_body_t *update_member_business_role_body);

update_member_business_role_body_t *update_member_business_role_body_parseFromJSON(cJSON *update_member_business_role_bodyJSON);

cJSON *update_member_business_role_body_convertToJSON(update_member_business_role_body_t *update_member_business_role_body);

#endif /* _update_member_business_role_body_H_ */

