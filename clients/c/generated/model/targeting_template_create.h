/*
 * targeting_template_create.h
 *
 * 
 */

#ifndef _targeting_template_create_H_
#define _targeting_template_create_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct targeting_template_create_t targeting_template_create_t;

#include "placement_group_type.h"
#include "targeting_spec.h"
#include "targeting_template_keyword.h"
#include "tracking_urls.h"

// Enum  for targeting_template_create

typedef enum  { pinterest_rest_api_targeting_template_create__NULL = 0, pinterest_rest_api_targeting_template_create__ALL, pinterest_rest_api_targeting_template_create__SEARCH, pinterest_rest_api_targeting_template_create__BROWSE, pinterest_rest_api_targeting_template_create__OTHER } pinterest_rest_api_targeting_template_create__e;

char* targeting_template_create_placement_group_ToString(pinterest_rest_api_targeting_template_create__e placement_group);

pinterest_rest_api_targeting_template_create__e targeting_template_create_placement_group_FromString(char* placement_group);



typedef struct targeting_template_create_t {
    char *name; // string
    int auto_targeting_enabled; //boolean
    struct targeting_spec_t *targeting_attributes; //model
    placement_group_type_t *placement_group; // custom
    list_t *keywords; //nonprimitive container
    struct tracking_urls_t *tracking_urls; //model

} targeting_template_create_t;

targeting_template_create_t *targeting_template_create_create(
    char *name,
    int auto_targeting_enabled,
    targeting_spec_t *targeting_attributes,
    placement_group_type_t *placement_group,
    list_t *keywords,
    tracking_urls_t *tracking_urls
);

void targeting_template_create_free(targeting_template_create_t *targeting_template_create);

targeting_template_create_t *targeting_template_create_parseFromJSON(cJSON *targeting_template_createJSON);

cJSON *targeting_template_create_convertToJSON(targeting_template_create_t *targeting_template_create);

#endif /* _targeting_template_create_H_ */

