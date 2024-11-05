/*
 * pin_create.h
 *
 * Pin
 */

#ifndef _pin_create_H_
#define _pin_create_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pin_create_t pin_create_t;

#include "board_owner.h"
#include "pin_media.h"
#include "pin_media_source.h"



typedef struct pin_create_t {
    char *id; // string
    char *created_at; //date time
    char *link; // string
    char *title; // string
    char *description; // string
    char *dominant_color; // string
    char *alt_text; // string
    char *board_id; // string
    char *board_section_id; // string
    struct board_owner_t *board_owner; //model
    struct pin_media_t *media; //model
    struct pin_media_source_t *media_source; //model
    char *parent_pin_id; // string
    char *note; // string

} pin_create_t;

pin_create_t *pin_create_create(
    char *id,
    char *created_at,
    char *link,
    char *title,
    char *description,
    char *dominant_color,
    char *alt_text,
    char *board_id,
    char *board_section_id,
    board_owner_t *board_owner,
    pin_media_t *media,
    pin_media_source_t *media_source,
    char *parent_pin_id,
    char *note
);

void pin_create_free(pin_create_t *pin_create);

pin_create_t *pin_create_parseFromJSON(cJSON *pin_createJSON);

cJSON *pin_create_convertToJSON(pin_create_t *pin_create);

#endif /* _pin_create_H_ */

