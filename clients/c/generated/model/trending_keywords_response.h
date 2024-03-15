/*
 * trending_keywords_response.h
 *
 * 
 */

#ifndef _trending_keywords_response_H_
#define _trending_keywords_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct trending_keywords_response_t trending_keywords_response_t;

#include "trending_keywords_response_trends_inner.h"



typedef struct trending_keywords_response_t {
    list_t *trends; //nonprimitive container

} trending_keywords_response_t;

trending_keywords_response_t *trending_keywords_response_create(
    list_t *trends
);

void trending_keywords_response_free(trending_keywords_response_t *trending_keywords_response);

trending_keywords_response_t *trending_keywords_response_parseFromJSON(cJSON *trending_keywords_responseJSON);

cJSON *trending_keywords_response_convertToJSON(trending_keywords_response_t *trending_keywords_response);

#endif /* _trending_keywords_response_H_ */

