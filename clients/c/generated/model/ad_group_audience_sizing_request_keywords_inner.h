/*
 * ad_group_audience_sizing_request_keywords_inner.h
 *
 * 
 */

#ifndef _ad_group_audience_sizing_request_keywords_inner_H_
#define _ad_group_audience_sizing_request_keywords_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ad_group_audience_sizing_request_keywords_inner_t ad_group_audience_sizing_request_keywords_inner_t;

#include "match_type_response.h"



typedef struct ad_group_audience_sizing_request_keywords_inner_t {
    pinterest_rest_api_match_type_response__e match_type; //referenced enum
    char *value; // string

    int _library_owned; // Is the library responsible for freeing this object?
} ad_group_audience_sizing_request_keywords_inner_t;

__attribute__((deprecated)) ad_group_audience_sizing_request_keywords_inner_t *ad_group_audience_sizing_request_keywords_inner_create(
    pinterest_rest_api_match_type_response__e match_type,
    char *value
);

void ad_group_audience_sizing_request_keywords_inner_free(ad_group_audience_sizing_request_keywords_inner_t *ad_group_audience_sizing_request_keywords_inner);

ad_group_audience_sizing_request_keywords_inner_t *ad_group_audience_sizing_request_keywords_inner_parseFromJSON(cJSON *ad_group_audience_sizing_request_keywords_innerJSON);

cJSON *ad_group_audience_sizing_request_keywords_inner_convertToJSON(ad_group_audience_sizing_request_keywords_inner_t *ad_group_audience_sizing_request_keywords_inner);

#endif /* _ad_group_audience_sizing_request_keywords_inner_H_ */

