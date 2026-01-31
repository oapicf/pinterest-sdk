/*
 * media.h
 *
 * 
 */

#ifndef _media_H_
#define _media_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct media_t media_t;

#include "media_upload_status.h"
#include "media_upload_type.h"



typedef struct media_t {
    char *media_id; // string
    media_upload_type_t *media_type; // custom
    media_upload_status_t *status; // custom

    int _library_owned; // Is the library responsible for freeing this object?
} media_t;

__attribute__((deprecated)) media_t *media_create(
    char *media_id,
    media_upload_type_t *media_type,
    media_upload_status_t *status
);

void media_free(media_t *media);

media_t *media_parseFromJSON(cJSON *mediaJSON);

cJSON *media_convertToJSON(media_t *media);

#endif /* _media_H_ */

