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



typedef struct targeting_template_create_t {
    char *name; // string
    int auto_targeting_enabled; //boolean
    struct targeting_spec_t *targeting_attributes; //model
    pinterest_rest_api_placement_group_type__e placement_group; //referenced enum
    list_t *keywords; //nonprimitive container
    struct tracking_urls_t *tracking_urls; //model

    int _library_owned; // Is the library responsible for freeing this object?
} targeting_template_create_t;

__attribute__((deprecated)) targeting_template_create_t *targeting_template_create_create(
    char *name,
    int auto_targeting_enabled,
    targeting_spec_t *targeting_attributes,
    pinterest_rest_api_placement_group_type__e placement_group,
    list_t *keywords,
    tracking_urls_t *tracking_urls
);

void targeting_template_create_free(targeting_template_create_t *targeting_template_create);

targeting_template_create_t *targeting_template_create_parseFromJSON(cJSON *targeting_template_createJSON);

cJSON *targeting_template_create_convertToJSON(targeting_template_create_t *targeting_template_create);

#endif /* _targeting_template_create_H_ */

