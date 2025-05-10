/*
 * catalogs_retail_feed.h
 *
 * Catalogs Retail Feed object
 */

#ifndef _catalogs_retail_feed_H_
#define _catalogs_retail_feed_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_retail_feed_t catalogs_retail_feed_t;

#include "catalogs_feed_credentials.h"
#include "catalogs_feed_processing_schedule.h"
#include "catalogs_format.h"
#include "catalogs_status.h"
#include "catalogs_type.h"
#include "country.h"
#include "nullable_currency.h"
#include "product_availability_type.h"



typedef struct catalogs_retail_feed_t {
    char *created_at; //date time
    char *id; // string
    char *updated_at; //date time
    char *name; // string
    pinterest_rest_api_catalogs_format__e format; //referenced enum
    pinterest_rest_api_catalogs_type__e catalog_type; //referenced enum
    struct catalogs_feed_credentials_t *credentials; //model
    char *location; // string
    struct catalogs_feed_processing_schedule_t *preferred_processing_schedule; //model
    pinterest_rest_api_catalogs_status__e status; //referenced enum
    pinterest_rest_api_nullable_currency__e default_currency; //referenced enum
    char *default_locale; // string
    pinterest_rest_api_country__e default_country; //referenced enum
    pinterest_rest_api_product_availability_type__e default_availability; //referenced enum

    int _library_owned; // Is the library responsible for freeing this object?
} catalogs_retail_feed_t;

__attribute__((deprecated)) catalogs_retail_feed_t *catalogs_retail_feed_create(
    char *created_at,
    char *id,
    char *updated_at,
    char *name,
    pinterest_rest_api_catalogs_format__e format,
    pinterest_rest_api_catalogs_type__e catalog_type,
    catalogs_feed_credentials_t *credentials,
    char *location,
    catalogs_feed_processing_schedule_t *preferred_processing_schedule,
    pinterest_rest_api_catalogs_status__e status,
    pinterest_rest_api_nullable_currency__e default_currency,
    char *default_locale,
    pinterest_rest_api_country__e default_country,
    pinterest_rest_api_product_availability_type__e default_availability
);

void catalogs_retail_feed_free(catalogs_retail_feed_t *catalogs_retail_feed);

catalogs_retail_feed_t *catalogs_retail_feed_parseFromJSON(cJSON *catalogs_retail_feedJSON);

cJSON *catalogs_retail_feed_convertToJSON(catalogs_retail_feed_t *catalogs_retail_feed);

#endif /* _catalogs_retail_feed_H_ */

