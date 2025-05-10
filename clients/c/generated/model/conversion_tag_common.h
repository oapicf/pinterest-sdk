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



typedef struct conversion_tag_common_t {
    char *ad_account_id; // string
    char *code_snippet; // string
    pinterest_rest_api_enhanced_match_status_type__e enhanced_match_status; //referenced enum
    char *id; // string
    double last_fired_time_ms; //numeric
    char *name; // string
    pinterest_rest_api_entity_status__e status; //referenced enum
    char *version; // string
    struct conversion_tag_configs_t *configs; //model

    int _library_owned; // Is the library responsible for freeing this object?
} conversion_tag_common_t;

__attribute__((deprecated)) conversion_tag_common_t *conversion_tag_common_create(
    char *ad_account_id,
    char *code_snippet,
    pinterest_rest_api_enhanced_match_status_type__e enhanced_match_status,
    char *id,
    double last_fired_time_ms,
    char *name,
    pinterest_rest_api_entity_status__e status,
    char *version,
    conversion_tag_configs_t *configs
);

void conversion_tag_common_free(conversion_tag_common_t *conversion_tag_common);

conversion_tag_common_t *conversion_tag_common_parseFromJSON(cJSON *conversion_tag_commonJSON);

cJSON *conversion_tag_common_convertToJSON(conversion_tag_common_t *conversion_tag_common);

#endif /* _conversion_tag_common_H_ */

