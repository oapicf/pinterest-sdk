/*
 * lead_form_array_response.h
 *
 * 
 */

#ifndef _lead_form_array_response_H_
#define _lead_form_array_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct lead_form_array_response_t lead_form_array_response_t;

#include "lead_form_array_response_items_inner.h"



typedef struct lead_form_array_response_t {
    list_t *items; //nonprimitive container

} lead_form_array_response_t;

lead_form_array_response_t *lead_form_array_response_create(
    list_t *items
);

void lead_form_array_response_free(lead_form_array_response_t *lead_form_array_response);

lead_form_array_response_t *lead_form_array_response_parseFromJSON(cJSON *lead_form_array_responseJSON);

cJSON *lead_form_array_response_convertToJSON(lead_form_array_response_t *lead_form_array_response);

#endif /* _lead_form_array_response_H_ */

