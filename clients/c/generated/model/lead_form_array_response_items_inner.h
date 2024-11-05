/*
 * lead_form_array_response_items_inner.h
 *
 * 
 */

#ifndef _lead_form_array_response_items_inner_H_
#define _lead_form_array_response_items_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct lead_form_array_response_items_inner_t lead_form_array_response_items_inner_t;

#include "exception.h"
#include "lead_form_response.h"



typedef struct lead_form_array_response_items_inner_t {
    struct lead_form_response_t *data; //model
    list_t *exceptions; //nonprimitive container

} lead_form_array_response_items_inner_t;

lead_form_array_response_items_inner_t *lead_form_array_response_items_inner_create(
    lead_form_response_t *data,
    list_t *exceptions
);

void lead_form_array_response_items_inner_free(lead_form_array_response_items_inner_t *lead_form_array_response_items_inner);

lead_form_array_response_items_inner_t *lead_form_array_response_items_inner_parseFromJSON(cJSON *lead_form_array_response_items_innerJSON);

cJSON *lead_form_array_response_items_inner_convertToJSON(lead_form_array_response_items_inner_t *lead_form_array_response_items_inner);

#endif /* _lead_form_array_response_items_inner_H_ */

