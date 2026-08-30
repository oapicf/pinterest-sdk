/*
 * ads_analytics.h
 *
 * 
 */

#ifndef _ads_analytics_H_
#define _ads_analytics_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ads_analytics_t ads_analytics_t;




typedef struct ads_analytics_t {
    char *ad_id; // string
    char *date; //date

    int _library_owned; // Is the library responsible for freeing this object?
} ads_analytics_t;

__attribute__((deprecated)) ads_analytics_t *ads_analytics_create(
    char *ad_id,
    char *date
);

void ads_analytics_free(ads_analytics_t *ads_analytics);

ads_analytics_t *ads_analytics_parseFromJSON(cJSON *ads_analyticsJSON);

cJSON *ads_analytics_convertToJSON(ads_analytics_t *ads_analytics);

#endif /* _ads_analytics_H_ */

