/*
 * update_business_memberships_response.h
 *
 * 
 */

#ifndef _update_business_memberships_response_H_
#define _update_business_memberships_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct update_business_memberships_response_t update_business_memberships_response_t;

#include "business_membership_member.h"



typedef struct update_business_memberships_response_t {
    list_t *items; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} update_business_memberships_response_t;

__attribute__((deprecated)) update_business_memberships_response_t *update_business_memberships_response_create(
    list_t *items
);

void update_business_memberships_response_free(update_business_memberships_response_t *update_business_memberships_response);

update_business_memberships_response_t *update_business_memberships_response_parseFromJSON(cJSON *update_business_memberships_responseJSON);

cJSON *update_business_memberships_response_convertToJSON(update_business_memberships_response_t *update_business_memberships_response);

#endif /* _update_business_memberships_response_H_ */

