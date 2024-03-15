/*
 * catalogs_feed_ingestion_info.h
 *
 * 
 */

#ifndef _catalogs_feed_ingestion_info_H_
#define _catalogs_feed_ingestion_info_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_feed_ingestion_info_t catalogs_feed_ingestion_info_t;




typedef struct catalogs_feed_ingestion_info_t {
    int in_stock; //numeric
    int out_of_stock; //numeric
    int preorder; //numeric

} catalogs_feed_ingestion_info_t;

catalogs_feed_ingestion_info_t *catalogs_feed_ingestion_info_create(
    int in_stock,
    int out_of_stock,
    int preorder
);

void catalogs_feed_ingestion_info_free(catalogs_feed_ingestion_info_t *catalogs_feed_ingestion_info);

catalogs_feed_ingestion_info_t *catalogs_feed_ingestion_info_parseFromJSON(cJSON *catalogs_feed_ingestion_infoJSON);

cJSON *catalogs_feed_ingestion_info_convertToJSON(catalogs_feed_ingestion_info_t *catalogs_feed_ingestion_info);

#endif /* _catalogs_feed_ingestion_info_H_ */

