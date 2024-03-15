/*
 * ad_group_audience_sizing_request.h
 *
 * 
 */

#ifndef _ad_group_audience_sizing_request_H_
#define _ad_group_audience_sizing_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ad_group_audience_sizing_request_t ad_group_audience_sizing_request_t;

#include "ad_group_audience_sizing_request_keywords_inner.h"
#include "placement_group_type.h"
#include "targeting_spec.h"

// Enum CREATIVETYPES for ad_group_audience_sizing_request

typedef enum  { pinterest_rest_api_ad_group_audience_sizing_request_CREATIVETYPES_NULL = 0, pinterest_rest_api_ad_group_audience_sizing_request_CREATIVETYPES_REGULAR, pinterest_rest_api_ad_group_audience_sizing_request_CREATIVETYPES_VIDEO, pinterest_rest_api_ad_group_audience_sizing_request_CREATIVETYPES_SHOPPING, pinterest_rest_api_ad_group_audience_sizing_request_CREATIVETYPES_CAROUSEL, pinterest_rest_api_ad_group_audience_sizing_request_CREATIVETYPES_MAX_VIDEO, pinterest_rest_api_ad_group_audience_sizing_request_CREATIVETYPES_SHOP_THE_PIN, pinterest_rest_api_ad_group_audience_sizing_request_CREATIVETYPES_COLLECTION, pinterest_rest_api_ad_group_audience_sizing_request_CREATIVETYPES_IDEA } pinterest_rest_api_ad_group_audience_sizing_request_CREATIVETYPES_e;

char* ad_group_audience_sizing_request_creative_types_ToString(pinterest_rest_api_ad_group_audience_sizing_request_CREATIVETYPES_e creative_types);

pinterest_rest_api_ad_group_audience_sizing_request_CREATIVETYPES_e ad_group_audience_sizing_request_creative_types_FromString(char* creative_types);



typedef struct ad_group_audience_sizing_request_t {
    int auto_targeting_enabled; //boolean
    placement_group_type_t *placement_group; // custom
    list_t *creative_types; //primitive container
    struct targeting_spec_t *targeting_spec; //model
    list_t *product_group_ids; //primitive container
    list_t *keywords; //nonprimitive container

} ad_group_audience_sizing_request_t;

ad_group_audience_sizing_request_t *ad_group_audience_sizing_request_create(
    int auto_targeting_enabled,
    placement_group_type_t *placement_group,
    list_t *creative_types,
    targeting_spec_t *targeting_spec,
    list_t *product_group_ids,
    list_t *keywords
);

void ad_group_audience_sizing_request_free(ad_group_audience_sizing_request_t *ad_group_audience_sizing_request);

ad_group_audience_sizing_request_t *ad_group_audience_sizing_request_parseFromJSON(cJSON *ad_group_audience_sizing_requestJSON);

cJSON *ad_group_audience_sizing_request_convertToJSON(ad_group_audience_sizing_request_t *ad_group_audience_sizing_request);

#endif /* _ad_group_audience_sizing_request_H_ */

