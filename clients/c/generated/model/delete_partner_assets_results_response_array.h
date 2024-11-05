/*
 * delete_partner_assets_results_response_array.h
 *
 * 
 */

#ifndef _delete_partner_assets_results_response_array_H_
#define _delete_partner_assets_results_response_array_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct delete_partner_assets_results_response_array_t delete_partner_assets_results_response_array_t;

#include "delete_partner_assets_result.h"



typedef struct delete_partner_assets_results_response_array_t {
    list_t *items; //nonprimitive container

} delete_partner_assets_results_response_array_t;

delete_partner_assets_results_response_array_t *delete_partner_assets_results_response_array_create(
    list_t *items
);

void delete_partner_assets_results_response_array_free(delete_partner_assets_results_response_array_t *delete_partner_assets_results_response_array);

delete_partner_assets_results_response_array_t *delete_partner_assets_results_response_array_parseFromJSON(cJSON *delete_partner_assets_results_response_arrayJSON);

cJSON *delete_partner_assets_results_response_array_convertToJSON(delete_partner_assets_results_response_array_t *delete_partner_assets_results_response_array);

#endif /* _delete_partner_assets_results_response_array_H_ */

