/*
 * book_closed_response.h
 *
 * Creation fields
 */

#ifndef _book_closed_response_H_
#define _book_closed_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct book_closed_response_t book_closed_response_t;




typedef struct book_closed_response_t {
    int conversion_metrics_ready; //boolean
    int non_conversion_metrics_ready; //boolean

} book_closed_response_t;

book_closed_response_t *book_closed_response_create(
    int conversion_metrics_ready,
    int non_conversion_metrics_ready
);

void book_closed_response_free(book_closed_response_t *book_closed_response);

book_closed_response_t *book_closed_response_parseFromJSON(cJSON *book_closed_responseJSON);

cJSON *book_closed_response_convertToJSON(book_closed_response_t *book_closed_response);

#endif /* _book_closed_response_H_ */

