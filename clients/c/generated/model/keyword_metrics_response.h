/*
 * keyword_metrics_response.h
 *
 * 
 */

#ifndef _keyword_metrics_response_H_
#define _keyword_metrics_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct keyword_metrics_response_t keyword_metrics_response_t;

#include "keyword_metrics.h"



typedef struct keyword_metrics_response_t {
    char *keyword; // string
    struct keyword_metrics_t *metrics; //model

} keyword_metrics_response_t;

keyword_metrics_response_t *keyword_metrics_response_create(
    char *keyword,
    keyword_metrics_t *metrics
);

void keyword_metrics_response_free(keyword_metrics_response_t *keyword_metrics_response);

keyword_metrics_response_t *keyword_metrics_response_parseFromJSON(cJSON *keyword_metrics_responseJSON);

cJSON *keyword_metrics_response_convertToJSON(keyword_metrics_response_t *keyword_metrics_response);

#endif /* _keyword_metrics_response_H_ */

