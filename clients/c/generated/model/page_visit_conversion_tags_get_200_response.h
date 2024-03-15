/*
 * page_visit_conversion_tags_get_200_response.h
 *
 * 
 */

#ifndef _page_visit_conversion_tags_get_200_response_H_
#define _page_visit_conversion_tags_get_200_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct page_visit_conversion_tags_get_200_response_t page_visit_conversion_tags_get_200_response_t;

#include "conversion_event_response.h"



typedef struct page_visit_conversion_tags_get_200_response_t {
    list_t *items; //nonprimitive container
    char *bookmark; // string

} page_visit_conversion_tags_get_200_response_t;

page_visit_conversion_tags_get_200_response_t *page_visit_conversion_tags_get_200_response_create(
    list_t *items,
    char *bookmark
);

void page_visit_conversion_tags_get_200_response_free(page_visit_conversion_tags_get_200_response_t *page_visit_conversion_tags_get_200_response);

page_visit_conversion_tags_get_200_response_t *page_visit_conversion_tags_get_200_response_parseFromJSON(cJSON *page_visit_conversion_tags_get_200_responseJSON);

cJSON *page_visit_conversion_tags_get_200_response_convertToJSON(page_visit_conversion_tags_get_200_response_t *page_visit_conversion_tags_get_200_response);

#endif /* _page_visit_conversion_tags_get_200_response_H_ */

