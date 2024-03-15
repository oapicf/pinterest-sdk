/*
 * ad_preview_request.h
 *
 * 
 */

#ifndef _ad_preview_request_H_
#define _ad_preview_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ad_preview_request_t ad_preview_request_t;

#include "ad_preview_create_from_image.h"
#include "ad_preview_create_from_pin.h"



typedef struct ad_preview_request_t {
    char *image_url; // string
    char *title; // string
    char *pin_id; // string

} ad_preview_request_t;

ad_preview_request_t *ad_preview_request_create(
    char *image_url,
    char *title,
    char *pin_id
);

void ad_preview_request_free(ad_preview_request_t *ad_preview_request);

ad_preview_request_t *ad_preview_request_parseFromJSON(cJSON *ad_preview_requestJSON);

cJSON *ad_preview_request_convertToJSON(ad_preview_request_t *ad_preview_request);

#endif /* _ad_preview_request_H_ */

