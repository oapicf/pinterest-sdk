/*
 * integrations_get_list_200_response.h
 *
 * 
 */

#ifndef _integrations_get_list_200_response_H_
#define _integrations_get_list_200_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct integrations_get_list_200_response_t integrations_get_list_200_response_t;

#include "integration_record.h"



typedef struct integrations_get_list_200_response_t {
    list_t *items; //nonprimitive container
    char *bookmark; // string

} integrations_get_list_200_response_t;

integrations_get_list_200_response_t *integrations_get_list_200_response_create(
    list_t *items,
    char *bookmark
);

void integrations_get_list_200_response_free(integrations_get_list_200_response_t *integrations_get_list_200_response);

integrations_get_list_200_response_t *integrations_get_list_200_response_parseFromJSON(cJSON *integrations_get_list_200_responseJSON);

cJSON *integrations_get_list_200_response_convertToJSON(integrations_get_list_200_response_t *integrations_get_list_200_response);

#endif /* _integrations_get_list_200_response_H_ */

