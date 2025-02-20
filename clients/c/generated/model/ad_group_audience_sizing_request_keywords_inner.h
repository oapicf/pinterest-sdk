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

// Enum  for ad_group_audience_sizing_request_keywords_inner

typedef enum  { pinterest_rest_api_ad_group_audience_sizing_request_keywords_inner__NULL = 0, pinterest_rest_api_ad_group_audience_sizing_request_keywords_inner__BROAD, pinterest_rest_api_ad_group_audience_sizing_request_keywords_inner__PHRASE, pinterest_rest_api_ad_group_audience_sizing_request_keywords_inner__EXACT, pinterest_rest_api_ad_group_audience_sizing_request_keywords_inner__EXACT_NEGATIVE, pinterest_rest_api_ad_group_audience_sizing_request_keywords_inner__PHRASE_NEGATIVE } pinterest_rest_api_ad_group_audience_sizing_request_keywords_inner__e;

char* ad_group_audience_sizing_request_keywords_inner_match_type_ToString(pinterest_rest_api_ad_group_audience_sizing_request_keywords_inner__e match_type);

pinterest_rest_api_ad_group_audience_sizing_request_keywords_inner__e ad_group_audience_sizing_request_keywords_inner_match_type_FromString(char* match_type);



typedef struct ad_group_audience_sizing_request_keywords_inner_t {
    match_type_response_t *match_type; // custom
    char *value; // string

} ad_group_audience_sizing_request_keywords_inner_t;

ad_group_audience_sizing_request_keywords_inner_t *ad_group_audience_sizing_request_keywords_inner_create(
    match_type_response_t *match_type,
    char *value
);

void ad_group_audience_sizing_request_keywords_inner_free(ad_group_audience_sizing_request_keywords_inner_t *ad_group_audience_sizing_request_keywords_inner);

ad_group_audience_sizing_request_keywords_inner_t *ad_group_audience_sizing_request_keywords_inner_parseFromJSON(cJSON *ad_group_audience_sizing_request_keywords_innerJSON);

cJSON *ad_group_audience_sizing_request_keywords_inner_convertToJSON(ad_group_audience_sizing_request_keywords_inner_t *ad_group_audience_sizing_request_keywords_inner);

#endif /* _ad_group_audience_sizing_request_keywords_inner_H_ */

