/*
 * delete_invites_results_response_array_items_inner.h
 *
 * 
 */

#ifndef _delete_invites_results_response_array_items_inner_H_
#define _delete_invites_results_response_array_items_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct delete_invites_results_response_array_items_inner_t delete_invites_results_response_array_items_inner_t;

#include "base_invite_data_response.h"
#include "delete_invites_results_response_array_items_inner_exception.h"



typedef struct delete_invites_results_response_array_items_inner_t {
    struct delete_invites_results_response_array_items_inner_exception_t *exception; //model
    struct base_invite_data_response_t *invite; //model

} delete_invites_results_response_array_items_inner_t;

delete_invites_results_response_array_items_inner_t *delete_invites_results_response_array_items_inner_create(
    delete_invites_results_response_array_items_inner_exception_t *exception,
    base_invite_data_response_t *invite
);

void delete_invites_results_response_array_items_inner_free(delete_invites_results_response_array_items_inner_t *delete_invites_results_response_array_items_inner);

delete_invites_results_response_array_items_inner_t *delete_invites_results_response_array_items_inner_parseFromJSON(cJSON *delete_invites_results_response_array_items_innerJSON);

cJSON *delete_invites_results_response_array_items_inner_convertToJSON(delete_invites_results_response_array_items_inner_t *delete_invites_results_response_array_items_inner);

#endif /* _delete_invites_results_response_array_items_inner_H_ */

