/*
 * media_upload_status.h
 *
 * Media upload status
 */

#ifndef _media_upload_status_H_
#define _media_upload_status_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct media_upload_status_t media_upload_status_t;


// Enum  for media_upload_status

typedef enum { pinterest_rest_api_media_upload_status__NULL = 0, pinterest_rest_api_media_upload_status__registered, pinterest_rest_api_media_upload_status__processing, pinterest_rest_api_media_upload_status__succeeded, pinterest_rest_api_media_upload_status__failed } pinterest_rest_api_media_upload_status__e;

char* media_upload_status_media_upload_status_ToString(pinterest_rest_api_media_upload_status__e media_upload_status);

pinterest_rest_api_media_upload_status__e media_upload_status_media_upload_status_FromString(char* media_upload_status);

//cJSON *media_upload_status_media_upload_status_convertToJSON(pinterest_rest_api_media_upload_status__e media_upload_status);

//pinterest_rest_api_media_upload_status__e media_upload_status_media_upload_status_parseFromJSON(cJSON *media_upload_statusJSON);

#endif /* _media_upload_status_H_ */

