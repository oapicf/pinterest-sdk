/*
 * media_upload.h
 *
 * Media upload that has been registered but not uploaded/processed yet.
 */

#ifndef _media_upload_H_
#define _media_upload_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct media_upload_t media_upload_t;

#include "media_upload_all_of_upload_parameters.h"
#include "media_upload_type.h"



typedef struct media_upload_t {
    char *media_id; // string
    media_upload_type_t *media_type; // custom
    char *upload_url; // string
    struct media_upload_all_of_upload_parameters_t *upload_parameters; //model

} media_upload_t;

media_upload_t *media_upload_create(
    char *media_id,
    media_upload_type_t *media_type,
    char *upload_url,
    media_upload_all_of_upload_parameters_t *upload_parameters
);

void media_upload_free(media_upload_t *media_upload);

media_upload_t *media_upload_parseFromJSON(cJSON *media_uploadJSON);

cJSON *media_upload_convertToJSON(media_upload_t *media_upload);

#endif /* _media_upload_H_ */

