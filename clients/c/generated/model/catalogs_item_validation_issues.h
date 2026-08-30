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
    struct catalogs_item_validation_errors_t *errors; //model
    char *item_id; // string
    int *item_number; //numeric
    struct catalogs_item_validation_warnings_t *warnings; //model

    int _library_owned; // Is the library responsible for freeing this object?
} catalogs_item_validation_issues_t;

__attribute__((deprecated)) catalogs_item_validation_issues_t *catalogs_item_validation_issues_create(
    catalogs_item_validation_errors_t *errors,
    char *item_id,
    int *item_number,
    catalogs_item_validation_warnings_t *warnings
);

void catalogs_item_validation_issues_free(catalogs_item_validation_issues_t *catalogs_item_validation_issues);

catalogs_item_validation_issues_t *catalogs_item_validation_issues_parseFromJSON(cJSON *catalogs_item_validation_issuesJSON);

cJSON *catalogs_item_validation_issues_convertToJSON(catalogs_item_validation_issues_t *catalogs_item_validation_issues);

#endif /* _catalogs_item_validation_issues_H_ */

