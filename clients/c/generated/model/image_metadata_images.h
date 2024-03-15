/*
 * image_metadata_images.h
 *
 * 
 */

#ifndef _image_metadata_images_H_
#define _image_metadata_images_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct image_metadata_images_t image_metadata_images_t;

#include "image_details.h"



typedef struct image_metadata_images_t {
    image_details_t *_150x150; //object
    image_details_t *_400x300; //object
    image_details_t *_600x; //object
    image_details_t *_1200x; //object

} image_metadata_images_t;

image_metadata_images_t *image_metadata_images_create(
    image_details_t *_150x150,
    image_details_t *_400x300,
    image_details_t *_600x,
    image_details_t *_1200x
);

void image_metadata_images_free(image_metadata_images_t *image_metadata_images);

image_metadata_images_t *image_metadata_images_parseFromJSON(cJSON *image_metadata_imagesJSON);

cJSON *image_metadata_images_convertToJSON(image_metadata_images_t *image_metadata_images);

#endif /* _image_metadata_images_H_ */

