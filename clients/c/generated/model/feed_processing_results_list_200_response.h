/*
 * feed_processing_results_list_200_response.h
 *
 * 
 */

#ifndef _feed_processing_results_list_200_response_H_
#define _feed_processing_results_list_200_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct feed_processing_results_list_200_response_t feed_processing_results_list_200_response_t;

#include "catalogs_feed_processing_result.h"



typedef struct feed_processing_results_list_200_response_t {
    list_t *items; //nonprimitive container
    char *bookmark; // string

} feed_processing_results_list_200_response_t;

feed_processing_results_list_200_response_t *feed_processing_results_list_200_response_create(
    list_t *items,
    char *bookmark
);

void feed_processing_results_list_200_response_free(feed_processing_results_list_200_response_t *feed_processing_results_list_200_response);

feed_processing_results_list_200_response_t *feed_processing_results_list_200_response_parseFromJSON(cJSON *feed_processing_results_list_200_responseJSON);

cJSON *feed_processing_results_list_200_response_convertToJSON(feed_processing_results_list_200_response_t *feed_processing_results_list_200_response);

#endif /* _feed_processing_results_list_200_response_H_ */

