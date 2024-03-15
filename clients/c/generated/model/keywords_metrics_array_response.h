/*
 * keywords_metrics_array_response.h
 *
 * 
 */

#ifndef _keywords_metrics_array_response_H_
#define _keywords_metrics_array_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct keywords_metrics_array_response_t keywords_metrics_array_response_t;

#include "keyword_metrics_response.h"



typedef struct keywords_metrics_array_response_t {
    list_t *data; //nonprimitive container

} keywords_metrics_array_response_t;

keywords_metrics_array_response_t *keywords_metrics_array_response_create(
    list_t *data
);

void keywords_metrics_array_response_free(keywords_metrics_array_response_t *keywords_metrics_array_response);

keywords_metrics_array_response_t *keywords_metrics_array_response_parseFromJSON(cJSON *keywords_metrics_array_responseJSON);

cJSON *keywords_metrics_array_response_convertToJSON(keywords_metrics_array_response_t *keywords_metrics_array_response);

#endif /* _keywords_metrics_array_response_H_ */

