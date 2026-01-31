/*
 * related_terms_related_terms_list_inner.h
 *
 * 
 */

#ifndef _related_terms_related_terms_list_inner_H_
#define _related_terms_related_terms_list_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct related_terms_related_terms_list_inner_t related_terms_related_terms_list_inner_t;




typedef struct related_terms_related_terms_list_inner_t {
    list_t *related_terms; //primitive container
    char *term; // string

    int _library_owned; // Is the library responsible for freeing this object?
} related_terms_related_terms_list_inner_t;

__attribute__((deprecated)) related_terms_related_terms_list_inner_t *related_terms_related_terms_list_inner_create(
    list_t *related_terms,
    char *term
);

void related_terms_related_terms_list_inner_free(related_terms_related_terms_list_inner_t *related_terms_related_terms_list_inner);

related_terms_related_terms_list_inner_t *related_terms_related_terms_list_inner_parseFromJSON(cJSON *related_terms_related_terms_list_innerJSON);

cJSON *related_terms_related_terms_list_inner_convertToJSON(related_terms_related_terms_list_inner_t *related_terms_related_terms_list_inner);

#endif /* _related_terms_related_terms_list_inner_H_ */

