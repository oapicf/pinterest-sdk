/*
 * create_membership_or_partnership_invites_body.h
 *
 * Body to be used on path to send Members or Partners Invite or Request
 */

#ifndef _create_membership_or_partnership_invites_body_H_
#define _create_membership_or_partnership_invites_body_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_membership_or_partnership_invites_body_t create_membership_or_partnership_invites_body_t;

#include "invite_type.h"

// Enum BUSINESSROLE for create_membership_or_partnership_invites_body

typedef enum  { pinterest_rest_api_create_membership_or_partnership_invites_body_BUSINESSROLE_NULL = 0, pinterest_rest_api_create_membership_or_partnership_invites_body_BUSINESSROLE_EMPLOYEE, pinterest_rest_api_create_membership_or_partnership_invites_body_BUSINESSROLE_BIZ_ADMIN, pinterest_rest_api_create_membership_or_partnership_invites_body_BUSINESSROLE_PARTNER } pinterest_rest_api_create_membership_or_partnership_invites_body_BUSINESSROLE_e;

char* create_membership_or_partnership_invites_body_business_role_ToString(pinterest_rest_api_create_membership_or_partnership_invites_body_BUSINESSROLE_e business_role);

pinterest_rest_api_create_membership_or_partnership_invites_body_BUSINESSROLE_e create_membership_or_partnership_invites_body_business_role_FromString(char* business_role);



typedef struct create_membership_or_partnership_invites_body_t {
    pinterest_rest_api_create_membership_or_partnership_invites_body_BUSINESSROLE_e business_role; //enum
    pinterest_rest_api_invite_type__e invite_type; //referenced enum
    list_t *members; //primitive container
    list_t *partners; //primitive container

    int _library_owned; // Is the library responsible for freeing this object?
} create_membership_or_partnership_invites_body_t;

__attribute__((deprecated)) create_membership_or_partnership_invites_body_t *create_membership_or_partnership_invites_body_create(
    pinterest_rest_api_create_membership_or_partnership_invites_body_BUSINESSROLE_e business_role,
    pinterest_rest_api_invite_type__e invite_type,
    list_t *members,
    list_t *partners
);

void create_membership_or_partnership_invites_body_free(create_membership_or_partnership_invites_body_t *create_membership_or_partnership_invites_body);

create_membership_or_partnership_invites_body_t *create_membership_or_partnership_invites_body_parseFromJSON(cJSON *create_membership_or_partnership_invites_bodyJSON);

cJSON *create_membership_or_partnership_invites_body_convertToJSON(create_membership_or_partnership_invites_body_t *create_membership_or_partnership_invites_body);

#endif /* _create_membership_or_partnership_invites_body_H_ */

