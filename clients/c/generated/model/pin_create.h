/*
 * pin_create.h
 *
 * Resource create operation model.
 */

#ifndef _pin_create_H_
#define _pin_create_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pin_create_t pin_create_t;

#include "pin_media_source.h"



typedef struct pin_create_t {
    char *alt_text; // string
    char *board_id; // string
    char *board_section_id; // string
    char *description; // string
    char *dominant_color; // string
    char *link; // string
    struct pin_media_source_t *media_source; //model
    char *parent_pin_id; // string
    char *sponsor_id; // string
    char *title; // string

    int _library_owned; // Is the library responsible for freeing this object?
} pin_create_t;

__attribute__((deprecated)) pin_create_t *pin_create_create(
    char *alt_text,
    char *board_id,
    char *board_section_id,
    char *description,
    char *dominant_color,
    char *link,
    pin_media_source_t *media_source,
    char *parent_pin_id,
    char *sponsor_id,
    char *title
);

void pin_create_free(pin_create_t *pin_create);

pin_create_t *pin_create_parseFromJSON(cJSON *pin_createJSON);

cJSON *pin_create_convertToJSON(pin_create_t *pin_create);

#endif /* _pin_create_H_ */

