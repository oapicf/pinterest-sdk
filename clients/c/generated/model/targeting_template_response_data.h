/*
 * targeting_template_response_data.h
 *
 * 
 */

#ifndef _targeting_template_response_data_H_
#define _targeting_template_response_data_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct targeting_template_response_data_t targeting_template_response_data_t;

#include "placement_group_type.h"
#include "targeting_spec.h"
#include "targeting_template_audience_sizing.h"
#include "targeting_template_keyword.h"
#include "tracking_urls.h"

// Enum  for targeting_template_response_data

typedef enum  { pinterest_rest_api_targeting_template_response_data__NULL = 0, pinterest_rest_api_targeting_template_response_data__ALL, pinterest_rest_api_targeting_template_response_data__SEARCH, pinterest_rest_api_targeting_template_response_data__BROWSE, pinterest_rest_api_targeting_template_response_data__OTHER } pinterest_rest_api_targeting_template_response_data__e;

char* targeting_template_response_data_placement_group_ToString(pinterest_rest_api_targeting_template_response_data__e placement_group);

pinterest_rest_api_targeting_template_response_data__e targeting_template_response_data_placement_group_FromString(char* placement_group);

// Enum STATUS for targeting_template_response_data

typedef enum  { pinterest_rest_api_targeting_template_response_data_STATUS_NULL = 0, pinterest_rest_api_targeting_template_response_data_STATUS_ACTIVE, pinterest_rest_api_targeting_template_response_data_STATUS_DELETED } pinterest_rest_api_targeting_template_response_data_STATUS_e;

char* targeting_template_response_data_status_ToString(pinterest_rest_api_targeting_template_response_data_STATUS_e status);

pinterest_rest_api_targeting_template_response_data_STATUS_e targeting_template_response_data_status_FromString(char* status);



typedef struct targeting_template_response_data_t {
    char *name; // string
    int auto_targeting_enabled; //boolean
    struct targeting_spec_t *targeting_attributes; //model
    placement_group_type_t *placement_group; // custom
    list_t *keywords; //nonprimitive container
    struct tracking_urls_t *tracking_urls; //model
    char *id; // string
    int created_time; //numeric
    int updated_time; //numeric
    char *ad_account_id; // string
    pinterest_rest_api_targeting_template_response_data_STATUS_e status; //enum
    struct targeting_template_audience_sizing_t *sizing; //model

} targeting_template_response_data_t;

targeting_template_response_data_t *targeting_template_response_data_create(
    char *name,
    int auto_targeting_enabled,
    targeting_spec_t *targeting_attributes,
    placement_group_type_t *placement_group,
    list_t *keywords,
    tracking_urls_t *tracking_urls,
    char *id,
    int created_time,
    int updated_time,
    char *ad_account_id,
    pinterest_rest_api_targeting_template_response_data_STATUS_e status,
    targeting_template_audience_sizing_t *sizing
);

void targeting_template_response_data_free(targeting_template_response_data_t *targeting_template_response_data);

targeting_template_response_data_t *targeting_template_response_data_parseFromJSON(cJSON *targeting_template_response_dataJSON);

cJSON *targeting_template_response_data_convertToJSON(targeting_template_response_data_t *targeting_template_response_data);

#endif /* _targeting_template_response_data_H_ */

