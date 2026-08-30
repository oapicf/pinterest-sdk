/*
 * appsflyer_audience.h
 *
 * Request model for creating an AppsFlyer audience
 */

#ifndef _appsflyer_audience_H_
#define _appsflyer_audience_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct appsflyer_audience_t appsflyer_audience_t;

#include "appsflyer_platform.h"



typedef struct appsflyer_audience_t {
    char *container_id; // string
    char *name; // string
    appsflyer_platform_t *platform; // custom

    int _library_owned; // Is the library responsible for freeing this object?
} appsflyer_audience_t;

__attribute__((deprecated)) appsflyer_audience_t *appsflyer_audience_create(
    char *container_id,
    char *name,
    appsflyer_platform_t *platform
);

void appsflyer_audience_free(appsflyer_audience_t *appsflyer_audience);

appsflyer_audience_t *appsflyer_audience_parseFromJSON(cJSON *appsflyer_audienceJSON);

cJSON *appsflyer_audience_convertToJSON(appsflyer_audience_t *appsflyer_audience);

#endif /* _appsflyer_audience_H_ */

