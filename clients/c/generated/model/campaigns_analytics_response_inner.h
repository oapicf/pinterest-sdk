/*
 * campaigns_analytics_response_inner.h
 *
 * 
 */

#ifndef _campaigns_analytics_response_inner_H_
#define _campaigns_analytics_response_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct campaigns_analytics_response_inner_t campaigns_analytics_response_inner_t;

#include "any_type.h"



typedef struct campaigns_analytics_response_inner_t {
    char *campaign_id; // string
    char *date; //date

} campaigns_analytics_response_inner_t;

campaigns_analytics_response_inner_t *campaigns_analytics_response_inner_create(
    char *campaign_id,
    char *date
);

void campaigns_analytics_response_inner_free(campaigns_analytics_response_inner_t *campaigns_analytics_response_inner);

campaigns_analytics_response_inner_t *campaigns_analytics_response_inner_parseFromJSON(cJSON *campaigns_analytics_response_innerJSON);

cJSON *campaigns_analytics_response_inner_convertToJSON(campaigns_analytics_response_inner_t *campaigns_analytics_response_inner);

#endif /* _campaigns_analytics_response_inner_H_ */

