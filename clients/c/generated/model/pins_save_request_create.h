/*
 * pins_save_request_create.h
 *
 * Resource create operation model.
 */

#ifndef _pins_save_request_create_H_
#define _pins_save_request_create_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pins_save_request_create_t pins_save_request_create_t;




typedef struct pins_save_request_create_t {
    char *board_id; // string
    char *board_section_id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} pins_save_request_create_t;

__attribute__((deprecated)) pins_save_request_create_t *pins_save_request_create_create(
    char *board_id,
    char *board_section_id
);

void pins_save_request_create_free(pins_save_request_create_t *pins_save_request_create);

pins_save_request_create_t *pins_save_request_create_parseFromJSON(cJSON *pins_save_request_createJSON);

cJSON *pins_save_request_create_convertToJSON(pins_save_request_create_t *pins_save_request_create);

#endif /* _pins_save_request_create_H_ */

