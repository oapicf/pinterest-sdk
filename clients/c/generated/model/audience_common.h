/*
 * audience_common.h
 *
 * 
 */

#ifndef _audience_common_H_
#define _audience_common_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct audience_common_t audience_common_t;

#include "audience_rule.h"



typedef struct audience_common_t {
    char *ad_account_id; // string
    char *name; // string
    struct audience_rule_t *rule; //model

} audience_common_t;

audience_common_t *audience_common_create(
    char *ad_account_id,
    char *name,
    audience_rule_t *rule
);

void audience_common_free(audience_common_t *audience_common);

audience_common_t *audience_common_parseFromJSON(cJSON *audience_commonJSON);

cJSON *audience_common_convertToJSON(audience_common_t *audience_common);

#endif /* _audience_common_H_ */

