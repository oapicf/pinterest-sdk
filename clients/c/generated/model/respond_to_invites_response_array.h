/*
 * respond_to_invites_response_array.h
 *
 * 
 */

#ifndef _respond_to_invites_response_array_H_
#define _respond_to_invites_response_array_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct respond_to_invites_response_array_t respond_to_invites_response_array_t;

#include "respond_to_invites_response_array_items_inner.h"



typedef struct respond_to_invites_response_array_t {
    list_t *items; //nonprimitive container

} respond_to_invites_response_array_t;

respond_to_invites_response_array_t *respond_to_invites_response_array_create(
    list_t *items
);

void respond_to_invites_response_array_free(respond_to_invites_response_array_t *respond_to_invites_response_array);

respond_to_invites_response_array_t *respond_to_invites_response_array_parseFromJSON(cJSON *respond_to_invites_response_arrayJSON);

cJSON *respond_to_invites_response_array_convertToJSON(respond_to_invites_response_array_t *respond_to_invites_response_array);

#endif /* _respond_to_invites_response_array_H_ */

