/*
 * update_partner_results_response_array_items_inner.h
 *
 * 
 */

#ifndef _update_partner_results_response_array_items_inner_H_
#define _update_partner_results_response_array_items_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct update_partner_results_response_array_items_inner_t update_partner_results_response_array_items_inner_t;

#include "business_access_error.h"



typedef struct update_partner_results_response_array_items_inner_t {
    struct business_access_error_t *exception; //model
    char *member_or_partner_id; // string

} update_partner_results_response_array_items_inner_t;

update_partner_results_response_array_items_inner_t *update_partner_results_response_array_items_inner_create(
    business_access_error_t *exception,
    char *member_or_partner_id
);

void update_partner_results_response_array_items_inner_free(update_partner_results_response_array_items_inner_t *update_partner_results_response_array_items_inner);

update_partner_results_response_array_items_inner_t *update_partner_results_response_array_items_inner_parseFromJSON(cJSON *update_partner_results_response_array_items_innerJSON);

cJSON *update_partner_results_response_array_items_inner_convertToJSON(update_partner_results_response_array_items_inner_t *update_partner_results_response_array_items_inner);

#endif /* _update_partner_results_response_array_items_inner_H_ */

