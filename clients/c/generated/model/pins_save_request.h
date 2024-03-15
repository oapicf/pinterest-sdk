/*
 * pins_save_request.h
 *
 * 
 */

#ifndef _pins_save_request_H_
#define _pins_save_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pins_save_request_t pins_save_request_t;




typedef struct pins_save_request_t {
    char *board_id; // string
    char *board_section_id; // string

} pins_save_request_t;

pins_save_request_t *pins_save_request_create(
    char *board_id,
    char *board_section_id
);

void pins_save_request_free(pins_save_request_t *pins_save_request);

pins_save_request_t *pins_save_request_parseFromJSON(cJSON *pins_save_requestJSON);

cJSON *pins_save_request_convertToJSON(pins_save_request_t *pins_save_request);

#endif /* _pins_save_request_H_ */

