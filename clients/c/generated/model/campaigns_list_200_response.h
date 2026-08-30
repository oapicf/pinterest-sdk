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

#include "campaign.h"



typedef struct campaigns_list_200_response_t {
    char *bookmark; // string
    list_t *items; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} campaigns_list_200_response_t;

__attribute__((deprecated)) campaigns_list_200_response_t *campaigns_list_200_response_create(
    char *bookmark,
    list_t *items
);

void campaigns_list_200_response_free(campaigns_list_200_response_t *campaigns_list_200_response);

campaigns_list_200_response_t *campaigns_list_200_response_parseFromJSON(cJSON *campaigns_list_200_responseJSON);

cJSON *campaigns_list_200_response_convertToJSON(campaigns_list_200_response_t *campaigns_list_200_response);

#endif /* _campaigns_list_200_response_H_ */

