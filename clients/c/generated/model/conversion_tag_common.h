/*
 * conversion_tag_common.h
 *
 * 
 */

#ifndef _conversion_tag_common_H_
#define _conversion_tag_common_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct conversion_tag_common_t conversion_tag_common_t;

#include "conversion_tag_configs.h"
#include "enhanced_match_status_type.h"
#include "entity_status.h"

// Enum  for conversion_tag_common

typedef enum  { pinterest_rest_api_conversion_tag_common__NULL = 0, pinterest_rest_api_conversion_tag_common__UNKNOWN, pinterest_rest_api_conversion_tag_common__NOT_VALIDATED, pinterest_rest_api_conversion_tag_common__VALIDATING_IN_PROGRESS, pinterest_rest_api_conversion_tag_common__VALIDATION_COMPLETE } pinterest_rest_api_conversion_tag_common__e;

char* conversion_tag_common_enhanced_match_status_ToString(pinterest_rest_api_conversion_tag_common__e enhanced_match_status);

pinterest_rest_api_conversion_tag_common__e conversion_tag_common_enhanced_match_status_FromString(char* enhanced_match_status);

// Enum  for conversion_tag_common

typedef enum  { pinterest_rest_api_conversion_tag_common__NULL = 0, pinterest_rest_api_conversion_tag_common__ACTIVE, pinterest_rest_api_conversion_tag_common__PAUSED, pinterest_rest_api_conversion_tag_common__ARCHIVED, pinterest_rest_api_conversion_tag_common__DRAFT, pinterest_rest_api_conversion_tag_common__DELETED_DRAFT } pinterest_rest_api_conversion_tag_common__e;

char* conversion_tag_common_status_ToString(pinterest_rest_api_conversion_tag_common__e status);

pinterest_rest_api_conversion_tag_common__e conversion_tag_common_status_FromString(char* status);



typedef struct conversion_tag_common_t {
    char *ad_account_id; // string
    char *code_snippet; // string
    enhanced_match_status_type_t *enhanced_match_status; // custom
    char *id; // string
    double last_fired_time_ms; //numeric
    char *name; // string
    entity_status_t *status; // custom
    char *version; // string
    struct conversion_tag_configs_t *configs; //model

} conversion_tag_common_t;

conversion_tag_common_t *conversion_tag_common_create(
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

void conversion_tag_common_free(conversion_tag_common_t *conversion_tag_common);

conversion_tag_common_t *conversion_tag_common_parseFromJSON(cJSON *conversion_tag_commonJSON);

cJSON *conversion_tag_common_convertToJSON(conversion_tag_common_t *conversion_tag_common);

#endif /* _conversion_tag_common_H_ */

