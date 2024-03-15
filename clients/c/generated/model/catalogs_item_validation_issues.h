/*
 * catalogs_item_validation_issues.h
 *
 * 
 */

#ifndef _catalogs_item_validation_issues_H_
#define _catalogs_item_validation_issues_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_item_validation_issues_t catalogs_item_validation_issues_t;

#include "catalogs_item_validation_errors.h"
#include "catalogs_item_validation_warnings.h"



typedef struct catalogs_item_validation_issues_t {
    int item_number; //numeric
    char *item_id; // string
    struct catalogs_item_validation_errors_t *errors; //model
    struct catalogs_item_validation_warnings_t *warnings; //model

} catalogs_item_validation_issues_t;

catalogs_item_validation_issues_t *catalogs_item_validation_issues_create(
    int item_number,
    char *item_id,
    catalogs_item_validation_errors_t *errors,
    catalogs_item_validation_warnings_t *warnings
);

void catalogs_item_validation_issues_free(catalogs_item_validation_issues_t *catalogs_item_validation_issues);

catalogs_item_validation_issues_t *catalogs_item_validation_issues_parseFromJSON(cJSON *catalogs_item_validation_issuesJSON);

cJSON *catalogs_item_validation_issues_convertToJSON(catalogs_item_validation_issues_t *catalogs_item_validation_issues);

#endif /* _catalogs_item_validation_issues_H_ */

