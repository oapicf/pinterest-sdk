/*
 * ad_accounts_audience.h
 *
 * 
 */

#ifndef _ad_accounts_audience_H_
#define _ad_accounts_audience_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ad_accounts_audience_t ad_accounts_audience_t;

#include "ad_accounts_audience_rule.h"
#include "audience_status.h"
#include "audience_type.h"



typedef struct ad_accounts_audience_t {
    char *ad_account_id; // string
    audience_type_t *audience_type; // custom
    char *created_by_company_name; // string
    int *created_timestamp; //numeric
    char *description; // string
    char *id; // string
    int *is_nca; //boolean
    char *name; // string
    struct ad_accounts_audience_rule_t *rule; //model
    int *size; //numeric
    audience_status_t *status; // custom
    char *type; // string
    int *updated_timestamp; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} ad_accounts_audience_t;

__attribute__((deprecated)) ad_accounts_audience_t *ad_accounts_audience_create(
    char *ad_account_id,
    audience_type_t *audience_type,
    char *created_by_company_name,
    int *created_timestamp,
    char *description,
    char *id,
    int *is_nca,
    char *name,
    ad_accounts_audience_rule_t *rule,
    int *size,
    audience_status_t *status,
    char *type,
    int *updated_timestamp
);

void ad_accounts_audience_free(ad_accounts_audience_t *ad_accounts_audience);

ad_accounts_audience_t *ad_accounts_audience_parseFromJSON(cJSON *ad_accounts_audienceJSON);

cJSON *ad_accounts_audience_convertToJSON(ad_accounts_audience_t *ad_accounts_audience);

#endif /* _ad_accounts_audience_H_ */

