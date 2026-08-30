/*
 * ad_group_delivery_estimates.h
 *
 * Ad group configuration for delivery estimates.
 */

#ifndef _ad_group_delivery_estimates_H_
#define _ad_group_delivery_estimates_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ad_group_delivery_estimates_t ad_group_delivery_estimates_t;

#include "ad_group_audience_sizing_creative_types.h"
#include "ad_group_delivery_estimates_keywords_items.h"
#include "optimization_goal_metadata.h"
#include "optimization_type.h"
#include "placement_group_type.h"
#include "targeting_spec_optimal.h"

// Enum  for ad_group_delivery_estimates

typedef enum  { pinterest_rest_api_ad_group_delivery_estimates__NULL = 0, pinterest_rest_api_ad_group_delivery_estimates__REGULAR, pinterest_rest_api_ad_group_delivery_estimates__VIDEO, pinterest_rest_api_ad_group_delivery_estimates__SHOPPING, pinterest_rest_api_ad_group_delivery_estimates__CAROUSEL, pinterest_rest_api_ad_group_delivery_estimates__MAX_VIDEO, pinterest_rest_api_ad_group_delivery_estimates__SHOP_THE_PIN, pinterest_rest_api_ad_group_delivery_estimates__COLLECTION, pinterest_rest_api_ad_group_delivery_estimates__IDEA } pinterest_rest_api_ad_group_delivery_estimates__e;

char* ad_group_delivery_estimates_creative_types_ToString(pinterest_rest_api_ad_group_delivery_estimates__e creative_types);

pinterest_rest_api_ad_group_delivery_estimates__e ad_group_delivery_estimates_creative_types_FromString(char* creative_types);



typedef struct ad_group_delivery_estimates_t {
    int *auto_targeting_enabled; //boolean
    list_t *creative_types; //nonprimitive container
    list_t *keywords; //nonprimitive container
    int *monthly_frequency_cap; //numeric
    struct optimization_goal_metadata_t *optimization_goal_metadata; //model
    optimization_type_t *optimization_type; // custom
    pinterest_rest_api_placement_group_type__e placement_group; //referenced enum
    list_t *product_group_ids; //primitive container
    struct targeting_spec_optimal_t *targeting_spec; //model

    int _library_owned; // Is the library responsible for freeing this object?
} ad_group_delivery_estimates_t;

__attribute__((deprecated)) ad_group_delivery_estimates_t *ad_group_delivery_estimates_create(
    int *auto_targeting_enabled,
    list_t *creative_types,
    list_t *keywords,
    int *monthly_frequency_cap,
    optimization_goal_metadata_t *optimization_goal_metadata,
    optimization_type_t *optimization_type,
    pinterest_rest_api_placement_group_type__e placement_group,
    list_t *product_group_ids,
    targeting_spec_optimal_t *targeting_spec
);

void ad_group_delivery_estimates_free(ad_group_delivery_estimates_t *ad_group_delivery_estimates);

ad_group_delivery_estimates_t *ad_group_delivery_estimates_parseFromJSON(cJSON *ad_group_delivery_estimatesJSON);

cJSON *ad_group_delivery_estimates_convertToJSON(ad_group_delivery_estimates_t *ad_group_delivery_estimates);

#endif /* _ad_group_delivery_estimates_H_ */

