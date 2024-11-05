/*
 * respond_to_invites_response_array_items_inner.h
 *
 * 
 */

#ifndef _respond_to_invites_response_array_items_inner_H_
#define _respond_to_invites_response_array_items_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct respond_to_invites_response_array_items_inner_t respond_to_invites_response_array_items_inner_t;

#include "base_invite_data_response.h"
#include "invite_exception_response.h"



typedef struct respond_to_invites_response_array_items_inner_t {
    struct invite_exception_response_t *exception; //model
    struct base_invite_data_response_t *invite; //model

} respond_to_invites_response_array_items_inner_t;

respond_to_invites_response_array_items_inner_t *respond_to_invites_response_array_items_inner_create(
    invite_exception_response_t *exception,
    base_invite_data_response_t *invite
);

void respond_to_invites_response_array_items_inner_free(respond_to_invites_response_array_items_inner_t *respond_to_invites_response_array_items_inner);

respond_to_invites_response_array_items_inner_t *respond_to_invites_response_array_items_inner_parseFromJSON(cJSON *respond_to_invites_response_array_items_innerJSON);

cJSON *respond_to_invites_response_array_items_inner_convertToJSON(respond_to_invites_response_array_items_inner_t *respond_to_invites_response_array_items_inner);

#endif /* _respond_to_invites_response_array_items_inner_H_ */

