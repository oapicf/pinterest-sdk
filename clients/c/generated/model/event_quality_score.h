/*
 * event_quality_score.h
 *
 * Schema for GET Conversion EQS response.
 */

#ifndef _event_quality_score_H_
#define _event_quality_score_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct event_quality_score_t event_quality_score_t;

#include "ingestion_source_options.h"
#include "lookback_period_options.h"
#include "overall_status_options.h"
#include "quality_components.h"
#include "source_platform_options.h"



typedef struct event_quality_score_t {
    pinterest_rest_api_ingestion_source_options__e ingestion_source; //referenced enum
    pinterest_rest_api_lookback_period_options__e lookback_period; //referenced enum
    pinterest_rest_api_overall_status_options__e overall_status; //referenced enum
    struct quality_components_t *quality_components; //model
    pinterest_rest_api_source_platform_options__e source_platform; //referenced enum

    int _library_owned; // Is the library responsible for freeing this object?
} event_quality_score_t;

__attribute__((deprecated)) event_quality_score_t *event_quality_score_create(
    pinterest_rest_api_ingestion_source_options__e ingestion_source,
    pinterest_rest_api_lookback_period_options__e lookback_period,
    pinterest_rest_api_overall_status_options__e overall_status,
    quality_components_t *quality_components,
    pinterest_rest_api_source_platform_options__e source_platform
);

void event_quality_score_free(event_quality_score_t *event_quality_score);

event_quality_score_t *event_quality_score_parseFromJSON(cJSON *event_quality_scoreJSON);

cJSON *event_quality_score_convertToJSON(event_quality_score_t *event_quality_score);

#endif /* _event_quality_score_H_ */

