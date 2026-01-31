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
    char *bookmark; // string
    list_t *items; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} paginated_t;

__attribute__((deprecated)) paginated_t *paginated_create(
    char *bookmark,
    list_t *items
);

void paginated_free(paginated_t *paginated);

paginated_t *paginated_parseFromJSON(cJSON *paginatedJSON);

cJSON *paginated_convertToJSON(paginated_t *paginated);

#endif /* _paginated_H_ */

