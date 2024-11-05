/*
 * targeting_template_audience_sizing.h
 *
 * Gets an audience size estimate for a set of given targeting spec data. &lt;p&gt;Returns:&lt;/p&gt; An object containing an audience size estimate that has a reach estimate (number of unique users) against the given targeting template. This by default provides a monthly estimate. 
 */

#ifndef _targeting_template_audience_sizing_H_
#define _targeting_template_audience_sizing_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct targeting_template_audience_sizing_t targeting_template_audience_sizing_t;

#include "targeting_template_audience_sizing_reach_estimate.h"



typedef struct targeting_template_audience_sizing_t {
    struct targeting_template_audience_sizing_reach_estimate_t *reach_estimate; //model

} targeting_template_audience_sizing_t;

targeting_template_audience_sizing_t *targeting_template_audience_sizing_create(
    targeting_template_audience_sizing_reach_estimate_t *reach_estimate
);

void targeting_template_audience_sizing_free(targeting_template_audience_sizing_t *targeting_template_audience_sizing);

targeting_template_audience_sizing_t *targeting_template_audience_sizing_parseFromJSON(cJSON *targeting_template_audience_sizingJSON);

cJSON *targeting_template_audience_sizing_convertToJSON(targeting_template_audience_sizing_t *targeting_template_audience_sizing);

#endif /* _targeting_template_audience_sizing_H_ */

