/*
 * catalogs_list_200_response.h
 *
 * 
 */

#ifndef _catalogs_list_200_response_H_
#define _catalogs_list_200_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_list_200_response_t catalogs_list_200_response_t;

#include "catalog.h"



typedef struct catalogs_list_200_response_t {
    list_t *items; //nonprimitive container
    char *bookmark; // string

} catalogs_list_200_response_t;

catalogs_list_200_response_t *catalogs_list_200_response_create(
    list_t *items,
    char *bookmark
);

void catalogs_list_200_response_free(catalogs_list_200_response_t *catalogs_list_200_response);

catalogs_list_200_response_t *catalogs_list_200_response_parseFromJSON(cJSON *catalogs_list_200_responseJSON);

cJSON *catalogs_list_200_response_convertToJSON(catalogs_list_200_response_t *catalogs_list_200_response);

#endif /* _catalogs_list_200_response_H_ */

