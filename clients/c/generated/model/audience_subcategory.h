/*
 * audience_subcategory.h
 *
 * 
 */

#ifndef _audience_subcategory_H_
#define _audience_subcategory_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct audience_subcategory_t audience_subcategory_t;




typedef struct audience_subcategory_t {
    char *key; // string
    char *name; // string
    double ratio; //numeric
    double index; //numeric
    char *id; // string

} audience_subcategory_t;

audience_subcategory_t *audience_subcategory_create(
    char *key,
    char *name,
    double ratio,
    double index,
    char *id
);

void audience_subcategory_free(audience_subcategory_t *audience_subcategory);

audience_subcategory_t *audience_subcategory_parseFromJSON(cJSON *audience_subcategoryJSON);

cJSON *audience_subcategory_convertToJSON(audience_subcategory_t *audience_subcategory);

#endif /* _audience_subcategory_H_ */

