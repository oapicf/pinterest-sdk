/*
 * ads_analytics_response_inner.h
 *
 * 
 */

#ifndef _ads_analytics_response_inner_H_
#define _ads_analytics_response_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ads_analytics_response_inner_t ads_analytics_response_inner_t;

#include "any_type.h"



typedef struct ads_analytics_response_inner_t {
    char *ad_id; // string
    char *date; //date

} ads_analytics_response_inner_t;

ads_analytics_response_inner_t *ads_analytics_response_inner_create(
    char *ad_id,
    char *date
);

void ads_analytics_response_inner_free(ads_analytics_response_inner_t *ads_analytics_response_inner);

ads_analytics_response_inner_t *ads_analytics_response_inner_parseFromJSON(cJSON *ads_analytics_response_innerJSON);

cJSON *ads_analytics_response_inner_convertToJSON(ads_analytics_response_inner_t *ads_analytics_response_inner);

#endif /* _ads_analytics_response_inner_H_ */

