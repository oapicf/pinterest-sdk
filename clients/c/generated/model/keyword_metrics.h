/*
 * keyword_metrics.h
 *
 * Keyword metrics JSON
 */

#ifndef _keyword_metrics_H_
#define _keyword_metrics_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct keyword_metrics_t keyword_metrics_t;




typedef struct keyword_metrics_t {
    double avg_cpc_in_micro_currency; //numeric
    char *keyword_query_volume; // string

} keyword_metrics_t;

keyword_metrics_t *keyword_metrics_create(
    double avg_cpc_in_micro_currency,
    char *keyword_query_volume
);

void keyword_metrics_free(keyword_metrics_t *keyword_metrics);

keyword_metrics_t *keyword_metrics_parseFromJSON(cJSON *keyword_metricsJSON);

cJSON *keyword_metrics_convertToJSON(keyword_metrics_t *keyword_metrics);

#endif /* _keyword_metrics_H_ */

