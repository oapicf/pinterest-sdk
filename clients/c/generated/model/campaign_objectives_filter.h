/*
 * campaign_objectives_filter.h
 *
 * 
 */

#ifndef _campaign_objectives_filter_H_
#define _campaign_objectives_filter_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct campaign_objectives_filter_t campaign_objectives_filter_t;

#include "objective_type.h"

// Enum  for campaign_objectives_filter

typedef enum  { pinterest_rest_api_campaign_objectives_filter__NULL = 0, pinterest_rest_api_campaign_objectives_filter__AWARENESS, pinterest_rest_api_campaign_objectives_filter__CONSIDERATION, pinterest_rest_api_campaign_objectives_filter__WEB_CONVERSION, pinterest_rest_api_campaign_objectives_filter__CATALOG_SALES, pinterest_rest_api_campaign_objectives_filter__VIDEO_COMPLETION } pinterest_rest_api_campaign_objectives_filter__e;

char* campaign_objectives_filter_campaign_objective_types_ToString(pinterest_rest_api_campaign_objectives_filter__e campaign_objective_types);

pinterest_rest_api_campaign_objectives_filter__e campaign_objectives_filter_campaign_objective_types_FromString(char* campaign_objective_types);



typedef struct campaign_objectives_filter_t {
    list_t *campaign_objective_types; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} campaign_objectives_filter_t;

__attribute__((deprecated)) campaign_objectives_filter_t *campaign_objectives_filter_create(
    list_t *campaign_objective_types
);

void campaign_objectives_filter_free(campaign_objectives_filter_t *campaign_objectives_filter);

campaign_objectives_filter_t *campaign_objectives_filter_parseFromJSON(cJSON *campaign_objectives_filterJSON);

cJSON *campaign_objectives_filter_convertToJSON(campaign_objectives_filter_t *campaign_objectives_filter);

#endif /* _campaign_objectives_filter_H_ */

