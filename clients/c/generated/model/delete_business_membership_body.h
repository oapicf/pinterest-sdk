/*
 * delete_business_membership_body.h
 *
 * List of members with role to delete.
 */

#ifndef _delete_business_membership_body_H_
#define _delete_business_membership_body_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct delete_business_membership_body_t delete_business_membership_body_t;

#include "delete_business_membership_member.h"



typedef struct delete_business_membership_body_t {
    list_t *members; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} delete_business_membership_body_t;

__attribute__((deprecated)) delete_business_membership_body_t *delete_business_membership_body_create(
    list_t *members
);

void delete_business_membership_body_free(delete_business_membership_body_t *delete_business_membership_body);

delete_business_membership_body_t *delete_business_membership_body_parseFromJSON(cJSON *delete_business_membership_bodyJSON);

cJSON *delete_business_membership_body_convertToJSON(delete_business_membership_body_t *delete_business_membership_body);

#endif /* _delete_business_membership_body_H_ */

