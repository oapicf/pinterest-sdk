/*
 * quality_component_issue.h
 *
 * Details of an issue with a quality component.
 */

#ifndef _quality_component_issue_H_
#define _quality_component_issue_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct quality_component_issue_t quality_component_issue_t;




typedef struct quality_component_issue_t {
    char *id; // string
    char *name; // string
    char *reason; // string

    int _library_owned; // Is the library responsible for freeing this object?
} quality_component_issue_t;

__attribute__((deprecated)) quality_component_issue_t *quality_component_issue_create(
    char *id,
    char *name,
    char *reason
);

void quality_component_issue_free(quality_component_issue_t *quality_component_issue);

quality_component_issue_t *quality_component_issue_parseFromJSON(cJSON *quality_component_issueJSON);

cJSON *quality_component_issue_convertToJSON(quality_component_issue_t *quality_component_issue);

#endif /* _quality_component_issue_H_ */

