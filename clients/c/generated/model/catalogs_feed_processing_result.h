/*
 * catalogs_feed_processing_result.h
 *
 * 
 */

#ifndef _catalogs_feed_processing_result_H_
#define _catalogs_feed_processing_result_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_feed_processing_result_t catalogs_feed_processing_result_t;

#include "catalogs_feed_ingestion_details.h"
#include "catalogs_feed_processing_status.h"
#include "catalogs_feed_product_counts.h"
#include "catalogs_feed_validation_details.h"

// Enum  for catalogs_feed_processing_result

typedef enum  { pinterest_rest_api_catalogs_feed_processing_result__NULL = 0, pinterest_rest_api_catalogs_feed_processing_result__COMPLETED, pinterest_rest_api_catalogs_feed_processing_result__FAILED, pinterest_rest_api_catalogs_feed_processing_result__PROCESSING } pinterest_rest_api_catalogs_feed_processing_result__e;

char* catalogs_feed_processing_result_status_ToString(pinterest_rest_api_catalogs_feed_processing_result__e status);

pinterest_rest_api_catalogs_feed_processing_result__e catalogs_feed_processing_result_status_FromString(char* status);



typedef struct catalogs_feed_processing_result_t {
    char *created_at; //date time
    char *id; // string
    char *updated_at; //date time
    struct catalogs_feed_ingestion_details_t *ingestion_details; //model
    catalogs_feed_processing_status_t *status; // custom
    struct catalogs_feed_product_counts_t *product_counts; //model
    struct catalogs_feed_validation_details_t *validation_details; //model

} catalogs_feed_processing_result_t;

catalogs_feed_processing_result_t *catalogs_feed_processing_result_create(
    char *created_at,
    char *id,
    char *updated_at,
    catalogs_feed_ingestion_details_t *ingestion_details,
    catalogs_feed_processing_status_t *status,
    catalogs_feed_product_counts_t *product_counts,
    catalogs_feed_validation_details_t *validation_details
);

void catalogs_feed_processing_result_free(catalogs_feed_processing_result_t *catalogs_feed_processing_result);

catalogs_feed_processing_result_t *catalogs_feed_processing_result_parseFromJSON(cJSON *catalogs_feed_processing_resultJSON);

cJSON *catalogs_feed_processing_result_convertToJSON(catalogs_feed_processing_result_t *catalogs_feed_processing_result);

#endif /* _catalogs_feed_processing_result_H_ */

