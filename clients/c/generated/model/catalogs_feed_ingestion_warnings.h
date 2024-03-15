/*
 * catalogs_feed_ingestion_warnings.h
 *
 * 
 */

#ifndef _catalogs_feed_ingestion_warnings_H_
#define _catalogs_feed_ingestion_warnings_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_feed_ingestion_warnings_t catalogs_feed_ingestion_warnings_t;




typedef struct catalogs_feed_ingestion_warnings_t {
    int additional_image_level_internal_error; //numeric
    int additional_image_file_not_accessible; //numeric
    int additional_image_malformed_url; //numeric
    int additional_image_file_not_found; //numeric
    int additional_image_invalid_file; //numeric
    int hotel_price_header_is_present; //numeric

} catalogs_feed_ingestion_warnings_t;

catalogs_feed_ingestion_warnings_t *catalogs_feed_ingestion_warnings_create(
    int additional_image_level_internal_error,
    int additional_image_file_not_accessible,
    int additional_image_malformed_url,
    int additional_image_file_not_found,
    int additional_image_invalid_file,
    int hotel_price_header_is_present
);

void catalogs_feed_ingestion_warnings_free(catalogs_feed_ingestion_warnings_t *catalogs_feed_ingestion_warnings);

catalogs_feed_ingestion_warnings_t *catalogs_feed_ingestion_warnings_parseFromJSON(cJSON *catalogs_feed_ingestion_warningsJSON);

cJSON *catalogs_feed_ingestion_warnings_convertToJSON(catalogs_feed_ingestion_warnings_t *catalogs_feed_ingestion_warnings);

#endif /* _catalogs_feed_ingestion_warnings_H_ */

