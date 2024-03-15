/*
 * media_upload_details.h
 *
 * Media upload details
 */

#ifndef _media_upload_details_H_
#define _media_upload_details_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct media_upload_details_t media_upload_details_t;

#include "media_upload_status.h"
#include "media_upload_type.h"



typedef struct media_upload_details_t {
    char *media_id; // string
    media_upload_type_t *media_type; // custom
    media_upload_status_t *status; // custom

} media_upload_details_t;

media_upload_details_t *media_upload_details_create(
    char *media_id,
    media_upload_type_t *media_type,
    media_upload_status_t *status
);

void media_upload_details_free(media_upload_details_t *media_upload_details);

media_upload_details_t *media_upload_details_parseFromJSON(cJSON *media_upload_detailsJSON);

cJSON *media_upload_details_convertToJSON(media_upload_details_t *media_upload_details);

#endif /* _media_upload_details_H_ */

