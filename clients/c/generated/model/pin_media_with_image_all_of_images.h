/*
 * pin_media_with_image_all_of_images.h
 *
 * 
 */

#ifndef _pin_media_with_image_all_of_images_H_
#define _pin_media_with_image_all_of_images_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pin_media_with_image_all_of_images_t pin_media_with_image_all_of_images_t;

#include "object.h"



typedef struct pin_media_with_image_all_of_images_t {
    object_t *_150x150; //object
    object_t *_400x300; //object
    object_t *_600x; //object
    object_t *_1200x; //object

} pin_media_with_image_all_of_images_t;

pin_media_with_image_all_of_images_t *pin_media_with_image_all_of_images_create(
    object_t *_150x150,
    object_t *_400x300,
    object_t *_600x,
    object_t *_1200x
);

void pin_media_with_image_all_of_images_free(pin_media_with_image_all_of_images_t *pin_media_with_image_all_of_images);

pin_media_with_image_all_of_images_t *pin_media_with_image_all_of_images_parseFromJSON(cJSON *pin_media_with_image_all_of_imagesJSON);

cJSON *pin_media_with_image_all_of_images_convertToJSON(pin_media_with_image_all_of_images_t *pin_media_with_image_all_of_images);

#endif /* _pin_media_with_image_all_of_images_H_ */

