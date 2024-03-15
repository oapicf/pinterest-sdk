/*
 * catalogs_feed_ingestion_details.h
 *
 * 
 */

#ifndef _catalogs_feed_ingestion_details_H_
#define _catalogs_feed_ingestion_details_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_feed_ingestion_details_t catalogs_feed_ingestion_details_t;

#include "catalogs_feed_ingestion_errors.h"
#include "catalogs_feed_ingestion_info.h"
#include "catalogs_feed_ingestion_warnings.h"



typedef struct catalogs_feed_ingestion_details_t {
    struct catalogs_feed_ingestion_errors_t *errors; //model
    struct catalogs_feed_ingestion_info_t *info; //model
    struct catalogs_feed_ingestion_warnings_t *warnings; //model

} catalogs_feed_ingestion_details_t;

catalogs_feed_ingestion_details_t *catalogs_feed_ingestion_details_create(
    catalogs_feed_ingestion_errors_t *errors,
    catalogs_feed_ingestion_info_t *info,
    catalogs_feed_ingestion_warnings_t *warnings
);

void catalogs_feed_ingestion_details_free(catalogs_feed_ingestion_details_t *catalogs_feed_ingestion_details);

catalogs_feed_ingestion_details_t *catalogs_feed_ingestion_details_parseFromJSON(cJSON *catalogs_feed_ingestion_detailsJSON);

cJSON *catalogs_feed_ingestion_details_convertToJSON(catalogs_feed_ingestion_details_t *catalogs_feed_ingestion_details);

#endif /* _catalogs_feed_ingestion_details_H_ */

