/*
 * bulk_download_response.h
 *
 * 
 */

#ifndef _bulk_download_response_H_
#define _bulk_download_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct bulk_download_response_t bulk_download_response_t;




typedef struct bulk_download_response_t {
    char *request_id; // string

} bulk_download_response_t;

bulk_download_response_t *bulk_download_response_create(
    char *request_id
);

void bulk_download_response_free(bulk_download_response_t *bulk_download_response);

bulk_download_response_t *bulk_download_response_parseFromJSON(cJSON *bulk_download_responseJSON);

cJSON *bulk_download_response_convertToJSON(bulk_download_response_t *bulk_download_response);

#endif /* _bulk_download_response_H_ */

