/*
 * pin_media_with_images.h
 *
 * Pin with multiple images.
 */

#ifndef _pin_media_with_images_H_
#define _pin_media_with_images_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pin_media_with_images_t pin_media_with_images_t;

#include "image_metadata.h"
#include "pin_media.h"



typedef struct pin_media_with_images_t {
    char *media_type; // string
    list_t *items; //nonprimitive container

} pin_media_with_images_t;

pin_media_with_images_t *pin_media_with_images_create(
    char *media_type,
    list_t *items
);

void pin_media_with_images_free(pin_media_with_images_t *pin_media_with_images);

pin_media_with_images_t *pin_media_with_images_parseFromJSON(cJSON *pin_media_with_imagesJSON);

cJSON *pin_media_with_images_convertToJSON(pin_media_with_images_t *pin_media_with_images);

#endif /* _pin_media_with_images_H_ */

