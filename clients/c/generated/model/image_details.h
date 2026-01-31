/*
 * image_details.h
 *
 * 
 */

#ifndef _image_details_H_
#define _image_details_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct image_details_t image_details_t;




typedef struct image_details_t {
    int height; //numeric
    char *url; // string
    int width; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} image_details_t;

__attribute__((deprecated)) image_details_t *image_details_create(
    int height,
    char *url,
    int width
);

void image_details_free(image_details_t *image_details);

image_details_t *image_details_parseFromJSON(cJSON *image_detailsJSON);

cJSON *image_details_convertToJSON(image_details_t *image_details);

#endif /* _image_details_H_ */

