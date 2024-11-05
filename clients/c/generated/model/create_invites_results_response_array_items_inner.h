/*
 * create_invites_results_response_array_items_inner.h
 *
 * 
 */

#ifndef _create_invites_results_response_array_items_inner_H_
#define _create_invites_results_response_array_items_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_invites_results_response_array_items_inner_t create_invites_results_response_array_items_inner_t;

#include "create_invites_results_response_array_items_inner_invite.h"
#include "invite_exception_response.h"



typedef struct create_invites_results_response_array_items_inner_t {
    struct invite_exception_response_t *exception; //model
    struct create_invites_results_response_array_items_inner_invite_t *invite; //model

} create_invites_results_response_array_items_inner_t;

create_invites_results_response_array_items_inner_t *create_invites_results_response_array_items_inner_create(
    invite_exception_response_t *exception,
    create_invites_results_response_array_items_inner_invite_t *invite
);

void create_invites_results_response_array_items_inner_free(create_invites_results_response_array_items_inner_t *create_invites_results_response_array_items_inner);

create_invites_results_response_array_items_inner_t *create_invites_results_response_array_items_inner_parseFromJSON(cJSON *create_invites_results_response_array_items_innerJSON);

cJSON *create_invites_results_response_array_items_inner_convertToJSON(create_invites_results_response_array_items_inner_t *create_invites_results_response_array_items_inner);

#endif /* _create_invites_results_response_array_items_inner_H_ */

