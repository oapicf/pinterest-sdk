/*
 * templates_list_200_response.h
 *
 * 
 */

#ifndef _templates_list_200_response_H_
#define _templates_list_200_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct templates_list_200_response_t templates_list_200_response_t;

#include "template_response.h"



typedef struct templates_list_200_response_t {
    list_t *items; //nonprimitive container
    char *bookmark; // string

} templates_list_200_response_t;

templates_list_200_response_t *templates_list_200_response_create(
    list_t *items,
    char *bookmark
);

void templates_list_200_response_free(templates_list_200_response_t *templates_list_200_response);

templates_list_200_response_t *templates_list_200_response_parseFromJSON(cJSON *templates_list_200_responseJSON);

cJSON *templates_list_200_response_convertToJSON(templates_list_200_response_t *templates_list_200_response);

#endif /* _templates_list_200_response_H_ */

