/*
 * update_invites_results_response_array_items_inner.h
 *
 * 
 */

#ifndef _update_invites_results_response_array_items_inner_H_
#define _update_invites_results_response_array_items_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct update_invites_results_response_array_items_inner_t update_invites_results_response_array_items_inner_t;

#include "invite_business_role_binding.h"
#include "invite_exception_response.h"



typedef struct update_invites_results_response_array_items_inner_t {
    struct invite_exception_response_t *exception; //model
    struct invite_business_role_binding_t *invite; //model

} update_invites_results_response_array_items_inner_t;

update_invites_results_response_array_items_inner_t *update_invites_results_response_array_items_inner_create(
    invite_exception_response_t *exception,
    invite_business_role_binding_t *invite
);

void update_invites_results_response_array_items_inner_free(update_invites_results_response_array_items_inner_t *update_invites_results_response_array_items_inner);

update_invites_results_response_array_items_inner_t *update_invites_results_response_array_items_inner_parseFromJSON(cJSON *update_invites_results_response_array_items_innerJSON);

cJSON *update_invites_results_response_array_items_inner_convertToJSON(update_invites_results_response_array_items_inner_t *update_invites_results_response_array_items_inner);

#endif /* _update_invites_results_response_array_items_inner_H_ */

