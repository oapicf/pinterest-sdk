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

#include "targeting_template_response_data.h"



typedef struct targeting_template_list_200_response_t {
    list_t *items; //nonprimitive container
    char *bookmark; // string

} targeting_template_list_200_response_t;

targeting_template_list_200_response_t *targeting_template_list_200_response_create(
    list_t *items,
    char *bookmark
);

void targeting_template_list_200_response_free(targeting_template_list_200_response_t *targeting_template_list_200_response);

targeting_template_list_200_response_t *targeting_template_list_200_response_parseFromJSON(cJSON *targeting_template_list_200_responseJSON);

cJSON *targeting_template_list_200_response_convertToJSON(targeting_template_list_200_response_t *targeting_template_list_200_response);

#endif /* _targeting_template_list_200_response_H_ */

