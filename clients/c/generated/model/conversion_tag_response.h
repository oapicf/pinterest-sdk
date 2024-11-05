/*
 * conversion_tag_response.h
 *
 * 
 */

#ifndef _conversion_tag_response_H_
#define _conversion_tag_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct conversion_tag_response_t conversion_tag_response_t;

#include "conversion_tag_configs.h"
#include "enhanced_match_status_type.h"
#include "entity_status.h"

// Enum  for conversion_tag_response

typedef enum  { pinterest_rest_api_conversion_tag_response__NULL = 0, pinterest_rest_api_conversion_tag_response__UNKNOWN, pinterest_rest_api_conversion_tag_response__NOT_VALIDATED, pinterest_rest_api_conversion_tag_response__VALIDATING_IN_PROGRESS, pinterest_rest_api_conversion_tag_response__VALIDATION_COMPLETE } pinterest_rest_api_conversion_tag_response__e;

char* conversion_tag_response_enhanced_match_status_ToString(pinterest_rest_api_conversion_tag_response__e enhanced_match_status);

pinterest_rest_api_conversion_tag_response__e conversion_tag_response_enhanced_match_status_FromString(char* enhanced_match_status);

// Enum  for conversion_tag_response

typedef enum  { pinterest_rest_api_conversion_tag_response__NULL = 0, pinterest_rest_api_conversion_tag_response__ACTIVE, pinterest_rest_api_conversion_tag_response__PAUSED, pinterest_rest_api_conversion_tag_response__ARCHIVED, pinterest_rest_api_conversion_tag_response__DRAFT, pinterest_rest_api_conversion_tag_response__DELETED_DRAFT } pinterest_rest_api_conversion_tag_response__e;

char* conversion_tag_response_status_ToString(pinterest_rest_api_conversion_tag_response__e status);

pinterest_rest_api_conversion_tag_response__e conversion_tag_response_status_FromString(char* status);



typedef struct conversion_tag_response_t {
    char *ad_account_id; // string
    char *code_snippet; // string
    enhanced_match_status_type_t *enhanced_match_status; // custom
    char *id; // string
    double last_fired_time_ms; //numeric
    char *name; // string
    entity_status_t *status; // custom
    char *version; // string
    struct conversion_tag_configs_t *configs; //model

} conversion_tag_response_t;

conversion_tag_response_t *conversion_tag_response_create(
    char *ad_account_id,
    char *code_snippet,
    enhanced_match_status_type_t *enhanced_match_status,
    char *id,
    double last_fired_time_ms,
    char *name,
    entity_status_t *status,
    char *version,
    conversion_tag_configs_t *configs
);

void conversion_tag_response_free(conversion_tag_response_t *conversion_tag_response);

conversion_tag_response_t *conversion_tag_response_parseFromJSON(cJSON *conversion_tag_responseJSON);

cJSON *conversion_tag_response_convertToJSON(conversion_tag_response_t *conversion_tag_response);

#endif /* _conversion_tag_response_H_ */

