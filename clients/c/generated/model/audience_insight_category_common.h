/*
 * audience_insight_category_common.h
 *
 * 
 */

#ifndef _audience_insight_category_common_H_
#define _audience_insight_category_common_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct audience_insight_category_common_t audience_insight_category_common_t;




typedef struct audience_insight_category_common_t {
    char *id; // string
    double index; //numeric
    char *key; // string
    char *name; // string
    double ratio; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} audience_insight_category_common_t;

__attribute__((deprecated)) audience_insight_category_common_t *audience_insight_category_common_create(
    char *id,
    double index,
    char *key,
    char *name,
    double ratio
);

void audience_insight_category_common_free(audience_insight_category_common_t *audience_insight_category_common);

audience_insight_category_common_t *audience_insight_category_common_parseFromJSON(cJSON *audience_insight_category_commonJSON);

cJSON *audience_insight_category_common_convertToJSON(audience_insight_category_common_t *audience_insight_category_common);

#endif /* _audience_insight_category_common_H_ */

