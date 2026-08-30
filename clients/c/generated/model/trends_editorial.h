/*
 * trends_editorial.h
 *
 * Information of the published editorial article.
 */

#ifndef _trends_editorial_H_
#define _trends_editorial_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct trends_editorial_t trends_editorial_t;

#include "keyword_info.h"



typedef struct trends_editorial_t {
    char *board_url; // string
    char *description; // string
    list_t *interests; //primitive container
    list_t *pins_url; //primitive container
    list_t *related_keywords; //nonprimitive container
    char *title; // string

    int _library_owned; // Is the library responsible for freeing this object?
} trends_editorial_t;

__attribute__((deprecated)) trends_editorial_t *trends_editorial_create(
    char *board_url,
    char *description,
    list_t *interests,
    list_t *pins_url,
    list_t *related_keywords,
    char *title
);

void trends_editorial_free(trends_editorial_t *trends_editorial);

trends_editorial_t *trends_editorial_parseFromJSON(cJSON *trends_editorialJSON);

cJSON *trends_editorial_convertToJSON(trends_editorial_t *trends_editorial);

#endif /* _trends_editorial_H_ */

