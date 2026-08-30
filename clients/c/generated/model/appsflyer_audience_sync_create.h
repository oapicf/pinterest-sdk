/*
 * appsflyer_audience_sync_create.h
 *
 * Resource create operation model.
 */

#ifndef _appsflyer_audience_sync_create_H_
#define _appsflyer_audience_sync_create_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct appsflyer_audience_sync_create_t appsflyer_audience_sync_create_t;




typedef struct appsflyer_audience_sync_create_t {
    char *container_id; // string
    char *url_adid_sha256; // string
    char *url_email_sha256; // string

    int _library_owned; // Is the library responsible for freeing this object?
} appsflyer_audience_sync_create_t;

__attribute__((deprecated)) appsflyer_audience_sync_create_t *appsflyer_audience_sync_create_create(
    char *container_id,
    char *url_adid_sha256,
    char *url_email_sha256
);

void appsflyer_audience_sync_create_free(appsflyer_audience_sync_create_t *appsflyer_audience_sync_create);

appsflyer_audience_sync_create_t *appsflyer_audience_sync_create_parseFromJSON(cJSON *appsflyer_audience_sync_createJSON);

cJSON *appsflyer_audience_sync_create_convertToJSON(appsflyer_audience_sync_create_t *appsflyer_audience_sync_create);

#endif /* _appsflyer_audience_sync_create_H_ */

