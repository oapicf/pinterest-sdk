/*
 * media_upload_create.h
 *
 * Resource create operation model.
 */

#ifndef _media_upload_create_H_
#define _media_upload_create_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct media_upload_create_t media_upload_create_t;

#include "media_upload_type.h"



typedef struct media_upload_create_t {
    media_upload_type_t *media_type; // custom

    int _library_owned; // Is the library responsible for freeing this object?
} media_upload_create_t;

__attribute__((deprecated)) media_upload_create_t *media_upload_create_create(
    media_upload_type_t *media_type
);

void media_upload_create_free(media_upload_create_t *media_upload_create);

media_upload_create_t *media_upload_create_parseFromJSON(cJSON *media_upload_createJSON);

cJSON *media_upload_create_convertToJSON(media_upload_create_t *media_upload_create);

#endif /* _media_upload_create_H_ */

