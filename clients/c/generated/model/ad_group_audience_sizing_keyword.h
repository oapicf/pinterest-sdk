/*
 * ad_group_audience_sizing_keyword.h
 *
 * 
 */

#ifndef _ad_group_audience_sizing_keyword_H_
#define _ad_group_audience_sizing_keyword_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ad_group_audience_sizing_keyword_t ad_group_audience_sizing_keyword_t;

#include "match_type.h"



typedef struct ad_group_audience_sizing_keyword_t {
    pinterest_rest_api_match_type__e match_type; //referenced enum
    char *value; // string

    int _library_owned; // Is the library responsible for freeing this object?
} ad_group_audience_sizing_keyword_t;

__attribute__((deprecated)) ad_group_audience_sizing_keyword_t *ad_group_audience_sizing_keyword_create(
    pinterest_rest_api_match_type__e match_type,
    char *value
);

void ad_group_audience_sizing_keyword_free(ad_group_audience_sizing_keyword_t *ad_group_audience_sizing_keyword);

ad_group_audience_sizing_keyword_t *ad_group_audience_sizing_keyword_parseFromJSON(cJSON *ad_group_audience_sizing_keywordJSON);

cJSON *ad_group_audience_sizing_keyword_convertToJSON(ad_group_audience_sizing_keyword_t *ad_group_audience_sizing_keyword);

#endif /* _ad_group_audience_sizing_keyword_H_ */

