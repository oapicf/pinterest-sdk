/*
 * ad_group_audience_sizing_response.h
 *
 * 
 */

#ifndef _ad_group_audience_sizing_response_H_
#define _ad_group_audience_sizing_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ad_group_audience_sizing_response_t ad_group_audience_sizing_response_t;




typedef struct ad_group_audience_sizing_response_t {
    double audience_size_lower_bound; //numeric
    double audience_size_upper_bound; //numeric

} ad_group_audience_sizing_response_t;

ad_group_audience_sizing_response_t *ad_group_audience_sizing_response_create(
    double audience_size_lower_bound,
    double audience_size_upper_bound
);

void ad_group_audience_sizing_response_free(ad_group_audience_sizing_response_t *ad_group_audience_sizing_response);

ad_group_audience_sizing_response_t *ad_group_audience_sizing_response_parseFromJSON(cJSON *ad_group_audience_sizing_responseJSON);

cJSON *ad_group_audience_sizing_response_convertToJSON(ad_group_audience_sizing_response_t *ad_group_audience_sizing_response);

#endif /* _ad_group_audience_sizing_response_H_ */

