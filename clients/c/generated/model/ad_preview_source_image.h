/*
 * ad_preview_source_image.h
 *
 * Ad preview source from an image URL.
 */

#ifndef _ad_preview_source_image_H_
#define _ad_preview_source_image_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ad_preview_source_image_t ad_preview_source_image_t;




typedef struct ad_preview_source_image_t {
    char *image_url; // string
    char *promotion_id; // string
    char *title; // string

    int _library_owned; // Is the library responsible for freeing this object?
} ad_preview_source_image_t;

__attribute__((deprecated)) ad_preview_source_image_t *ad_preview_source_image_create(
    char *image_url,
    char *promotion_id,
    char *title
);

void ad_preview_source_image_free(ad_preview_source_image_t *ad_preview_source_image);

ad_preview_source_image_t *ad_preview_source_image_parseFromJSON(cJSON *ad_preview_source_imageJSON);

cJSON *ad_preview_source_image_convertToJSON(ad_preview_source_image_t *ad_preview_source_image);

#endif /* _ad_preview_source_image_H_ */

