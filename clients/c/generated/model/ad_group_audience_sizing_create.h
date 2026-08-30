/*
 * ad_group_audience_sizing_create.h
 *
 * Resource create operation model.
 */

#ifndef _ad_group_audience_sizing_create_H_
#define _ad_group_audience_sizing_create_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ad_group_audience_sizing_create_t ad_group_audience_sizing_create_t;

#include "ad_group_audience_sizing_creative_types.h"
#include "ad_group_audience_sizing_keyword.h"
#include "adgroup_placement_group_type.h"
#include "targeting_spec_optimal.h"

// Enum  for ad_group_audience_sizing_create

typedef enum  { pinterest_rest_api_ad_group_audience_sizing_create__NULL = 0, pinterest_rest_api_ad_group_audience_sizing_create__REGULAR, pinterest_rest_api_ad_group_audience_sizing_create__VIDEO, pinterest_rest_api_ad_group_audience_sizing_create__SHOPPING, pinterest_rest_api_ad_group_audience_sizing_create__CAROUSEL, pinterest_rest_api_ad_group_audience_sizing_create__MAX_VIDEO, pinterest_rest_api_ad_group_audience_sizing_create__SHOP_THE_PIN, pinterest_rest_api_ad_group_audience_sizing_create__COLLECTION, pinterest_rest_api_ad_group_audience_sizing_create__IDEA } pinterest_rest_api_ad_group_audience_sizing_create__e;

char* ad_group_audience_sizing_create_creative_types_ToString(pinterest_rest_api_ad_group_audience_sizing_create__e creative_types);

pinterest_rest_api_ad_group_audience_sizing_create__e ad_group_audience_sizing_create_creative_types_FromString(char* creative_types);



typedef struct ad_group_audience_sizing_create_t {
    int *auto_targeting_enabled; //boolean
    list_t *creative_types; //nonprimitive container
    list_t *keywords; //nonprimitive container
    adgroup_placement_group_type_t *placement_group; // custom
    list_t *product_group_ids; //primitive container
    struct targeting_spec_optimal_t *targeting_spec; //model

    int _library_owned; // Is the library responsible for freeing this object?
} ad_group_audience_sizing_create_t;

__attribute__((deprecated)) ad_group_audience_sizing_create_t *ad_group_audience_sizing_create_create(
    int *auto_targeting_enabled,
    list_t *creative_types,
    list_t *keywords,
    adgroup_placement_group_type_t *placement_group,
    list_t *product_group_ids,
    targeting_spec_optimal_t *targeting_spec
);

void ad_group_audience_sizing_create_free(ad_group_audience_sizing_create_t *ad_group_audience_sizing_create);

ad_group_audience_sizing_create_t *ad_group_audience_sizing_create_parseFromJSON(cJSON *ad_group_audience_sizing_createJSON);

cJSON *ad_group_audience_sizing_create_convertToJSON(ad_group_audience_sizing_create_t *ad_group_audience_sizing_create);

#endif /* _ad_group_audience_sizing_create_H_ */

