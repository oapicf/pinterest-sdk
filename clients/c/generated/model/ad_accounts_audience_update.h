/*
 * ad_accounts_audience_update.h
 *
 * Resource create or update operation model.
 */

#ifndef _ad_accounts_audience_update_H_
#define _ad_accounts_audience_update_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ad_accounts_audience_update_t ad_accounts_audience_update_t;

#include "ad_accounts_audience_rule.h"
#include "audience_type.h"
#include "audience_update_operation_type.h"



typedef struct ad_accounts_audience_update_t {
    char *ad_account_id; // string
    audience_type_t *audience_type; // custom
    char *description; // string
    char *name; // string
    audience_update_operation_type_t *operation_type; // custom
    struct ad_accounts_audience_rule_t *rule; //model

    int _library_owned; // Is the library responsible for freeing this object?
} ad_accounts_audience_update_t;

__attribute__((deprecated)) ad_accounts_audience_update_t *ad_accounts_audience_update_create(
    char *ad_account_id,
    audience_type_t *audience_type,
    char *description,
    char *name,
    audience_update_operation_type_t *operation_type,
    ad_accounts_audience_rule_t *rule
);

void ad_accounts_audience_update_free(ad_accounts_audience_update_t *ad_accounts_audience_update);

ad_accounts_audience_update_t *ad_accounts_audience_update_parseFromJSON(cJSON *ad_accounts_audience_updateJSON);

cJSON *ad_accounts_audience_update_convertToJSON(ad_accounts_audience_update_t *ad_accounts_audience_update);

#endif /* _ad_accounts_audience_update_H_ */

