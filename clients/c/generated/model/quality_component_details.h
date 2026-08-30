/*
 * quality_component_details.h
 *
 * Metrics for a specific event type within a quality component.
 */

#ifndef _quality_component_details_H_
#define _quality_component_details_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct quality_component_details_t quality_component_details_t;

#include "quality_component_issue.h"



typedef struct quality_component_details_t {
    double *coverage; //numeric
    list_t *issues; //nonprimitive container
    double *overlap; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} quality_component_details_t;

__attribute__((deprecated)) quality_component_details_t *quality_component_details_create(
    double *coverage,
    list_t *issues,
    double *overlap
);

void quality_component_details_free(quality_component_details_t *quality_component_details);

quality_component_details_t *quality_component_details_parseFromJSON(cJSON *quality_component_detailsJSON);

cJSON *quality_component_details_convertToJSON(quality_component_details_t *quality_component_details);

#endif /* _quality_component_details_H_ */

