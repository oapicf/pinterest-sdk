/*
 * campaign_update_request_all_of2.h
 *
 * 
 */

#ifndef _campaign_update_request_all_of2_H_
#define _campaign_update_request_all_of2_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct campaign_update_request_all_of2_t campaign_update_request_all_of2_t;

#include "campaign_bid_options_update.h"
#include "intended_promotion_type.h"
#include "objective_type.h"



typedef struct campaign_update_request_all_of2_t {
    struct campaign_bid_options_update_t *bid_options; //model
    pinterest_rest_api_intended_promotion_type__e intended_promotion_type; //referenced enum
    int *is_ltv_optimized; //boolean
    int *is_performance_plus; //boolean
    int *is_top_of_search; //boolean
    objective_type_t *objective_type; // custom

    int _library_owned; // Is the library responsible for freeing this object?
} campaign_update_request_all_of2_t;

__attribute__((deprecated)) campaign_update_request_all_of2_t *campaign_update_request_all_of2_create(
    campaign_bid_options_update_t *bid_options,
    pinterest_rest_api_intended_promotion_type__e intended_promotion_type,
    int *is_ltv_optimized,
    int *is_performance_plus,
    int *is_top_of_search,
    objective_type_t *objective_type
);

void campaign_update_request_all_of2_free(campaign_update_request_all_of2_t *campaign_update_request_all_of2);

campaign_update_request_all_of2_t *campaign_update_request_all_of2_parseFromJSON(cJSON *campaign_update_request_all_of2JSON);

cJSON *campaign_update_request_all_of2_convertToJSON(campaign_update_request_all_of2_t *campaign_update_request_all_of2);

#endif /* _campaign_update_request_all_of2_H_ */

