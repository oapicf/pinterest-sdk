/*
 * campaigns_list_200_response.h
 *
 * 
 */

#ifndef _campaigns_list_200_response_H_
#define _campaigns_list_200_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct campaigns_list_200_response_t campaigns_list_200_response_t;

#include "campaign_response.h"



typedef struct campaigns_list_200_response_t {
    list_t *items; //nonprimitive container
    char *bookmark; // string

} campaigns_list_200_response_t;

campaigns_list_200_response_t *campaigns_list_200_response_create(
    list_t *items,
    char *bookmark
);

void campaigns_list_200_response_free(campaigns_list_200_response_t *campaigns_list_200_response);

campaigns_list_200_response_t *campaigns_list_200_response_parseFromJSON(cJSON *campaigns_list_200_responseJSON);

cJSON *campaigns_list_200_response_convertToJSON(campaigns_list_200_response_t *campaigns_list_200_response);

#endif /* _campaigns_list_200_response_H_ */

