/*
 * items_issues_list_200_response.h
 *
 * 
 */

#ifndef _items_issues_list_200_response_H_
#define _items_issues_list_200_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct items_issues_list_200_response_t items_issues_list_200_response_t;

#include "catalogs_item_validation_issues.h"



typedef struct items_issues_list_200_response_t {
    list_t *items; //nonprimitive container
    char *bookmark; // string

} items_issues_list_200_response_t;

items_issues_list_200_response_t *items_issues_list_200_response_create(
    list_t *items,
    char *bookmark
);

void items_issues_list_200_response_free(items_issues_list_200_response_t *items_issues_list_200_response);

items_issues_list_200_response_t *items_issues_list_200_response_parseFromJSON(cJSON *items_issues_list_200_responseJSON);

cJSON *items_issues_list_200_response_convertToJSON(items_issues_list_200_response_t *items_issues_list_200_response);

#endif /* _items_issues_list_200_response_H_ */

