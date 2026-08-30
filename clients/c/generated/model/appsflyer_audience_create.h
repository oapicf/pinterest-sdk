/*
 * appsflyer_audience_create.h
 *
 * Resource create operation model.
 */

#ifndef _appsflyer_audience_create_H_
#define _appsflyer_audience_create_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct appsflyer_audience_create_t appsflyer_audience_create_t;

#include "appsflyer_platform.h"



typedef struct appsflyer_audience_create_t {
    char *name; // string
    appsflyer_platform_t *platform; // custom

    int _library_owned; // Is the library responsible for freeing this object?
} appsflyer_audience_create_t;

__attribute__((deprecated)) appsflyer_audience_create_t *appsflyer_audience_create_create(
    char *name,
    appsflyer_platform_t *platform
);

void appsflyer_audience_create_free(appsflyer_audience_create_t *appsflyer_audience_create);

appsflyer_audience_create_t *appsflyer_audience_create_parseFromJSON(cJSON *appsflyer_audience_createJSON);

cJSON *appsflyer_audience_create_convertToJSON(appsflyer_audience_create_t *appsflyer_audience_create);

#endif /* _appsflyer_audience_create_H_ */

