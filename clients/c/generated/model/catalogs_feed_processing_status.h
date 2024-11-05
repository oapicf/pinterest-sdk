/*
 * catalogs_feed_processing_status.h
 *
 * 
 */

#ifndef _catalogs_feed_processing_status_H_
#define _catalogs_feed_processing_status_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_feed_processing_status_t catalogs_feed_processing_status_t;


// Enum  for catalogs_feed_processing_status

typedef enum { pinterest_rest_api_catalogs_feed_processing_status__NULL = 0, pinterest_rest_api_catalogs_feed_processing_status__COMPLETED, pinterest_rest_api_catalogs_feed_processing_status__FAILED, pinterest_rest_api_catalogs_feed_processing_status__PROCESSING } pinterest_rest_api_catalogs_feed_processing_status__e;

char* catalogs_feed_processing_status_catalogs_feed_processing_status_ToString(pinterest_rest_api_catalogs_feed_processing_status__e catalogs_feed_processing_status);

pinterest_rest_api_catalogs_feed_processing_status__e catalogs_feed_processing_status_catalogs_feed_processing_status_FromString(char* catalogs_feed_processing_status);

//cJSON *catalogs_feed_processing_status_catalogs_feed_processing_status_convertToJSON(pinterest_rest_api_catalogs_feed_processing_status__e catalogs_feed_processing_status);

//pinterest_rest_api_catalogs_feed_processing_status__e catalogs_feed_processing_status_catalogs_feed_processing_status_parseFromJSON(cJSON *catalogs_feed_processing_statusJSON);

#endif /* _catalogs_feed_processing_status_H_ */

