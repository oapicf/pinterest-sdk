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
    char *key; // string
    char *name; // string
    double ratio; //numeric
    double index; //numeric
    char *id; // string
    list_t *subcategories; //nonprimitive container

} audience_category_t;

audience_category_t *audience_category_create(
    char *key,
    char *name,
    double ratio,
    double index,
    char *id,
    list_t *subcategories
);

void audience_category_free(audience_category_t *audience_category);

audience_category_t *audience_category_parseFromJSON(cJSON *audience_categoryJSON);

cJSON *audience_category_convertToJSON(audience_category_t *audience_category);

#endif /* _audience_category_H_ */

