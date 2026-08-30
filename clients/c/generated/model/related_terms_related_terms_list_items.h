/*
 * related_terms_related_terms_list_items.h
 *
 * 
 */

#ifndef _related_terms_related_terms_list_items_H_
#define _related_terms_related_terms_list_items_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct related_terms_related_terms_list_items_t related_terms_related_terms_list_items_t;




typedef struct related_terms_related_terms_list_items_t {
    list_t *related_terms; //primitive container
    char *term; // string

    int _library_owned; // Is the library responsible for freeing this object?
} related_terms_related_terms_list_items_t;

__attribute__((deprecated)) related_terms_related_terms_list_items_t *related_terms_related_terms_list_items_create(
    list_t *related_terms,
    char *term
);

void related_terms_related_terms_list_items_free(related_terms_related_terms_list_items_t *related_terms_related_terms_list_items);

related_terms_related_terms_list_items_t *related_terms_related_terms_list_items_parseFromJSON(cJSON *related_terms_related_terms_list_itemsJSON);

cJSON *related_terms_related_terms_list_items_convertToJSON(related_terms_related_terms_list_items_t *related_terms_related_terms_list_items);

#endif /* _related_terms_related_terms_list_items_H_ */

