/*
 * catalogs_feed_ingestion.h
 *
 * 
 */

#ifndef _catalogs_feed_ingestion_H_
#define _catalogs_feed_ingestion_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_feed_ingestion_t catalogs_feed_ingestion_t;

#include "catalogs_feed_processing_status.h"

// Enum  for catalogs_feed_ingestion

typedef enum  { pinterest_rest_api_catalogs_feed_ingestion__NULL = 0, pinterest_rest_api_catalogs_feed_ingestion__COMPLETED, pinterest_rest_api_catalogs_feed_ingestion__FAILED, pinterest_rest_api_catalogs_feed_ingestion__PROCESSING } pinterest_rest_api_catalogs_feed_ingestion__e;

char* catalogs_feed_ingestion_status_ToString(pinterest_rest_api_catalogs_feed_ingestion__e status);

pinterest_rest_api_catalogs_feed_ingestion__e catalogs_feed_ingestion_status_FromString(char* status);



typedef struct catalogs_feed_ingestion_t {
    char *id; // string
    char *feed_id; // string
    char *created_at; //date time
    catalogs_feed_processing_status_t *status; // custom

} catalogs_feed_ingestion_t;

catalogs_feed_ingestion_t *catalogs_feed_ingestion_create(
    char *id,
    char *feed_id,
    char *created_at,
    catalogs_feed_processing_status_t *status
);

void catalogs_feed_ingestion_free(catalogs_feed_ingestion_t *catalogs_feed_ingestion);

catalogs_feed_ingestion_t *catalogs_feed_ingestion_parseFromJSON(cJSON *catalogs_feed_ingestionJSON);

cJSON *catalogs_feed_ingestion_convertToJSON(catalogs_feed_ingestion_t *catalogs_feed_ingestion);

#endif /* _catalogs_feed_ingestion_H_ */

