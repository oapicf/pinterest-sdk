/*
 * audience_category.h
 *
 * 
 */

#ifndef _audience_category_H_
#define _audience_category_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct audience_category_t audience_category_t;

#include "audience_subcategory.h"



typedef struct audience_category_t {
    char *id; // string
    double index; //numeric
    char *key; // string
    char *name; // string
    double ratio; //numeric
    list_t *subcategories; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} audience_category_t;

__attribute__((deprecated)) audience_category_t *audience_category_create(
    char *id,
    double index,
    char *key,
    char *name,
    double ratio,
    list_t *subcategories
);

void audience_category_free(audience_category_t *audience_category);

audience_category_t *audience_category_parseFromJSON(cJSON *audience_categoryJSON);

cJSON *audience_category_convertToJSON(audience_category_t *audience_category);

#endif /* _audience_category_H_ */

