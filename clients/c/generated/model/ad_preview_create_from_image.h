/*
 * ad_preview_create_from_image.h
 *
 * 
 */

#ifndef _ad_preview_create_from_image_H_
#define _ad_preview_create_from_image_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ad_preview_create_from_image_t ad_preview_create_from_image_t;




typedef struct ad_preview_create_from_image_t {
    char *image_url; // string
    char *title; // string

} ad_preview_create_from_image_t;

ad_preview_create_from_image_t *ad_preview_create_from_image_create(
    char *image_url,
    char *title
);

void ad_preview_create_from_image_free(ad_preview_create_from_image_t *ad_preview_create_from_image);

ad_preview_create_from_image_t *ad_preview_create_from_image_parseFromJSON(cJSON *ad_preview_create_from_imageJSON);

cJSON *ad_preview_create_from_image_convertToJSON(ad_preview_create_from_image_t *ad_preview_create_from_image);

#endif /* _ad_preview_create_from_image_H_ */

