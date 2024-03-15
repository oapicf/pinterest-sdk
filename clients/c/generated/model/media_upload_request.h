/*
 * media_upload_request.h
 *
 * Media upload request
 */

#ifndef _media_upload_request_H_
#define _media_upload_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct media_upload_request_t media_upload_request_t;

#include "media_upload_type.h"



typedef struct media_upload_request_t {
    media_upload_type_t *media_type; // custom

} media_upload_request_t;

media_upload_request_t *media_upload_request_create(
    media_upload_type_t *media_type
);

void media_upload_request_free(media_upload_request_t *media_upload_request);

media_upload_request_t *media_upload_request_parseFromJSON(cJSON *media_upload_requestJSON);

cJSON *media_upload_request_convertToJSON(media_upload_request_t *media_upload_request);

#endif /* _media_upload_request_H_ */

