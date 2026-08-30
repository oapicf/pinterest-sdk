/*
 * advertiser_defined_event_input.h
 *
 * Advertiser defined event input for create/update operations
 */

#ifndef _advertiser_defined_event_input_H_
#define _advertiser_defined_event_input_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct advertiser_defined_event_input_t advertiser_defined_event_input_t;

#include "advertiser_defined_event_mapping_type.h"



typedef struct advertiser_defined_event_input_t {
    advertiser_defined_event_mapping_type_t *mapped_conversion_type; // custom
    char *name; // string

    int _library_owned; // Is the library responsible for freeing this object?
} advertiser_defined_event_input_t;

__attribute__((deprecated)) advertiser_defined_event_input_t *advertiser_defined_event_input_create(
    advertiser_defined_event_mapping_type_t *mapped_conversion_type,
    char *name
);

void advertiser_defined_event_input_free(advertiser_defined_event_input_t *advertiser_defined_event_input);

advertiser_defined_event_input_t *advertiser_defined_event_input_parseFromJSON(cJSON *advertiser_defined_event_inputJSON);

cJSON *advertiser_defined_event_input_convertToJSON(advertiser_defined_event_input_t *advertiser_defined_event_input);

#endif /* _advertiser_defined_event_input_H_ */

