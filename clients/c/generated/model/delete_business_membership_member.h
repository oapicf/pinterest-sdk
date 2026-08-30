/*
 * delete_business_membership_member.h
 *
 * Single instance of a business member to be removed from the business.
 */

#ifndef _delete_business_membership_member_H_
#define _delete_business_membership_member_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct delete_business_membership_member_t delete_business_membership_member_t;

#include "business_role_for_members.h"



typedef struct delete_business_membership_member_t {
    pinterest_rest_api_business_role_for_members__e business_role; //referenced enum
    char *member_id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} delete_business_membership_member_t;

__attribute__((deprecated)) delete_business_membership_member_t *delete_business_membership_member_create(
    pinterest_rest_api_business_role_for_members__e business_role,
    char *member_id
);

void delete_business_membership_member_free(delete_business_membership_member_t *delete_business_membership_member);

delete_business_membership_member_t *delete_business_membership_member_parseFromJSON(cJSON *delete_business_membership_memberJSON);

cJSON *delete_business_membership_member_convertToJSON(delete_business_membership_member_t *delete_business_membership_member);

#endif /* _delete_business_membership_member_H_ */

