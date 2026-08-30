/*
 * bulk_download.h
 *
 * Ad entities to get in bulk request.
 */

#ifndef _bulk_download_H_
#define _bulk_download_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct bulk_download_t bulk_download_t;




typedef struct bulk_download_t {
    char *request_id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} bulk_download_t;

__attribute__((deprecated)) bulk_download_t *bulk_download_create(
    char *request_id
);

void bulk_download_free(bulk_download_t *bulk_download);

bulk_download_t *bulk_download_parseFromJSON(cJSON *bulk_downloadJSON);

cJSON *bulk_download_convertToJSON(bulk_download_t *bulk_download);

#endif /* _bulk_download_H_ */

