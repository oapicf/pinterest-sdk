/*
 * catalogs_feed_ingestion_errors.h
 *
 * 
 */

#ifndef _catalogs_feed_ingestion_errors_H_
#define _catalogs_feed_ingestion_errors_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_feed_ingestion_errors_t catalogs_feed_ingestion_errors_t;


// Enum LARGEPRODUCTCOUNTDECREASE for catalogs_feed_ingestion_errors

typedef enum  { pinterest_rest_api_catalogs_feed_ingestion_errors_LARGEPRODUCTCOUNTDECREASE_NULL = 0, pinterest_rest_api_catalogs_feed_ingestion_errors_LARGEPRODUCTCOUNTDECREASE__1 } pinterest_rest_api_catalogs_feed_ingestion_errors_LARGEPRODUCTCOUNTDECREASE_e;

char* catalogs_feed_ingestion_errors_large_product_count_decrease_ToString(pinterest_rest_api_catalogs_feed_ingestion_errors_LARGEPRODUCTCOUNTDECREASE_e large_product_count_decrease);

pinterest_rest_api_catalogs_feed_ingestion_errors_LARGEPRODUCTCOUNTDECREASE_e catalogs_feed_ingestion_errors_large_product_count_decrease_FromString(char* large_product_count_decrease);



typedef struct catalogs_feed_ingestion_errors_t {
    int line_level_internal_error; //numeric
    int large_product_count_decrease; //numeric
    int account_flagged; //numeric
    int image_level_internal_error; //numeric
    int image_file_not_accessible; //numeric
    int image_malformed_url; //numeric
    int image_file_not_found; //numeric
    int image_invalid_file; //numeric

} catalogs_feed_ingestion_errors_t;

catalogs_feed_ingestion_errors_t *catalogs_feed_ingestion_errors_create(
    int line_level_internal_error,
    int large_product_count_decrease,
    int account_flagged,
    int image_level_internal_error,
    int image_file_not_accessible,
    int image_malformed_url,
    int image_file_not_found,
    int image_invalid_file
);

void catalogs_feed_ingestion_errors_free(catalogs_feed_ingestion_errors_t *catalogs_feed_ingestion_errors);

catalogs_feed_ingestion_errors_t *catalogs_feed_ingestion_errors_parseFromJSON(cJSON *catalogs_feed_ingestion_errorsJSON);

cJSON *catalogs_feed_ingestion_errors_convertToJSON(catalogs_feed_ingestion_errors_t *catalogs_feed_ingestion_errors);

#endif /* _catalogs_feed_ingestion_errors_H_ */

