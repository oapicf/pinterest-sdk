/*
 * update_invites_results_response_array.h
 *
 * 
 */

#ifndef _update_invites_results_response_array_H_
#define _update_invites_results_response_array_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct update_invites_results_response_array_t update_invites_results_response_array_t;

#include "update_invites_results_response_array_items_inner.h"



typedef struct update_invites_results_response_array_t {
    list_t *items; //nonprimitive container

} update_invites_results_response_array_t;

update_invites_results_response_array_t *update_invites_results_response_array_create(
    list_t *items
);

void update_invites_results_response_array_free(update_invites_results_response_array_t *update_invites_results_response_array);

update_invites_results_response_array_t *update_invites_results_response_array_parseFromJSON(cJSON *update_invites_results_response_arrayJSON);

cJSON *update_invites_results_response_array_convertToJSON(update_invites_results_response_array_t *update_invites_results_response_array);

#endif /* _update_invites_results_response_array_H_ */

