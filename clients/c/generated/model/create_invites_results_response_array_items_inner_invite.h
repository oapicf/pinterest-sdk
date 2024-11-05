/*
 * create_invites_results_response_array_items_inner_invite.h
 *
 * An invite object if the invite/request was successfully created. Will only be provided if the an invite/request is successfully created.
 */

#ifndef _create_invites_results_response_array_items_inner_invite_H_
#define _create_invites_results_response_array_items_inner_invite_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_invites_results_response_array_items_inner_invite_t create_invites_results_response_array_items_inner_invite_t;

#include "business_access_user_summary.h"



typedef struct create_invites_results_response_array_items_inner_invite_t {
    char *id; // string
    struct business_access_user_summary_t *user; //model

} create_invites_results_response_array_items_inner_invite_t;

create_invites_results_response_array_items_inner_invite_t *create_invites_results_response_array_items_inner_invite_create(
    char *id,
    business_access_user_summary_t *user
);

void create_invites_results_response_array_items_inner_invite_free(create_invites_results_response_array_items_inner_invite_t *create_invites_results_response_array_items_inner_invite);

create_invites_results_response_array_items_inner_invite_t *create_invites_results_response_array_items_inner_invite_parseFromJSON(cJSON *create_invites_results_response_array_items_inner_inviteJSON);

cJSON *create_invites_results_response_array_items_inner_invite_convertToJSON(create_invites_results_response_array_items_inner_invite_t *create_invites_results_response_array_items_inner_invite);

#endif /* _create_invites_results_response_array_items_inner_invite_H_ */

