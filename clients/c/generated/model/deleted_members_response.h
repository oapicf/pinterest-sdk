/*
 * deleted_members_response.h
 *
 * An object with a list of members that were deleted.
 */

#ifndef _deleted_members_response_H_
#define _deleted_members_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct deleted_members_response_t deleted_members_response_t;




typedef struct deleted_members_response_t {
    list_t *deleted_members; //primitive container

} deleted_members_response_t;

deleted_members_response_t *deleted_members_response_create(
    list_t *deleted_members
);

void deleted_members_response_free(deleted_members_response_t *deleted_members_response);

deleted_members_response_t *deleted_members_response_parseFromJSON(cJSON *deleted_members_responseJSON);

cJSON *deleted_members_response_convertToJSON(deleted_members_response_t *deleted_members_response);

#endif /* _deleted_members_response_H_ */

