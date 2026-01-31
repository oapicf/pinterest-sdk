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

#include "image_size.h"

// Enum MEDIATYPE for pin_media_with_image

typedef enum  { pinterest_rest_api_pin_media_with_image_MEDIATYPE_NULL = 0, pinterest_rest_api_pin_media_with_image_MEDIATYPE_image } pinterest_rest_api_pin_media_with_image_MEDIATYPE_e;

char* pin_media_with_image_media_type_ToString(pinterest_rest_api_pin_media_with_image_MEDIATYPE_e media_type);

pinterest_rest_api_pin_media_with_image_MEDIATYPE_e pin_media_with_image_media_type_FromString(char* media_type);



typedef struct pin_media_with_image_t {
    struct image_size_t *images; //model
    pinterest_rest_api_pin_media_with_image_MEDIATYPE_e media_type; //enum

    int _library_owned; // Is the library responsible for freeing this object?
} pin_media_with_image_t;

__attribute__((deprecated)) pin_media_with_image_t *pin_media_with_image_create(
    image_size_t *images,
    pinterest_rest_api_pin_media_with_image_MEDIATYPE_e media_type
);

void pin_media_with_image_free(pin_media_with_image_t *pin_media_with_image);

pin_media_with_image_t *pin_media_with_image_parseFromJSON(cJSON *pin_media_with_imageJSON);

cJSON *pin_media_with_image_convertToJSON(pin_media_with_image_t *pin_media_with_image);

#endif /* _pin_media_with_image_H_ */

