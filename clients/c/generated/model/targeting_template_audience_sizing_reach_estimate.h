/*
 * targeting_template_audience_sizing_reach_estimate.h
 *
 * 
 */

#ifndef _targeting_template_audience_sizing_reach_estimate_H_
#define _targeting_template_audience_sizing_reach_estimate_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct targeting_template_audience_sizing_reach_estimate_t targeting_template_audience_sizing_reach_estimate_t;




typedef struct targeting_template_audience_sizing_reach_estimate_t {
    long estimate; //numeric
    long lower_bound; //numeric
    long upper_bound; //numeric

} targeting_template_audience_sizing_reach_estimate_t;

targeting_template_audience_sizing_reach_estimate_t *targeting_template_audience_sizing_reach_estimate_create(
    long estimate,
    long lower_bound,
    long upper_bound
);

void targeting_template_audience_sizing_reach_estimate_free(targeting_template_audience_sizing_reach_estimate_t *targeting_template_audience_sizing_reach_estimate);

targeting_template_audience_sizing_reach_estimate_t *targeting_template_audience_sizing_reach_estimate_parseFromJSON(cJSON *targeting_template_audience_sizing_reach_estimateJSON);

cJSON *targeting_template_audience_sizing_reach_estimate_convertToJSON(targeting_template_audience_sizing_reach_estimate_t *targeting_template_audience_sizing_reach_estimate);

#endif /* _targeting_template_audience_sizing_reach_estimate_H_ */

