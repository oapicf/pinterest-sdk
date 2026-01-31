/*
 * catalogs_feed_product_counts.h
 *
 * The counts can be null early in the process.
 */

#ifndef _catalogs_feed_product_counts_H_
#define _catalogs_feed_product_counts_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_feed_product_counts_t catalogs_feed_product_counts_t;




typedef struct catalogs_feed_product_counts_t {
    int ingested; //numeric
    int original; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} catalogs_feed_product_counts_t;

__attribute__((deprecated)) catalogs_feed_product_counts_t *catalogs_feed_product_counts_create(
    int ingested,
    int original
);

void catalogs_feed_product_counts_free(catalogs_feed_product_counts_t *catalogs_feed_product_counts);

catalogs_feed_product_counts_t *catalogs_feed_product_counts_parseFromJSON(cJSON *catalogs_feed_product_countsJSON);

cJSON *catalogs_feed_product_counts_convertToJSON(catalogs_feed_product_counts_t *catalogs_feed_product_counts);

#endif /* _catalogs_feed_product_counts_H_ */

