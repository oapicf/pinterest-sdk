/*
 * ad_group_audience_sizing.h
 *
 * 
 */

#ifndef _ad_group_audience_sizing_H_
#define _ad_group_audience_sizing_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ad_group_audience_sizing_t ad_group_audience_sizing_t;




typedef struct ad_group_audience_sizing_t {
    double *audience_size_lower_bound; //numeric
    double *audience_size_upper_bound; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} ad_group_audience_sizing_t;

__attribute__((deprecated)) ad_group_audience_sizing_t *ad_group_audience_sizing_create(
    double *audience_size_lower_bound,
    double *audience_size_upper_bound
);

void ad_group_audience_sizing_free(ad_group_audience_sizing_t *ad_group_audience_sizing);

ad_group_audience_sizing_t *ad_group_audience_sizing_parseFromJSON(cJSON *ad_group_audience_sizingJSON);

cJSON *ad_group_audience_sizing_convertToJSON(ad_group_audience_sizing_t *ad_group_audience_sizing);

#endif /* _ad_group_audience_sizing_H_ */

