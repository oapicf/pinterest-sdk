/*
 * audience.h
 *
 * 
 */

#ifndef _audience_H_
#define _audience_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct audience_t audience_t;

#include "audience_rule.h"
#include "audience_status.h"
#include "pinner_list_type.h"



typedef struct audience_t {
    char *ad_account_id; // string
    pinner_list_type_t *audience_type; // custom
    char *created_by_company_name; // string
    int *created_timestamp; //numeric
    char *description; // string
    char *id; // string
    int *is_nca; //boolean
    char *name; // string
    struct audience_rule_t *rule; //model
    int *size; //numeric
    audience_status_t *status; // custom
    char *type; // string
    int *updated_timestamp; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} audience_t;

__attribute__((deprecated)) audience_t *audience_create(
    char *ad_account_id,
    pinner_list_type_t *audience_type,
    char *created_by_company_name,
    int *created_timestamp,
    char *description,
    char *id,
    int *is_nca,
    char *name,
    audience_rule_t *rule,
    int *size,
    audience_status_t *status,
    char *type,
    int *updated_timestamp
);

void audience_free(audience_t *audience);

audience_t *audience_parseFromJSON(cJSON *audienceJSON);

cJSON *audience_convertToJSON(audience_t *audience);

#endif /* _audience_H_ */

