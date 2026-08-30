/*
 * targeting_template.h
 *
 * 
 */

#ifndef _targeting_template_H_
#define _targeting_template_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct targeting_template_t targeting_template_t;

#include "placement_group_type.h"
#include "targeting_spec_optimal.h"
#include "targeting_template_audience_sizing.h"
#include "targeting_template_keyword.h"
#include "targeting_template_status.h"
#include "tracking_urls.h"



typedef struct targeting_template_t {
    char *ad_account_id; // string
    int *auto_targeting_enabled; //boolean
    int *created_time; //numeric
    char *id; // string
    list_t *keywords; //nonprimitive container
    char *name; // string
    pinterest_rest_api_placement_group_type__e placement_group; //referenced enum
    struct targeting_template_audience_sizing_t *sizing; //model
    targeting_template_status_t *status; // custom
    struct targeting_spec_optimal_t *targeting_attributes; //model
    struct tracking_urls_t *tracking_urls; //model
    int *updated_time; //numeric
    int *valid; //boolean

    int _library_owned; // Is the library responsible for freeing this object?
} targeting_template_t;

__attribute__((deprecated)) targeting_template_t *targeting_template_create(
    char *ad_account_id,
    int *auto_targeting_enabled,
    int *created_time,
    char *id,
    list_t *keywords,
    char *name,
    pinterest_rest_api_placement_group_type__e placement_group,
    targeting_template_audience_sizing_t *sizing,
    targeting_template_status_t *status,
    targeting_spec_optimal_t *targeting_attributes,
    tracking_urls_t *tracking_urls,
    int *updated_time,
    int *valid
);

void targeting_template_free(targeting_template_t *targeting_template);

targeting_template_t *targeting_template_parseFromJSON(cJSON *targeting_templateJSON);

cJSON *targeting_template_convertToJSON(targeting_template_t *targeting_template);

#endif /* _targeting_template_H_ */

