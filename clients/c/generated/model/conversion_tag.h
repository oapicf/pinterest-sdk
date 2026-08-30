/*
 * conversion_tag.h
 *
 * 
 */

#ifndef _conversion_tag_H_
#define _conversion_tag_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct conversion_tag_t conversion_tag_t;

#include "conversion_tag_configs.h"
#include "enhanced_match_status_type.h"
#include "entity_status.h"



typedef struct conversion_tag_t {
    char *code_snippet; // string
    struct conversion_tag_configs_t *configs; //model
    enhanced_match_status_type_t *enhanced_match_status; // custom
    char *id; // string
    double *last_fired_time_ms; //numeric
    char *name; // string
    char *version; // string
    char *ad_account_id; // string
    entity_status_t *status; // custom

    int _library_owned; // Is the library responsible for freeing this object?
} conversion_tag_t;

__attribute__((deprecated)) conversion_tag_t *conversion_tag_create(
    char *code_snippet,
    conversion_tag_configs_t *configs,
    enhanced_match_status_type_t *enhanced_match_status,
    char *id,
    double *last_fired_time_ms,
    char *name,
    char *version,
    char *ad_account_id,
    entity_status_t *status
);

void conversion_tag_free(conversion_tag_t *conversion_tag);

conversion_tag_t *conversion_tag_parseFromJSON(cJSON *conversion_tagJSON);

cJSON *conversion_tag_convertToJSON(conversion_tag_t *conversion_tag);

#endif /* _conversion_tag_H_ */

