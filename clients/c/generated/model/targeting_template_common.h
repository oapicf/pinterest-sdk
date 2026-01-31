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



typedef struct targeting_template_common_t {
    int auto_targeting_enabled; //boolean
    list_t *keywords; //nonprimitive container
    char *name; // string
    pinterest_rest_api_placement_group_type__e placement_group; //referenced enum
    struct targeting_spec_t *targeting_attributes; //model
    struct tracking_urls_t *tracking_urls; //model

    int _library_owned; // Is the library responsible for freeing this object?
} targeting_template_common_t;

__attribute__((deprecated)) targeting_template_common_t *targeting_template_common_create(
    int auto_targeting_enabled,
    list_t *keywords,
    char *name,
    pinterest_rest_api_placement_group_type__e placement_group,
    targeting_spec_t *targeting_attributes,
    tracking_urls_t *tracking_urls
);

void targeting_template_common_free(targeting_template_common_t *targeting_template_common);

targeting_template_common_t *targeting_template_common_parseFromJSON(cJSON *targeting_template_commonJSON);

cJSON *targeting_template_common_convertToJSON(targeting_template_common_t *targeting_template_common);

#endif /* _targeting_template_common_H_ */

