/*
 * create_invites_results_response_array.h
 *
 * 
 */

#ifndef _create_invites_results_response_array_H_
#define _create_invites_results_response_array_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_invites_results_response_array_t create_invites_results_response_array_t;

#include "create_invites_results_response_array_items_inner.h"



typedef struct create_invites_results_response_array_t {
    list_t *items; //nonprimitive container

} create_invites_results_response_array_t;

create_invites_results_response_array_t *create_invites_results_response_array_create(
    list_t *items
);

void create_invites_results_response_array_free(create_invites_results_response_array_t *create_invites_results_response_array);

create_invites_results_response_array_t *create_invites_results_response_array_parseFromJSON(cJSON *create_invites_results_response_arrayJSON);

cJSON *create_invites_results_response_array_convertToJSON(create_invites_results_response_array_t *create_invites_results_response_array);

#endif /* _create_invites_results_response_array_H_ */

