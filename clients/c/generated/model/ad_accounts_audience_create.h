/*
 * ad_accounts_audience_create.h
 *
 * Resource create operation model.
 */

#ifndef _ad_accounts_audience_create_H_
#define _ad_accounts_audience_create_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ad_accounts_audience_create_t ad_accounts_audience_create_t;

#include "ad_accounts_audience_rule.h"
#include "audience_type.h"



typedef struct ad_accounts_audience_create_t {
    char *ad_account_id; // string
    audience_type_t *audience_type; // custom
    char *description; // string
    char *name; // string
    struct ad_accounts_audience_rule_t *rule; //model

    int _library_owned; // Is the library responsible for freeing this object?
} ad_accounts_audience_create_t;

__attribute__((deprecated)) ad_accounts_audience_create_t *ad_accounts_audience_create_create(
    char *ad_account_id,
    audience_type_t *audience_type,
    char *description,
    char *name,
    ad_accounts_audience_rule_t *rule
);

void ad_accounts_audience_create_free(ad_accounts_audience_create_t *ad_accounts_audience_create);

ad_accounts_audience_create_t *ad_accounts_audience_create_parseFromJSON(cJSON *ad_accounts_audience_createJSON);

cJSON *ad_accounts_audience_create_convertToJSON(ad_accounts_audience_create_t *ad_accounts_audience_create);

#endif /* _ad_accounts_audience_create_H_ */

