/*
 * paginated.h
 *
 * 
 */

#ifndef _paginated_H_
#define _paginated_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct paginated_t paginated_t;

#include "object.h"



typedef struct paginated_t {
    list_t *items; //nonprimitive container
    char *bookmark; // string

} paginated_t;

paginated_t *paginated_create(
    list_t *items,
    char *bookmark
);

void paginated_free(paginated_t *paginated);

paginated_t *paginated_parseFromJSON(cJSON *paginatedJSON);

cJSON *paginated_convertToJSON(paginated_t *paginated);

#endif /* _paginated_H_ */

