/*
 * pin.h
 *
 * Pin
 */

#ifndef _pin_H_
#define _pin_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pin_t pin_t;

#include "board_owner.h"
#include "creative_type.h"
#include "object.h"
#include "pin_media_source.h"
#include "summary_pin_media.h"



typedef struct pin_t {
    char *id; // string
    char *created_at; //date time
    char *link; // string
    char *title; // string
    char *description; // string
    char *dominant_color; // string
    char *alt_text; // string
    creative_type_t *creative_type; // custom
    char *board_id; // string
    char *board_section_id; // string
    struct board_owner_t *board_owner; //model
    int is_owner; //boolean
    struct summary_pin_media_t *media; //model
    struct pin_media_source_t *media_source; //model
    char *parent_pin_id; // string
    int is_standard; //boolean
    int has_been_promoted; //boolean
    char *note; // string
    object_t *pin_metrics; //object

} pin_t;

pin_t *pin_create(
    char *id,
    char *created_at,
    char *link,
    char *title,
    char *description,
    char *dominant_color,
    char *alt_text,
    creative_type_t *creative_type,
    char *board_id,
    char *board_section_id,
    board_owner_t *board_owner,
    int is_owner,
    summary_pin_media_t *media,
    pin_media_source_t *media_source,
    char *parent_pin_id,
    int is_standard,
    int has_been_promoted,
    char *note,
    object_t *pin_metrics
);

void pin_free(pin_t *pin);

pin_t *pin_parseFromJSON(cJSON *pinJSON);

cJSON *pin_convertToJSON(pin_t *pin);

#endif /* _pin_H_ */

