/*
 * book_closed.h
 *
 * 
 */

#ifndef _book_closed_H_
#define _book_closed_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct book_closed_t book_closed_t;




typedef struct book_closed_t {
    int *conversion_metrics_ready; //boolean
    int *non_conversion_metrics_ready; //boolean

    int _library_owned; // Is the library responsible for freeing this object?
} book_closed_t;

__attribute__((deprecated)) book_closed_t *book_closed_create(
    int *conversion_metrics_ready,
    int *non_conversion_metrics_ready
);

void book_closed_free(book_closed_t *book_closed);

book_closed_t *book_closed_parseFromJSON(cJSON *book_closedJSON);

cJSON *book_closed_convertToJSON(book_closed_t *book_closed);

#endif /* _book_closed_H_ */

