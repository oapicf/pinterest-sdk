/*
 * related_terms.h
 *
 * 
 */

#ifndef _related_terms_H_
#define _related_terms_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct related_terms_t related_terms_t;

#include "related_terms_related_terms_list_inner.h"



typedef struct related_terms_t {
    char *id; // string
    int related_term_count; //numeric
    list_t *related_terms_list; //nonprimitive container

} related_terms_t;

related_terms_t *related_terms_create(
    char *id,
    int related_term_count,
    list_t *related_terms_list
);

void related_terms_free(related_terms_t *related_terms);

related_terms_t *related_terms_parseFromJSON(cJSON *related_termsJSON);

cJSON *related_terms_convertToJSON(related_terms_t *related_terms);

#endif /* _related_terms_H_ */

