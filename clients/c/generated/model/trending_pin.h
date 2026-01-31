/*
 * trending_pin.h
 *
 * Pin image data for trending topics
 */

#ifndef _trending_pin_H_
#define _trending_pin_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct trending_pin_t trending_pin_t;




typedef struct trending_pin_t {
    int height; //numeric
    char *id; // string
    char *src; // string
    int width; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} trending_pin_t;

__attribute__((deprecated)) trending_pin_t *trending_pin_create(
    int height,
    char *id,
    char *src,
    int width
);

void trending_pin_free(trending_pin_t *trending_pin);

trending_pin_t *trending_pin_parseFromJSON(cJSON *trending_pinJSON);

cJSON *trending_pin_convertToJSON(trending_pin_t *trending_pin);

#endif /* _trending_pin_H_ */

