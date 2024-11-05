/*
 * delete_invites_results_response_array_items_inner_exception.h
 *
 * An exception object if there is an error performing the cancellation. It will only be provided if there is an error.
 */

#ifndef _delete_invites_results_response_array_items_inner_exception_H_
#define _delete_invites_results_response_array_items_inner_exception_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct delete_invites_results_response_array_items_inner_exception_t delete_invites_results_response_array_items_inner_exception_t;




typedef struct delete_invites_results_response_array_items_inner_exception_t {
    char *invite_id; // string
    char *message; // string

} delete_invites_results_response_array_items_inner_exception_t;

delete_invites_results_response_array_items_inner_exception_t *delete_invites_results_response_array_items_inner_exception_create(
    char *invite_id,
    char *message
);

void delete_invites_results_response_array_items_inner_exception_free(delete_invites_results_response_array_items_inner_exception_t *delete_invites_results_response_array_items_inner_exception);

delete_invites_results_response_array_items_inner_exception_t *delete_invites_results_response_array_items_inner_exception_parseFromJSON(cJSON *delete_invites_results_response_array_items_inner_exceptionJSON);

cJSON *delete_invites_results_response_array_items_inner_exception_convertToJSON(delete_invites_results_response_array_items_inner_exception_t *delete_invites_results_response_array_items_inner_exception);

#endif /* _delete_invites_results_response_array_items_inner_exception_H_ */

