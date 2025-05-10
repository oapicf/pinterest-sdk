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



typedef struct catalogs_feed_ingestion_t {
    char *id; // string
    char *feed_id; // string
    char *created_at; //date time
    pinterest_rest_api_catalogs_feed_processing_status__e status; //referenced enum

    int _library_owned; // Is the library responsible for freeing this object?
} catalogs_feed_ingestion_t;

__attribute__((deprecated)) catalogs_feed_ingestion_t *catalogs_feed_ingestion_create(
    char *id,
    char *feed_id,
    char *created_at,
    pinterest_rest_api_catalogs_feed_processing_status__e status
);

void catalogs_feed_ingestion_free(catalogs_feed_ingestion_t *catalogs_feed_ingestion);

catalogs_feed_ingestion_t *catalogs_feed_ingestion_parseFromJSON(cJSON *catalogs_feed_ingestionJSON);

cJSON *catalogs_feed_ingestion_convertToJSON(catalogs_feed_ingestion_t *catalogs_feed_ingestion);

#endif /* _catalogs_feed_ingestion_H_ */

