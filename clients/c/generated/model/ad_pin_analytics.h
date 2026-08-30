/*
 * ad_pin_analytics.h
 *
 * 
 */

#ifndef _ad_pin_analytics_H_
#define _ad_pin_analytics_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ad_pin_analytics_t ad_pin_analytics_t;




typedef struct ad_pin_analytics_t {
    char *date; //date
    char *pin_id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} ad_pin_analytics_t;

__attribute__((deprecated)) ad_pin_analytics_t *ad_pin_analytics_create(
    char *date,
    char *pin_id
);

void ad_pin_analytics_free(ad_pin_analytics_t *ad_pin_analytics);

ad_pin_analytics_t *ad_pin_analytics_parseFromJSON(cJSON *ad_pin_analyticsJSON);

cJSON *ad_pin_analytics_convertToJSON(ad_pin_analytics_t *ad_pin_analytics);

#endif /* _ad_pin_analytics_H_ */

