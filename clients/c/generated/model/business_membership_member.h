/*
 * business_membership_member.h
 *
 * A business member identified by &#x60;member_id&#x60; with their &#x60;business_role&#x60; in the business.
 */

#ifndef _business_membership_member_H_
#define _business_membership_member_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct business_membership_member_t business_membership_member_t;

#include "business_role_for_members.h"



typedef struct business_membership_member_t {
    pinterest_rest_api_business_role_for_members__e business_role; //referenced enum
    char *member_id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} business_membership_member_t;

__attribute__((deprecated)) business_membership_member_t *business_membership_member_create(
    pinterest_rest_api_business_role_for_members__e business_role,
    char *member_id
);

void business_membership_member_free(business_membership_member_t *business_membership_member);

business_membership_member_t *business_membership_member_parseFromJSON(cJSON *business_membership_memberJSON);

cJSON *business_membership_member_convertToJSON(business_membership_member_t *business_membership_member);

#endif /* _business_membership_member_H_ */

