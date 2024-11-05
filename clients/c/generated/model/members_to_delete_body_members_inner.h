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

// Enum  for members_to_delete_body_members_inner

typedef enum  { pinterest_rest_api_members_to_delete_body_members_inner__NULL = 0, pinterest_rest_api_members_to_delete_body_members_inner__EMPLOYEE, pinterest_rest_api_members_to_delete_body_members_inner__BIZ_ADMIN } pinterest_rest_api_members_to_delete_body_members_inner__e;

char* members_to_delete_body_members_inner_business_role_ToString(pinterest_rest_api_members_to_delete_body_members_inner__e business_role);

pinterest_rest_api_members_to_delete_body_members_inner__e members_to_delete_body_members_inner_business_role_FromString(char* business_role);



typedef struct members_to_delete_body_members_inner_t {
    char *member_id; // string
    business_role_for_members_t *business_role; // custom

} members_to_delete_body_members_inner_t;

members_to_delete_body_members_inner_t *members_to_delete_body_members_inner_create(
    char *member_id,
    business_role_for_members_t *business_role
);

void members_to_delete_body_members_inner_free(members_to_delete_body_members_inner_t *members_to_delete_body_members_inner);

members_to_delete_body_members_inner_t *members_to_delete_body_members_inner_parseFromJSON(cJSON *members_to_delete_body_members_innerJSON);

cJSON *members_to_delete_body_members_inner_convertToJSON(members_to_delete_body_members_inner_t *members_to_delete_body_members_inner);

#endif /* _members_to_delete_body_members_inner_H_ */

