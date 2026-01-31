/*
 * members_to_delete_body_members_inner.h
 *
 * 
 */

#ifndef _members_to_delete_body_members_inner_H_
#define _members_to_delete_body_members_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct members_to_delete_body_members_inner_t members_to_delete_body_members_inner_t;

#include "business_role_for_members.h"



typedef struct members_to_delete_body_members_inner_t {
    pinterest_rest_api_business_role_for_members__e business_role; //referenced enum
    char *member_id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} members_to_delete_body_members_inner_t;

__attribute__((deprecated)) members_to_delete_body_members_inner_t *members_to_delete_body_members_inner_create(
    pinterest_rest_api_business_role_for_members__e business_role,
    char *member_id
);

void members_to_delete_body_members_inner_free(members_to_delete_body_members_inner_t *members_to_delete_body_members_inner);

members_to_delete_body_members_inner_t *members_to_delete_body_members_inner_parseFromJSON(cJSON *members_to_delete_body_members_innerJSON);

cJSON *members_to_delete_body_members_inner_convertToJSON(members_to_delete_body_members_inner_t *members_to_delete_body_members_inner);

#endif /* _members_to_delete_body_members_inner_H_ */

