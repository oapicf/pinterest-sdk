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

// Enum STATUS for targeting_template_response_data

typedef enum  { pinterest_rest_api_targeting_template_response_data_STATUS_NULL = 0, pinterest_rest_api_targeting_template_response_data_STATUS_ACTIVE, pinterest_rest_api_targeting_template_response_data_STATUS_DELETED } pinterest_rest_api_targeting_template_response_data_STATUS_e;

char* targeting_template_response_data_status_ToString(pinterest_rest_api_targeting_template_response_data_STATUS_e status);

pinterest_rest_api_targeting_template_response_data_STATUS_e targeting_template_response_data_status_FromString(char* status);



typedef struct targeting_template_response_data_t {
    int auto_targeting_enabled; //boolean
    list_t *keywords; //nonprimitive container
    char *name; // string
    pinterest_rest_api_placement_group_type__e placement_group; //referenced enum
    struct targeting_spec_t *targeting_attributes; //model
    struct tracking_urls_t *tracking_urls; //model
    char *ad_account_id; // string
    int created_time; //numeric
    char *id; // string
    struct targeting_template_audience_sizing_t *sizing; //model
    pinterest_rest_api_targeting_template_response_data_STATUS_e status; //enum
    int updated_time; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} targeting_template_response_data_t;

__attribute__((deprecated)) targeting_template_response_data_t *targeting_template_response_data_create(
    int auto_targeting_enabled,
    list_t *keywords,
    char *name,
    pinterest_rest_api_placement_group_type__e placement_group,
    targeting_spec_t *targeting_attributes,
    tracking_urls_t *tracking_urls,
    char *ad_account_id,
    int created_time,
    char *id,
    targeting_template_audience_sizing_t *sizing,
    pinterest_rest_api_targeting_template_response_data_STATUS_e status,
    int updated_time
);

void targeting_template_response_data_free(targeting_template_response_data_t *targeting_template_response_data);

targeting_template_response_data_t *targeting_template_response_data_parseFromJSON(cJSON *targeting_template_response_dataJSON);

cJSON *targeting_template_response_data_convertToJSON(targeting_template_response_data_t *targeting_template_response_data);

#endif /* _targeting_template_response_data_H_ */

