/*
 * image_size.h
 *
 * 
 */

#ifndef _image_size_H_
#define _image_size_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct image_size_t image_size_t;

#include "image_details.h"



typedef struct image_size_t {
    struct image_details_t *_1200x; //model
    struct image_details_t *_150x150; //model
    struct image_details_t *_400x300; //model
    struct image_details_t *_600x; //model

    int _library_owned; // Is the library responsible for freeing this object?
} image_size_t;

__attribute__((deprecated)) image_size_t *image_size_create(
    image_details_t *_1200x,
    image_details_t *_150x150,
    image_details_t *_400x300,
    image_details_t *_600x
);

void image_size_free(image_size_t *image_size);

image_size_t *image_size_parseFromJSON(cJSON *image_sizeJSON);

cJSON *image_size_convertToJSON(image_size_t *image_size);

#endif /* _image_size_H_ */

