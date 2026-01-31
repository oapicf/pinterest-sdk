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

// Enum MEDIATYPE for pin_media_with_images

typedef enum  { pinterest_rest_api_pin_media_with_images_MEDIATYPE_NULL = 0, pinterest_rest_api_pin_media_with_images_MEDIATYPE_multiple_images } pinterest_rest_api_pin_media_with_images_MEDIATYPE_e;

char* pin_media_with_images_media_type_ToString(pinterest_rest_api_pin_media_with_images_MEDIATYPE_e media_type);

pinterest_rest_api_pin_media_with_images_MEDIATYPE_e pin_media_with_images_media_type_FromString(char* media_type);



typedef struct pin_media_with_images_t {
    list_t *items; //nonprimitive container
    pinterest_rest_api_pin_media_with_images_MEDIATYPE_e media_type; //enum

    int _library_owned; // Is the library responsible for freeing this object?
} pin_media_with_images_t;

__attribute__((deprecated)) pin_media_with_images_t *pin_media_with_images_create(
    list_t *items,
    pinterest_rest_api_pin_media_with_images_MEDIATYPE_e media_type
);

void pin_media_with_images_free(pin_media_with_images_t *pin_media_with_images);

pin_media_with_images_t *pin_media_with_images_parseFromJSON(cJSON *pin_media_with_imagesJSON);

cJSON *pin_media_with_images_convertToJSON(pin_media_with_images_t *pin_media_with_images);

#endif /* _pin_media_with_images_H_ */

