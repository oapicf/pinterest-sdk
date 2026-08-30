/*
 * targeting_template_list_200_response.h
 *
 * 
 */

#ifndef _targeting_template_list_200_response_H_
#define _targeting_template_list_200_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct targeting_template_list_200_response_t targeting_template_list_200_response_t;

#include "targeting_template.h"



typedef struct targeting_template_list_200_response_t {
    char *bookmark; // string
    list_t *items; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} targeting_template_list_200_response_t;

__attribute__((deprecated)) targeting_template_list_200_response_t *targeting_template_list_200_response_create(
    char *bookmark,
    list_t *items
);

void targeting_template_list_200_response_free(targeting_template_list_200_response_t *targeting_template_list_200_response);

targeting_template_list_200_response_t *targeting_template_list_200_response_parseFromJSON(cJSON *targeting_template_list_200_responseJSON);

cJSON *targeting_template_list_200_response_convertToJSON(targeting_template_list_200_response_t *targeting_template_list_200_response);

#endif /* _targeting_template_list_200_response_H_ */

