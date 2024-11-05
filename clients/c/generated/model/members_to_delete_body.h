/*
 * members_to_delete_body.h
 *
 * 
 */

#ifndef _members_to_delete_body_H_
#define _members_to_delete_body_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct members_to_delete_body_t members_to_delete_body_t;

#include "members_to_delete_body_members_inner.h"



typedef struct members_to_delete_body_t {
    list_t *members; //nonprimitive container

} members_to_delete_body_t;

members_to_delete_body_t *members_to_delete_body_create(
    list_t *members
);

void members_to_delete_body_free(members_to_delete_body_t *members_to_delete_body);

members_to_delete_body_t *members_to_delete_body_parseFromJSON(cJSON *members_to_delete_bodyJSON);

cJSON *members_to_delete_body_convertToJSON(members_to_delete_body_t *members_to_delete_body);

#endif /* _members_to_delete_body_H_ */

