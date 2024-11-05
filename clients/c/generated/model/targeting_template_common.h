/*
 * targeting_template_common.h
 *
 * 
 */

#ifndef _targeting_template_common_H_
#define _targeting_template_common_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct targeting_template_common_t targeting_template_common_t;

#include "placement_group_type.h"
#include "targeting_spec.h"
#include "targeting_template_keyword.h"
#include "tracking_urls.h"

// Enum  for targeting_template_common

typedef enum  { pinterest_rest_api_targeting_template_common__NULL = 0, pinterest_rest_api_targeting_template_common__ALL, pinterest_rest_api_targeting_template_common__SEARCH, pinterest_rest_api_targeting_template_common__BROWSE, pinterest_rest_api_targeting_template_common__OTHER } pinterest_rest_api_targeting_template_common__e;

char* targeting_template_common_placement_group_ToString(pinterest_rest_api_targeting_template_common__e placement_group);

pinterest_rest_api_targeting_template_common__e targeting_template_common_placement_group_FromString(char* placement_group);



typedef struct targeting_template_common_t {
    char *name; // string
    int auto_targeting_enabled; //boolean
    struct targeting_spec_t *targeting_attributes; //model
    placement_group_type_t *placement_group; // custom
    list_t *keywords; //nonprimitive container
    struct tracking_urls_t *tracking_urls; //model

} targeting_template_common_t;

targeting_template_common_t *targeting_template_common_create(
    char *name,
    int auto_targeting_enabled,
    targeting_spec_t *targeting_attributes,
    placement_group_type_t *placement_group,
    list_t *keywords,
    tracking_urls_t *tracking_urls
);

void targeting_template_common_free(targeting_template_common_t *targeting_template_common);

targeting_template_common_t *targeting_template_common_parseFromJSON(cJSON *targeting_template_commonJSON);

cJSON *targeting_template_common_convertToJSON(targeting_template_common_t *targeting_template_common);

#endif /* _targeting_template_common_H_ */

