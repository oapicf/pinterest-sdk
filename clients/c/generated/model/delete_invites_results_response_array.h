/*
 * delete_invites_results_response_array.h
 *
 * Response to delete invites sent to Members or Partners, if there is an exception, return the exception mapped with the invite id
 */

#ifndef _delete_invites_results_response_array_H_
#define _delete_invites_results_response_array_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct delete_invites_results_response_array_t delete_invites_results_response_array_t;

#include "delete_invites_results_response_array_items_inner.h"



typedef struct delete_invites_results_response_array_t {
    list_t *items; //nonprimitive container

} delete_invites_results_response_array_t;

delete_invites_results_response_array_t *delete_invites_results_response_array_create(
    list_t *items
);

void delete_invites_results_response_array_free(delete_invites_results_response_array_t *delete_invites_results_response_array);

delete_invites_results_response_array_t *delete_invites_results_response_array_parseFromJSON(cJSON *delete_invites_results_response_arrayJSON);

cJSON *delete_invites_results_response_array_convertToJSON(delete_invites_results_response_array_t *delete_invites_results_response_array);

#endif /* _delete_invites_results_response_array_H_ */

