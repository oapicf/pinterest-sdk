/*
 * pin_media_with_image.h
 *
 * Pin with image.
 */

#ifndef _pin_media_with_image_H_
#define _pin_media_with_image_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pin_media_with_image_t pin_media_with_image_t;

#include "image_metadata_images.h"
#include "pin_media.h"



typedef struct pin_media_with_image_t {
    char *media_type; // string
    struct image_metadata_images_t *images; //model

} pin_media_with_image_t;

pin_media_with_image_t *pin_media_with_image_create(
    char *media_type,
    image_metadata_images_t *images
);

void pin_media_with_image_free(pin_media_with_image_t *pin_media_with_image);

pin_media_with_image_t *pin_media_with_image_parseFromJSON(cJSON *pin_media_with_imageJSON);

cJSON *pin_media_with_image_convertToJSON(pin_media_with_image_t *pin_media_with_image);

#endif /* _pin_media_with_image_H_ */

